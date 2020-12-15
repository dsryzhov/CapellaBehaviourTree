package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.ReactiveFallback;

/**
 * @generated
 */
public class ReactiveFallbackHelper {

	private static final ReactiveFallbackHelper instance = new ReactiveFallbackHelper();

	/**
	 * @generated
	 */
	public static ReactiveFallbackHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ReactiveFallback object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}