
package rds.capella.btree.data.BehaviourTree.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.common.data.modellingcore.FinalizableElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;

import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.capellacore.VisibilityKind;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.core.data.information.Association;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.MultiplicityElement;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.requirement.Requirement;

import org.polarsys.kitalpha.emde.model.impl.ElementExtensionImpl;

import rds.capella.btree.data.BehaviourTree.BTreeContainer;
import rds.capella.btree.data.BehaviourTree.BTreeElement;
import rds.capella.btree.data.BehaviourTree.BTreeRoot;
import rds.capella.btree.data.BehaviourTree.BehaviourTreePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTree Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getId <em>Id</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getSid <em>Sid</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMigratedElements <em>Owned Migrated Elements</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getReview <em>Review</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMinCard <em>Owned Min Card</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMaxCard <em>Owned Max Card</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#isIsPartOfKey <em>Is Part Of Key</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 *   <li>{@link rds.capella.btree.data.BehaviourTree.impl.BTreeRootImpl#getOwnedBTreeContainer <em>Owned BTree Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTreeRootImpl extends ElementExtensionImpl implements BTreeRoot {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSid() <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid()
	 * @generated
	 * @ordered
	 */
	protected static final String SID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSid() <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSid()
	 * @generated
	 * @ordered
	 */
	protected String sid = SID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedConstraints() <em>Owned Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstraint> ownedConstraints;

	/**
	 * The cached value of the '{@link #getOwnedMigratedElements() <em>Owned Migrated Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMigratedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> ownedMigratedElements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_DOC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInDoc = VISIBLE_IN_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_LM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInLM = VISIBLE_IN_LM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractType() <em>Abstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstractType;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDefaultValue() <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedDefaultValue;

	/**
	 * The cached value of the '{@link #getOwnedMinValue() <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedMinValue;

	/**
	 * The cached value of the '{@link #getOwnedMaxValue() <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedMaxValue;

	/**
	 * The cached value of the '{@link #getOwnedNullValue() <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNullValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedNullValue;

	/**
	 * The cached value of the '{@link #getOwnedMinCard() <em>Owned Min Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinCard()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMinCard;

	/**
	 * The cached value of the '{@link #getOwnedMinLength() <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMinLength;

	/**
	 * The cached value of the '{@link #getOwnedMaxCard() <em>Owned Max Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxCard()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMaxCard;

	/**
	 * The cached value of the '{@link #getOwnedMaxLength() <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMaxLength;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_KIND_EDEFAULT = AggregationKind.UNSET;

	/**
	 * The cached value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregationKind = AGGREGATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPartOfKey() <em>Is Part Of Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_OF_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartOfKey() <em>Is Part Of Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartOfKey = IS_PART_OF_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedBTreeContainer() <em>Owned BTree Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBTreeContainer()
	 * @generated
	 * @ordered
	 */
	protected BTreeContainer ownedBTreeContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTreeRootImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourTreePackage.Literals.BTREE_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getId() {

		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setId(String newId) {

		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__ID, oldId, id));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getSid() {

		return sid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setSid(String newSid) {

		String oldSid = sid;
		sid = newSid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__SID, oldSid, sid));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractConstraint> getConstraints() {

		// TODO: implement this method to return the 'Constraints' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractConstraint> getOwnedConstraints() {

		if (ownedConstraints == null) {
			ownedConstraints = new EObjectContainmentEList.Resolving<AbstractConstraint>(AbstractConstraint.class, this,
					BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS);
		}
		return ownedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<ModelElement> getOwnedMigratedElements() {

		if (ownedMigratedElements == null) {
			ownedMigratedElements = new EObjectContainmentEList.Resolving<ModelElement>(ModelElement.class, this,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS);
		}
		return ownedMigratedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getName() {

		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setName(String newName) {

		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__NAME, oldName,
					name));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractTrace> getIncomingTraces() {

		//INJECTED-CODE-BEGIN
		return new BasicEList<AbstractTrace>();
		//INJECTED-CODE-END

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractTrace> getOutgoingTraces() {

		//INJECTED-CODE-BEGIN
		return new BasicEList<AbstractTrace>();
		//INJECTED-CODE-END

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isVisibleInDoc() {

		return visibleInDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setVisibleInDoc(boolean newVisibleInDoc) {

		boolean oldVisibleInDoc = visibleInDoc;
		visibleInDoc = newVisibleInDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC,
					oldVisibleInDoc, visibleInDoc));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isVisibleInLM() {

		return visibleInLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setVisibleInLM(boolean newVisibleInLM) {

		boolean oldVisibleInLM = visibleInLM;
		visibleInLM = newVisibleInLM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM,
					oldVisibleInLM, visibleInLM));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getSummary() {

		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setSummary(String newSummary) {

		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__SUMMARY, oldSummary,
					summary));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getDescription() {

		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setDescription(String newDescription) {

		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__DESCRIPTION,
					oldDescription, description));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getReview() {

		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setReview(String newReview) {

		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__REVIEW, oldReview,
					review));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {

		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList.Resolving<AbstractPropertyValue>(
					AbstractPropertyValue.class, this, BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {

		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList.Resolving<EnumerationPropertyType>(
					EnumerationPropertyType.class, this,
					BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {

		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this,
					BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {

		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList.Resolving<PropertyValueGroup>(
					PropertyValueGroup.class, this, BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {

		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this,
					BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EnumerationPropertyLiteral getStatus() {

		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject) status;
			status = (EnumerationPropertyLiteral) eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviourTreePackage.BTREE_ROOT__STATUS,
							oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public EnumerationPropertyLiteral basicGetStatus() {

		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setStatus(EnumerationPropertyLiteral newStatus) {

		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__STATUS, oldStatus,
					status));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<EnumerationPropertyLiteral> getFeatures() {

		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this,
					BehaviourTreePackage.BTREE_ROOT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<Requirement> getAppliedRequirements() {

		// TODO: implement this method to return the 'Applied Requirements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsAbstract() {

		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsAbstract(boolean newIsAbstract) {

		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT,
					oldIsAbstract, isAbstract));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsStatic() {

		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsStatic(boolean newIsStatic) {

		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__IS_STATIC,
					oldIsStatic, isStatic));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public VisibilityKind getVisibility() {

		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setVisibility(VisibilityKind newVisibility) {

		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__VISIBILITY,
					oldVisibility, visibility));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public AbstractType getAbstractType() {

		if (abstractType != null && abstractType.eIsProxy()) {
			InternalEObject oldAbstractType = (InternalEObject) abstractType;
			abstractType = (AbstractType) eResolveProxy(oldAbstractType);
			if (abstractType != oldAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE, oldAbstractType, abstractType));
			}
		}
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public AbstractType basicGetAbstractType() {

		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setAbstractType(AbstractType newAbstractType) {

		AbstractType oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE,
					oldAbstractType, abstractType));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Type getType() {

		Type type = basicGetType();
		return type != null && type.eIsProxy() ? (Type) eResolveProxy((InternalEObject) type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Type basicGetType() {

		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isOrdered() {

		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOrdered(boolean newOrdered) {

		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__ORDERED, oldOrdered,
					ordered));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isUnique() {

		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setUnique(boolean newUnique) {

		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__UNIQUE, oldUnique,
					unique));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isMinInclusive() {

		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setMinInclusive(boolean newMinInclusive) {

		boolean oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE,
					oldMinInclusive, minInclusive));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isMaxInclusive() {

		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setMaxInclusive(boolean newMaxInclusive) {

		boolean oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE,
					oldMaxInclusive, maxInclusive));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public DataValue getOwnedDefaultValue() {

		return ownedDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedDefaultValue(DataValue newOwnedDefaultValue, NotificationChain msgs) {

		DataValue oldOwnedDefaultValue = ownedDefaultValue;
		ownedDefaultValue = newOwnedDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE, oldOwnedDefaultValue, newOwnedDefaultValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedDefaultValue(DataValue newOwnedDefaultValue) {

		if (newOwnedDefaultValue != ownedDefaultValue) {
			NotificationChain msgs = null;
			if (ownedDefaultValue != null)
				msgs = ((InternalEObject) ownedDefaultValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE, null, msgs);
			if (newOwnedDefaultValue != null)
				msgs = ((InternalEObject) newOwnedDefaultValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE, null, msgs);
			msgs = basicSetOwnedDefaultValue(newOwnedDefaultValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE,
					newOwnedDefaultValue, newOwnedDefaultValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public DataValue getOwnedMinValue() {

		return ownedMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMinValue(DataValue newOwnedMinValue, NotificationChain msgs) {

		DataValue oldOwnedMinValue = ownedMinValue;
		ownedMinValue = newOwnedMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE, oldOwnedMinValue, newOwnedMinValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMinValue(DataValue newOwnedMinValue) {

		if (newOwnedMinValue != ownedMinValue) {
			NotificationChain msgs = null;
			if (ownedMinValue != null)
				msgs = ((InternalEObject) ownedMinValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE, null, msgs);
			if (newOwnedMinValue != null)
				msgs = ((InternalEObject) newOwnedMinValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE, null, msgs);
			msgs = basicSetOwnedMinValue(newOwnedMinValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE,
					newOwnedMinValue, newOwnedMinValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public DataValue getOwnedMaxValue() {

		return ownedMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMaxValue(DataValue newOwnedMaxValue, NotificationChain msgs) {

		DataValue oldOwnedMaxValue = ownedMaxValue;
		ownedMaxValue = newOwnedMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE, oldOwnedMaxValue, newOwnedMaxValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMaxValue(DataValue newOwnedMaxValue) {

		if (newOwnedMaxValue != ownedMaxValue) {
			NotificationChain msgs = null;
			if (ownedMaxValue != null)
				msgs = ((InternalEObject) ownedMaxValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE, null, msgs);
			if (newOwnedMaxValue != null)
				msgs = ((InternalEObject) newOwnedMaxValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE, null, msgs);
			msgs = basicSetOwnedMaxValue(newOwnedMaxValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE,
					newOwnedMaxValue, newOwnedMaxValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public DataValue getOwnedNullValue() {

		return ownedNullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedNullValue(DataValue newOwnedNullValue, NotificationChain msgs) {

		DataValue oldOwnedNullValue = ownedNullValue;
		ownedNullValue = newOwnedNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE, oldOwnedNullValue, newOwnedNullValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedNullValue(DataValue newOwnedNullValue) {

		if (newOwnedNullValue != ownedNullValue) {
			NotificationChain msgs = null;
			if (ownedNullValue != null)
				msgs = ((InternalEObject) ownedNullValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE, null, msgs);
			if (newOwnedNullValue != null)
				msgs = ((InternalEObject) newOwnedNullValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE, null, msgs);
			msgs = basicSetOwnedNullValue(newOwnedNullValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE,
					newOwnedNullValue, newOwnedNullValue));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public NumericValue getOwnedMinCard() {

		return ownedMinCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMinCard(NumericValue newOwnedMinCard, NotificationChain msgs) {

		NumericValue oldOwnedMinCard = ownedMinCard;
		ownedMinCard = newOwnedMinCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD, oldOwnedMinCard, newOwnedMinCard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMinCard(NumericValue newOwnedMinCard) {

		if (newOwnedMinCard != ownedMinCard) {
			NotificationChain msgs = null;
			if (ownedMinCard != null)
				msgs = ((InternalEObject) ownedMinCard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD, null, msgs);
			if (newOwnedMinCard != null)
				msgs = ((InternalEObject) newOwnedMinCard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD, null, msgs);
			msgs = basicSetOwnedMinCard(newOwnedMinCard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD,
					newOwnedMinCard, newOwnedMinCard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public NumericValue getOwnedMinLength() {

		return ownedMinLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMinLength(NumericValue newOwnedMinLength, NotificationChain msgs) {

		NumericValue oldOwnedMinLength = ownedMinLength;
		ownedMinLength = newOwnedMinLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH, oldOwnedMinLength, newOwnedMinLength);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMinLength(NumericValue newOwnedMinLength) {

		if (newOwnedMinLength != ownedMinLength) {
			NotificationChain msgs = null;
			if (ownedMinLength != null)
				msgs = ((InternalEObject) ownedMinLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH, null, msgs);
			if (newOwnedMinLength != null)
				msgs = ((InternalEObject) newOwnedMinLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH, null, msgs);
			msgs = basicSetOwnedMinLength(newOwnedMinLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH,
					newOwnedMinLength, newOwnedMinLength));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public NumericValue getOwnedMaxCard() {

		return ownedMaxCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMaxCard(NumericValue newOwnedMaxCard, NotificationChain msgs) {

		NumericValue oldOwnedMaxCard = ownedMaxCard;
		ownedMaxCard = newOwnedMaxCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD, oldOwnedMaxCard, newOwnedMaxCard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMaxCard(NumericValue newOwnedMaxCard) {

		if (newOwnedMaxCard != ownedMaxCard) {
			NotificationChain msgs = null;
			if (ownedMaxCard != null)
				msgs = ((InternalEObject) ownedMaxCard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD, null, msgs);
			if (newOwnedMaxCard != null)
				msgs = ((InternalEObject) newOwnedMaxCard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD, null, msgs);
			msgs = basicSetOwnedMaxCard(newOwnedMaxCard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD,
					newOwnedMaxCard, newOwnedMaxCard));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public NumericValue getOwnedMaxLength() {

		return ownedMaxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedMaxLength(NumericValue newOwnedMaxLength, NotificationChain msgs) {

		NumericValue oldOwnedMaxLength = ownedMaxLength;
		ownedMaxLength = newOwnedMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH, oldOwnedMaxLength, newOwnedMaxLength);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedMaxLength(NumericValue newOwnedMaxLength) {

		if (newOwnedMaxLength != ownedMaxLength) {
			NotificationChain msgs = null;
			if (ownedMaxLength != null)
				msgs = ((InternalEObject) ownedMaxLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH, null, msgs);
			if (newOwnedMaxLength != null)
				msgs = ((InternalEObject) newOwnedMaxLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH, null, msgs);
			msgs = basicSetOwnedMaxLength(newOwnedMaxLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH,
					newOwnedMaxLength, newOwnedMaxLength));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isFinal() {

		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setFinal(boolean newFinal) {

		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__FINAL, oldFinal,
					final_));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public AggregationKind getAggregationKind() {

		return aggregationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setAggregationKind(AggregationKind newAggregationKind) {

		AggregationKind oldAggregationKind = aggregationKind;
		aggregationKind = newAggregationKind == null ? AGGREGATION_KIND_EDEFAULT : newAggregationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND,
					oldAggregationKind, aggregationKind));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsDerived() {

		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsDerived(boolean newIsDerived) {

		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__IS_DERIVED,
					oldIsDerived, isDerived));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsReadOnly() {

		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsReadOnly(boolean newIsReadOnly) {

		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY,
					oldIsReadOnly, isReadOnly));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean isIsPartOfKey() {

		return isPartOfKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setIsPartOfKey(boolean newIsPartOfKey) {

		boolean oldIsPartOfKey = isPartOfKey;
		isPartOfKey = newIsPartOfKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY,
					oldIsPartOfKey, isPartOfKey));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public Association getAssociation() {

		Association association = basicGetAssociation();
		return association != null && association.eIsProxy()
				? (Association) eResolveProxy((InternalEObject) association)
				: association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public Association basicGetAssociation() {

		// TODO: implement this method to return the 'Association' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public EList<InstanceRole> getRepresentingInstanceRoles() {

		// TODO: implement this method to return the 'Representing Instance Roles' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public BTreeContainer getOwnedBTreeContainer() {

		return ownedBTreeContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public NotificationChain basicSetOwnedBTreeContainer(BTreeContainer newOwnedBTreeContainer,
			NotificationChain msgs) {

		BTreeContainer oldOwnedBTreeContainer = ownedBTreeContainer;
		ownedBTreeContainer = newOwnedBTreeContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER, oldOwnedBTreeContainer,
					newOwnedBTreeContainer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}

		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void setOwnedBTreeContainer(BTreeContainer newOwnedBTreeContainer) {

		if (newOwnedBTreeContainer != ownedBTreeContainer) {
			NotificationChain msgs = null;
			if (ownedBTreeContainer != null)
				msgs = ((InternalEObject) ownedBTreeContainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER, null, msgs);
			if (newOwnedBTreeContainer != null)
				msgs = ((InternalEObject) newOwnedBTreeContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER, null, msgs);
			msgs = basicSetOwnedBTreeContainer(newOwnedBTreeContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER, newOwnedBTreeContainer,
					newOwnedBTreeContainer));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public void destroy() {
		org.eclipse.emf.ecore.util.EcoreUtil.delete(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getFullLabel() {
		return org.polarsys.capella.common.model.label.LabelRetriever.getFullLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public String getLabel() {
		return org.polarsys.capella.common.model.label.LabelRetriever.getLabel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	@Override
	public boolean hasUnnamedLabel() {
		return org.polarsys.capella.common.model.label.LabelRetriever.UNNAMED_ELEMENT.equals(this.getLabel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
			return ((InternalEList<?>) getOwnedConstraints()).basicRemove(otherEnd, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
			return ((InternalEList<?>) getOwnedMigratedElements()).basicRemove(otherEnd, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
			return ((InternalEList<?>) getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
			return ((InternalEList<?>) getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
			return ((InternalEList<?>) getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
			return basicSetOwnedDefaultValue(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
			return basicSetOwnedMinValue(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
			return basicSetOwnedMaxValue(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
			return basicSetOwnedNullValue(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
			return basicSetOwnedMinCard(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
			return basicSetOwnedMinLength(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
			return basicSetOwnedMaxCard(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
			return basicSetOwnedMaxLength(null, msgs);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
			return basicSetOwnedBTreeContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
			return getId();
		case BehaviourTreePackage.BTREE_ROOT__SID:
			return getSid();
		case BehaviourTreePackage.BTREE_ROOT__CONSTRAINTS:
			return getConstraints();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
			return getOwnedConstraints();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
			return getOwnedMigratedElements();
		case BehaviourTreePackage.BTREE_ROOT__NAME:
			return getName();
		case BehaviourTreePackage.BTREE_ROOT__INCOMING_TRACES:
			return getIncomingTraces();
		case BehaviourTreePackage.BTREE_ROOT__OUTGOING_TRACES:
			return getOutgoingTraces();
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
			return isVisibleInDoc();
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
			return isVisibleInLM();
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
			return getSummary();
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
			return getDescription();
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
			return getReview();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
			return getOwnedPropertyValues();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
			return getOwnedEnumerationPropertyTypes();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES:
			return getAppliedPropertyValues();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
			return getOwnedPropertyValueGroups();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS:
			return getAppliedPropertyValueGroups();
		case BehaviourTreePackage.BTREE_ROOT__STATUS:
			if (resolve)
				return getStatus();
			return basicGetStatus();
		case BehaviourTreePackage.BTREE_ROOT__FEATURES:
			return getFeatures();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_REQUIREMENTS:
			return getAppliedRequirements();
		case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
			return isIsAbstract();
		case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
			return isIsStatic();
		case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
			return getVisibility();
		case BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE:
			if (resolve)
				return getAbstractType();
			return basicGetAbstractType();
		case BehaviourTreePackage.BTREE_ROOT__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case BehaviourTreePackage.BTREE_ROOT__ORDERED:
			return isOrdered();
		case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
			return isUnique();
		case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
			return isMinInclusive();
		case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
			return isMaxInclusive();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
			return getOwnedDefaultValue();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
			return getOwnedMinValue();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
			return getOwnedMaxValue();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
			return getOwnedNullValue();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
			return getOwnedMinCard();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
			return getOwnedMinLength();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
			return getOwnedMaxCard();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
			return getOwnedMaxLength();
		case BehaviourTreePackage.BTREE_ROOT__FINAL:
			return isFinal();
		case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
			return getAggregationKind();
		case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
			return isIsDerived();
		case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
			return isIsReadOnly();
		case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
			return isIsPartOfKey();
		case BehaviourTreePackage.BTREE_ROOT__ASSOCIATION:
			if (resolve)
				return getAssociation();
			return basicGetAssociation();
		case BehaviourTreePackage.BTREE_ROOT__REPRESENTING_INSTANCE_ROLES:
			return getRepresentingInstanceRoles();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
			return getOwnedBTreeContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
			setId((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__SID:
			setSid((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
			getOwnedConstraints().clear();
			getOwnedConstraints().addAll((Collection<? extends AbstractConstraint>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
			getOwnedMigratedElements().clear();
			getOwnedMigratedElements().addAll((Collection<? extends ModelElement>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__NAME:
			setName((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
			setVisibleInDoc((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
			setVisibleInLM((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
			setSummary((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
			setReview((String) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
			getOwnedPropertyValues().clear();
			getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
			getOwnedEnumerationPropertyTypes().clear();
			getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES:
			getAppliedPropertyValues().clear();
			getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
			getOwnedPropertyValueGroups().clear();
			getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS:
			getAppliedPropertyValueGroups().clear();
			getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__STATUS:
			setStatus((EnumerationPropertyLiteral) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
			setIsStatic((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
			setVisibility((VisibilityKind) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE:
			setAbstractType((AbstractType) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__ORDERED:
			setOrdered((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
			setUnique((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
			setMinInclusive((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
			setMaxInclusive((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
			setOwnedDefaultValue((DataValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
			setOwnedMinValue((DataValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
			setOwnedMaxValue((DataValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
			setOwnedNullValue((DataValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
			setOwnedMinCard((NumericValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
			setOwnedMinLength((NumericValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
			setOwnedMaxCard((NumericValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
			setOwnedMaxLength((NumericValue) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__FINAL:
			setFinal((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
			setAggregationKind((AggregationKind) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
			setIsDerived((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
			setIsReadOnly((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
			setIsPartOfKey((Boolean) newValue);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
			setOwnedBTreeContainer((BTreeContainer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
			setId(ID_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__SID:
			setSid(SID_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
			getOwnedConstraints().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
			getOwnedMigratedElements().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
			setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
			setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
			setSummary(SUMMARY_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
			setReview(REVIEW_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
			getOwnedPropertyValues().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
			getOwnedEnumerationPropertyTypes().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES:
			getAppliedPropertyValues().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
			getOwnedPropertyValueGroups().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS:
			getAppliedPropertyValueGroups().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__STATUS:
			setStatus((EnumerationPropertyLiteral) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__FEATURES:
			getFeatures().clear();
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
			setIsStatic(IS_STATIC_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
			setVisibility(VISIBILITY_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE:
			setAbstractType((AbstractType) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__ORDERED:
			setOrdered(ORDERED_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
			setUnique(UNIQUE_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
			setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
			setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
			setOwnedDefaultValue((DataValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
			setOwnedMinValue((DataValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
			setOwnedMaxValue((DataValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
			setOwnedNullValue((DataValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
			setOwnedMinCard((NumericValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
			setOwnedMinLength((NumericValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
			setOwnedMaxCard((NumericValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
			setOwnedMaxLength((NumericValue) null);
			return;
		case BehaviourTreePackage.BTREE_ROOT__FINAL:
			setFinal(FINAL_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
			setAggregationKind(AGGREGATION_KIND_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
			setIsDerived(IS_DERIVED_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
			setIsReadOnly(IS_READ_ONLY_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
			setIsPartOfKey(IS_PART_OF_KEY_EDEFAULT);
			return;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
			setOwnedBTreeContainer((BTreeContainer) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BehaviourTreePackage.BTREE_ROOT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case BehaviourTreePackage.BTREE_ROOT__SID:
			return SID_EDEFAULT == null ? sid != null : !SID_EDEFAULT.equals(sid);
		case BehaviourTreePackage.BTREE_ROOT__CONSTRAINTS:
			return !getConstraints().isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
			return ownedConstraints != null && !ownedConstraints.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
			return ownedMigratedElements != null && !ownedMigratedElements.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BehaviourTreePackage.BTREE_ROOT__INCOMING_TRACES:
			return !getIncomingTraces().isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OUTGOING_TRACES:
			return !getOutgoingTraces().isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
			return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
			return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
			return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
		case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case BehaviourTreePackage.BTREE_ROOT__REVIEW:
			return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
			return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
			return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES:
			return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
			return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS:
			return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__STATUS:
			return status != null;
		case BehaviourTreePackage.BTREE_ROOT__FEATURES:
			return features != null && !features.isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__APPLIED_REQUIREMENTS:
			return !getAppliedRequirements().isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
			return isStatic != IS_STATIC_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
			return visibility != VISIBILITY_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE:
			return abstractType != null;
		case BehaviourTreePackage.BTREE_ROOT__TYPE:
			return basicGetType() != null;
		case BehaviourTreePackage.BTREE_ROOT__ORDERED:
			return ordered != ORDERED_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
			return unique != UNIQUE_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
			return minInclusive != MIN_INCLUSIVE_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
			return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
			return ownedDefaultValue != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
			return ownedMinValue != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
			return ownedMaxValue != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
			return ownedNullValue != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
			return ownedMinCard != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
			return ownedMinLength != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
			return ownedMaxCard != null;
		case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
			return ownedMaxLength != null;
		case BehaviourTreePackage.BTREE_ROOT__FINAL:
			return final_ != FINAL_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
			return aggregationKind != AGGREGATION_KIND_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
			return isDerived != IS_DERIVED_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
			return isReadOnly != IS_READ_ONLY_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
			return isPartOfKey != IS_PART_OF_KEY_EDEFAULT;
		case BehaviourTreePackage.BTREE_ROOT__ASSOCIATION:
			return basicGetAssociation() != null;
		case BehaviourTreePackage.BTREE_ROOT__REPRESENTING_INSTANCE_ROLES:
			return !getRepresentingInstanceRoles().isEmpty();
		case BehaviourTreePackage.BTREE_ROOT__OWNED_BTREE_CONTAINER:
			return ownedBTreeContainer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__ID:
				return ModellingcorePackage.MODEL_ELEMENT__ID;
			case BehaviourTreePackage.BTREE_ROOT__SID:
				return ModellingcorePackage.MODEL_ELEMENT__SID;
			case BehaviourTreePackage.BTREE_ROOT__CONSTRAINTS:
				return ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS:
				return ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS:
				return ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__NAME:
				return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__INCOMING_TRACES:
				return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
			case BehaviourTreePackage.BTREE_ROOT__OUTGOING_TRACES:
				return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
			default:
				return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC:
				return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
			case BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM:
				return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
			default:
				return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__SUMMARY:
				return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
			case BehaviourTreePackage.BTREE_ROOT__DESCRIPTION:
				return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
			case BehaviourTreePackage.BTREE_ROOT__REVIEW:
				return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES:
				return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
			case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES:
				return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS:
				return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
			case BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS:
				return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
			case BehaviourTreePackage.BTREE_ROOT__STATUS:
				return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
			case BehaviourTreePackage.BTREE_ROOT__FEATURES:
				return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
			case BehaviourTreePackage.BTREE_ROOT__APPLIED_REQUIREMENTS:
				return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT:
				return CapellacorePackage.FEATURE__IS_ABSTRACT;
			case BehaviourTreePackage.BTREE_ROOT__IS_STATIC:
				return CapellacorePackage.FEATURE__IS_STATIC;
			case BehaviourTreePackage.BTREE_ROOT__VISIBILITY:
				return CapellacorePackage.FEATURE__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE:
				return ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__TYPE:
				return CapellacorePackage.TYPED_ELEMENT__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__ORDERED:
				return InformationPackage.MULTIPLICITY_ELEMENT__ORDERED;
			case BehaviourTreePackage.BTREE_ROOT__UNIQUE:
				return InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE;
			case BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE:
				return InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE;
			case BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE:
				return InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD;
			case BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH:
				return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;
			default:
				return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__FINAL:
				return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
			default:
				return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND:
				return InformationPackage.PROPERTY__AGGREGATION_KIND;
			case BehaviourTreePackage.BTREE_ROOT__IS_DERIVED:
				return InformationPackage.PROPERTY__IS_DERIVED;
			case BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY:
				return InformationPackage.PROPERTY__IS_READ_ONLY;
			case BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY:
				return InformationPackage.PROPERTY__IS_PART_OF_KEY;
			case BehaviourTreePackage.BTREE_ROOT__ASSOCIATION:
				return InformationPackage.PROPERTY__ASSOCIATION;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (derivedFeatureID) {
			case BehaviourTreePackage.BTREE_ROOT__REPRESENTING_INSTANCE_ROLES:
				return InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES;
			default:
				return -1;
			}
		}
		if (baseClass == BTreeElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.MODEL_ELEMENT__ID:
				return BehaviourTreePackage.BTREE_ROOT__ID;
			case ModellingcorePackage.MODEL_ELEMENT__SID:
				return BehaviourTreePackage.BTREE_ROOT__SID;
			case ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS:
				return BehaviourTreePackage.BTREE_ROOT__CONSTRAINTS;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_CONSTRAINTS;
			case ModellingcorePackage.MODEL_ELEMENT__OWNED_MIGRATED_ELEMENTS:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MIGRATED_ELEMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME:
				return BehaviourTreePackage.BTREE_ROOT__NAME;
			default:
				return -1;
			}
		}
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES:
				return BehaviourTreePackage.BTREE_ROOT__INCOMING_TRACES;
			case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES:
				return BehaviourTreePackage.BTREE_ROOT__OUTGOING_TRACES;
			default:
				return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC:
				return BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_DOC;
			case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM:
				return BehaviourTreePackage.BTREE_ROOT__VISIBLE_IN_LM;
			default:
				return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
			case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY:
				return BehaviourTreePackage.BTREE_ROOT__SUMMARY;
			case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION:
				return BehaviourTreePackage.BTREE_ROOT__DESCRIPTION;
			case CapellacorePackage.CAPELLA_ELEMENT__REVIEW:
				return BehaviourTreePackage.BTREE_ROOT__REVIEW;
			case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUES;
			case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_ENUMERATION_PROPERTY_TYPES;
			case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES:
				return BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUES;
			case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_PROPERTY_VALUE_GROUPS;
			case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS:
				return BehaviourTreePackage.BTREE_ROOT__APPLIED_PROPERTY_VALUE_GROUPS;
			case CapellacorePackage.CAPELLA_ELEMENT__STATUS:
				return BehaviourTreePackage.BTREE_ROOT__STATUS;
			case CapellacorePackage.CAPELLA_ELEMENT__FEATURES:
				return BehaviourTreePackage.BTREE_ROOT__FEATURES;
			case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS:
				return BehaviourTreePackage.BTREE_ROOT__APPLIED_REQUIREMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
			case CapellacorePackage.FEATURE__IS_ABSTRACT:
				return BehaviourTreePackage.BTREE_ROOT__IS_ABSTRACT;
			case CapellacorePackage.FEATURE__IS_STATIC:
				return BehaviourTreePackage.BTREE_ROOT__IS_STATIC;
			case CapellacorePackage.FEATURE__VISIBILITY:
				return BehaviourTreePackage.BTREE_ROOT__VISIBILITY;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE:
				return BehaviourTreePackage.BTREE_ROOT__ABSTRACT_TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
			case CapellacorePackage.TYPED_ELEMENT__TYPE:
				return BehaviourTreePackage.BTREE_ROOT__TYPE;
			default:
				return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
			case InformationPackage.MULTIPLICITY_ELEMENT__ORDERED:
				return BehaviourTreePackage.BTREE_ROOT__ORDERED;
			case InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE:
				return BehaviourTreePackage.BTREE_ROOT__UNIQUE;
			case InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE:
				return BehaviourTreePackage.BTREE_ROOT__MIN_INCLUSIVE;
			case InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE:
				return BehaviourTreePackage.BTREE_ROOT__MAX_INCLUSIVE;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_DEFAULT_VALUE;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_VALUE;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_VALUE;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_NULL_VALUE;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_CARD;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MIN_LENGTH;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_CARD;
			case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH:
				return BehaviourTreePackage.BTREE_ROOT__OWNED_MAX_LENGTH;
			default:
				return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
			case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL:
				return BehaviourTreePackage.BTREE_ROOT__FINAL;
			default:
				return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseFeatureID) {
			case InformationPackage.PROPERTY__AGGREGATION_KIND:
				return BehaviourTreePackage.BTREE_ROOT__AGGREGATION_KIND;
			case InformationPackage.PROPERTY__IS_DERIVED:
				return BehaviourTreePackage.BTREE_ROOT__IS_DERIVED;
			case InformationPackage.PROPERTY__IS_READ_ONLY:
				return BehaviourTreePackage.BTREE_ROOT__IS_READ_ONLY;
			case InformationPackage.PROPERTY__IS_PART_OF_KEY:
				return BehaviourTreePackage.BTREE_ROOT__IS_PART_OF_KEY;
			case InformationPackage.PROPERTY__ASSOCIATION:
				return BehaviourTreePackage.BTREE_ROOT__ASSOCIATION;
			default:
				return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (baseFeatureID) {
			case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
				return BehaviourTreePackage.BTREE_ROOT__REPRESENTING_INSTANCE_ROLES;
			default:
				return -1;
			}
		}
		if (baseClass == BTreeElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseOperationID) {
			/*
			case ModellingcorePackage.MODEL_ELEMENT___DESTROY:
				return BehaviourTreePackage.BTREE_ROOT___DESTROY;
			case ModellingcorePackage.MODEL_ELEMENT___GET_FULL_LABEL:
				return BehaviourTreePackage.BTREE_ROOT___GET_FULL_LABEL;
			case ModellingcorePackage.MODEL_ELEMENT___GET_LABEL:
				return BehaviourTreePackage.BTREE_ROOT___GET_LABEL;
			case ModellingcorePackage.MODEL_ELEMENT___HAS_UNNAMED_LABEL:
				return BehaviourTreePackage.BTREE_ROOT___HAS_UNNAMED_LABEL;
			*/
			default:
				return -1;
			}
		}
		if (baseClass == AbstractNamedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == TraceableElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == BTreeElement.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case BehaviourTreePackage.BTREE_ROOT___DESTROY:
			destroy();
			return null;
		case BehaviourTreePackage.BTREE_ROOT___GET_FULL_LABEL:
			return getFullLabel();
		case BehaviourTreePackage.BTREE_ROOT___GET_LABEL:
			return getLabel();
		case BehaviourTreePackage.BTREE_ROOT___HAS_UNNAMED_LABEL:
			return hasUnnamedLabel();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", sid: "); //$NON-NLS-1$
		result.append(sid);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", visibleInDoc: "); //$NON-NLS-1$
		result.append(visibleInDoc);
		result.append(", visibleInLM: "); //$NON-NLS-1$
		result.append(visibleInLM);
		result.append(", summary: "); //$NON-NLS-1$
		result.append(summary);
		result.append(", description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", review: "); //$NON-NLS-1$
		result.append(review);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(", isStatic: "); //$NON-NLS-1$
		result.append(isStatic);
		result.append(", visibility: "); //$NON-NLS-1$
		result.append(visibility);
		result.append(", ordered: "); //$NON-NLS-1$
		result.append(ordered);
		result.append(", unique: "); //$NON-NLS-1$
		result.append(unique);
		result.append(", minInclusive: "); //$NON-NLS-1$
		result.append(minInclusive);
		result.append(", maxInclusive: "); //$NON-NLS-1$
		result.append(maxInclusive);
		result.append(", final: "); //$NON-NLS-1$
		result.append(final_);
		result.append(", aggregationKind: "); //$NON-NLS-1$
		result.append(aggregationKind);
		result.append(", isDerived: "); //$NON-NLS-1$
		result.append(isDerived);
		result.append(", isReadOnly: "); //$NON-NLS-1$
		result.append(isReadOnly);
		result.append(", isPartOfKey: "); //$NON-NLS-1$
		result.append(isPartOfKey);
		result.append(')');
		return result.toString();
	}

} //BTreeRootImpl