package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.Retry;

/**
 * @generated
 */
public class RetryHelper {

	private static final RetryHelper instance = new RetryHelper();

	/**
	 * @generated
	 */
	public static RetryHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Retry object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}