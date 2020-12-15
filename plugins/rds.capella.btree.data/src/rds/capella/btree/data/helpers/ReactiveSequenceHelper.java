package rds.capella.btree.data.helpers;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.capella.common.model.helpers.HelperNotFoundException;
import rds.capella.btree.data.BehaviourTree.ReactiveSequence;

/**
 * @generated
 */
public class ReactiveSequenceHelper {

	private static final ReactiveSequenceHelper instance = new ReactiveSequenceHelper();

	/**
	 * @generated
	 */
	public static ReactiveSequenceHelper getInstance() {
		return instance;
	}

	/**
	 * @generated
	 */
	public Object doSwitch(ReactiveSequence object, EStructuralFeature feature) {
		// handle derivated feature

		// delegate to parent helper
		return org.polarsys.capella.core.data.helpers.capellacore.delegates.NamedElementHelper.getInstance()
				.doSwitch(object, feature);

	}

}