/**
 */
package webasite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import webasite.Entity;
import webasite.Form;
import webasite.WebasitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webasite.impl.EntityImpl#getShownBy <em>Shown By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends WebElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getShownBy() <em>Shown By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShownBy()
	 * @generated
	 * @ordered
	 */
	protected Form shownBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebasitePackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getShownBy() {
		if (shownBy != null && shownBy.eIsProxy()) {
			InternalEObject oldShownBy = (InternalEObject)shownBy;
			shownBy = (Form)eResolveProxy(oldShownBy);
			if (shownBy != oldShownBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebasitePackage.ENTITY__SHOWN_BY, oldShownBy, shownBy));
			}
		}
		return shownBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetShownBy() {
		return shownBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShownBy(Form newShownBy, NotificationChain msgs) {
		Form oldShownBy = shownBy;
		shownBy = newShownBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebasitePackage.ENTITY__SHOWN_BY, oldShownBy, newShownBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShownBy(Form newShownBy) {
		if (newShownBy != shownBy) {
			NotificationChain msgs = null;
			if (shownBy != null)
				msgs = ((InternalEObject)shownBy).eInverseRemove(this, WebasitePackage.FORM__DATA, Form.class, msgs);
			if (newShownBy != null)
				msgs = ((InternalEObject)newShownBy).eInverseAdd(this, WebasitePackage.FORM__DATA, Form.class, msgs);
			msgs = basicSetShownBy(newShownBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebasitePackage.ENTITY__SHOWN_BY, newShownBy, newShownBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				if (shownBy != null)
					msgs = ((InternalEObject)shownBy).eInverseRemove(this, WebasitePackage.FORM__DATA, Form.class, msgs);
				return basicSetShownBy((Form)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				return basicSetShownBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				if (resolve) return getShownBy();
				return basicGetShownBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				setShownBy((Form)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				setShownBy((Form)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebasitePackage.ENTITY__SHOWN_BY:
				return shownBy != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
