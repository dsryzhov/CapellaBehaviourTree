package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.Repeat;

/**
 * @generated
 */
public class RepeatHelper {

	private static final RepeatHelper instance = new RepeatHelper();

	/**
	 * @generated
	 */
	public static RepeatHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(Repeat object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}