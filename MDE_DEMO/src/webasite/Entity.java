/**
 */
package webasite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webasite.Entity#getShownBy <em>Shown By</em>}</li>
 * </ul>
 *
 * @see webasite.WebasitePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends WebElement {
	/**
	 * Returns the value of the '<em><b>Shown By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link webasite.Form#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shown By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shown By</em>' reference.
	 * @see #setShownBy(Form)
	 * @see webasite.WebasitePackage#getEntity_ShownBy()
	 * @see webasite.Form#getData
	 * @model opposite="data"
	 * @generated
	 */
	Form getShownBy();

	/**
	 * Sets the value of the '{@link webasite.Entity#getShownBy <em>Shown By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shown By</em>' reference.
	 * @see #getShownBy()
	 * @generated
	 */
	void setShownBy(Form value);

} // Entity
