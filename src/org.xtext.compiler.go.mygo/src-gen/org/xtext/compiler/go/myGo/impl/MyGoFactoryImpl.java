/**
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.myGo.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.compiler.go.myGo.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyGoFactoryImpl extends EFactoryImpl implements MyGoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyGoFactory init()
  {
    try
    {
      MyGoFactory theMyGoFactory = (MyGoFactory)EPackage.Registry.INSTANCE.getEFactory(MyGoPackage.eNS_URI);
      if (theMyGoFactory != null)
      {
        return theMyGoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyGoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyGoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyGoPackage.MODEL: return createModel();
      case MyGoPackage.DECLARATIONS: return createDeclarations();
      case MyGoPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case MyGoPackage.RECEIVER: return createReceiver();
      case MyGoPackage.BODY: return createBody();
      case MyGoPackage.LINE_COMMAND: return createLineCommand();
      case MyGoPackage.ASSIGNMENT: return createAssignment();
      case MyGoPackage.FOR_RANGE: return createForRange();
      case MyGoPackage.PARAMETERS_DECLARATION: return createParametersDeclaration();
      case MyGoPackage.PARAMETERS_VALUES: return createParametersValues();
      case MyGoPackage.TYPE_DECLARATION: return createTypeDeclaration();
      case MyGoPackage.VALUE: return createValue();
      case MyGoPackage.ID_TYPE: return createIdType();
      case MyGoPackage.FUNC_CALL: return createFuncCall();
      case MyGoPackage.RECEIVER_INSTANCE: return createReceiverInstance();
      case MyGoPackage.EXPRESSION: return createExpression();
      case MyGoPackage.EXPLICIT_CAST: return createExplicitCast();
      case MyGoPackage.VARIABLE: return createVariable();
      case MyGoPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case MyGoPackage.RETURN_STATEMENT: return createReturnStatement();
      case MyGoPackage.EXPRESSION2: return createExpression2();
      case MyGoPackage.EXPRESSION3: return createExpression3();
      case MyGoPackage.EXPRESSION4: return createExpression4();
      case MyGoPackage.EXPRESSION5: return createExpression5();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarations createDeclarations()
  {
    DeclarationsImpl declarations = new DeclarationsImpl();
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Receiver createReceiver()
  {
    ReceiverImpl receiver = new ReceiverImpl();
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LineCommand createLineCommand()
  {
    LineCommandImpl lineCommand = new LineCommandImpl();
    return lineCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForRange createForRange()
  {
    ForRangeImpl forRange = new ForRangeImpl();
    return forRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersDeclaration createParametersDeclaration()
  {
    ParametersDeclarationImpl parametersDeclaration = new ParametersDeclarationImpl();
    return parametersDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametersValues createParametersValues()
  {
    ParametersValuesImpl parametersValues = new ParametersValuesImpl();
    return parametersValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDeclaration createTypeDeclaration()
  {
    TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
    return typeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdType createIdType()
  {
    IdTypeImpl idType = new IdTypeImpl();
    return idType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FuncCall createFuncCall()
  {
    FuncCallImpl funcCall = new FuncCallImpl();
    return funcCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverInstance createReceiverInstance()
  {
    ReceiverInstanceImpl receiverInstance = new ReceiverInstanceImpl();
    return receiverInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitCast createExplicitCast()
  {
    ExplicitCastImpl explicitCast = new ExplicitCastImpl();
    return explicitCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression2 createExpression2()
  {
    Expression2Impl expression2 = new Expression2Impl();
    return expression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression3 createExpression3()
  {
    Expression3Impl expression3 = new Expression3Impl();
    return expression3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression4 createExpression4()
  {
    Expression4Impl expression4 = new Expression4Impl();
    return expression4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression5 createExpression5()
  {
    Expression5Impl expression5 = new Expression5Impl();
    return expression5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyGoPackage getMyGoPackage()
  {
    return (MyGoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyGoPackage getPackage()
  {
    return MyGoPackage.eINSTANCE;
  }

} //MyGoFactoryImpl
