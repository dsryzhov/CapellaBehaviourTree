
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.polarsys.capella.common.lib.IdGenerator;
import rds.capella.btree.data.BehaviourTree.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourTreeFactoryImpl extends EFactoryImpl implements BehaviourTreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviourTreeFactory init() {
		try {
			BehaviourTreeFactory theBehaviourTreeFactory = (BehaviourTreeFactory) EPackage.Registry.INSTANCE
					.getEFactory(BehaviourTreePackage.eNS_URI);
			if (theBehaviourTreeFactory != null) {
				return theBehaviourTreeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviourTreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTreeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BehaviourTreePackage.BTREE_ROOT:
			return createBTreeRoot();
		case BehaviourTreePackage.BTREE_INCLUDE:
			return createBTreeInclude();
		case BehaviourTreePackage.ACTION:
			return createAction();
		case BehaviourTreePackage.CONDITION:
			return createCondition();
		case BehaviourTreePackage.PARALLEL:
			return createParallel();
		case BehaviourTreePackage.SEQUENCE:
			return createSequence();
		case BehaviourTreePackage.REACTIVE_SEQUENCE:
			return createReactiveSequence();
		case BehaviourTreePackage.SEQUENCE_STAR:
			return createSequenceStar();
		case BehaviourTreePackage.FALLBACK:
			return createFallback();
		case BehaviourTreePackage.REACTIVE_FALLBACK:
			return createReactiveFallback();
		case BehaviourTreePackage.INVERTER:
			return createInverter();
		case BehaviourTreePackage.FORCE_SUCCESS:
			return createForceSuccess();
		case BehaviourTreePackage.FORCE_FAILURE:
			return createForceFailure();
		case BehaviourTreePackage.REPEAT:
			return createRepeat();
		case BehaviourTreePackage.RETRY:
			return createRetry();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BTreeRoot createBTreeRoot() {
		BTreeRootImpl bTreeRoot = new BTreeRootImpl();
		//begin-capella-code

		bTreeRoot.setId(IdGenerator.createId());

		//end-capella-code
		return bTreeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTreeInclude createBTreeInclude() {
		BTreeIncludeImpl bTreeInclude = new BTreeIncludeImpl();
		//begin-capella-code

		bTreeInclude.setId(IdGenerator.createId());

		//end-capella-code
		return bTreeInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		//begin-capella-code

		action.setId(IdGenerator.createId());

		//end-capella-code
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		//begin-capella-code

		condition.setId(IdGenerator.createId());

		//end-capella-code
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		//begin-capella-code

		parallel.setId(IdGenerator.createId());

		//end-capella-code
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		//begin-capella-code

		sequence.setId(IdGenerator.createId());

		//end-capella-code
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveSequence createReactiveSequence() {
		ReactiveSequenceImpl reactiveSequence = new ReactiveSequenceImpl();
		//begin-capella-code

		reactiveSequence.setId(IdGenerator.createId());

		//end-capella-code
		return reactiveSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceStar createSequenceStar() {
		SequenceStarImpl sequenceStar = new SequenceStarImpl();
		//begin-capella-code

		sequenceStar.setId(IdGenerator.createId());

		//end-capella-code
		return sequenceStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fallback createFallback() {
		FallbackImpl fallback = new FallbackImpl();
		//begin-capella-code

		fallback.setId(IdGenerator.createId());

		//end-capella-code
		return fallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReactiveFallback createReactiveFallback() {
		ReactiveFallbackImpl reactiveFallback = new ReactiveFallbackImpl();
		//begin-capella-code

		reactiveFallback.setId(IdGenerator.createId());

		//end-capella-code
		return reactiveFallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inverter createInverter() {
		InverterImpl inverter = new InverterImpl();
		//begin-capella-code

		inverter.setId(IdGenerator.createId());

		//end-capella-code
		return inverter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceSuccess createForceSuccess() {
		ForceSuccessImpl forceSuccess = new ForceSuccessImpl();
		//begin-capella-code

		forceSuccess.setId(IdGenerator.createId());

		//end-capella-code
		return forceSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForceFailure createForceFailure() {
		ForceFailureImpl forceFailure = new ForceFailureImpl();
		//begin-capella-code

		forceFailure.setId(IdGenerator.createId());

		//end-capella-code
		return forceFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		//begin-capella-code

		repeat.setId(IdGenerator.createId());

		//end-capella-code
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Retry createRetry() {
		RetryImpl retry = new RetryImpl();
		//begin-capella-code

		retry.setId(IdGenerator.createId());

		//end-capella-code
		return retry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviourTreePackage getBehaviourTreePackage() {
		return (BehaviourTreePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviourTreePackage getPackage() {
		return BehaviourTreePackage.eINSTANCE;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BTreeRoot createBTreeRoot(String name_p) {
		BTreeRoot bTreeRoot = createBTreeRoot();
		bTreeRoot.setName(name_p);
		return bTreeRoot;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BTreeInclude createBTreeInclude(String name_p) {
		BTreeInclude bTreeInclude = createBTreeInclude();
		bTreeInclude.setName(name_p);
		return bTreeInclude;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Action createAction(String name_p) {
		Action action = createAction();
		action.setName(name_p);
		return action;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Condition createCondition(String name_p) {
		Condition condition = createCondition();
		condition.setName(name_p);
		return condition;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Parallel createParallel(String name_p) {
		Parallel parallel = createParallel();
		parallel.setName(name_p);
		return parallel;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Sequence createSequence(String name_p) {
		Sequence sequence = createSequence();
		sequence.setName(name_p);
		return sequence;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ReactiveSequence createReactiveSequence(String name_p) {
		ReactiveSequence reactiveSequence = createReactiveSequence();
		reactiveSequence.setName(name_p);
		return reactiveSequence;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SequenceStar createSequenceStar(String name_p) {
		SequenceStar sequenceStar = createSequenceStar();
		sequenceStar.setName(name_p);
		return sequenceStar;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Fallback createFallback(String name_p) {
		Fallback fallback = createFallback();
		fallback.setName(name_p);
		return fallback;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ReactiveFallback createReactiveFallback(String name_p) {
		ReactiveFallback reactiveFallback = createReactiveFallback();
		reactiveFallback.setName(name_p);
		return reactiveFallback;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Inverter createInverter(String name_p) {
		Inverter inverter = createInverter();
		inverter.setName(name_p);
		return inverter;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ForceSuccess createForceSuccess(String name_p) {
		ForceSuccess forceSuccess = createForceSuccess();
		forceSuccess.setName(name_p);
		return forceSuccess;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ForceFailure createForceFailure(String name_p) {
		ForceFailure forceFailure = createForceFailure();
		forceFailure.setName(name_p);
		return forceFailure;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Repeat createRepeat(String name_p) {
		Repeat repeat = createRepeat();
		repeat.setName(name_p);
		return repeat;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Retry createRetry(String name_p) {
		Retry retry = createRetry();
		retry.setName(name_p);
		return retry;
	}

} //BehaviourTreeFactoryImpl
