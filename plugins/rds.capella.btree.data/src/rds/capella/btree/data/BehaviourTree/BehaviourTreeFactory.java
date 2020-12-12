
package rds.capella.btree.data.BehaviourTree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage
 * @generated
 */
public interface BehaviourTreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourTreeFactory eINSTANCE = rds.capella.btree.data.BehaviourTree.impl.BehaviourTreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>BTree Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BTree Root</em>'.
	 * @generated
	 */
	BTreeRoot createBTreeRoot();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Reactive Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Sequence</em>'.
	 * @generated
	 */
	ReactiveSequence createReactiveSequence();

	/**
	 * Returns a new object of class '<em>Sequence Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Star</em>'.
	 * @generated
	 */
	SequenceStar createSequenceStar();

	/**
	 * Returns a new object of class '<em>Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fallback</em>'.
	 * @generated
	 */
	Fallback createFallback();

	/**
	 * Returns a new object of class '<em>Reactive Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactive Fallback</em>'.
	 * @generated
	 */
	ReactiveFallback createReactiveFallback();

	/**
	 * Returns a new object of class '<em>Inverter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverter</em>'.
	 * @generated
	 */
	Inverter createInverter();

	/**
	 * Returns a new object of class '<em>Force Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Success</em>'.
	 * @generated
	 */
	ForceSuccess createForceSuccess();

	/**
	 * Returns a new object of class '<em>Force Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Force Failure</em>'.
	 * @generated
	 */
	ForceFailure createForceFailure();

	/**
	 * Returns a new object of class '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeat</em>'.
	 * @generated
	 */
	Repeat createRepeat();

	/**
	 * Returns a new object of class '<em>Retry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retry</em>'.
	 * @generated
	 */
	Retry createRetry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourTreePackage getBehaviourTreePackage();

} //BehaviourTreeFactory
