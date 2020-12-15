package rds.capella.btree.data.BehaviourTree.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import rds.capella.btree.data.BehaviourTree.Sequence;

/**
 * This is the item provider adapter for a {@link SequenceSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null && obj.eClass()
				.equals(rds.capella.btree.data.BehaviourTree.BehaviourTreePackage.eINSTANCE.getSequence());
	}
}
