package webasite.tests;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import webasite.Entity;
import webasite.Form;
import webasite.FormType;
import webasite.Page;
import webasite.WebModel;
import webasite.WebasiteFactory;
import webasite.WebasitePackage;

public class SerializeDeserialize {

	public static void loadModel(String path) {

	}

	public static void serializeModel(WebModel wm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebModel create() {
		WebModel wm = WebasiteFactory.eINSTANCE.createWebModel();

		Page p1 = WebasiteFactory.eINSTANCE.createPage();
		Page p2 = WebasiteFactory.eINSTANCE.createPage();
		Entity e1 = WebasiteFactory.eINSTANCE.createEntity();
		Entity e2 = WebasiteFactory.eINSTANCE.createEntity();
		Form f1 = WebasiteFactory.eINSTANCE.createForm();
		Form f2 = WebasiteFactory.eINSTANCE.createForm();
		f1.setType(FormType.MULTIPLE);
		f1.setData(e1);
		f2.setType(FormType.MULTIPLE);
		f2.setData(e2);
		p1.setComposedOf(f1);
		p2.setComposedOf(f2);
		wm.getModelElement().add(p1);
		wm.getModelElement().add(p2);
		wm.getModelElement().add(e1);
		wm.getModelElement().add(e2);

		return wm;
	}

	public static boolean validate(WebModel wm) {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(wm);
		if (diagnostic.getSeverity() == Diagnostic.ERROR)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		WebModel wm = create();
		System.out.println(validate(wm));
		serializeModel(wm, "MyWebModel.xmi");
		WebModel wmDeserialize = load("MyWebModel.xmi");

	}

	public static WebModel load(String fileName) {
		EPackage.Registry.INSTANCE.put(WebasitePackage.eNS_URI, WebasitePackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		WebModel myWeb = (WebModel) resource.getContents().get(0);
		System.out.println(myWeb);
		System.out.println(myWeb.getModelElement());
		return myWeb;
	}

}
