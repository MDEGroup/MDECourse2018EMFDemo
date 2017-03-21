/**
 */
package webasite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webasite.Page#getContent <em>Content</em>}</li>
 *   <li>{@link webasite.Page#getComposedOf <em>Composed Of</em>}</li>
 * </ul>
 *
 * @see webasite.WebasitePackage#getPage()
 * @model
 * @generated
 */
public interface Page extends WebElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see webasite.WebasitePackage#getPage_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link webasite.Page#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' containment reference.
	 * @see #setComposedOf(Form)
	 * @see webasite.WebasitePackage#getPage_ComposedOf()
	 * @model containment="true"
	 * @generated
	 */
	Form getComposedOf();

	/**
	 * Sets the value of the '{@link webasite.Page#getComposedOf <em>Composed Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composed Of</em>' containment reference.
	 * @see #getComposedOf()
	 * @generated
	 */
	void setComposedOf(Form value);

} // Page
