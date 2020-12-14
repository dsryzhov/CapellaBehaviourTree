
package rds.capella.btree.data.BehaviourTree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTree Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.BTreeInclude#getBtreeReference <em>Btree Reference</em>}</li>
 * </ul>
 *
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeInclude()
 * @model
 * @generated
 */

public interface BTreeInclude extends BTreeNode {

	/**
	 * Returns the value of the '<em><b>Btree Reference</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btree Reference</em>' reference.
	 * @see #setBtreeReference(BTreeRoot)
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeInclude_BtreeReference()
	 * @model required="true"
	 * @generated
	 */

	BTreeRoot getBtreeReference();

	/**
	 * Sets the value of the '{@link rds.capella.btree.data.BehaviourTree.BTreeInclude#getBtreeReference <em>Btree Reference</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Btree Reference</em>' reference.
	 * @see #getBtreeReference()
	 * @generated
	 */

	void setBtreeReference(BTreeRoot value);

} // BTreeInclude
