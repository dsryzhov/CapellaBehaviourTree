
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import rds.capella.btree.data.BehaviourTree.BTreeLeaf;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTree Leaf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeLeafImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BTreeLeafImpl extends BTreeNodeImpl implements BTreeLeaf {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTreeLeafImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTreePackage.Literals.BTREE_LEAF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public AbstractFunction getFunction() {

		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (AbstractFunction) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTreePackage.BTREE_LEAF__FUNCTION,
							oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractFunction basicGetFunction() {

		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setFunction(AbstractFunction newFunction) {

		AbstractFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_LEAF__FUNCTION,
					oldFunction, function));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_LEAF__FUNCTION:
			if (resolve)
				return getFunction();
			return basicGetFunction();
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
		case BehaviourTreePackage.BTREE_LEAF__FUNCTION:
			setFunction((AbstractFunction) newValue);
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
		case BehaviourTreePackage.BTREE_LEAF__FUNCTION:
			setFunction((AbstractFunction) null);
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
		case BehaviourTreePackage.BTREE_LEAF__FUNCTION:
			return function != null;
		}
		return super.eIsSet(featureID);
	}

} //BTreeLeafImpl