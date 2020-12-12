
package rds.capella.btree.data.BehaviourTree.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.common.data.modellingcore.FinalizableElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.MultiplicityElement;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

import rds.capella.btree.data.BehaviourTree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage
 * @generated
 */
public class BehaviourTreeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourTreePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTreeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BehaviourTreePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourTreeSwitch<Adapter> modelSwitch = new BehaviourTreeSwitch<Adapter>() {
		@Override
		public Adapter caseBTreeElement(BTreeElement object) {
			return createBTreeElementAdapter();
		}

		@Override
		public Adapter caseBTreeNode(BTreeNode object) {
			return createBTreeNodeAdapter();
		}

		@Override
		public Adapter caseBTreeContainer(BTreeContainer object) {
			return createBTreeContainerAdapter();
		}

		@Override
		public Adapter caseBTreeLeaf(BTreeLeaf object) {
			return createBTreeLeafAdapter();
		}

		@Override
		public Adapter caseBTreeDecorator(BTreeDecorator object) {
			return createBTreeDecoratorAdapter();
		}

		@Override
		public Adapter caseBTreeSequence(BTreeSequence object) {
			return createBTreeSequenceAdapter();
		}

		@Override
		public Adapter caseBTreeFallback(BTreeFallback object) {
			return createBTreeFallbackAdapter();
		}

		@Override
		public Adapter caseBTreeRoot(BTreeRoot object) {
			return createBTreeRootAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseParallel(Parallel object) {
			return createParallelAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter caseReactiveSequence(ReactiveSequence object) {
			return createReactiveSequenceAdapter();
		}

		@Override
		public Adapter caseSequenceStar(SequenceStar object) {
			return createSequenceStarAdapter();
		}

		@Override
		public Adapter caseFallback(Fallback object) {
			return createFallbackAdapter();
		}

		@Override
		public Adapter caseReactiveFallback(ReactiveFallback object) {
			return createReactiveFallbackAdapter();
		}

		@Override
		public Adapter caseInverter(Inverter object) {
			return createInverterAdapter();
		}

		@Override
		public Adapter caseForceSuccess(ForceSuccess object) {
			return createForceSuccessAdapter();
		}

		@Override
		public Adapter caseForceFailure(ForceFailure object) {
			return createForceFailureAdapter();
		}

		@Override
		public Adapter caseRepeat(Repeat object) {
			return createRepeatAdapter();
		}

		@Override
		public Adapter caseRetry(Retry object) {
			return createRetryAdapter();
		}

		@Override
		public Adapter caseElement(Element object) {
			return createElementAdapter();
		}

		@Override
		public Adapter caseExtensibleElement(ExtensibleElement object) {
			return createExtensibleElementAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
			return createAbstractNamedElementAdapter();
		}

		@Override
		public Adapter caseTraceableElement(TraceableElement object) {
			return createTraceableElementAdapter();
		}

		@Override
		public Adapter casePublishableElement(PublishableElement object) {
			return createPublishableElementAdapter();
		}

		@Override
		public Adapter caseCapellaElement(CapellaElement object) {
			return createCapellaElementAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseFeature(Feature object) {
			return createFeatureAdapter();
		}

		@Override
		public Adapter caseAbstractTypedElement(AbstractTypedElement object) {
			return createAbstractTypedElementAdapter();
		}

		@Override
		public Adapter caseTypedElement(TypedElement object) {
			return createTypedElementAdapter();
		}

		@Override
		public Adapter caseMultiplicityElement(MultiplicityElement object) {
			return createMultiplicityElementAdapter();
		}

		@Override
		public Adapter caseFinalizableElement(FinalizableElement object) {
			return createFinalizableElementAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseAbstractInstance(AbstractInstance object) {
			return createAbstractInstanceAdapter();
		}

		@Override
		public Adapter caseElementExtension(ElementExtension object) {
			return createElementExtensionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeElement <em>BTree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeElement
	 * @generated
	 */
	public Adapter createBTreeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeNode <em>BTree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeNode
	 * @generated
	 */
	public Adapter createBTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeContainer <em>BTree Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeContainer
	 * @generated
	 */
	public Adapter createBTreeContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeLeaf <em>BTree Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeLeaf
	 * @generated
	 */
	public Adapter createBTreeLeafAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeDecorator <em>BTree Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeDecorator
	 * @generated
	 */
	public Adapter createBTreeDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeSequence <em>BTree Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeSequence
	 * @generated
	 */
	public Adapter createBTreeSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeFallback <em>BTree Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeFallback
	 * @generated
	 */
	public Adapter createBTreeFallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.BTreeRoot <em>BTree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeRoot
	 * @generated
	 */
	public Adapter createBTreeRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.ReactiveSequence
	 * @generated
	 */
	public Adapter createReactiveSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.SequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.SequenceStar
	 * @generated
	 */
	public Adapter createSequenceStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Fallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Fallback
	 * @generated
	 */
	public Adapter createFallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.ReactiveFallback
	 * @generated
	 */
	public Adapter createReactiveFallbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Inverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Inverter
	 * @generated
	 */
	public Adapter createInverterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.ForceSuccess <em>Force Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.ForceSuccess
	 * @generated
	 */
	public Adapter createForceSuccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.ForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.ForceFailure
	 * @generated
	 */
	public Adapter createForceFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rds.capella.btree.data.BehaviourTree.Retry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rds.capella.btree.data.BehaviourTree.Retry
	 * @generated
	 */
	public Adapter createRetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.AbstractTypedElement <em>Abstract Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.AbstractTypedElement
	 * @generated
	 */
	public Adapter createAbstractTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.capellacore.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.capellacore.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.information.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.information.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.common.data.modellingcore.FinalizableElement <em>Finalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.common.data.modellingcore.FinalizableElement
	 * @generated
	 */
	public Adapter createFinalizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.information.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.information.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.capella.core.data.information.AbstractInstance <em>Abstract Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.capella.core.data.information.AbstractInstance
	 * @generated
	 */
	public Adapter createAbstractInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.polarsys.kitalpha.emde.model.ElementExtension <em>Element Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.polarsys.kitalpha.emde.model.ElementExtension
	 * @generated
	 */
	public Adapter createElementExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BehaviourTreeAdapterFactory
