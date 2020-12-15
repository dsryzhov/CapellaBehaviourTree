
package rds.capella.btree.data.BehaviourTree;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTree Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.BTreeRoot#getOwnedBTreeContainer <em>Owned BTree Container</em>}</li>
 * </ul>
 *
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeRoot()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement='http://www.polarsys.org/capella/core/interaction/1.4.0#//AbstractCapability http://www.polarsys.org/capella/core/cs/1.4.0#//Component http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping='platform:/plugin/org.polarsys.capella.core.data.gen/model/Interaction.ecore#//AbstractCapability platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction'"
 * @generated
 */

public interface BTreeRoot extends ElementExtension, BTreeElement {

	/**
	 * Returns the value of the '<em><b>Owned BTree Container</b></em>' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned BTree Container</em>' containment reference.
	 * @see #setOwnedBTreeContainer(BTreeContainer)
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#getBTreeRoot_OwnedBTreeContainer()
	 * @model containment="true"
	 * @generated
	 */

	BTreeContainer getOwnedBTreeContainer();

	/**
	 * Sets the value of the '{@link rds.capella.btree.data.BehaviourTree.BTreeRoot#getOwnedBTreeContainer <em>Owned BTree Container</em>}' containment reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned BTree Container</em>' containment reference.
	 * @see #getOwnedBTreeContainer()
	 * @generated
	 */

	void setOwnedBTreeContainer(BTreeContainer value);

} // BTreeRoot
