/**
 */
package org.eclipse.pss.dsl.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.pss.dsl.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAbstract_Component()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Component identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__EXTENDS = 2;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__POOL = 3;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.ObjectImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT_IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.ComponentImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Component identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_IDENTIFIER = ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ACTION = ABSTRACT_COMPONENT__ACTION;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__EXTENDS = ABSTRACT_COMPONENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POOL = ABSTRACT_COMPONENT__POOL;

	/**
	 * The feature id for the '<em><b>Data object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATA_OBJECT = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.DataFlow_ObjectImpl <em>Data Flow Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.DataFlow_ObjectImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getDataFlow_Object()
	 * @generated
	 */
	int DATA_FLOW_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OBJECT__OBJECT_IDENTIFIER = OBJECT__OBJECT_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Data Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.Data_ObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.Data_ObjectImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getData_Object()
	 * @generated
	 */
	int DATA_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__OBJECT_IDENTIFIER = OBJECT__OBJECT_IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.ResourceImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__OBJECT_IDENTIFIER = DATA_OBJECT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Type identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE_IDENTIFIER = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl <em>Root Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getRootComponent()
	 * @generated
	 */
	int ROOT_COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Component identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__COMPONENT_IDENTIFIER = ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__ACTION = ABSTRACT_COMPONENT__ACTION;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__EXTENDS = ABSTRACT_COMPONENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__POOL = ABSTRACT_COMPONENT__POOL;

	/**
	 * The feature id for the '<em><b>Component invocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__COMPONENT_INVOCATION = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action invocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT__ACTION_INVOCATION = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Root Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.ActionImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Action identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.poolImpl <em>pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.poolImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getpool()
	 * @generated
	 */
	int POOL = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.ActivityImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Action invocation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACTION_INVOCATION = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.PssModelImpl <em>Pss Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.PssModelImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getPssModel()
	 * @generated
	 */
	int PSS_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Component declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSS_MODEL__COMPONENT_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSS_MODEL__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Pss Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pss Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.Component_InvocationImpl <em>Component Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.Component_InvocationImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getComponent_Invocation()
	 * @generated
	 */
	int COMPONENT_INVOCATION = 10;

	/**
	 * The feature id for the '<em><b>Component identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__COMPONENT_IDENTIFIER = COMPONENT__COMPONENT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__ACTION = COMPONENT__ACTION;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__EXTENDS = COMPONENT__EXTENDS;

	/**
	 * The feature id for the '<em><b>Pool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__POOL = COMPONENT__POOL;

	/**
	 * The feature id for the '<em><b>Data object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__DATA_OBJECT = COMPONENT__DATA_OBJECT;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION__COMPONENT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INVOCATION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.Action_invocationImpl <em>Action invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.Action_invocationImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAction_invocation()
	 * @generated
	 */
	int ACTION_INVOCATION = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.StreamImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 11;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__OBJECT_IDENTIFIER = DATA_FLOW_OBJECT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__INPUT = DATA_FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__OUTPUT = DATA_FLOW_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = DATA_FLOW_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = DATA_FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.impl.BufferImpl
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 12;

	/**
	 * The feature id for the '<em><b>Object identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OBJECT_IDENTIFIER = DATA_FLOW_OBJECT__OBJECT_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INPUT = DATA_FLOW_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OUTPUT = DATA_FLOW_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = DATA_FLOW_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = DATA_FLOW_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL__OBJECT = 0;

	/**
	 * The number of structural features of the '<em>pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POOL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Action identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION__ACTION_IDENTIFIER = ACTION__ACTION_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION__OBJECT = ACTION__OBJECT;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Action instance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION__ACTION_INSTANCE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_INVOCATION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.pss.dsl.metamodel.Resource_kind <em>Resource kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.pss.dsl.metamodel.Resource_kind
	 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getResource_kind()
	 * @generated
	 */
	int RESOURCE_KIND = 15;

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Abstract_Component
	 * @generated
	 */
	EClass getAbstract_Component();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getComponent_identifier <em>Component identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component identifier</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Abstract_Component#getComponent_identifier()
	 * @see #getAbstract_Component()
	 * @generated
	 */
	EAttribute getAbstract_Component_Component_identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Abstract_Component#getAction()
	 * @see #getAbstract_Component()
	 * @generated
	 */
	EReference getAbstract_Component_Action();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Abstract_Component#getExtends()
	 * @see #getAbstract_Component()
	 * @generated
	 */
	EReference getAbstract_Component_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Abstract_Component#getPool <em>Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pool</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Abstract_Component#getPool()
	 * @see #getAbstract_Component()
	 * @generated
	 */
	EReference getAbstract_Component_Pool();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Object#getObject_identifier <em>Object identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object identifier</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Object#getObject_identifier()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Object_identifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Component#getData_object <em>Data object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Component#getData_object()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Data_object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.DataFlow_Object <em>Data Flow Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow Object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.DataFlow_Object
	 * @generated
	 */
	EClass getDataFlow_Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Data_Object <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Data_Object
	 * @generated
	 */
	EClass getData_Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Resource#getType_identifier <em>Type identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type identifier</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Resource#getType_identifier()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Type_identifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.RootComponent <em>Root Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Component</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.RootComponent
	 * @generated
	 */
	EClass getRootComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.RootComponent#getComponent_invocation <em>Component invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component invocation</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.RootComponent#getComponent_invocation()
	 * @see #getRootComponent()
	 * @generated
	 */
	EReference getRootComponent_Component_invocation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.pss.dsl.metamodel.RootComponent#getAction_invocation <em>Action invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action invocation</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.RootComponent#getAction_invocation()
	 * @see #getRootComponent()
	 * @generated
	 */
	EReference getRootComponent_Action_invocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Action#getAction_identifier <em>Action identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action identifier</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action#getAction_identifier()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Action_identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Action#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action#getObject()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Action#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action#getActivity()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.pool <em>pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>pool</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.pool
	 * @generated
	 */
	EClass getpool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.pool#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.pool#getObject()
	 * @see #getpool()
	 * @generated
	 */
	EReference getpool_Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.Activity#getAction_invocation <em>Action invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action invocation</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Activity#getAction_invocation()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Action_invocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.PssModel <em>Pss Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pss Model</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.PssModel
	 * @generated
	 */
	EClass getPssModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.PssModel#getComponent_declaration <em>Component declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component declaration</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.PssModel#getComponent_declaration()
	 * @see #getPssModel()
	 * @generated
	 */
	EReference getPssModel_Component_declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.pss.dsl.metamodel.PssModel#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.PssModel#getAction()
	 * @see #getPssModel()
	 * @generated
	 */
	EReference getPssModel_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Component_Invocation <em>Component Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Invocation</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Component_Invocation
	 * @generated
	 */
	EClass getComponent_Invocation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pss.dsl.metamodel.Component_Invocation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Component_Invocation#getComponent()
	 * @see #getComponent_Invocation()
	 * @generated
	 */
	EReference getComponent_Invocation_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Action_invocation <em>Action invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action invocation</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action_invocation
	 * @generated
	 */
	EClass getAction_invocation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.pss.dsl.metamodel.Action_invocation#getAction_instance <em>Action instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action instance</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Action_invocation#getAction_instance()
	 * @see #getAction_invocation()
	 * @generated
	 */
	EReference getAction_invocation_Action_instance();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Stream#isInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Stream#isInput()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Stream#isOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Stream#isOutput()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_Output();

	/**
	 * Returns the meta object for class '{@link org.eclipse.pss.dsl.metamodel.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Buffer#isInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Buffer#isInput()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.pss.dsl.metamodel.Buffer#isOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Buffer#isOutput()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Output();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.pss.dsl.metamodel.Resource_kind <em>Resource kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource kind</em>'.
	 * @see org.eclipse.pss.dsl.metamodel.Resource_kind
	 * @generated
	 */
	EEnum getResource_kind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

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
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.Abstract_ComponentImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAbstract_Component()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstract_Component();

		/**
		 * The meta object literal for the '<em><b>Component identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__COMPONENT_IDENTIFIER = eINSTANCE.getAbstract_Component_Component_identifier();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__ACTION = eINSTANCE.getAbstract_Component_Action();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__EXTENDS = eINSTANCE.getAbstract_Component_Extends();

		/**
		 * The meta object literal for the '<em><b>Pool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__POOL = eINSTANCE.getAbstract_Component_Pool();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.ObjectImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Object identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT_IDENTIFIER = eINSTANCE.getObject_Object_identifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.ComponentImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Data object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATA_OBJECT = eINSTANCE.getComponent_Data_object();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.DataFlow_ObjectImpl <em>Data Flow Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.DataFlow_ObjectImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getDataFlow_Object()
		 * @generated
		 */
		EClass DATA_FLOW_OBJECT = eINSTANCE.getDataFlow_Object();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.Data_ObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.Data_ObjectImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getData_Object()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getData_Object();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.ResourceImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Type identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__TYPE_IDENTIFIER = eINSTANCE.getResource_Type_identifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl <em>Root Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.RootComponentImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getRootComponent()
		 * @generated
		 */
		EClass ROOT_COMPONENT = eINSTANCE.getRootComponent();

		/**
		 * The meta object literal for the '<em><b>Component invocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_COMPONENT__COMPONENT_INVOCATION = eINSTANCE.getRootComponent_Component_invocation();

		/**
		 * The meta object literal for the '<em><b>Action invocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_COMPONENT__ACTION_INVOCATION = eINSTANCE.getRootComponent_Action_invocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.ActionImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_IDENTIFIER = eINSTANCE.getAction_Action_identifier();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OBJECT = eINSTANCE.getAction_Object();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIVITY = eINSTANCE.getAction_Activity();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.poolImpl <em>pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.poolImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getpool()
		 * @generated
		 */
		EClass POOL = eINSTANCE.getpool();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POOL__OBJECT = eINSTANCE.getpool_Object();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.ActivityImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Action invocation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACTION_INVOCATION = eINSTANCE.getActivity_Action_invocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.PssModelImpl <em>Pss Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.PssModelImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getPssModel()
		 * @generated
		 */
		EClass PSS_MODEL = eINSTANCE.getPssModel();

		/**
		 * The meta object literal for the '<em><b>Component declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSS_MODEL__COMPONENT_DECLARATION = eINSTANCE.getPssModel_Component_declaration();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSS_MODEL__ACTION = eINSTANCE.getPssModel_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.Component_InvocationImpl <em>Component Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.Component_InvocationImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getComponent_Invocation()
		 * @generated
		 */
		EClass COMPONENT_INVOCATION = eINSTANCE.getComponent_Invocation();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INVOCATION__COMPONENT = eINSTANCE.getComponent_Invocation_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.Action_invocationImpl <em>Action invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.Action_invocationImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getAction_invocation()
		 * @generated
		 */
		EClass ACTION_INVOCATION = eINSTANCE.getAction_invocation();

		/**
		 * The meta object literal for the '<em><b>Action instance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_INVOCATION__ACTION_INSTANCE = eINSTANCE.getAction_invocation_Action_instance();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.StreamImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__INPUT = eINSTANCE.getStream_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__OUTPUT = eINSTANCE.getStream_Output();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.impl.BufferImpl
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__INPUT = eINSTANCE.getBuffer_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__OUTPUT = eINSTANCE.getBuffer_Output();

		/**
		 * The meta object literal for the '{@link org.eclipse.pss.dsl.metamodel.Resource_kind <em>Resource kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.pss.dsl.metamodel.Resource_kind
		 * @see org.eclipse.pss.dsl.metamodel.impl.MetamodelPackageImpl#getResource_kind()
		 * @generated
		 */
		EEnum RESOURCE_KIND = eINSTANCE.getResource_kind();

	}

} //MetamodelPackage
