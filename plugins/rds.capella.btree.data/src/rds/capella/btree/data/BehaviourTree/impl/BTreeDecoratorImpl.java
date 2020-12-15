
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;
import rds.capella.btree.data.BehaviourTree.BTreeNode;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTree Decorator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeDecoratorImpl#getOwnedNode <em>Owned Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BTreeDecoratorImpl extends BTreeNodeImpl implements BTreeDecorator {
	/**
	 * The cached value of the '{@link #getOwnedNode() <em>Owned Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNode()
	 * @generated
	 * @ordered
	 */
	protected BTreeNode ownedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTreeDecoratorImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTreePackage.Literals.BTREE_DECORATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public BTreeNode getOwnedNode() {

		return ownedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedNode(BTreeNode newOwnedNode, NotificationChain msgs) {

		BTreeNode oldOwnedNode = ownedNode;
		ownedNode = newOwnedNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE, oldOwnedNode, newOwnedNode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedNode(BTreeNode newOwnedNode) {

		if (newOwnedNode != ownedNode) {
			NotificationChain msgs = null;
			if (ownedNode != null)
				msgs = ((InternalEObject) ownedNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE, null, msgs);
			if (newOwnedNode != null)
				msgs = ((InternalEObject) newOwnedNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE, null, msgs);
			msgs = basicSetOwnedNode(newOwnedNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE,
					newOwnedNode, newOwnedNode));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			return basicSetOwnedNode(null, msgs);
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
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			return getOwnedNode();
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
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			setOwnedNode((BTreeNode) newValue);
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
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			setOwnedNode((BTreeNode) null);
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
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			return ownedNode != null;
		}
		return super.eIsSet(featureID);
	}

} //BTreeDecoratorImpl