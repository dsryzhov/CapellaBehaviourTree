
package rds.capella.btree.data.BehaviourTree;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rds.capella.btree.data.BehaviourTree.BehaviourTreeFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension extensibleProviderFactory='true' childCreationExtenders='true' useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface BehaviourTreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BehaviourTree"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rds/capella/btree/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BehaviourTree"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourTreePackage eINSTANCE = rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl.init();

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeElementImpl <em>BTree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeElementImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeElement()
	 * @generated
	 */
	int BTREE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_EXTENSIONS = InformationPackage.ABSTRACT_INSTANCE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__ID = InformationPackage.ABSTRACT_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__SID = InformationPackage.ABSTRACT_INSTANCE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__CONSTRAINTS = InformationPackage.ABSTRACT_INSTANCE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_CONSTRAINTS = InformationPackage.ABSTRACT_INSTANCE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MIGRATED_ELEMENTS = InformationPackage.ABSTRACT_INSTANCE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__NAME = InformationPackage.ABSTRACT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__INCOMING_TRACES = InformationPackage.ABSTRACT_INSTANCE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OUTGOING_TRACES = InformationPackage.ABSTRACT_INSTANCE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__VISIBLE_IN_DOC = InformationPackage.ABSTRACT_INSTANCE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__VISIBLE_IN_LM = InformationPackage.ABSTRACT_INSTANCE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__SUMMARY = InformationPackage.ABSTRACT_INSTANCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__DESCRIPTION = InformationPackage.ABSTRACT_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__REVIEW = InformationPackage.ABSTRACT_INSTANCE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_PROPERTY_VALUES = InformationPackage.ABSTRACT_INSTANCE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES = InformationPackage.ABSTRACT_INSTANCE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__APPLIED_PROPERTY_VALUES = InformationPackage.ABSTRACT_INSTANCE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS = InformationPackage.ABSTRACT_INSTANCE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS = InformationPackage.ABSTRACT_INSTANCE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__STATUS = InformationPackage.ABSTRACT_INSTANCE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__FEATURES = InformationPackage.ABSTRACT_INSTANCE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__APPLIED_REQUIREMENTS = InformationPackage.ABSTRACT_INSTANCE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__IS_ABSTRACT = InformationPackage.ABSTRACT_INSTANCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__IS_STATIC = InformationPackage.ABSTRACT_INSTANCE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__VISIBILITY = InformationPackage.ABSTRACT_INSTANCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__ABSTRACT_TYPE = InformationPackage.ABSTRACT_INSTANCE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__TYPE = InformationPackage.ABSTRACT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__ORDERED = InformationPackage.ABSTRACT_INSTANCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__UNIQUE = InformationPackage.ABSTRACT_INSTANCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__MIN_INCLUSIVE = InformationPackage.ABSTRACT_INSTANCE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__MAX_INCLUSIVE = InformationPackage.ABSTRACT_INSTANCE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_DEFAULT_VALUE = InformationPackage.ABSTRACT_INSTANCE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MIN_VALUE = InformationPackage.ABSTRACT_INSTANCE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MAX_VALUE = InformationPackage.ABSTRACT_INSTANCE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_NULL_VALUE = InformationPackage.ABSTRACT_INSTANCE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MIN_CARD = InformationPackage.ABSTRACT_INSTANCE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MIN_LENGTH = InformationPackage.ABSTRACT_INSTANCE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MAX_CARD = InformationPackage.ABSTRACT_INSTANCE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__OWNED_MAX_LENGTH = InformationPackage.ABSTRACT_INSTANCE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__FINAL = InformationPackage.ABSTRACT_INSTANCE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__AGGREGATION_KIND = InformationPackage.ABSTRACT_INSTANCE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__IS_DERIVED = InformationPackage.ABSTRACT_INSTANCE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__IS_READ_ONLY = InformationPackage.ABSTRACT_INSTANCE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__IS_PART_OF_KEY = InformationPackage.ABSTRACT_INSTANCE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__ASSOCIATION = InformationPackage.ABSTRACT_INSTANCE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT__REPRESENTING_INSTANCE_ROLES = InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>BTree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ELEMENT_FEATURE_COUNT = InformationPackage.ABSTRACT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @ordered
	 */
	int BTREE_ELEMENT___DESTROY = 0;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @ordered
	 */
	int BTREE_ELEMENT___GET_FULL_LABEL = 0;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @ordered
	 */
	int BTREE_ELEMENT___GET_LABEL = 0;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @ordered
	 */
	int BTREE_ELEMENT___HAS_UNNAMED_LABEL = 0;

	/**
	 * The number of operations of the '<em>BTree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @ordered
	 */
	int BTREE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeNodeImpl <em>BTree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeNodeImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeNode()
	 * @generated
	 */
	int BTREE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_EXTENSIONS = BTREE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__ID = BTREE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__SID = BTREE_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__CONSTRAINTS = BTREE_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_CONSTRAINTS = BTREE_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MIGRATED_ELEMENTS = BTREE_ELEMENT__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__NAME = BTREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__INCOMING_TRACES = BTREE_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OUTGOING_TRACES = BTREE_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__VISIBLE_IN_DOC = BTREE_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__VISIBLE_IN_LM = BTREE_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__SUMMARY = BTREE_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__DESCRIPTION = BTREE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__REVIEW = BTREE_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_PROPERTY_VALUES = BTREE_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__APPLIED_PROPERTY_VALUES = BTREE_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_PROPERTY_VALUE_GROUPS = BTREE_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__STATUS = BTREE_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__FEATURES = BTREE_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__APPLIED_REQUIREMENTS = BTREE_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__IS_ABSTRACT = BTREE_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__IS_STATIC = BTREE_ELEMENT__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__VISIBILITY = BTREE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__ABSTRACT_TYPE = BTREE_ELEMENT__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__TYPE = BTREE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__ORDERED = BTREE_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__UNIQUE = BTREE_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__MIN_INCLUSIVE = BTREE_ELEMENT__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__MAX_INCLUSIVE = BTREE_ELEMENT__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_DEFAULT_VALUE = BTREE_ELEMENT__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MIN_VALUE = BTREE_ELEMENT__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MAX_VALUE = BTREE_ELEMENT__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_NULL_VALUE = BTREE_ELEMENT__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MIN_CARD = BTREE_ELEMENT__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MIN_LENGTH = BTREE_ELEMENT__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MAX_CARD = BTREE_ELEMENT__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__OWNED_MAX_LENGTH = BTREE_ELEMENT__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__FINAL = BTREE_ELEMENT__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__AGGREGATION_KIND = BTREE_ELEMENT__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__IS_DERIVED = BTREE_ELEMENT__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__IS_READ_ONLY = BTREE_ELEMENT__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__IS_PART_OF_KEY = BTREE_ELEMENT__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__ASSOCIATION = BTREE_ELEMENT__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE__REPRESENTING_INSTANCE_ROLES = BTREE_ELEMENT__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>BTree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE_FEATURE_COUNT = BTREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE___DESTROY = BTREE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE___GET_FULL_LABEL = BTREE_ELEMENT___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE___GET_LABEL = BTREE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE___HAS_UNNAMED_LABEL = BTREE_ELEMENT___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_NODE_OPERATION_COUNT = BTREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeContainerImpl <em>BTree Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeContainerImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeContainer()
	 * @generated
	 */
	int BTREE_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_EXTENSIONS = BTREE_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__ID = BTREE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__SID = BTREE_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__CONSTRAINTS = BTREE_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_CONSTRAINTS = BTREE_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MIGRATED_ELEMENTS = BTREE_NODE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__NAME = BTREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__INCOMING_TRACES = BTREE_NODE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OUTGOING_TRACES = BTREE_NODE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__VISIBLE_IN_DOC = BTREE_NODE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__VISIBLE_IN_LM = BTREE_NODE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__SUMMARY = BTREE_NODE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__DESCRIPTION = BTREE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__REVIEW = BTREE_NODE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_PROPERTY_VALUES = BTREE_NODE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_NODE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__APPLIED_PROPERTY_VALUES = BTREE_NODE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_PROPERTY_VALUE_GROUPS = BTREE_NODE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_NODE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__STATUS = BTREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__FEATURES = BTREE_NODE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__APPLIED_REQUIREMENTS = BTREE_NODE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__IS_ABSTRACT = BTREE_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__IS_STATIC = BTREE_NODE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__VISIBILITY = BTREE_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__ABSTRACT_TYPE = BTREE_NODE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__TYPE = BTREE_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__ORDERED = BTREE_NODE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__UNIQUE = BTREE_NODE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__MIN_INCLUSIVE = BTREE_NODE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__MAX_INCLUSIVE = BTREE_NODE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_DEFAULT_VALUE = BTREE_NODE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MIN_VALUE = BTREE_NODE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MAX_VALUE = BTREE_NODE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_NULL_VALUE = BTREE_NODE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MIN_CARD = BTREE_NODE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MIN_LENGTH = BTREE_NODE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MAX_CARD = BTREE_NODE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_MAX_LENGTH = BTREE_NODE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__FINAL = BTREE_NODE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__AGGREGATION_KIND = BTREE_NODE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__IS_DERIVED = BTREE_NODE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__IS_READ_ONLY = BTREE_NODE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__IS_PART_OF_KEY = BTREE_NODE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__ASSOCIATION = BTREE_NODE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__REPRESENTING_INSTANCE_ROLES = BTREE_NODE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER__OWNED_NODES = BTREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTree Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER_FEATURE_COUNT = BTREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER___DESTROY = BTREE_NODE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER___GET_FULL_LABEL = BTREE_NODE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER___GET_LABEL = BTREE_NODE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER___HAS_UNNAMED_LABEL = BTREE_NODE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_CONTAINER_OPERATION_COUNT = BTREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeLeafImpl <em>BTree Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeLeafImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeLeaf()
	 * @generated
	 */
	int BTREE_LEAF = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_EXTENSIONS = BTREE_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__ID = BTREE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__SID = BTREE_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__CONSTRAINTS = BTREE_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_CONSTRAINTS = BTREE_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MIGRATED_ELEMENTS = BTREE_NODE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__NAME = BTREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__INCOMING_TRACES = BTREE_NODE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OUTGOING_TRACES = BTREE_NODE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__VISIBLE_IN_DOC = BTREE_NODE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__VISIBLE_IN_LM = BTREE_NODE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__SUMMARY = BTREE_NODE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__DESCRIPTION = BTREE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__REVIEW = BTREE_NODE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_PROPERTY_VALUES = BTREE_NODE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_NODE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__APPLIED_PROPERTY_VALUES = BTREE_NODE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_PROPERTY_VALUE_GROUPS = BTREE_NODE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_NODE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__STATUS = BTREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__FEATURES = BTREE_NODE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__APPLIED_REQUIREMENTS = BTREE_NODE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__IS_ABSTRACT = BTREE_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__IS_STATIC = BTREE_NODE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__VISIBILITY = BTREE_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__ABSTRACT_TYPE = BTREE_NODE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__TYPE = BTREE_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__ORDERED = BTREE_NODE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__UNIQUE = BTREE_NODE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__MIN_INCLUSIVE = BTREE_NODE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__MAX_INCLUSIVE = BTREE_NODE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_DEFAULT_VALUE = BTREE_NODE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MIN_VALUE = BTREE_NODE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MAX_VALUE = BTREE_NODE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_NULL_VALUE = BTREE_NODE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MIN_CARD = BTREE_NODE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MIN_LENGTH = BTREE_NODE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MAX_CARD = BTREE_NODE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__OWNED_MAX_LENGTH = BTREE_NODE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__FINAL = BTREE_NODE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__AGGREGATION_KIND = BTREE_NODE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__IS_DERIVED = BTREE_NODE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__IS_READ_ONLY = BTREE_NODE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__IS_PART_OF_KEY = BTREE_NODE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__ASSOCIATION = BTREE_NODE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__REPRESENTING_INSTANCE_ROLES = BTREE_NODE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF__FUNCTION = BTREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BTree Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF_FEATURE_COUNT = BTREE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF___DESTROY = BTREE_NODE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF___GET_FULL_LABEL = BTREE_NODE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF___GET_LABEL = BTREE_NODE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF___HAS_UNNAMED_LABEL = BTREE_NODE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_LEAF_OPERATION_COUNT = BTREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeDecoratorImpl <em>BTree Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeDecoratorImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeDecorator()
	 * @generated
	 */
	int BTREE_DECORATOR = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_EXTENSIONS = BTREE_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__ID = BTREE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__SID = BTREE_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__CONSTRAINTS = BTREE_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_CONSTRAINTS = BTREE_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS = BTREE_NODE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__NAME = BTREE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__INCOMING_TRACES = BTREE_NODE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OUTGOING_TRACES = BTREE_NODE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__VISIBLE_IN_DOC = BTREE_NODE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__VISIBLE_IN_LM = BTREE_NODE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__SUMMARY = BTREE_NODE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__DESCRIPTION = BTREE_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__REVIEW = BTREE_NODE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_PROPERTY_VALUES = BTREE_NODE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_NODE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__APPLIED_PROPERTY_VALUES = BTREE_NODE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS = BTREE_NODE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_NODE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__STATUS = BTREE_NODE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__FEATURES = BTREE_NODE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__APPLIED_REQUIREMENTS = BTREE_NODE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__IS_ABSTRACT = BTREE_NODE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__IS_STATIC = BTREE_NODE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__VISIBILITY = BTREE_NODE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__ABSTRACT_TYPE = BTREE_NODE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__TYPE = BTREE_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__ORDERED = BTREE_NODE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__UNIQUE = BTREE_NODE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__MIN_INCLUSIVE = BTREE_NODE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__MAX_INCLUSIVE = BTREE_NODE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_DEFAULT_VALUE = BTREE_NODE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MIN_VALUE = BTREE_NODE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MAX_VALUE = BTREE_NODE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_NULL_VALUE = BTREE_NODE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MIN_CARD = BTREE_NODE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MIN_LENGTH = BTREE_NODE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MAX_CARD = BTREE_NODE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__OWNED_MAX_LENGTH = BTREE_NODE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__FINAL = BTREE_NODE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__AGGREGATION_KIND = BTREE_NODE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__IS_DERIVED = BTREE_NODE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__IS_READ_ONLY = BTREE_NODE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__IS_PART_OF_KEY = BTREE_NODE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__ASSOCIATION = BTREE_NODE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES = BTREE_NODE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>BTree Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR_FEATURE_COUNT = BTREE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR___DESTROY = BTREE_NODE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR___GET_FULL_LABEL = BTREE_NODE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR___GET_LABEL = BTREE_NODE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR___HAS_UNNAMED_LABEL = BTREE_NODE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_DECORATOR_OPERATION_COUNT = BTREE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeSequenceImpl <em>BTree Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeSequenceImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeSequence()
	 * @generated
	 */
	int BTREE_SEQUENCE = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_EXTENSIONS = BTREE_CONTAINER__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__ID = BTREE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__SID = BTREE_CONTAINER__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__CONSTRAINTS = BTREE_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_CONSTRAINTS = BTREE_CONTAINER__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MIGRATED_ELEMENTS = BTREE_CONTAINER__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__NAME = BTREE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__INCOMING_TRACES = BTREE_CONTAINER__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OUTGOING_TRACES = BTREE_CONTAINER__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__VISIBLE_IN_DOC = BTREE_CONTAINER__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__VISIBLE_IN_LM = BTREE_CONTAINER__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__SUMMARY = BTREE_CONTAINER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__DESCRIPTION = BTREE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__REVIEW = BTREE_CONTAINER__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_PROPERTY_VALUES = BTREE_CONTAINER__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_CONTAINER__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__APPLIED_PROPERTY_VALUES = BTREE_CONTAINER__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__STATUS = BTREE_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__FEATURES = BTREE_CONTAINER__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__APPLIED_REQUIREMENTS = BTREE_CONTAINER__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__IS_ABSTRACT = BTREE_CONTAINER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__IS_STATIC = BTREE_CONTAINER__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__VISIBILITY = BTREE_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__ABSTRACT_TYPE = BTREE_CONTAINER__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__TYPE = BTREE_CONTAINER__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__ORDERED = BTREE_CONTAINER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__UNIQUE = BTREE_CONTAINER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__MIN_INCLUSIVE = BTREE_CONTAINER__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__MAX_INCLUSIVE = BTREE_CONTAINER__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_DEFAULT_VALUE = BTREE_CONTAINER__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MIN_VALUE = BTREE_CONTAINER__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MAX_VALUE = BTREE_CONTAINER__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_NULL_VALUE = BTREE_CONTAINER__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MIN_CARD = BTREE_CONTAINER__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MIN_LENGTH = BTREE_CONTAINER__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MAX_CARD = BTREE_CONTAINER__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_MAX_LENGTH = BTREE_CONTAINER__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__FINAL = BTREE_CONTAINER__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__AGGREGATION_KIND = BTREE_CONTAINER__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__IS_DERIVED = BTREE_CONTAINER__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__IS_READ_ONLY = BTREE_CONTAINER__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__IS_PART_OF_KEY = BTREE_CONTAINER__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__ASSOCIATION = BTREE_CONTAINER__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__REPRESENTING_INSTANCE_ROLES = BTREE_CONTAINER__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE__OWNED_NODES = BTREE_CONTAINER__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>BTree Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE_FEATURE_COUNT = BTREE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE___DESTROY = BTREE_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE___GET_FULL_LABEL = BTREE_CONTAINER___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE___GET_LABEL = BTREE_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE___HAS_UNNAMED_LABEL = BTREE_CONTAINER___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_SEQUENCE_OPERATION_COUNT = BTREE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeFallbackImpl <em>BTree Fallback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeFallbackImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeFallback()
	 * @generated
	 */
	int BTREE_FALLBACK = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_EXTENSIONS = BTREE_CONTAINER__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__ID = BTREE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__SID = BTREE_CONTAINER__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__CONSTRAINTS = BTREE_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_CONSTRAINTS = BTREE_CONTAINER__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MIGRATED_ELEMENTS = BTREE_CONTAINER__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__NAME = BTREE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__INCOMING_TRACES = BTREE_CONTAINER__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OUTGOING_TRACES = BTREE_CONTAINER__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__VISIBLE_IN_DOC = BTREE_CONTAINER__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__VISIBLE_IN_LM = BTREE_CONTAINER__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__SUMMARY = BTREE_CONTAINER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__DESCRIPTION = BTREE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__REVIEW = BTREE_CONTAINER__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_PROPERTY_VALUES = BTREE_CONTAINER__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_CONTAINER__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__APPLIED_PROPERTY_VALUES = BTREE_CONTAINER__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__STATUS = BTREE_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__FEATURES = BTREE_CONTAINER__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__APPLIED_REQUIREMENTS = BTREE_CONTAINER__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__IS_ABSTRACT = BTREE_CONTAINER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__IS_STATIC = BTREE_CONTAINER__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__VISIBILITY = BTREE_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__ABSTRACT_TYPE = BTREE_CONTAINER__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__TYPE = BTREE_CONTAINER__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__ORDERED = BTREE_CONTAINER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__UNIQUE = BTREE_CONTAINER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__MIN_INCLUSIVE = BTREE_CONTAINER__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__MAX_INCLUSIVE = BTREE_CONTAINER__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_DEFAULT_VALUE = BTREE_CONTAINER__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MIN_VALUE = BTREE_CONTAINER__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MAX_VALUE = BTREE_CONTAINER__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_NULL_VALUE = BTREE_CONTAINER__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MIN_CARD = BTREE_CONTAINER__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MIN_LENGTH = BTREE_CONTAINER__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MAX_CARD = BTREE_CONTAINER__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_MAX_LENGTH = BTREE_CONTAINER__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__FINAL = BTREE_CONTAINER__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__AGGREGATION_KIND = BTREE_CONTAINER__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__IS_DERIVED = BTREE_CONTAINER__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__IS_READ_ONLY = BTREE_CONTAINER__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__IS_PART_OF_KEY = BTREE_CONTAINER__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__ASSOCIATION = BTREE_CONTAINER__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__REPRESENTING_INSTANCE_ROLES = BTREE_CONTAINER__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK__OWNED_NODES = BTREE_CONTAINER__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>BTree Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK_FEATURE_COUNT = BTREE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK___DESTROY = BTREE_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK___GET_FULL_LABEL = BTREE_CONTAINER___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK___GET_LABEL = BTREE_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK___HAS_UNNAMED_LABEL = BTREE_CONTAINER___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>BTree Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_FALLBACK_OPERATION_COUNT = BTREE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl <em>BTree Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeRoot()
	 * @generated
	 */
	int BTREE_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_EXTENSIONS = EmdePackage.ELEMENT_EXTENSION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__ID = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__SID = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__CONSTRAINTS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_CONSTRAINTS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MIGRATED_ELEMENTS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__NAME = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__INCOMING_TRACES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OUTGOING_TRACES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__VISIBLE_IN_DOC = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__VISIBLE_IN_LM = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__SUMMARY = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__DESCRIPTION = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__REVIEW = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_PROPERTY_VALUES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__APPLIED_PROPERTY_VALUES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__STATUS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__FEATURES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__APPLIED_REQUIREMENTS = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__IS_ABSTRACT = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__IS_STATIC = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__VISIBILITY = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__ABSTRACT_TYPE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__TYPE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__ORDERED = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__UNIQUE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__MIN_INCLUSIVE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__MAX_INCLUSIVE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_DEFAULT_VALUE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MIN_VALUE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MAX_VALUE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_NULL_VALUE = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MIN_CARD = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MIN_LENGTH = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MAX_CARD = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_MAX_LENGTH = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__FINAL = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__AGGREGATION_KIND = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__IS_DERIVED = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__IS_READ_ONLY = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__IS_PART_OF_KEY = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__ASSOCIATION = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__REPRESENTING_INSTANCE_ROLES = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Owned BTree Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT__OWNED_BTREE_CONTAINER = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 45;

	/**
	 * The number of structural features of the '<em>BTree Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT_FEATURE_COUNT = EmdePackage.ELEMENT_EXTENSION_FEATURE_COUNT + 46;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT___DESTROY = EmdePackage.ELEMENT_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT___GET_FULL_LABEL = EmdePackage.ELEMENT_EXTENSION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT___GET_LABEL = EmdePackage.ELEMENT_EXTENSION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT___HAS_UNNAMED_LABEL = EmdePackage.ELEMENT_EXTENSION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>BTree Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTREE_ROOT_OPERATION_COUNT = EmdePackage.ELEMENT_EXTENSION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ActionImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_EXTENSIONS = BTREE_LEAF__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = BTREE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SID = BTREE_LEAF__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONSTRAINTS = BTREE_LEAF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_CONSTRAINTS = BTREE_LEAF__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MIGRATED_ELEMENTS = BTREE_LEAF__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BTREE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING_TRACES = BTREE_LEAF__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING_TRACES = BTREE_LEAF__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VISIBLE_IN_DOC = BTREE_LEAF__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VISIBLE_IN_LM = BTREE_LEAF__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUMMARY = BTREE_LEAF__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = BTREE_LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REVIEW = BTREE_LEAF__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_PROPERTY_VALUES = BTREE_LEAF__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_LEAF__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__APPLIED_PROPERTY_VALUES = BTREE_LEAF__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_PROPERTY_VALUE_GROUPS = BTREE_LEAF__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_LEAF__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATUS = BTREE_LEAF__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FEATURES = BTREE_LEAF__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__APPLIED_REQUIREMENTS = BTREE_LEAF__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_ABSTRACT = BTREE_LEAF__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_STATIC = BTREE_LEAF__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VISIBILITY = BTREE_LEAF__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ABSTRACT_TYPE = BTREE_LEAF__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = BTREE_LEAF__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ORDERED = BTREE_LEAF__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UNIQUE = BTREE_LEAF__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MIN_INCLUSIVE = BTREE_LEAF__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__MAX_INCLUSIVE = BTREE_LEAF__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_DEFAULT_VALUE = BTREE_LEAF__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MIN_VALUE = BTREE_LEAF__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MAX_VALUE = BTREE_LEAF__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_NULL_VALUE = BTREE_LEAF__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MIN_CARD = BTREE_LEAF__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MIN_LENGTH = BTREE_LEAF__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MAX_CARD = BTREE_LEAF__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OWNED_MAX_LENGTH = BTREE_LEAF__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FINAL = BTREE_LEAF__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AGGREGATION_KIND = BTREE_LEAF__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_DERIVED = BTREE_LEAF__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_READ_ONLY = BTREE_LEAF__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IS_PART_OF_KEY = BTREE_LEAF__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ASSOCIATION = BTREE_LEAF__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__REPRESENTING_INSTANCE_ROLES = BTREE_LEAF__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FUNCTION = BTREE_LEAF__FUNCTION;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BTREE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___DESTROY = BTREE_LEAF___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_FULL_LABEL = BTREE_LEAF___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___GET_LABEL = BTREE_LEAF___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___HAS_UNNAMED_LABEL = BTREE_LEAF___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BTREE_LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ConditionImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_EXTENSIONS = BTREE_LEAF__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = BTREE_LEAF__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SID = BTREE_LEAF__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONSTRAINTS = BTREE_LEAF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_CONSTRAINTS = BTREE_LEAF__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MIGRATED_ELEMENTS = BTREE_LEAF__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = BTREE_LEAF__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INCOMING_TRACES = BTREE_LEAF__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OUTGOING_TRACES = BTREE_LEAF__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VISIBLE_IN_DOC = BTREE_LEAF__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VISIBLE_IN_LM = BTREE_LEAF__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SUMMARY = BTREE_LEAF__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = BTREE_LEAF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REVIEW = BTREE_LEAF__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_PROPERTY_VALUES = BTREE_LEAF__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_LEAF__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__APPLIED_PROPERTY_VALUES = BTREE_LEAF__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_PROPERTY_VALUE_GROUPS = BTREE_LEAF__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_LEAF__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATUS = BTREE_LEAF__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FEATURES = BTREE_LEAF__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__APPLIED_REQUIREMENTS = BTREE_LEAF__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_ABSTRACT = BTREE_LEAF__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_STATIC = BTREE_LEAF__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VISIBILITY = BTREE_LEAF__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ABSTRACT_TYPE = BTREE_LEAF__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = BTREE_LEAF__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ORDERED = BTREE_LEAF__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__UNIQUE = BTREE_LEAF__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MIN_INCLUSIVE = BTREE_LEAF__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__MAX_INCLUSIVE = BTREE_LEAF__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_DEFAULT_VALUE = BTREE_LEAF__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MIN_VALUE = BTREE_LEAF__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MAX_VALUE = BTREE_LEAF__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_NULL_VALUE = BTREE_LEAF__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MIN_CARD = BTREE_LEAF__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MIN_LENGTH = BTREE_LEAF__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MAX_CARD = BTREE_LEAF__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OWNED_MAX_LENGTH = BTREE_LEAF__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FINAL = BTREE_LEAF__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__AGGREGATION_KIND = BTREE_LEAF__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_DERIVED = BTREE_LEAF__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_READ_ONLY = BTREE_LEAF__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IS_PART_OF_KEY = BTREE_LEAF__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ASSOCIATION = BTREE_LEAF__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REPRESENTING_INSTANCE_ROLES = BTREE_LEAF__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FUNCTION = BTREE_LEAF__FUNCTION;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = BTREE_LEAF_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___DESTROY = BTREE_LEAF___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_FULL_LABEL = BTREE_LEAF___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___GET_LABEL = BTREE_LEAF___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___HAS_UNNAMED_LABEL = BTREE_LEAF___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = BTREE_LEAF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ParallelImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_EXTENSIONS = BTREE_CONTAINER__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ID = BTREE_CONTAINER__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SID = BTREE_CONTAINER__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__CONSTRAINTS = BTREE_CONTAINER__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_CONSTRAINTS = BTREE_CONTAINER__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MIGRATED_ELEMENTS = BTREE_CONTAINER__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = BTREE_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__INCOMING_TRACES = BTREE_CONTAINER__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OUTGOING_TRACES = BTREE_CONTAINER__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VISIBLE_IN_DOC = BTREE_CONTAINER__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VISIBLE_IN_LM = BTREE_CONTAINER__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__SUMMARY = BTREE_CONTAINER__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DESCRIPTION = BTREE_CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__REVIEW = BTREE_CONTAINER__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_PROPERTY_VALUES = BTREE_CONTAINER__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_CONTAINER__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__APPLIED_PROPERTY_VALUES = BTREE_CONTAINER__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_CONTAINER__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STATUS = BTREE_CONTAINER__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__FEATURES = BTREE_CONTAINER__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__APPLIED_REQUIREMENTS = BTREE_CONTAINER__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__IS_ABSTRACT = BTREE_CONTAINER__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__IS_STATIC = BTREE_CONTAINER__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__VISIBILITY = BTREE_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ABSTRACT_TYPE = BTREE_CONTAINER__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TYPE = BTREE_CONTAINER__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ORDERED = BTREE_CONTAINER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__UNIQUE = BTREE_CONTAINER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__MIN_INCLUSIVE = BTREE_CONTAINER__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__MAX_INCLUSIVE = BTREE_CONTAINER__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_DEFAULT_VALUE = BTREE_CONTAINER__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MIN_VALUE = BTREE_CONTAINER__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MAX_VALUE = BTREE_CONTAINER__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_NULL_VALUE = BTREE_CONTAINER__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MIN_CARD = BTREE_CONTAINER__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MIN_LENGTH = BTREE_CONTAINER__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MAX_CARD = BTREE_CONTAINER__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_MAX_LENGTH = BTREE_CONTAINER__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__FINAL = BTREE_CONTAINER__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__AGGREGATION_KIND = BTREE_CONTAINER__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__IS_DERIVED = BTREE_CONTAINER__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__IS_READ_ONLY = BTREE_CONTAINER__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__IS_PART_OF_KEY = BTREE_CONTAINER__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__ASSOCIATION = BTREE_CONTAINER__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__REPRESENTING_INSTANCE_ROLES = BTREE_CONTAINER__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__OWNED_NODES = BTREE_CONTAINER__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = BTREE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL___DESTROY = BTREE_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL___GET_FULL_LABEL = BTREE_CONTAINER___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL___GET_LABEL = BTREE_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL___HAS_UNNAMED_LABEL = BTREE_CONTAINER___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = BTREE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.SequenceImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_EXTENSIONS = BTREE_SEQUENCE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = BTREE_SEQUENCE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SID = BTREE_SEQUENCE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CONSTRAINTS = BTREE_SEQUENCE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_CONSTRAINTS = BTREE_SEQUENCE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MIGRATED_ELEMENTS = BTREE_SEQUENCE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = BTREE_SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INCOMING_TRACES = BTREE_SEQUENCE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OUTGOING_TRACES = BTREE_SEQUENCE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VISIBLE_IN_DOC = BTREE_SEQUENCE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VISIBLE_IN_LM = BTREE_SEQUENCE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUMMARY = BTREE_SEQUENCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = BTREE_SEQUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REVIEW = BTREE_SEQUENCE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_PROPERTY_VALUES = BTREE_SEQUENCE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__APPLIED_PROPERTY_VALUES = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STATUS = BTREE_SEQUENCE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FEATURES = BTREE_SEQUENCE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__APPLIED_REQUIREMENTS = BTREE_SEQUENCE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IS_ABSTRACT = BTREE_SEQUENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IS_STATIC = BTREE_SEQUENCE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__VISIBILITY = BTREE_SEQUENCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ABSTRACT_TYPE = BTREE_SEQUENCE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE = BTREE_SEQUENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ORDERED = BTREE_SEQUENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__UNIQUE = BTREE_SEQUENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__MIN_INCLUSIVE = BTREE_SEQUENCE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__MAX_INCLUSIVE = BTREE_SEQUENCE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_DEFAULT_VALUE = BTREE_SEQUENCE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MIN_VALUE = BTREE_SEQUENCE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MAX_VALUE = BTREE_SEQUENCE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_NULL_VALUE = BTREE_SEQUENCE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MIN_CARD = BTREE_SEQUENCE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MIN_LENGTH = BTREE_SEQUENCE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MAX_CARD = BTREE_SEQUENCE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_MAX_LENGTH = BTREE_SEQUENCE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FINAL = BTREE_SEQUENCE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__AGGREGATION_KIND = BTREE_SEQUENCE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IS_DERIVED = BTREE_SEQUENCE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IS_READ_ONLY = BTREE_SEQUENCE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__IS_PART_OF_KEY = BTREE_SEQUENCE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ASSOCIATION = BTREE_SEQUENCE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__REPRESENTING_INSTANCE_ROLES = BTREE_SEQUENCE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OWNED_NODES = BTREE_SEQUENCE__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = BTREE_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___DESTROY = BTREE_SEQUENCE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___GET_FULL_LABEL = BTREE_SEQUENCE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___GET_LABEL = BTREE_SEQUENCE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___HAS_UNNAMED_LABEL = BTREE_SEQUENCE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = BTREE_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ReactiveSequenceImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getReactiveSequence()
	 * @generated
	 */
	int REACTIVE_SEQUENCE = 12;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_EXTENSIONS = BTREE_SEQUENCE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__ID = BTREE_SEQUENCE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__SID = BTREE_SEQUENCE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__CONSTRAINTS = BTREE_SEQUENCE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_CONSTRAINTS = BTREE_SEQUENCE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MIGRATED_ELEMENTS = BTREE_SEQUENCE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__NAME = BTREE_SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__INCOMING_TRACES = BTREE_SEQUENCE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OUTGOING_TRACES = BTREE_SEQUENCE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__VISIBLE_IN_DOC = BTREE_SEQUENCE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__VISIBLE_IN_LM = BTREE_SEQUENCE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__SUMMARY = BTREE_SEQUENCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__DESCRIPTION = BTREE_SEQUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__REVIEW = BTREE_SEQUENCE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_PROPERTY_VALUES = BTREE_SEQUENCE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__APPLIED_PROPERTY_VALUES = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__STATUS = BTREE_SEQUENCE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__FEATURES = BTREE_SEQUENCE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__APPLIED_REQUIREMENTS = BTREE_SEQUENCE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__IS_ABSTRACT = BTREE_SEQUENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__IS_STATIC = BTREE_SEQUENCE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__VISIBILITY = BTREE_SEQUENCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__ABSTRACT_TYPE = BTREE_SEQUENCE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__TYPE = BTREE_SEQUENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__ORDERED = BTREE_SEQUENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__UNIQUE = BTREE_SEQUENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__MIN_INCLUSIVE = BTREE_SEQUENCE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__MAX_INCLUSIVE = BTREE_SEQUENCE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_DEFAULT_VALUE = BTREE_SEQUENCE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MIN_VALUE = BTREE_SEQUENCE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MAX_VALUE = BTREE_SEQUENCE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_NULL_VALUE = BTREE_SEQUENCE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MIN_CARD = BTREE_SEQUENCE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MIN_LENGTH = BTREE_SEQUENCE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MAX_CARD = BTREE_SEQUENCE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_MAX_LENGTH = BTREE_SEQUENCE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__FINAL = BTREE_SEQUENCE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__AGGREGATION_KIND = BTREE_SEQUENCE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__IS_DERIVED = BTREE_SEQUENCE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__IS_READ_ONLY = BTREE_SEQUENCE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__IS_PART_OF_KEY = BTREE_SEQUENCE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__ASSOCIATION = BTREE_SEQUENCE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__REPRESENTING_INSTANCE_ROLES = BTREE_SEQUENCE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE__OWNED_NODES = BTREE_SEQUENCE__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Reactive Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE_FEATURE_COUNT = BTREE_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE___DESTROY = BTREE_SEQUENCE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE___GET_FULL_LABEL = BTREE_SEQUENCE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE___GET_LABEL = BTREE_SEQUENCE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE___HAS_UNNAMED_LABEL = BTREE_SEQUENCE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Reactive Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_SEQUENCE_OPERATION_COUNT = BTREE_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.SequenceStarImpl <em>Sequence Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.SequenceStarImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getSequenceStar()
	 * @generated
	 */
	int SEQUENCE_STAR = 13;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_EXTENSIONS = BTREE_SEQUENCE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__ID = BTREE_SEQUENCE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__SID = BTREE_SEQUENCE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__CONSTRAINTS = BTREE_SEQUENCE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_CONSTRAINTS = BTREE_SEQUENCE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MIGRATED_ELEMENTS = BTREE_SEQUENCE__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__NAME = BTREE_SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__INCOMING_TRACES = BTREE_SEQUENCE__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OUTGOING_TRACES = BTREE_SEQUENCE__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__VISIBLE_IN_DOC = BTREE_SEQUENCE__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__VISIBLE_IN_LM = BTREE_SEQUENCE__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__SUMMARY = BTREE_SEQUENCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__DESCRIPTION = BTREE_SEQUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__REVIEW = BTREE_SEQUENCE__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_PROPERTY_VALUES = BTREE_SEQUENCE__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_SEQUENCE__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__APPLIED_PROPERTY_VALUES = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_SEQUENCE__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__STATUS = BTREE_SEQUENCE__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__FEATURES = BTREE_SEQUENCE__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__APPLIED_REQUIREMENTS = BTREE_SEQUENCE__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__IS_ABSTRACT = BTREE_SEQUENCE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__IS_STATIC = BTREE_SEQUENCE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__VISIBILITY = BTREE_SEQUENCE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__ABSTRACT_TYPE = BTREE_SEQUENCE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__TYPE = BTREE_SEQUENCE__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__ORDERED = BTREE_SEQUENCE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__UNIQUE = BTREE_SEQUENCE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__MIN_INCLUSIVE = BTREE_SEQUENCE__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__MAX_INCLUSIVE = BTREE_SEQUENCE__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_DEFAULT_VALUE = BTREE_SEQUENCE__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MIN_VALUE = BTREE_SEQUENCE__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MAX_VALUE = BTREE_SEQUENCE__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_NULL_VALUE = BTREE_SEQUENCE__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MIN_CARD = BTREE_SEQUENCE__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MIN_LENGTH = BTREE_SEQUENCE__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MAX_CARD = BTREE_SEQUENCE__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_MAX_LENGTH = BTREE_SEQUENCE__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__FINAL = BTREE_SEQUENCE__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__AGGREGATION_KIND = BTREE_SEQUENCE__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__IS_DERIVED = BTREE_SEQUENCE__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__IS_READ_ONLY = BTREE_SEQUENCE__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__IS_PART_OF_KEY = BTREE_SEQUENCE__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__ASSOCIATION = BTREE_SEQUENCE__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__REPRESENTING_INSTANCE_ROLES = BTREE_SEQUENCE__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR__OWNED_NODES = BTREE_SEQUENCE__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Sequence Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_FEATURE_COUNT = BTREE_SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR___DESTROY = BTREE_SEQUENCE___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR___GET_FULL_LABEL = BTREE_SEQUENCE___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR___GET_LABEL = BTREE_SEQUENCE___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR___HAS_UNNAMED_LABEL = BTREE_SEQUENCE___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Sequence Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STAR_OPERATION_COUNT = BTREE_SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.FallbackImpl <em>Fallback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.FallbackImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getFallback()
	 * @generated
	 */
	int FALLBACK = 14;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_EXTENSIONS = BTREE_FALLBACK__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__ID = BTREE_FALLBACK__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__SID = BTREE_FALLBACK__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__CONSTRAINTS = BTREE_FALLBACK__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_CONSTRAINTS = BTREE_FALLBACK__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MIGRATED_ELEMENTS = BTREE_FALLBACK__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__NAME = BTREE_FALLBACK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__INCOMING_TRACES = BTREE_FALLBACK__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OUTGOING_TRACES = BTREE_FALLBACK__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__VISIBLE_IN_DOC = BTREE_FALLBACK__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__VISIBLE_IN_LM = BTREE_FALLBACK__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__SUMMARY = BTREE_FALLBACK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__DESCRIPTION = BTREE_FALLBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__REVIEW = BTREE_FALLBACK__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_PROPERTY_VALUES = BTREE_FALLBACK__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_FALLBACK__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__APPLIED_PROPERTY_VALUES = BTREE_FALLBACK__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_PROPERTY_VALUE_GROUPS = BTREE_FALLBACK__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_FALLBACK__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__STATUS = BTREE_FALLBACK__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__FEATURES = BTREE_FALLBACK__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__APPLIED_REQUIREMENTS = BTREE_FALLBACK__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__IS_ABSTRACT = BTREE_FALLBACK__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__IS_STATIC = BTREE_FALLBACK__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__VISIBILITY = BTREE_FALLBACK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__ABSTRACT_TYPE = BTREE_FALLBACK__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__TYPE = BTREE_FALLBACK__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__ORDERED = BTREE_FALLBACK__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__UNIQUE = BTREE_FALLBACK__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__MIN_INCLUSIVE = BTREE_FALLBACK__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__MAX_INCLUSIVE = BTREE_FALLBACK__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_DEFAULT_VALUE = BTREE_FALLBACK__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MIN_VALUE = BTREE_FALLBACK__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MAX_VALUE = BTREE_FALLBACK__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_NULL_VALUE = BTREE_FALLBACK__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MIN_CARD = BTREE_FALLBACK__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MIN_LENGTH = BTREE_FALLBACK__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MAX_CARD = BTREE_FALLBACK__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_MAX_LENGTH = BTREE_FALLBACK__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__FINAL = BTREE_FALLBACK__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__AGGREGATION_KIND = BTREE_FALLBACK__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__IS_DERIVED = BTREE_FALLBACK__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__IS_READ_ONLY = BTREE_FALLBACK__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__IS_PART_OF_KEY = BTREE_FALLBACK__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__ASSOCIATION = BTREE_FALLBACK__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__REPRESENTING_INSTANCE_ROLES = BTREE_FALLBACK__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK__OWNED_NODES = BTREE_FALLBACK__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_FEATURE_COUNT = BTREE_FALLBACK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK___DESTROY = BTREE_FALLBACK___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK___GET_FULL_LABEL = BTREE_FALLBACK___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK___GET_LABEL = BTREE_FALLBACK___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK___HAS_UNNAMED_LABEL = BTREE_FALLBACK___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_OPERATION_COUNT = BTREE_FALLBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ReactiveFallbackImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getReactiveFallback()
	 * @generated
	 */
	int REACTIVE_FALLBACK = 15;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_EXTENSIONS = BTREE_FALLBACK__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__ID = BTREE_FALLBACK__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__SID = BTREE_FALLBACK__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__CONSTRAINTS = BTREE_FALLBACK__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_CONSTRAINTS = BTREE_FALLBACK__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MIGRATED_ELEMENTS = BTREE_FALLBACK__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__NAME = BTREE_FALLBACK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__INCOMING_TRACES = BTREE_FALLBACK__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OUTGOING_TRACES = BTREE_FALLBACK__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__VISIBLE_IN_DOC = BTREE_FALLBACK__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__VISIBLE_IN_LM = BTREE_FALLBACK__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__SUMMARY = BTREE_FALLBACK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__DESCRIPTION = BTREE_FALLBACK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__REVIEW = BTREE_FALLBACK__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_PROPERTY_VALUES = BTREE_FALLBACK__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_FALLBACK__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__APPLIED_PROPERTY_VALUES = BTREE_FALLBACK__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_PROPERTY_VALUE_GROUPS = BTREE_FALLBACK__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_FALLBACK__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__STATUS = BTREE_FALLBACK__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__FEATURES = BTREE_FALLBACK__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__APPLIED_REQUIREMENTS = BTREE_FALLBACK__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__IS_ABSTRACT = BTREE_FALLBACK__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__IS_STATIC = BTREE_FALLBACK__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__VISIBILITY = BTREE_FALLBACK__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__ABSTRACT_TYPE = BTREE_FALLBACK__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__TYPE = BTREE_FALLBACK__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__ORDERED = BTREE_FALLBACK__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__UNIQUE = BTREE_FALLBACK__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__MIN_INCLUSIVE = BTREE_FALLBACK__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__MAX_INCLUSIVE = BTREE_FALLBACK__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_DEFAULT_VALUE = BTREE_FALLBACK__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MIN_VALUE = BTREE_FALLBACK__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MAX_VALUE = BTREE_FALLBACK__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_NULL_VALUE = BTREE_FALLBACK__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MIN_CARD = BTREE_FALLBACK__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MIN_LENGTH = BTREE_FALLBACK__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MAX_CARD = BTREE_FALLBACK__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_MAX_LENGTH = BTREE_FALLBACK__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__FINAL = BTREE_FALLBACK__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__AGGREGATION_KIND = BTREE_FALLBACK__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__IS_DERIVED = BTREE_FALLBACK__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__IS_READ_ONLY = BTREE_FALLBACK__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__IS_PART_OF_KEY = BTREE_FALLBACK__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__ASSOCIATION = BTREE_FALLBACK__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__REPRESENTING_INSTANCE_ROLES = BTREE_FALLBACK__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK__OWNED_NODES = BTREE_FALLBACK__OWNED_NODES;

	/**
	 * The number of structural features of the '<em>Reactive Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK_FEATURE_COUNT = BTREE_FALLBACK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK___DESTROY = BTREE_FALLBACK___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK___GET_FULL_LABEL = BTREE_FALLBACK___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK___GET_LABEL = BTREE_FALLBACK___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK___HAS_UNNAMED_LABEL = BTREE_FALLBACK___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Reactive Fallback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTIVE_FALLBACK_OPERATION_COUNT = BTREE_FALLBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.InverterImpl <em>Inverter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.InverterImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getInverter()
	 * @generated
	 */
	int INVERTER = 16;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_EXTENSIONS = BTREE_DECORATOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__ID = BTREE_DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__SID = BTREE_DECORATOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__CONSTRAINTS = BTREE_DECORATOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_CONSTRAINTS = BTREE_DECORATOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MIGRATED_ELEMENTS = BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__NAME = BTREE_DECORATOR__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__INCOMING_TRACES = BTREE_DECORATOR__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OUTGOING_TRACES = BTREE_DECORATOR__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__VISIBLE_IN_DOC = BTREE_DECORATOR__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__VISIBLE_IN_LM = BTREE_DECORATOR__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__SUMMARY = BTREE_DECORATOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__DESCRIPTION = BTREE_DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__REVIEW = BTREE_DECORATOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_PROPERTY_VALUES = BTREE_DECORATOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__APPLIED_PROPERTY_VALUES = BTREE_DECORATOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__STATUS = BTREE_DECORATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__FEATURES = BTREE_DECORATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__APPLIED_REQUIREMENTS = BTREE_DECORATOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__IS_ABSTRACT = BTREE_DECORATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__IS_STATIC = BTREE_DECORATOR__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__VISIBILITY = BTREE_DECORATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__ABSTRACT_TYPE = BTREE_DECORATOR__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__TYPE = BTREE_DECORATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__ORDERED = BTREE_DECORATOR__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__UNIQUE = BTREE_DECORATOR__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__MIN_INCLUSIVE = BTREE_DECORATOR__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__MAX_INCLUSIVE = BTREE_DECORATOR__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_DEFAULT_VALUE = BTREE_DECORATOR__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MIN_VALUE = BTREE_DECORATOR__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MAX_VALUE = BTREE_DECORATOR__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_NULL_VALUE = BTREE_DECORATOR__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MIN_CARD = BTREE_DECORATOR__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MIN_LENGTH = BTREE_DECORATOR__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MAX_CARD = BTREE_DECORATOR__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__OWNED_MAX_LENGTH = BTREE_DECORATOR__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__FINAL = BTREE_DECORATOR__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__AGGREGATION_KIND = BTREE_DECORATOR__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__IS_DERIVED = BTREE_DECORATOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__IS_READ_ONLY = BTREE_DECORATOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__IS_PART_OF_KEY = BTREE_DECORATOR__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__ASSOCIATION = BTREE_DECORATOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER__REPRESENTING_INSTANCE_ROLES = BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_FEATURE_COUNT = BTREE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER___DESTROY = BTREE_DECORATOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER___GET_FULL_LABEL = BTREE_DECORATOR___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER___GET_LABEL = BTREE_DECORATOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER___HAS_UNNAMED_LABEL = BTREE_DECORATOR___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Inverter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERTER_OPERATION_COUNT = BTREE_DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ForceSuccessImpl <em>Force Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ForceSuccessImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getForceSuccess()
	 * @generated
	 */
	int FORCE_SUCCESS = 17;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_EXTENSIONS = BTREE_DECORATOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__ID = BTREE_DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__SID = BTREE_DECORATOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__CONSTRAINTS = BTREE_DECORATOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_CONSTRAINTS = BTREE_DECORATOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MIGRATED_ELEMENTS = BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__NAME = BTREE_DECORATOR__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__INCOMING_TRACES = BTREE_DECORATOR__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OUTGOING_TRACES = BTREE_DECORATOR__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__VISIBLE_IN_DOC = BTREE_DECORATOR__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__VISIBLE_IN_LM = BTREE_DECORATOR__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__SUMMARY = BTREE_DECORATOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__DESCRIPTION = BTREE_DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__REVIEW = BTREE_DECORATOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_PROPERTY_VALUES = BTREE_DECORATOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__APPLIED_PROPERTY_VALUES = BTREE_DECORATOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__STATUS = BTREE_DECORATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__FEATURES = BTREE_DECORATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__APPLIED_REQUIREMENTS = BTREE_DECORATOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__IS_ABSTRACT = BTREE_DECORATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__IS_STATIC = BTREE_DECORATOR__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__VISIBILITY = BTREE_DECORATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__ABSTRACT_TYPE = BTREE_DECORATOR__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__TYPE = BTREE_DECORATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__ORDERED = BTREE_DECORATOR__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__UNIQUE = BTREE_DECORATOR__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__MIN_INCLUSIVE = BTREE_DECORATOR__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__MAX_INCLUSIVE = BTREE_DECORATOR__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_DEFAULT_VALUE = BTREE_DECORATOR__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MIN_VALUE = BTREE_DECORATOR__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MAX_VALUE = BTREE_DECORATOR__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_NULL_VALUE = BTREE_DECORATOR__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MIN_CARD = BTREE_DECORATOR__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MIN_LENGTH = BTREE_DECORATOR__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MAX_CARD = BTREE_DECORATOR__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__OWNED_MAX_LENGTH = BTREE_DECORATOR__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__FINAL = BTREE_DECORATOR__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__AGGREGATION_KIND = BTREE_DECORATOR__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__IS_DERIVED = BTREE_DECORATOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__IS_READ_ONLY = BTREE_DECORATOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__IS_PART_OF_KEY = BTREE_DECORATOR__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__ASSOCIATION = BTREE_DECORATOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS__REPRESENTING_INSTANCE_ROLES = BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>Force Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_FEATURE_COUNT = BTREE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS___DESTROY = BTREE_DECORATOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS___GET_FULL_LABEL = BTREE_DECORATOR___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS___GET_LABEL = BTREE_DECORATOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS___HAS_UNNAMED_LABEL = BTREE_DECORATOR___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Force Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_SUCCESS_OPERATION_COUNT = BTREE_DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.ForceFailureImpl <em>Force Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.ForceFailureImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getForceFailure()
	 * @generated
	 */
	int FORCE_FAILURE = 18;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_EXTENSIONS = BTREE_DECORATOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__ID = BTREE_DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__SID = BTREE_DECORATOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__CONSTRAINTS = BTREE_DECORATOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_CONSTRAINTS = BTREE_DECORATOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MIGRATED_ELEMENTS = BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__NAME = BTREE_DECORATOR__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__INCOMING_TRACES = BTREE_DECORATOR__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OUTGOING_TRACES = BTREE_DECORATOR__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__VISIBLE_IN_DOC = BTREE_DECORATOR__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__VISIBLE_IN_LM = BTREE_DECORATOR__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__SUMMARY = BTREE_DECORATOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__DESCRIPTION = BTREE_DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__REVIEW = BTREE_DECORATOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_PROPERTY_VALUES = BTREE_DECORATOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__APPLIED_PROPERTY_VALUES = BTREE_DECORATOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__STATUS = BTREE_DECORATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__FEATURES = BTREE_DECORATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__APPLIED_REQUIREMENTS = BTREE_DECORATOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__IS_ABSTRACT = BTREE_DECORATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__IS_STATIC = BTREE_DECORATOR__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__VISIBILITY = BTREE_DECORATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__ABSTRACT_TYPE = BTREE_DECORATOR__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__TYPE = BTREE_DECORATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__ORDERED = BTREE_DECORATOR__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__UNIQUE = BTREE_DECORATOR__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__MIN_INCLUSIVE = BTREE_DECORATOR__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__MAX_INCLUSIVE = BTREE_DECORATOR__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_DEFAULT_VALUE = BTREE_DECORATOR__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MIN_VALUE = BTREE_DECORATOR__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MAX_VALUE = BTREE_DECORATOR__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_NULL_VALUE = BTREE_DECORATOR__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MIN_CARD = BTREE_DECORATOR__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MIN_LENGTH = BTREE_DECORATOR__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MAX_CARD = BTREE_DECORATOR__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__OWNED_MAX_LENGTH = BTREE_DECORATOR__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__FINAL = BTREE_DECORATOR__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__AGGREGATION_KIND = BTREE_DECORATOR__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__IS_DERIVED = BTREE_DECORATOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__IS_READ_ONLY = BTREE_DECORATOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__IS_PART_OF_KEY = BTREE_DECORATOR__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__ASSOCIATION = BTREE_DECORATOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE__REPRESENTING_INSTANCE_ROLES = BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>Force Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_FEATURE_COUNT = BTREE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE___DESTROY = BTREE_DECORATOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE___GET_FULL_LABEL = BTREE_DECORATOR___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE___GET_LABEL = BTREE_DECORATOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE___HAS_UNNAMED_LABEL = BTREE_DECORATOR___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Force Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORCE_FAILURE_OPERATION_COUNT = BTREE_DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.RepeatImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 19;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_EXTENSIONS = BTREE_DECORATOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ID = BTREE_DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__SID = BTREE_DECORATOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__CONSTRAINTS = BTREE_DECORATOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_CONSTRAINTS = BTREE_DECORATOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MIGRATED_ELEMENTS = BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__NAME = BTREE_DECORATOR__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__INCOMING_TRACES = BTREE_DECORATOR__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OUTGOING_TRACES = BTREE_DECORATOR__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__VISIBLE_IN_DOC = BTREE_DECORATOR__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__VISIBLE_IN_LM = BTREE_DECORATOR__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__SUMMARY = BTREE_DECORATOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__DESCRIPTION = BTREE_DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__REVIEW = BTREE_DECORATOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_PROPERTY_VALUES = BTREE_DECORATOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__APPLIED_PROPERTY_VALUES = BTREE_DECORATOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__STATUS = BTREE_DECORATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__FEATURES = BTREE_DECORATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__APPLIED_REQUIREMENTS = BTREE_DECORATOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__IS_ABSTRACT = BTREE_DECORATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__IS_STATIC = BTREE_DECORATOR__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__VISIBILITY = BTREE_DECORATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ABSTRACT_TYPE = BTREE_DECORATOR__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__TYPE = BTREE_DECORATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ORDERED = BTREE_DECORATOR__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__UNIQUE = BTREE_DECORATOR__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__MIN_INCLUSIVE = BTREE_DECORATOR__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__MAX_INCLUSIVE = BTREE_DECORATOR__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_DEFAULT_VALUE = BTREE_DECORATOR__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MIN_VALUE = BTREE_DECORATOR__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MAX_VALUE = BTREE_DECORATOR__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_NULL_VALUE = BTREE_DECORATOR__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MIN_CARD = BTREE_DECORATOR__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MIN_LENGTH = BTREE_DECORATOR__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MAX_CARD = BTREE_DECORATOR__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__OWNED_MAX_LENGTH = BTREE_DECORATOR__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__FINAL = BTREE_DECORATOR__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__AGGREGATION_KIND = BTREE_DECORATOR__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__IS_DERIVED = BTREE_DECORATOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__IS_READ_ONLY = BTREE_DECORATOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__IS_PART_OF_KEY = BTREE_DECORATOR__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__ASSOCIATION = BTREE_DECORATOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__REPRESENTING_INSTANCE_ROLES = BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = BTREE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___DESTROY = BTREE_DECORATOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___GET_FULL_LABEL = BTREE_DECORATOR___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___GET_LABEL = BTREE_DECORATOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT___HAS_UNNAMED_LABEL = BTREE_DECORATOR___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = BTREE_DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.impl.RetryImpl <em>Retry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.impl.RetryImpl
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getRetry()
	 * @generated
	 */
	int RETRY = 20;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_EXTENSIONS = BTREE_DECORATOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__ID = BTREE_DECORATOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__SID = BTREE_DECORATOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__CONSTRAINTS = BTREE_DECORATOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_CONSTRAINTS = BTREE_DECORATOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Migrated Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MIGRATED_ELEMENTS = BTREE_DECORATOR__OWNED_MIGRATED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__NAME = BTREE_DECORATOR__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__INCOMING_TRACES = BTREE_DECORATOR__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OUTGOING_TRACES = BTREE_DECORATOR__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__VISIBLE_IN_DOC = BTREE_DECORATOR__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__VISIBLE_IN_LM = BTREE_DECORATOR__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__SUMMARY = BTREE_DECORATOR__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__DESCRIPTION = BTREE_DECORATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__REVIEW = BTREE_DECORATOR__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_PROPERTY_VALUES = BTREE_DECORATOR__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_ENUMERATION_PROPERTY_TYPES = BTREE_DECORATOR__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__APPLIED_PROPERTY_VALUES = BTREE_DECORATOR__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__APPLIED_PROPERTY_VALUE_GROUPS = BTREE_DECORATOR__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__STATUS = BTREE_DECORATOR__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__FEATURES = BTREE_DECORATOR__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__APPLIED_REQUIREMENTS = BTREE_DECORATOR__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__IS_ABSTRACT = BTREE_DECORATOR__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__IS_STATIC = BTREE_DECORATOR__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__VISIBILITY = BTREE_DECORATOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__ABSTRACT_TYPE = BTREE_DECORATOR__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__TYPE = BTREE_DECORATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__ORDERED = BTREE_DECORATOR__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__UNIQUE = BTREE_DECORATOR__UNIQUE;

	/**
	 * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__MIN_INCLUSIVE = BTREE_DECORATOR__MIN_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__MAX_INCLUSIVE = BTREE_DECORATOR__MAX_INCLUSIVE;

	/**
	 * The feature id for the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_DEFAULT_VALUE = BTREE_DECORATOR__OWNED_DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MIN_VALUE = BTREE_DECORATOR__OWNED_MIN_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MAX_VALUE = BTREE_DECORATOR__OWNED_MAX_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_NULL_VALUE = BTREE_DECORATOR__OWNED_NULL_VALUE;

	/**
	 * The feature id for the '<em><b>Owned Min Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MIN_CARD = BTREE_DECORATOR__OWNED_MIN_CARD;

	/**
	 * The feature id for the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MIN_LENGTH = BTREE_DECORATOR__OWNED_MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Owned Max Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MAX_CARD = BTREE_DECORATOR__OWNED_MAX_CARD;

	/**
	 * The feature id for the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__OWNED_MAX_LENGTH = BTREE_DECORATOR__OWNED_MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__FINAL = BTREE_DECORATOR__FINAL;

	/**
	 * The feature id for the '<em><b>Aggregation Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__AGGREGATION_KIND = BTREE_DECORATOR__AGGREGATION_KIND;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__IS_DERIVED = BTREE_DECORATOR__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__IS_READ_ONLY = BTREE_DECORATOR__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Is Part Of Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__IS_PART_OF_KEY = BTREE_DECORATOR__IS_PART_OF_KEY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__ASSOCIATION = BTREE_DECORATOR__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Representing Instance Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY__REPRESENTING_INSTANCE_ROLES = BTREE_DECORATOR__REPRESENTING_INSTANCE_ROLES;

	/**
	 * The number of structural features of the '<em>Retry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_FEATURE_COUNT = BTREE_DECORATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY___DESTROY = BTREE_DECORATOR___DESTROY;

	/**
	 * The operation id for the '<em>Get Full Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY___GET_FULL_LABEL = BTREE_DECORATOR___GET_FULL_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY___GET_LABEL = BTREE_DECORATOR___GET_LABEL;

	/**
	 * The operation id for the '<em>Has Unnamed Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY___HAS_UNNAMED_LABEL = BTREE_DECORATOR___HAS_UNNAMED_LABEL;

	/**
	 * The number of operations of the '<em>Retry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETRY_OPERATION_COUNT = BTREE_DECORATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rds.capella.btree.data.BehaviourTree.TickResult <em>Tick Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rds.capella.btree.data.BehaviourTree.TickResult
	 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getTickResult()
	 * @generated
	 */
	int TICK_RESULT = 21;

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeElement <em>BTree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Element</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeElement
	 * @generated
	 */
	EClass getBTreeElement();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeNode <em>BTree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Node</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeNode
	 * @generated
	 */
	EClass getBTreeNode();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeContainer <em>BTree Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Container</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeContainer
	 * @generated
	 */
	EClass getBTreeContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link rds.capella.btree.data.BehaviourTree.BTreeContainer#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Nodes</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeContainer#getOwnedNodes()
	 * @see #getBTreeContainer()
	 * @generated
	 */
	EReference getBTreeContainer_OwnedNodes();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeLeaf <em>BTree Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Leaf</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeLeaf
	 * @generated
	 */
	EClass getBTreeLeaf();

	/**
	 * Returns the meta object for the reference '{@link rds.capella.btree.data.BehaviourTree.BTreeLeaf#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeLeaf#getFunction()
	 * @see #getBTreeLeaf()
	 * @generated
	 */
	EReference getBTreeLeaf_Function();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeDecorator <em>BTree Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Decorator</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeDecorator
	 * @generated
	 */
	EClass getBTreeDecorator();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeSequence <em>BTree Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Sequence</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeSequence
	 * @generated
	 */
	EClass getBTreeSequence();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeFallback <em>BTree Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Fallback</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeFallback
	 * @generated
	 */
	EClass getBTreeFallback();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.BTreeRoot <em>BTree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BTree Root</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeRoot
	 * @generated
	 */
	EClass getBTreeRoot();

	/**
	 * Returns the meta object for the containment reference '{@link rds.capella.btree.data.BehaviourTree.BTreeRoot#getOwnedBTreeContainer <em>Owned BTree Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned BTree Container</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.BTreeRoot#getOwnedBTreeContainer()
	 * @see #getBTreeRoot()
	 * @generated
	 */
	EReference getBTreeRoot_OwnedBTreeContainer();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.ReactiveSequence <em>Reactive Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Sequence</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.ReactiveSequence
	 * @generated
	 */
	EClass getReactiveSequence();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.SequenceStar <em>Sequence Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Star</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.SequenceStar
	 * @generated
	 */
	EClass getSequenceStar();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Fallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Fallback
	 * @generated
	 */
	EClass getFallback();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.ReactiveFallback <em>Reactive Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactive Fallback</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.ReactiveFallback
	 * @generated
	 */
	EClass getReactiveFallback();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Inverter <em>Inverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverter</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Inverter
	 * @generated
	 */
	EClass getInverter();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.ForceSuccess <em>Force Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Success</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.ForceSuccess
	 * @generated
	 */
	EClass getForceSuccess();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.ForceFailure <em>Force Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Force Failure</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.ForceFailure
	 * @generated
	 */
	EClass getForceFailure();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for class '{@link rds.capella.btree.data.BehaviourTree.Retry <em>Retry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retry</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.Retry
	 * @generated
	 */
	EClass getRetry();

	/**
	 * Returns the meta object for enum '{@link rds.capella.btree.data.BehaviourTree.TickResult <em>Tick Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tick Result</em>'.
	 * @see rds.capella.btree.data.BehaviourTree.TickResult
	 * @generated
	 */
	EEnum getTickResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourTreeFactory getBehaviourTreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeElementImpl <em>BTree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeElementImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeElement()
		 * @generated
		 */
		EClass BTREE_ELEMENT = eINSTANCE.getBTreeElement();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeNodeImpl <em>BTree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeNodeImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeNode()
		 * @generated
		 */
		EClass BTREE_NODE = eINSTANCE.getBTreeNode();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeContainerImpl <em>BTree Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeContainerImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeContainer()
		 * @generated
		 */
		EClass BTREE_CONTAINER = eINSTANCE.getBTreeContainer();

		/**
		 * The meta object literal for the '<em><b>Owned Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTREE_CONTAINER__OWNED_NODES = eINSTANCE.getBTreeContainer_OwnedNodes();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeLeafImpl <em>BTree Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeLeafImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeLeaf()
		 * @generated
		 */
		EClass BTREE_LEAF = eINSTANCE.getBTreeLeaf();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTREE_LEAF__FUNCTION = eINSTANCE.getBTreeLeaf_Function();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeDecoratorImpl <em>BTree Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeDecoratorImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeDecorator()
		 * @generated
		 */
		EClass BTREE_DECORATOR = eINSTANCE.getBTreeDecorator();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeSequenceImpl <em>BTree Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeSequenceImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeSequence()
		 * @generated
		 */
		EClass BTREE_SEQUENCE = eINSTANCE.getBTreeSequence();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeFallbackImpl <em>BTree Fallback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeFallbackImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeFallback()
		 * @generated
		 */
		EClass BTREE_FALLBACK = eINSTANCE.getBTreeFallback();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl <em>BTree Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getBTreeRoot()
		 * @generated
		 */
		EClass BTREE_ROOT = eINSTANCE.getBTreeRoot();

		/**
		 * The meta object literal for the '<em><b>Owned BTree Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BTREE_ROOT__OWNED_BTREE_CONTAINER = eINSTANCE.getBTreeRoot_OwnedBTreeContainer();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ActionImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ConditionImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ParallelImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.SequenceImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ReactiveSequenceImpl <em>Reactive Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ReactiveSequenceImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getReactiveSequence()
		 * @generated
		 */
		EClass REACTIVE_SEQUENCE = eINSTANCE.getReactiveSequence();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.SequenceStarImpl <em>Sequence Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.SequenceStarImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getSequenceStar()
		 * @generated
		 */
		EClass SEQUENCE_STAR = eINSTANCE.getSequenceStar();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.FallbackImpl <em>Fallback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.FallbackImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getFallback()
		 * @generated
		 */
		EClass FALLBACK = eINSTANCE.getFallback();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ReactiveFallbackImpl <em>Reactive Fallback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ReactiveFallbackImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getReactiveFallback()
		 * @generated
		 */
		EClass REACTIVE_FALLBACK = eINSTANCE.getReactiveFallback();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.InverterImpl <em>Inverter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.InverterImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getInverter()
		 * @generated
		 */
		EClass INVERTER = eINSTANCE.getInverter();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ForceSuccessImpl <em>Force Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ForceSuccessImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getForceSuccess()
		 * @generated
		 */
		EClass FORCE_SUCCESS = eINSTANCE.getForceSuccess();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.ForceFailureImpl <em>Force Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.ForceFailureImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getForceFailure()
		 * @generated
		 */
		EClass FORCE_FAILURE = eINSTANCE.getForceFailure();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.RepeatImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.impl.RetryImpl <em>Retry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.impl.RetryImpl
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getRetry()
		 * @generated
		 */
		EClass RETRY = eINSTANCE.getRetry();

		/**
		 * The meta object literal for the '{@link rds.capella.btree.data.BehaviourTree.TickResult <em>Tick Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rds.capella.btree.data.BehaviourTree.TickResult
		 * @see rds.capella.btree.data.BehaviourTree.impl.BehaviourTreePackageImpl#getTickResult()
		 * @generated
		 */
		EEnum TICK_RESULT = eINSTANCE.getTickResult();

	}

} //BehaviourTreePackage
