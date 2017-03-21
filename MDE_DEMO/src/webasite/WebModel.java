/**
 */
package webasite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webasite.WebModel#getModelElement <em>Model Element</em>}</li>
 * </ul>
 *
 * @see webasite.WebasitePackage#getWebModel()
 * @model
 * @generated
 */
public interface WebModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link webasite.WebElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' containment reference list.
	 * @see webasite.WebasitePackage#getWebModel_ModelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebElement> getModelElement();

} // WebModel
