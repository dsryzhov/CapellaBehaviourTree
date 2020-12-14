
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rds.capella.btree.data.BehaviourTree.BTreeInclude;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTree Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeIncludeImpl#getBtreeReference <em>Btree Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTreeIncludeImpl extends BTreeNodeImpl implements BTreeInclude {

	/**
	 * The cached value of the '{@link #getBtreeReference() <em>Btree Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBtreeReference()
	 * @generated
	 * @ordered
	 */
	protected BTreeRoot btreeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTreeIncludeImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTreePackage.Literals.BTREE_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public BTreeRoot getBtreeReference() {

		if (btreeReference != null && btreeReference.eIsProxy()) {
			InternalEObject oldBtreeReference = (InternalEObject) btreeReference;
			btreeReference = (BTreeRoot) eResolveProxy(oldBtreeReference);
			if (btreeReference != oldBtreeReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE, oldBtreeReference, btreeReference));
			}
		}
		return btreeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public BTreeRoot basicGetBtreeReference() {

		return btreeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setBtreeReference(BTreeRoot newBtreeReference) {

		BTreeRoot oldBtreeReference = btreeReference;
		btreeReference = newBtreeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE,
					oldBtreeReference, btreeReference));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE:
			if (resolve)
				return getBtreeReference();
			return basicGetBtreeReference();
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
		case BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE:
			setBtreeReference((BTreeRoot) newValue);
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
		case BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE:
			setBtreeReference((BTreeRoot) null);
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
		case BehaviourTreePackage.BTREE_INCLUDE__BTREE_REFERENCE:
			return btreeReference != null;
		}
		return super.eIsSet(featureID);
	}

} //BTreeIncludeImpl