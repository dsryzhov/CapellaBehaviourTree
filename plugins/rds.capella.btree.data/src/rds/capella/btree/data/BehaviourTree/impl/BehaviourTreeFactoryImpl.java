
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
		return bTreeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BTreeInclude createBTreeInclude() {
		BTreeIncludeImpl bTreeInclude = new BTreeIncludeImpl();
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

} //BehaviourTreeFactoryImpl
