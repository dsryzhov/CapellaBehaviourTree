
package rds.capella.btree.data.BehaviourTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTree Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.BTreeDecorator#getOwnedNode <em>Owned Node</em>}</li>
 * </ul>
 *
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeDecorator()
 * @model abstract="true"
 * @generated
 */

public interface BTreeDecorator extends BTreeNode {

	/**
	 * Returns the value of the '<em><b>Owned Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Node</em>' containment reference.
	 * @see #setOwnedNode(BTreeNode)
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeDecorator_OwnedNode()
	 * @model containment="true" required="true"
	 * @generated
	 */

	BTreeNode getOwnedNode();

	/**
	 * Sets the value of the '{@link rds.capella.btree.data.BehaviourTree.BTreeDecorator#getOwnedNode <em>Owned Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Node</em>' containment reference.
	 * @see #getOwnedNode()
	 * @generated
	 */

	void setOwnedNode(BTreeNode value);

} // BTreeDecorator
