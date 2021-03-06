package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;

/**
 * @generated
 */
public class BTreeDecoratorHelper {

	private static final BTreeDecoratorHelper instance = new BTreeDecoratorHelper();

	/**
	 * @generated
	 */
	public static BTreeDecoratorHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(BTreeDecorator object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}