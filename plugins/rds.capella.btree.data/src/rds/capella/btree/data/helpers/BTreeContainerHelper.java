package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.BTreeContainer;

/**
 * @generated
 */
public class BTreeContainerHelper {

	private static final BTreeContainerHelper instance = new BTreeContainerHelper();

	/**
	 * @generated
	 */
	public static BTreeContainerHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BTreeContainer object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}