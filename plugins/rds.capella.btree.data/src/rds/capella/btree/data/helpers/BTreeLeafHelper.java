package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.BTreeLeaf;

/**
 * @generated
 */
public class BTreeLeafHelper {

	private static final BTreeLeafHelper instance = new BTreeLeafHelper();

	/**
	 * @generated
	 */
	public static BTreeLeafHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BTreeLeaf object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}