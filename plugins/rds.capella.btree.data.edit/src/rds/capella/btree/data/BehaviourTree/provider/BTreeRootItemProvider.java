
package rds.capella.btree.data.BehaviourTree.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.ElementExtensionItemProvider;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BehaviourTreeFactory;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * This is the item provider adapter for a {@link rds.capella.btree.data.BehaviourTree.BTreeRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTreeRootItemProvider extends ElementExtensionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTreeRootItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addSidPropertyDescriptor(object);
			addConstraintsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIncomingTracesPropertyDescriptor(object);
			addOutgoingTracesPropertyDescriptor(object);
			addVisibleInDocPropertyDescriptor(object);
			addVisibleInLMPropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addReviewPropertyDescriptor(object);
			addAppliedPropertyValuesPropertyDescriptor(object);
			addAppliedPropertyValueGroupsPropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
			addAppliedRequirementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelElement_id_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_id_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_ModelElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.MODEL_ELEMENT__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelElement_sid_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_sid_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_ModelElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.MODEL_ELEMENT__SID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelElement_constraints_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_constraints_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ModelElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.MODEL_ELEMENT__CONSTRAINTS, false, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractNamedElement_name_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_AbstractNamedElement_name_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_AbstractNamedElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.ABSTRACT_NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTracesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TraceableElement_incomingTraces_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_incomingTraces_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_TraceableElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.TRACEABLE_ELEMENT__INCOMING_TRACES, false, false, false, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTracesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_TraceableElement_outgoingTraces_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_outgoingTraces_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_TraceableElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.TRACEABLE_ELEMENT__OUTGOING_TRACES, false, false, false, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Visible In Doc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleInDocPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PublishableElement_visibleInDoc_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInDoc_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_PublishableElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Visible In LM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleInLMPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PublishableElement_visibleInLM_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInLM_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_PublishableElement_type"), //$NON-NLS-1$
						ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_summary_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_summary_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_CapellaElement_type"), //$NON-NLS-1$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__SUMMARY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_description_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_description_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_CapellaElement_type"), //$NON-NLS-1$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Review feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReviewPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_review_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_review_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_CapellaElement_type"), //$NON-NLS-1$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__REVIEW, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Applied Property Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedPropertyValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_appliedPropertyValues_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_CapellaElement_appliedPropertyValues_feature", "_UI_CapellaElement_type"), //$NON-NLS-1$ //$NON-NLS-2$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Applied Property Value Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedPropertyValueGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_appliedPropertyValueGroups_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_CapellaElement_appliedPropertyValueGroups_feature", "_UI_CapellaElement_type"), //$NON-NLS-1$ //$NON-NLS-2$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_status_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_status_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_CapellaElement_type"), //$NON-NLS-1$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_features_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_features_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_CapellaElement_type"), //$NON-NLS-1$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__FEATURES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Applied Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CapellaElement_appliedRequirements_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
								"_UI_CapellaElement_appliedRequirements_feature", "_UI_CapellaElement_type"), //$NON-NLS-1$ //$NON-NLS-2$
						CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS, false, false, false, null,
						null, null));
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
			childrenFeatures.add(ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_CONSTRAINTS);
			childrenFeatures.add(ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS);
			childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES);
			childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES);
			childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS);
			childrenFeatures.add(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns BTreeRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BTreeRoot")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public String getText(Object object) {
		String label = ((BTreeRoot) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BTreeRoot_type") : //$NON-NLS-1$
				label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(BTreeRoot.class)) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
		case BehaviourTreePackage.BTREE_ROOT__SID:
		case BehaviourTreePackage.BTREE_ROOT__NAME:
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
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

		newChildDescriptors.add(createChildParameter(EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
				BehaviourTreeFactory.eINSTANCE.createBTreeRoot()));

		newChildDescriptors.add(createChildParameter(ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_CONSTRAINTS,
				CapellacoreFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
				CapellacoreFactory.eINSTANCE.createStringPropertyValue()));

		newChildDescriptors.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
				CapellacoreFactory.eINSTANCE.createIntegerPropertyValue()));

		newChildDescriptors.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
				CapellacoreFactory.eINSTANCE.createBooleanPropertyValue()));

		newChildDescriptors.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
				CapellacoreFactory.eINSTANCE.createFloatPropertyValue()));

		newChildDescriptors.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
				CapellacoreFactory.eINSTANCE.createEnumerationPropertyValue()));

		newChildDescriptors
				.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES,
						CapellacoreFactory.eINSTANCE.createEnumerationPropertyType()));

		newChildDescriptors
				.add(createChildParameter(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS,
						CapellacoreFactory.eINSTANCE.createPropertyValueGroup()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createBTreeInclude()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createReactiveSequence()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createSequenceStar()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createFallback()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createReactiveFallback()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createInverter()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createForceSuccess()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createForceFailure()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add(createChildParameter(BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
				BehaviourTreeFactory.eINSTANCE.createRetry()));
	}

}