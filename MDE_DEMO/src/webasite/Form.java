/**
 */
package webasite;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webasite.Form#getType <em>Type</em>}</li>
 *   <li>{@link webasite.Form#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see webasite.WebasitePackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link webasite.FormType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see webasite.FormType
	 * @see #setType(FormType)
	 * @see webasite.WebasitePackage#getForm_Type()
	 * @model
	 * @generated
	 */
	FormType getType();

	/**
	 * Sets the value of the '{@link webasite.Form#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see webasite.FormType
	 * @see #getType()
	 * @generated
	 */
	void setType(FormType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link webasite.Entity#getShownBy <em>Shown By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Entity)
	 * @see webasite.WebasitePackage#getForm_Data()
	 * @see webasite.Entity#getShownBy
	 * @model opposite="shownBy"
	 * @generated
	 */
	Entity getData();

	/**
	 * Sets the value of the '{@link webasite.Form#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Entity value);

} // Form
