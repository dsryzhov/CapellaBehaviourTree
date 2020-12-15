package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.BTreeSequence;

/**
 * @generated
 */
public class BTreeSequenceHelper {

	private static final BTreeSequenceHelper instance = new BTreeSequenceHelper();

	/**
	 * @generated
	 */
	public static BTreeSequenceHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BTreeSequence object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}