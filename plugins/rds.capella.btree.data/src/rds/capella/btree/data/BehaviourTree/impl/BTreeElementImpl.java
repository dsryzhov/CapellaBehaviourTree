
package rds.capella.btree.data.BehaviourTree.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.capella.core.data.capellacore.impl.NamedElementImpl;
import rds.capella.btree.data.BehaviourTree.BTreeElement;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTree Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BTreeElementImpl extends NamedElementImpl implements BTreeElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected BTreeElementImpl() {
		super();
		setId(EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTreePackage.Literals.BTREE_ELEMENT;
	}

} //BTreeElementImpl