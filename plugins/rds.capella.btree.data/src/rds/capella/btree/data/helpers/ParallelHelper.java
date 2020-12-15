package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.Parallel;

/**
 * @generated
 */
public class ParallelHelper {

	private static final ParallelHelper instance = new ParallelHelper();

	/**
	 * @generated
	 */
	public static ParallelHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Parallel object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}