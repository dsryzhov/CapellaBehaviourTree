package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.SequenceStar;

/**
 * @generated
 */
public class SequenceStarHelper {

	private static final SequenceStarHelper instance = new SequenceStarHelper();

	/**
	 * @generated
	 */
	public static SequenceStarHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(SequenceStar object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}