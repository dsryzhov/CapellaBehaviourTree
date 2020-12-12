
package rds.capella.btree.data.BehaviourTree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTree Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.BTreeContainer#getOwnedNodes <em>Owned Nodes</em>}</li>
 * </ul>
 *
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeContainer()
 * @model abstract="true"
 * @generated
 */

public interface BTreeContainer extends BTreeNode {

	/**
	 * Returns the value of the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link rds.capella.btree.data.BehaviourTree.BTreeNode}.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Nodes</em>' containment reference list.
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeContainer_OwnedNodes()
	 * @model containment="true"
	 * @generated
	 */

	EList<BTreeNode> getOwnedNodes();

} // BTreeContainer
