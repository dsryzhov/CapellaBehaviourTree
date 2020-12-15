
package rds.capella.btree.data.BehaviourTree.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.capella.core.data.information.InformationPackage;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import rds.capella.btree.data.BehaviourTree.BTreeInclude;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * This is the item provider adapter for a {@link rds.capella.btree.data.BehaviourTree.BTreeInclude} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTreeIncludeItemProvider extends BTreeNodeItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor btreeReferencePropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTreeIncludeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process BehaviourTreePackage.Literals.BTREE_INCLUDE__BTREE_REFERENCE
			if (btreeReferencePropertyDescriptor != null) {
				Object btreeReferenceValue = eObject.eGet(BehaviourTreePackage.Literals.BTREE_INCLUDE__BTREE_REFERENCE,
						true);
				if (btreeReferenceValue != null && btreeReferenceValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) btreeReferenceValue)) {
					itemPropertyDescriptors.remove(btreeReferencePropertyDescriptor);
				} else if (btreeReferenceValue == null && ExtensionModelManager.getAnyType(eObject,
						BehaviourTreePackage.Literals.BTREE_INCLUDE__BTREE_REFERENCE) != null) {
					itemPropertyDescriptors.remove(btreeReferencePropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(btreeReferencePropertyDescriptor) == false) {
					itemPropertyDescriptors.add(btreeReferencePropertyDescriptor);
				}
			}
		}
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

			addBtreeReferencePropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Btree Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBtreeReferencePropertyDescriptor(Object object) {
		// begin-extension-code
		btreeReferencePropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BTreeInclude_btreeReference_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_BTreeInclude_btreeReference_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_BTreeInclude_type"), //$NON-NLS-1$
				BehaviourTreePackage.Literals.BTREE_INCLUDE__BTREE_REFERENCE, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(btreeReferencePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns BTreeInclude.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTreeInclude")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((BTreeInclude) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_BTreeInclude_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
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
	}

}