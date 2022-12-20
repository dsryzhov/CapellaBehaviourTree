
package rds.capella.btree.data.BehaviourTree;

import org.polarsys.capella.core.data.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTree Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.BTreeLeaf#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeLeaf()
 * @model abstract="true"
 * @generated
 */

public interface BTreeLeaf extends BTreeNode {

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(AbstractFunction)
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeLeaf_Function()
	 * @model required="true"
	 * @generated
	 */

	AbstractFunction getFunction();

	/**
	 * Sets the value of the '{@link rds.capella.btree.data.BehaviourTree.BTreeLeaf#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */

	void setFunction(AbstractFunction value);

} // BTreeLeaf
