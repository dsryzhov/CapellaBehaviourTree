
package rds.capella.btree.data.BehaviourTree.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

import rds.capella.btree.data.BehaviourTree.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreePackage
 * @generated
 */
public class BehaviourTreeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviourTreePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTreeSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviourTreePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case BehaviourTreePackage.BTREE_ELEMENT: {
			BTreeElement bTreeElement = (BTreeElement) theEObject;
			T result = caseBTreeElement(bTreeElement);
			if (result == null)
				result = caseNamedElement(bTreeElement);
			if (result == null)
				result = caseAbstractNamedElement(bTreeElement);
			if (result == null)
				result = caseCapellaElement(bTreeElement);
			if (result == null)
				result = caseTraceableElement(bTreeElement);
			if (result == null)
				result = casePublishableElement(bTreeElement);
			if (result == null)
				result = caseModelElement(bTreeElement);
			if (result == null)
				result = caseExtensibleElement(bTreeElement);
			if (result == null)
				result = caseElement(bTreeElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_NODE: {
			BTreeNode bTreeNode = (BTreeNode) theEObject;
			T result = caseBTreeNode(bTreeNode);
			if (result == null)
				result = caseBTreeElement(bTreeNode);
			if (result == null)
				result = caseNamedElement(bTreeNode);
			if (result == null)
				result = caseAbstractNamedElement(bTreeNode);
			if (result == null)
				result = caseCapellaElement(bTreeNode);
			if (result == null)
				result = caseTraceableElement(bTreeNode);
			if (result == null)
				result = casePublishableElement(bTreeNode);
			if (result == null)
				result = caseModelElement(bTreeNode);
			if (result == null)
				result = caseExtensibleElement(bTreeNode);
			if (result == null)
				result = caseElement(bTreeNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_CONTAINER: {
			BTreeContainer bTreeContainer = (BTreeContainer) theEObject;
			T result = caseBTreeContainer(bTreeContainer);
			if (result == null)
				result = caseBTreeNode(bTreeContainer);
			if (result == null)
				result = caseBTreeElement(bTreeContainer);
			if (result == null)
				result = caseNamedElement(bTreeContainer);
			if (result == null)
				result = caseAbstractNamedElement(bTreeContainer);
			if (result == null)
				result = caseCapellaElement(bTreeContainer);
			if (result == null)
				result = caseTraceableElement(bTreeContainer);
			if (result == null)
				result = casePublishableElement(bTreeContainer);
			if (result == null)
				result = caseModelElement(bTreeContainer);
			if (result == null)
				result = caseExtensibleElement(bTreeContainer);
			if (result == null)
				result = caseElement(bTreeContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_LEAF: {
			BTreeLeaf bTreeLeaf = (BTreeLeaf) theEObject;
			T result = caseBTreeLeaf(bTreeLeaf);
			if (result == null)
				result = caseBTreeNode(bTreeLeaf);
			if (result == null)
				result = caseBTreeElement(bTreeLeaf);
			if (result == null)
				result = caseNamedElement(bTreeLeaf);
			if (result == null)
				result = caseAbstractNamedElement(bTreeLeaf);
			if (result == null)
				result = caseCapellaElement(bTreeLeaf);
			if (result == null)
				result = caseTraceableElement(bTreeLeaf);
			if (result == null)
				result = casePublishableElement(bTreeLeaf);
			if (result == null)
				result = caseModelElement(bTreeLeaf);
			if (result == null)
				result = caseExtensibleElement(bTreeLeaf);
			if (result == null)
				result = caseElement(bTreeLeaf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_DECORATOR: {
			BTreeDecorator bTreeDecorator = (BTreeDecorator) theEObject;
			T result = caseBTreeDecorator(bTreeDecorator);
			if (result == null)
				result = caseBTreeNode(bTreeDecorator);
			if (result == null)
				result = caseBTreeElement(bTreeDecorator);
			if (result == null)
				result = caseNamedElement(bTreeDecorator);
			if (result == null)
				result = caseAbstractNamedElement(bTreeDecorator);
			if (result == null)
				result = caseCapellaElement(bTreeDecorator);
			if (result == null)
				result = caseTraceableElement(bTreeDecorator);
			if (result == null)
				result = casePublishableElement(bTreeDecorator);
			if (result == null)
				result = caseModelElement(bTreeDecorator);
			if (result == null)
				result = caseExtensibleElement(bTreeDecorator);
			if (result == null)
				result = caseElement(bTreeDecorator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_SEQUENCE: {
			BTreeSequence bTreeSequence = (BTreeSequence) theEObject;
			T result = caseBTreeSequence(bTreeSequence);
			if (result == null)
				result = caseBTreeContainer(bTreeSequence);
			if (result == null)
				result = caseBTreeNode(bTreeSequence);
			if (result == null)
				result = caseBTreeElement(bTreeSequence);
			if (result == null)
				result = caseNamedElement(bTreeSequence);
			if (result == null)
				result = caseAbstractNamedElement(bTreeSequence);
			if (result == null)
				result = caseCapellaElement(bTreeSequence);
			if (result == null)
				result = caseTraceableElement(bTreeSequence);
			if (result == null)
				result = casePublishableElement(bTreeSequence);
			if (result == null)
				result = caseModelElement(bTreeSequence);
			if (result == null)
				result = caseExtensibleElement(bTreeSequence);
			if (result == null)
				result = caseElement(bTreeSequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_FALLBACK: {
			BTreeFallback bTreeFallback = (BTreeFallback) theEObject;
			T result = caseBTreeFallback(bTreeFallback);
			if (result == null)
				result = caseBTreeContainer(bTreeFallback);
			if (result == null)
				result = caseBTreeNode(bTreeFallback);
			if (result == null)
				result = caseBTreeElement(bTreeFallback);
			if (result == null)
				result = caseNamedElement(bTreeFallback);
			if (result == null)
				result = caseAbstractNamedElement(bTreeFallback);
			if (result == null)
				result = caseCapellaElement(bTreeFallback);
			if (result == null)
				result = caseTraceableElement(bTreeFallback);
			if (result == null)
				result = casePublishableElement(bTreeFallback);
			if (result == null)
				result = caseModelElement(bTreeFallback);
			if (result == null)
				result = caseExtensibleElement(bTreeFallback);
			if (result == null)
				result = caseElement(bTreeFallback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_ROOT: {
			BTreeRoot bTreeRoot = (BTreeRoot) theEObject;
			T result = caseBTreeRoot(bTreeRoot);
			if (result == null)
				result = caseElementExtension(bTreeRoot);
			if (result == null)
				result = caseBTreeElement(bTreeRoot);
			if (result == null)
				result = caseNamedElement(bTreeRoot);
			if (result == null)
				result = caseElement(bTreeRoot);
			if (result == null)
				result = caseAbstractNamedElement(bTreeRoot);
			if (result == null)
				result = caseCapellaElement(bTreeRoot);
			if (result == null)
				result = caseTraceableElement(bTreeRoot);
			if (result == null)
				result = casePublishableElement(bTreeRoot);
			if (result == null)
				result = caseExtensibleElement(bTreeRoot);
			if (result == null)
				result = caseModelElement(bTreeRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.BTREE_INCLUDE: {
			BTreeInclude bTreeInclude = (BTreeInclude) theEObject;
			T result = caseBTreeInclude(bTreeInclude);
			if (result == null)
				result = caseBTreeNode(bTreeInclude);
			if (result == null)
				result = caseBTreeElement(bTreeInclude);
			if (result == null)
				result = caseNamedElement(bTreeInclude);
			if (result == null)
				result = caseAbstractNamedElement(bTreeInclude);
			if (result == null)
				result = caseCapellaElement(bTreeInclude);
			if (result == null)
				result = caseTraceableElement(bTreeInclude);
			if (result == null)
				result = casePublishableElement(bTreeInclude);
			if (result == null)
				result = caseModelElement(bTreeInclude);
			if (result == null)
				result = caseExtensibleElement(bTreeInclude);
			if (result == null)
				result = caseElement(bTreeInclude);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = caseBTreeLeaf(action);
			if (result == null)
				result = caseBTreeNode(action);
			if (result == null)
				result = caseBTreeElement(action);
			if (result == null)
				result = caseNamedElement(action);
			if (result == null)
				result = caseAbstractNamedElement(action);
			if (result == null)
				result = caseCapellaElement(action);
			if (result == null)
				result = caseTraceableElement(action);
			if (result == null)
				result = casePublishableElement(action);
			if (result == null)
				result = caseModelElement(action);
			if (result == null)
				result = caseExtensibleElement(action);
			if (result == null)
				result = caseElement(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.CONDITION: {
			Condition condition = (Condition) theEObject;
			T result = caseCondition(condition);
			if (result == null)
				result = caseBTreeLeaf(condition);
			if (result == null)
				result = caseBTreeNode(condition);
			if (result == null)
				result = caseBTreeElement(condition);
			if (result == null)
				result = caseNamedElement(condition);
			if (result == null)
				result = caseAbstractNamedElement(condition);
			if (result == null)
				result = caseCapellaElement(condition);
			if (result == null)
				result = caseTraceableElement(condition);
			if (result == null)
				result = casePublishableElement(condition);
			if (result == null)
				result = caseModelElement(condition);
			if (result == null)
				result = caseExtensibleElement(condition);
			if (result == null)
				result = caseElement(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.PARALLEL: {
			Parallel parallel = (Parallel) theEObject;
			T result = caseParallel(parallel);
			if (result == null)
				result = caseBTreeContainer(parallel);
			if (result == null)
				result = caseBTreeNode(parallel);
			if (result == null)
				result = caseBTreeElement(parallel);
			if (result == null)
				result = caseNamedElement(parallel);
			if (result == null)
				result = caseAbstractNamedElement(parallel);
			if (result == null)
				result = caseCapellaElement(parallel);
			if (result == null)
				result = caseTraceableElement(parallel);
			if (result == null)
				result = casePublishableElement(parallel);
			if (result == null)
				result = caseModelElement(parallel);
			if (result == null)
				result = caseExtensibleElement(parallel);
			if (result == null)
				result = caseElement(parallel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.SEQUENCE: {
			Sequence sequence = (Sequence) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = caseBTreeSequence(sequence);
			if (result == null)
				result = caseBTreeContainer(sequence);
			if (result == null)
				result = caseBTreeNode(sequence);
			if (result == null)
				result = caseBTreeElement(sequence);
			if (result == null)
				result = caseNamedElement(sequence);
			if (result == null)
				result = caseAbstractNamedElement(sequence);
			if (result == null)
				result = caseCapellaElement(sequence);
			if (result == null)
				result = caseTraceableElement(sequence);
			if (result == null)
				result = casePublishableElement(sequence);
			if (result == null)
				result = caseModelElement(sequence);
			if (result == null)
				result = caseExtensibleElement(sequence);
			if (result == null)
				result = caseElement(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.REACTIVE_SEQUENCE: {
			ReactiveSequence reactiveSequence = (ReactiveSequence) theEObject;
			T result = caseReactiveSequence(reactiveSequence);
			if (result == null)
				result = caseBTreeSequence(reactiveSequence);
			if (result == null)
				result = caseBTreeContainer(reactiveSequence);
			if (result == null)
				result = caseBTreeNode(reactiveSequence);
			if (result == null)
				result = caseBTreeElement(reactiveSequence);
			if (result == null)
				result = caseNamedElement(reactiveSequence);
			if (result == null)
				result = caseAbstractNamedElement(reactiveSequence);
			if (result == null)
				result = caseCapellaElement(reactiveSequence);
			if (result == null)
				result = caseTraceableElement(reactiveSequence);
			if (result == null)
				result = casePublishableElement(reactiveSequence);
			if (result == null)
				result = caseModelElement(reactiveSequence);
			if (result == null)
				result = caseExtensibleElement(reactiveSequence);
			if (result == null)
				result = caseElement(reactiveSequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.SEQUENCE_STAR: {
			SequenceStar sequenceStar = (SequenceStar) theEObject;
			T result = caseSequenceStar(sequenceStar);
			if (result == null)
				result = caseBTreeSequence(sequenceStar);
			if (result == null)
				result = caseBTreeContainer(sequenceStar);
			if (result == null)
				result = caseBTreeNode(sequenceStar);
			if (result == null)
				result = caseBTreeElement(sequenceStar);
			if (result == null)
				result = caseNamedElement(sequenceStar);
			if (result == null)
				result = caseAbstractNamedElement(sequenceStar);
			if (result == null)
				result = caseCapellaElement(sequenceStar);
			if (result == null)
				result = caseTraceableElement(sequenceStar);
			if (result == null)
				result = casePublishableElement(sequenceStar);
			if (result == null)
				result = caseModelElement(sequenceStar);
			if (result == null)
				result = caseExtensibleElement(sequenceStar);
			if (result == null)
				result = caseElement(sequenceStar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.FALLBACK: {
			Fallback fallback = (Fallback) theEObject;
			T result = caseFallback(fallback);
			if (result == null)
				result = caseBTreeFallback(fallback);
			if (result == null)
				result = caseBTreeContainer(fallback);
			if (result == null)
				result = caseBTreeNode(fallback);
			if (result == null)
				result = caseBTreeElement(fallback);
			if (result == null)
				result = caseNamedElement(fallback);
			if (result == null)
				result = caseAbstractNamedElement(fallback);
			if (result == null)
				result = caseCapellaElement(fallback);
			if (result == null)
				result = caseTraceableElement(fallback);
			if (result == null)
				result = casePublishableElement(fallback);
			if (result == null)
				result = caseModelElement(fallback);
			if (result == null)
				result = caseExtensibleElement(fallback);
			if (result == null)
				result = caseElement(fallback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.REACTIVE_FALLBACK: {
			ReactiveFallback reactiveFallback = (ReactiveFallback) theEObject;
			T result = caseReactiveFallback(reactiveFallback);
			if (result == null)
				result = caseBTreeFallback(reactiveFallback);
			if (result == null)
				result = caseBTreeContainer(reactiveFallback);
			if (result == null)
				result = caseBTreeNode(reactiveFallback);
			if (result == null)
				result = caseBTreeElement(reactiveFallback);
			if (result == null)
				result = caseNamedElement(reactiveFallback);
			if (result == null)
				result = caseAbstractNamedElement(reactiveFallback);
			if (result == null)
				result = caseCapellaElement(reactiveFallback);
			if (result == null)
				result = caseTraceableElement(reactiveFallback);
			if (result == null)
				result = casePublishableElement(reactiveFallback);
			if (result == null)
				result = caseModelElement(reactiveFallback);
			if (result == null)
				result = caseExtensibleElement(reactiveFallback);
			if (result == null)
				result = caseElement(reactiveFallback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.INVERTER: {
			Inverter inverter = (Inverter) theEObject;
			T result = caseInverter(inverter);
			if (result == null)
				result = caseBTreeDecorator(inverter);
			if (result == null)
				result = caseBTreeNode(inverter);
			if (result == null)
				result = caseBTreeElement(inverter);
			if (result == null)
				result = caseNamedElement(inverter);
			if (result == null)
				result = caseAbstractNamedElement(inverter);
			if (result == null)
				result = caseCapellaElement(inverter);
			if (result == null)
				result = caseTraceableElement(inverter);
			if (result == null)
				result = casePublishableElement(inverter);
			if (result == null)
				result = caseModelElement(inverter);
			if (result == null)
				result = caseExtensibleElement(inverter);
			if (result == null)
				result = caseElement(inverter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.FORCE_SUCCESS: {
			ForceSuccess forceSuccess = (ForceSuccess) theEObject;
			T result = caseForceSuccess(forceSuccess);
			if (result == null)
				result = caseBTreeDecorator(forceSuccess);
			if (result == null)
				result = caseBTreeNode(forceSuccess);
			if (result == null)
				result = caseBTreeElement(forceSuccess);
			if (result == null)
				result = caseNamedElement(forceSuccess);
			if (result == null)
				result = caseAbstractNamedElement(forceSuccess);
			if (result == null)
				result = caseCapellaElement(forceSuccess);
			if (result == null)
				result = caseTraceableElement(forceSuccess);
			if (result == null)
				result = casePublishableElement(forceSuccess);
			if (result == null)
				result = caseModelElement(forceSuccess);
			if (result == null)
				result = caseExtensibleElement(forceSuccess);
			if (result == null)
				result = caseElement(forceSuccess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.FORCE_FAILURE: {
			ForceFailure forceFailure = (ForceFailure) theEObject;
			T result = caseForceFailure(forceFailure);
			if (result == null)
				result = caseBTreeDecorator(forceFailure);
			if (result == null)
				result = caseBTreeNode(forceFailure);
			if (result == null)
				result = caseBTreeElement(forceFailure);
			if (result == null)
				result = caseNamedElement(forceFailure);
			if (result == null)
				result = caseAbstractNamedElement(forceFailure);
			if (result == null)
				result = caseCapellaElement(forceFailure);
			if (result == null)
				result = caseTraceableElement(forceFailure);
			if (result == null)
				result = casePublishableElement(forceFailure);
			if (result == null)
				result = caseModelElement(forceFailure);
			if (result == null)
				result = caseExtensibleElement(forceFailure);
			if (result == null)
				result = caseElement(forceFailure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.REPEAT: {
			Repeat repeat = (Repeat) theEObject;
			T result = caseRepeat(repeat);
			if (result == null)
				result = caseBTreeDecorator(repeat);
			if (result == null)
				result = caseBTreeNode(repeat);
			if (result == null)
				result = caseBTreeElement(repeat);
			if (result == null)
				result = caseNamedElement(repeat);
			if (result == null)
				result = caseAbstractNamedElement(repeat);
			if (result == null)
				result = caseCapellaElement(repeat);
			if (result == null)
				result = caseTraceableElement(repeat);
			if (result == null)
				result = casePublishableElement(repeat);
			if (result == null)
				result = caseModelElement(repeat);
			if (result == null)
				result = caseExtensibleElement(repeat);
			if (result == null)
				result = caseElement(repeat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BehaviourTreePackage.RETRY: {
			Retry retry = (Retry) theEObject;
			T result = caseRetry(retry);
			if (result == null)
				result = caseBTreeDecorator(retry);
			if (result == null)
				result = caseBTreeNode(retry);
			if (result == null)
				result = caseBTreeElement(retry);
			if (result == null)
				result = caseNamedElement(retry);
			if (result == null)
				result = caseAbstractNamedElement(retry);
			if (result == null)
				result = caseCapellaElement(retry);
			if (result == null)
				result = caseTraceableElement(retry);
			if (result == null)
				result = casePublishableElement(retry);
			if (result == null)
				result = caseModelElement(retry);
			if (result == null)
				result = caseExtensibleElement(retry);
			if (result == null)
				result = caseElement(retry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeElement(BTreeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeNode(BTreeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeContainer(BTreeContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Leaf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeLeaf(BTreeLeaf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeDecorator(BTreeDecorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeSequence(BTreeSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Fallback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeFallback(BTreeFallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeRoot(BTreeRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BTree Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BTree Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTreeInclude(BTreeInclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveSequence(ReactiveSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Star</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStar(SequenceStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fallback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallback(Fallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactive Fallback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactive Fallback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactiveFallback(ReactiveFallback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverter(Inverter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Success</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Success</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceSuccess(ForceSuccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Force Failure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Force Failure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForceFailure(ForceFailure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetry(Retry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleElement(ExtensibleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableElement(TraceableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishableElement(PublishableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapellaElement(CapellaElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementExtension(ElementExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BehaviourTreeSwitch
