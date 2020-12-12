
package rds.capella.btree.data.BehaviourTree.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.information.InformationFactory;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.datavalue.DatavalueFactory;
import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.ElementExtensionItemProvider;
import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BehaviourTreeFactory;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * This is the item provider adapter for a {@link rds.capella.btree.data.BehaviourTree.BTreeRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BTreeRootItemProvider extends ElementExtensionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor statusPropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor abstractTypePropertyDescriptor;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor typePropertyDescriptor;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor associationPropertyDescriptor;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS
			if (statusPropertyDescriptor != null) {
				Object statusValue = eObject.eGet(CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS, true);
				if (statusValue != null && statusValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) statusValue)) {
					itemPropertyDescriptors.remove(statusPropertyDescriptor);
				} else if (statusValue == null && ExtensionModelManager.getAnyType(eObject,
						CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS) != null) {
					itemPropertyDescriptors.remove(statusPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(statusPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(statusPropertyDescriptor);
				}
			}
			// Process ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE
			if (abstractTypePropertyDescriptor != null) {
				Object abstractTypeValue = eObject
						.eGet(ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE, true);
				if (abstractTypeValue != null && abstractTypeValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) abstractTypeValue)) {
					itemPropertyDescriptors.remove(abstractTypePropertyDescriptor);
				} else if (abstractTypeValue == null && ExtensionModelManager.getAnyType(eObject,
						ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE) != null) {
					itemPropertyDescriptors.remove(abstractTypePropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(abstractTypePropertyDescriptor) == false) {
					itemPropertyDescriptors.add(abstractTypePropertyDescriptor);
				}
			}
			// Process CapellacorePackage.Literals.TYPED_ELEMENT__TYPE
			if (typePropertyDescriptor != null) {
				Object typeValue = eObject.eGet(CapellacorePackage.Literals.TYPED_ELEMENT__TYPE, true);
				if (typeValue != null && typeValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) typeValue)) {
					itemPropertyDescriptors.remove(typePropertyDescriptor);
				} else if (typeValue == null && ExtensionModelManager.getAnyType(eObject,
						CapellacorePackage.Literals.TYPED_ELEMENT__TYPE) != null) {
					itemPropertyDescriptors.remove(typePropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(typePropertyDescriptor) == false) {
					itemPropertyDescriptors.add(typePropertyDescriptor);
				}
			}
			// Process InformationPackage.Literals.PROPERTY__ASSOCIATION
			if (associationPropertyDescriptor != null) {
				Object associationValue = eObject.eGet(InformationPackage.Literals.PROPERTY__ASSOCIATION, true);
				if (associationValue != null && associationValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) associationValue)) {
					itemPropertyDescriptors.remove(associationPropertyDescriptor);
				} else if (associationValue == null && ExtensionModelManager.getAnyType(eObject,
						InformationPackage.Literals.PROPERTY__ASSOCIATION) != null) {
					itemPropertyDescriptors.remove(associationPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(associationPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(associationPropertyDescriptor);
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
			addIsAbstractPropertyDescriptor(object);
			addIsStaticPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
			addAbstractTypePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addOrderedPropertyDescriptor(object);
			addUniquePropertyDescriptor(object);
			addMinInclusivePropertyDescriptor(object);
			addMaxInclusivePropertyDescriptor(object);
			addFinalPropertyDescriptor(object);
			addAggregationKindPropertyDescriptor(object);
			addIsDerivedPropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
			addIsPartOfKeyPropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
			addRepresentingInstanceRolesPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelElement_id_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_id_feature", "_UI_ModelElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				ModellingcorePackage.Literals.MODEL_ELEMENT__ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Sid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSidPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelElement_sid_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_sid_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ModelElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.MODEL_ELEMENT__SID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Constraints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelElement_constraints_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_ModelElement_constraints_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_ModelElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.MODEL_ELEMENT__CONSTRAINTS, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractNamedElement_name_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractNamedElement_name_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AbstractNamedElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.ABSTRACT_NAMED_ELEMENT__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Incoming Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingTracesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TraceableElement_incomingTraces_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_incomingTraces_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_TraceableElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.TRACEABLE_ELEMENT__INCOMING_TRACES, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Outgoing Traces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingTracesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TraceableElement_outgoingTraces_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_outgoingTraces_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_TraceableElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.TRACEABLE_ELEMENT__OUTGOING_TRACES, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Visible In Doc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleInDocPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PublishableElement_visibleInDoc_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInDoc_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_PublishableElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Visible In LM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibleInLMPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PublishableElement_visibleInLM_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInLM_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_PublishableElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Summary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_summary_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_summary_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__SUMMARY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_description_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_description_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__DESCRIPTION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Review feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReviewPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_review_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_review_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__REVIEW, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Applied Property Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedPropertyValuesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_appliedPropertyValues_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedPropertyValues_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES, true, false, true, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Applied Property Value Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedPropertyValueGroupsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_appliedPropertyValueGroups_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedPropertyValueGroups_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS, true, false, true, null,
				null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		// begin-extension-code
		statusPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_status_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_status_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(statusPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_features_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_features_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__FEATURES, true, false, true, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Applied Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedRequirementsPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CapellaElement_appliedRequirements_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedRequirements_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_CapellaElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS, false, false, false, null, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Feature_isAbstract_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Feature_isAbstract_feature", "_UI_Feature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				CapellacorePackage.Literals.FEATURE__IS_ABSTRACT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Static feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Feature_isStatic_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Feature_isStatic_feature", "_UI_Feature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				CapellacorePackage.Literals.FEATURE__IS_STATIC, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Feature_visibility_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Feature_visibility_feature", "_UI_Feature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				CapellacorePackage.Literals.FEATURE__VISIBILITY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Abstract Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractTypePropertyDescriptor(Object object) {
		// begin-extension-code
		abstractTypePropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractTypedElement_abstractType_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_AbstractTypedElement_abstractType_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_AbstractTypedElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(abstractTypePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		// begin-extension-code
		typePropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TypedElement_type_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_TypedElement_type_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_TypedElement_type"), //$NON-NLS-1$
				CapellacorePackage.Literals.TYPED_ELEMENT__TYPE, false, false, false, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(typePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderedPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultiplicityElement_ordered_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_ordered_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_MultiplicityElement_type"), //$NON-NLS-1$
				InformationPackage.Literals.MULTIPLICITY_ELEMENT__ORDERED, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUniquePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultiplicityElement_unique_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_unique_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_MultiplicityElement_type"), //$NON-NLS-1$
				InformationPackage.Literals.MULTIPLICITY_ELEMENT__UNIQUE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Min Inclusive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinInclusivePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultiplicityElement_minInclusive_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_minInclusive_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_MultiplicityElement_type"), //$NON-NLS-1$
				InformationPackage.Literals.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Max Inclusive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxInclusivePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MultiplicityElement_maxInclusive_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_maxInclusive_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_MultiplicityElement_type"), //$NON-NLS-1$
				InformationPackage.Literals.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Final feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_FinalizableElement_final_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_FinalizableElement_final_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_FinalizableElement_type"), //$NON-NLS-1$
				ModellingcorePackage.Literals.FINALIZABLE_ELEMENT__FINAL, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Aggregation Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAggregationKindPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_aggregationKind_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Property_aggregationKind_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Property_type"), //$NON-NLS-1$
				InformationPackage.Literals.PROPERTY__AGGREGATION_KIND, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Derived feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDerivedPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_isDerived_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Property_isDerived_feature", "_UI_Property_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				InformationPackage.Literals.PROPERTY__IS_DERIVED, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_isReadOnly_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Property_isReadOnly_feature", "_UI_Property_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				InformationPackage.Literals.PROPERTY__IS_READ_ONLY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Is Part Of Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPartOfKeyPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_isPartOfKey_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Property_isPartOfKey_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Property_type"), //$NON-NLS-1$
				InformationPackage.Literals.PROPERTY__IS_PART_OF_KEY, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
				// begin-extension-code
				null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		// begin-extension-code
		associationPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Property_association_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Property_association_feature", //$NON-NLS-1$//$NON-NLS-2$
						"_UI_Property_type"), //$NON-NLS-1$
				InformationPackage.Literals.PROPERTY__ASSOCIATION, false, false, false, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(associationPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Representing Instance Roles feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepresentingInstanceRolesPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
		// end-extension-code
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AbstractInstance_representingInstanceRoles_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", //$NON-NLS-1$
						"_UI_AbstractInstance_representingInstanceRoles_feature", "_UI_AbstractInstance_type"), //$NON-NLS-1$ //$NON-NLS-2$
				InformationPackage.Literals.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES, false, false, false, null,
				null,
				// begin-extension-code
				null));
		// end-extension-code
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
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD);
			childrenFeatures.add(InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH);
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
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((BTreeRoot) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_BTreeRoot_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(BTreeRoot.class)) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
		case BehaviourTreePackage.BTREE_ROOT__SID:
		case BehaviourTreePackage.BTREE_ROOT__NAME:
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
		case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
		case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
		case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
		case BehaviourTreePackage.BTREE_ROOT__ORDERED:
		case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
		case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
		case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
		case BehaviourTreePackage.BTREE_ROOT__FINAL:
		case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
		case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
		case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
		case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
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
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					BehaviourTreeFactory.eINSTANCE.createBTreeRoot());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_CONSTRAINTS,
					CapellacoreFactory.eINSTANCE.createConstraint());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
					CapellacoreFactory.eINSTANCE.createStringPropertyValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
					CapellacoreFactory.eINSTANCE.createIntegerPropertyValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
					CapellacoreFactory.eINSTANCE.createBooleanPropertyValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
					CapellacoreFactory.eINSTANCE.createFloatPropertyValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
					CapellacoreFactory.eINSTANCE.createEnumerationPropertyValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES,
					CapellacoreFactory.eINSTANCE.createEnumerationPropertyType());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS,
					CapellacoreFactory.eINSTANCE.createPropertyValueGroup());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					InformationFactory.eINSTANCE.createCollectionValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					InformationFactory.eINSTANCE.createCollectionValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralBooleanValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createBooleanReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationLiteral());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralStringValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createStringReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					InformationFactory.eINSTANCE.createCollectionValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					InformationFactory.eINSTANCE.createCollectionValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralBooleanValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createBooleanReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationLiteral());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralStringValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createStringReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					InformationFactory.eINSTANCE.createCollectionValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					InformationFactory.eINSTANCE.createCollectionValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralBooleanValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createBooleanReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationLiteral());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralStringValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createStringReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					InformationFactory.eINSTANCE.createCollectionValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					InformationFactory.eINSTANCE.createCollectionValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralBooleanValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createBooleanReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationLiteral());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createEnumerationReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralStringValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createStringReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createComplexValueReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH,
					DatavalueFactory.eINSTANCE.createLiteralNumericValue());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH,
					DatavalueFactory.eINSTANCE.createNumericReference());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH,
					DatavalueFactory.eINSTANCE.createBinaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH,
					DatavalueFactory.eINSTANCE.createUnaryExpression());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createParallel());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createSequence());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createReactiveSequence());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createSequenceStar());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createFallback());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					BehaviourTreePackage.Literals.BTREE_ROOT__OWNED_BTREE_CONTAINER,
					BehaviourTreeFactory.eINSTANCE.createReactiveFallback());
			if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD
				|| childFeature == InformationPackage.Literals.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}