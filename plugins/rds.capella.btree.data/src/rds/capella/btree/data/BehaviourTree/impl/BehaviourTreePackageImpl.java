
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;

import org.polarsys.capella.core.data.cs.CsPackage;

import org.polarsys.capella.core.data.ctx.CtxPackage;

import org.polarsys.capella.core.data.epbs.EpbsPackage;

import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;

import org.polarsys.capella.core.data.la.LaPackage;

import org.polarsys.capella.core.data.oa.OaPackage;

import org.polarsys.capella.core.data.pa.PaPackage;

import org.polarsys.capella.core.data.requirement.RequirementPackage;

import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import rds.capella.btree.data.BehaviourTree.Action;
import rds.capella.btree.data.BehaviourTree.BTreeContainer;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;
import rds.capella.btree.data.BehaviourTree.BTreeElement;
import rds.capella.btree.data.BehaviourTree.BTreeFallback;
import rds.capella.btree.data.BehaviourTree.BTreeInclude;
import rds.capella.btree.data.BehaviourTree.BTreeLeaf;
import rds.capella.btree.data.BehaviourTree.BTreeNode;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BTreeSequence;
import rds.capella.btree.data.BehaviourTree.BehaviourTreeFactory;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;
import rds.capella.btree.data.BehaviourTree.Condition;
import rds.capella.btree.data.BehaviourTree.Fallback;
import rds.capella.btree.data.BehaviourTree.ForceFailure;
import rds.capella.btree.data.BehaviourTree.ForceSuccess;
import rds.capella.btree.data.BehaviourTree.Inverter;
import rds.capella.btree.data.BehaviourTree.Parallel;
import rds.capella.btree.data.BehaviourTree.ReactiveFallback;
import rds.capella.btree.data.BehaviourTree.ReactiveSequence;
import rds.capella.btree.data.BehaviourTree.Repeat;
import rds.capella.btree.data.BehaviourTree.Retry;
import rds.capella.btree.data.BehaviourTree.Sequence;
import rds.capella.btree.data.BehaviourTree.SequenceStar;
import rds.capella.btree.data.BehaviourTree.TickResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourTreePackageImpl extends EPackageImpl implements BehaviourTreePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeLeafEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeDecoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeFallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTreeIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactiveFallbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceSuccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forceFailureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourTreePackageImpl() {
		super(eNS_URI, BehaviourTreeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BehaviourTreePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourTreePackage init() {
		if (isInited)
			return (BehaviourTreePackage) EPackage.Registry.INSTANCE.getEPackage(BehaviourTreePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBehaviourTreePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BehaviourTreePackageImpl theBehaviourTreePackage = registeredBehaviourTreePackage instanceof BehaviourTreePackageImpl
				? (BehaviourTreePackageImpl) registeredBehaviourTreePackage
				: new BehaviourTreePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBehaviourTreePackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourTreePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviourTreePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourTreePackage.eNS_URI, theBehaviourTreePackage);
		return theBehaviourTreePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeElement() {
		return bTreeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeNode() {
		return bTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeContainer() {
		return bTreeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBTreeContainer_OwnedNodes() {
		return (EReference) bTreeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeLeaf() {
		return bTreeLeafEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBTreeLeaf_Function() {
		return (EReference) bTreeLeafEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeDecorator() {
		return bTreeDecoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBTreeDecorator_OwnedNode() {
		return (EReference) bTreeDecoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeSequence() {
		return bTreeSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeFallback() {
		return bTreeFallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeRoot() {
		return bTreeRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBTreeRoot_OwnedBTreeContainer() {
		return (EReference) bTreeRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBTreeInclude() {
		return bTreeIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBTreeInclude_BtreeReference() {
		return (EReference) bTreeIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactiveSequence() {
		return reactiveSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceStar() {
		return sequenceStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallback() {
		return fallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReactiveFallback() {
		return reactiveFallbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInverter() {
		return inverterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceSuccess() {
		return forceSuccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForceFailure() {
		return forceFailureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetry() {
		return retryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviourTreeFactory getBehaviourTreeFactory() {
		return (BehaviourTreeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bTreeElementEClass = createEClass(BTREE_ELEMENT);

		bTreeNodeEClass = createEClass(BTREE_NODE);

		bTreeContainerEClass = createEClass(BTREE_CONTAINER);
		createEReference(bTreeContainerEClass, BTREE_CONTAINER__OWNED_NODES);

		bTreeLeafEClass = createEClass(BTREE_LEAF);
		createEReference(bTreeLeafEClass, BTREE_LEAF__FUNCTION);

		bTreeDecoratorEClass = createEClass(BTREE_DECORATOR);
		createEReference(bTreeDecoratorEClass, BTREE_DECORATOR__OWNED_NODE);

		bTreeSequenceEClass = createEClass(BTREE_SEQUENCE);

		bTreeFallbackEClass = createEClass(BTREE_FALLBACK);

		bTreeRootEClass = createEClass(BTREE_ROOT);
		createEReference(bTreeRootEClass, BTREE_ROOT__OWNED_BTREE_CONTAINER);

		bTreeIncludeEClass = createEClass(BTREE_INCLUDE);
		createEReference(bTreeIncludeEClass, BTREE_INCLUDE__BTREE_REFERENCE);

		actionEClass = createEClass(ACTION);

		conditionEClass = createEClass(CONDITION);

		parallelEClass = createEClass(PARALLEL);

		sequenceEClass = createEClass(SEQUENCE);

		reactiveSequenceEClass = createEClass(REACTIVE_SEQUENCE);

		sequenceStarEClass = createEClass(SEQUENCE_STAR);

		fallbackEClass = createEClass(FALLBACK);

		reactiveFallbackEClass = createEClass(REACTIVE_FALLBACK);

		inverterEClass = createEClass(INVERTER);

		forceSuccessEClass = createEClass(FORCE_SUCCESS);

		forceFailureEClass = createEClass(FORCE_FAILURE);

		repeatEClass = createEClass(REPEAT);

		retryEClass = createEClass(RETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage) EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bTreeElementEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		bTreeNodeEClass.getESuperTypes().add(this.getBTreeElement());
		bTreeContainerEClass.getESuperTypes().add(this.getBTreeNode());
		bTreeLeafEClass.getESuperTypes().add(this.getBTreeNode());
		bTreeDecoratorEClass.getESuperTypes().add(this.getBTreeNode());
		bTreeSequenceEClass.getESuperTypes().add(this.getBTreeContainer());
		bTreeFallbackEClass.getESuperTypes().add(this.getBTreeContainer());
		bTreeRootEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		bTreeRootEClass.getESuperTypes().add(this.getBTreeElement());
		bTreeIncludeEClass.getESuperTypes().add(this.getBTreeNode());
		actionEClass.getESuperTypes().add(this.getBTreeLeaf());
		conditionEClass.getESuperTypes().add(this.getBTreeLeaf());
		parallelEClass.getESuperTypes().add(this.getBTreeContainer());
		sequenceEClass.getESuperTypes().add(this.getBTreeSequence());
		reactiveSequenceEClass.getESuperTypes().add(this.getBTreeSequence());
		sequenceStarEClass.getESuperTypes().add(this.getBTreeSequence());
		fallbackEClass.getESuperTypes().add(this.getBTreeFallback());
		reactiveFallbackEClass.getESuperTypes().add(this.getBTreeFallback());
		inverterEClass.getESuperTypes().add(this.getBTreeDecorator());
		forceSuccessEClass.getESuperTypes().add(this.getBTreeDecorator());
		forceFailureEClass.getESuperTypes().add(this.getBTreeDecorator());
		repeatEClass.getESuperTypes().add(this.getBTreeDecorator());
		retryEClass.getESuperTypes().add(this.getBTreeDecorator());

		// Initialize classes, features, and operations; add parameters
		initEClass(bTreeElementEClass, BTreeElement.class, "BTreeElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bTreeNodeEClass, BTreeNode.class, "BTreeNode", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bTreeContainerEClass, BTreeContainer.class, "BTreeContainer", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTreeContainer_OwnedNodes(), this.getBTreeNode(), null, "ownedNodes", null, 0, -1, //$NON-NLS-1$
				BTreeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTreeLeafEClass, BTreeLeaf.class, "BTreeLeaf", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTreeLeaf_Function(), theFaPackage.getAbstractFunction(), null, "function", null, 1, 1, //$NON-NLS-1$
				BTreeLeaf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTreeDecoratorEClass, BTreeDecorator.class, "BTreeDecorator", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTreeDecorator_OwnedNode(), this.getBTreeNode(), null, "ownedNode", null, 1, 1, //$NON-NLS-1$
				BTreeDecorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTreeSequenceEClass, BTreeSequence.class, "BTreeSequence", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bTreeFallbackEClass, BTreeFallback.class, "BTreeFallback", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bTreeRootEClass, BTreeRoot.class, "BTreeRoot", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTreeRoot_OwnedBTreeContainer(), this.getBTreeContainer(), null, "ownedBTreeContainer", null, //$NON-NLS-1$
				0, 1, BTreeRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTreeIncludeEClass, BTreeInclude.class, "BTreeInclude", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBTreeInclude_BtreeReference(), this.getBTreeRoot(), null, "btreeReference", null, 0, 1, //$NON-NLS-1$
				BTreeInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveSequenceEClass, ReactiveSequence.class, "ReactiveSequence", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceStarEClass, SequenceStar.class, "SequenceStar", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fallbackEClass, Fallback.class, "Fallback", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(reactiveFallbackEClass, ReactiveFallback.class, "ReactiveFallback", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverterEClass, Inverter.class, "Inverter", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceSuccessEClass, ForceSuccess.class, "ForceSuccess", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forceFailureEClass, ForceFailure.class, "ForceFailure", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(retryEClass, Retry.class, "Retry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension"; //$NON-NLS-1$
		addAnnotation(this, source, new String[] { "extensibleProviderFactory", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"childCreationExtenders", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useUUIDs", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"useIDAttributes", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(bTreeRootEClass, source, new String[] { "ExtendedElement", //$NON-NLS-1$
				"http://www.polarsys.org/capella/core/interaction/1.4.0#//AbstractCapability http://www.polarsys.org/capella/core/cs/1.4.0#//Component http://www.polarsys.org/capella/core/fa/1.4.0#//AbstractFunction" //$NON-NLS-1$
		});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(bTreeRootEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				"platform:/plugin/org.polarsys.capella.core.data.gen/model/Interaction.ecore#//AbstractCapability platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction" //$NON-NLS-1$
		});
	}

} //BehaviourTreePackageImpl
