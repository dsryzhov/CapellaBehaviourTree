/**
 * <copyright>
 *
 * </copyright>
 */

package rds.capella.btree.data.helpers;

import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.polarsys.capella.common.model.helpers.IHelper;

import rds.capella.btree.data.BehaviourTree.BTreeElement;
import rds.capella.btree.data.BehaviourTree.BTreeNode;
import rds.capella.btree.data.BehaviourTree.BTreeContainer;
import rds.capella.btree.data.BehaviourTree.BTreeLeaf;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;
import rds.capella.btree.data.BehaviourTree.BTreeSequence;
import rds.capella.btree.data.BehaviourTree.BTreeFallback;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BTreeInclude;
import rds.capella.btree.data.BehaviourTree.Action;
import rds.capella.btree.data.BehaviourTree.Condition;
import rds.capella.btree.data.BehaviourTree.Parallel;
import rds.capella.btree.data.BehaviourTree.Sequence;
import rds.capella.btree.data.BehaviourTree.ReactiveSequence;
import rds.capella.btree.data.BehaviourTree.SequenceStar;
import rds.capella.btree.data.BehaviourTree.Fallback;
import rds.capella.btree.data.BehaviourTree.ReactiveFallback;
import rds.capella.btree.data.BehaviourTree.Inverter;
import rds.capella.btree.data.BehaviourTree.ForceSuccess;
import rds.capella.btree.data.BehaviourTree.ForceFailure;
import rds.capella.btree.data.BehaviourTree.Repeat;
import rds.capella.btree.data.BehaviourTree.Retry;

/**
 * @generated 
 */
public class BehaviourTreePackageHelper implements IHelper {

	/**
	 * @generated
	 */
	public Object getValue(EObject object, EStructuralFeature feature, EAnnotation annotation) {
		Object ret = null;

		if (ret == null && object instanceof BTreeElement) {
			ret = BTreeElementHelper.getInstance().doSwitch((BTreeElement) object, feature);
		}
		if (ret == null && object instanceof BTreeNode) {
			ret = BTreeNodeHelper.getInstance().doSwitch((BTreeNode) object, feature);
		}
		if (ret == null && object instanceof BTreeContainer) {
			ret = BTreeContainerHelper.getInstance().doSwitch((BTreeContainer) object, feature);
		}
		if (ret == null && object instanceof BTreeLeaf) {
			ret = BTreeLeafHelper.getInstance().doSwitch((BTreeLeaf) object, feature);
		}
		if (ret == null && object instanceof BTreeDecorator) {
			ret = BTreeDecoratorHelper.getInstance().doSwitch((BTreeDecorator) object, feature);
		}
		if (ret == null && object instanceof BTreeSequence) {
			ret = BTreeSequenceHelper.getInstance().doSwitch((BTreeSequence) object, feature);
		}
		if (ret == null && object instanceof BTreeFallback) {
			ret = BTreeFallbackHelper.getInstance().doSwitch((BTreeFallback) object, feature);
		}
		if (ret == null && object instanceof BTreeRoot) {
			ret = BTreeRootHelper.getInstance().doSwitch((BTreeRoot) object, feature);
		}
		if (ret == null && object instanceof BTreeInclude) {
			ret = BTreeIncludeHelper.getInstance().doSwitch((BTreeInclude) object, feature);
		}
		if (ret == null && object instanceof Action) {
			ret = ActionHelper.getInstance().doSwitch((Action) object, feature);
		}
		if (ret == null && object instanceof Condition) {
			ret = ConditionHelper.getInstance().doSwitch((Condition) object, feature);
		}
		if (ret == null && object instanceof Parallel) {
			ret = ParallelHelper.getInstance().doSwitch((Parallel) object, feature);
		}
		if (ret == null && object instanceof Sequence) {
			ret = SequenceHelper.getInstance().doSwitch((Sequence) object, feature);
		}
		if (ret == null && object instanceof ReactiveSequence) {
			ret = ReactiveSequenceHelper.getInstance().doSwitch((ReactiveSequence) object, feature);
		}
		if (ret == null && object instanceof SequenceStar) {
			ret = SequenceStarHelper.getInstance().doSwitch((SequenceStar) object, feature);
		}
		if (ret == null && object instanceof Fallback) {
			ret = FallbackHelper.getInstance().doSwitch((Fallback) object, feature);
		}
		if (ret == null && object instanceof ReactiveFallback) {
			ret = ReactiveFallbackHelper.getInstance().doSwitch((ReactiveFallback) object, feature);
		}
		if (ret == null && object instanceof Inverter) {
			ret = InverterHelper.getInstance().doSwitch((Inverter) object, feature);
		}
		if (ret == null && object instanceof ForceSuccess) {
			ret = ForceSuccessHelper.getInstance().doSwitch((ForceSuccess) object, feature);
		}
		if (ret == null && object instanceof ForceFailure) {
			ret = ForceFailureHelper.getInstance().doSwitch((ForceFailure) object, feature);
		}
		if (ret == null && object instanceof Repeat) {
			ret = RepeatHelper.getInstance().doSwitch((Repeat) object, feature);
		}
		if (ret == null && object instanceof Retry) {
			ret = RetryHelper.getInstance().doSwitch((Retry) object, feature);
		}
		return ret;
	}

}
