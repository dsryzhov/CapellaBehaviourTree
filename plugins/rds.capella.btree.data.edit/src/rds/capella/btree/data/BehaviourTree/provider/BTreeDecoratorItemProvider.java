
package rds.capella.btree.data.BehaviourTree.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import rds.capella.btree.data.BehaviourTree.BTreeDecorator;
import rds.capella.btree.data.BehaviourTree.BehaviourTreeFactory;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * This is the item provider adapter for a {@link rds.capella.btree.data.BehaviourTree.BTreeDecorator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTreeDecoratorItemProvider extends BTreeNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTreeDecoratorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BTreeDecorator) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BTreeDecorator_type") : //$NON-NLS-1$
				getString("_UI_BTreeDecorator_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BTreeDecorator.class)) {
		case BehaviourTreePackage.BTREE_DECORATOR__OWNED_NODE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createBTreeInclude()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createReactiveSequence()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createSequenceStar()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createFallback()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createReactiveFallback()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createInverter()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createForceSuccess()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createForceFailure()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_DECORATOR__OWNED_NODE,
				BehaviourTreeFactory.eINSTANCE.createRetry()));
	}

}