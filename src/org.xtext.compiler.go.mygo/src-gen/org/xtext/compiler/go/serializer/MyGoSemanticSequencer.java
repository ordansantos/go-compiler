/*
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.compiler.go.myGo.Assignment;
import org.xtext.compiler.go.myGo.Body;
import org.xtext.compiler.go.myGo.Declarations;
import org.xtext.compiler.go.myGo.ExplicitCast;
import org.xtext.compiler.go.myGo.Expression;
import org.xtext.compiler.go.myGo.Expression2;
import org.xtext.compiler.go.myGo.Expression3;
import org.xtext.compiler.go.myGo.Expression4;
import org.xtext.compiler.go.myGo.Expression5;
import org.xtext.compiler.go.myGo.ForRange;
import org.xtext.compiler.go.myGo.FuncCall;
import org.xtext.compiler.go.myGo.FunctionDeclaration;
import org.xtext.compiler.go.myGo.IdType;
import org.xtext.compiler.go.myGo.Model;
import org.xtext.compiler.go.myGo.MyGoPackage;
import org.xtext.compiler.go.myGo.ParametersDeclaration;
import org.xtext.compiler.go.myGo.ParametersValues;
import org.xtext.compiler.go.myGo.Receiver;
import org.xtext.compiler.go.myGo.ReceiverInstance;
import org.xtext.compiler.go.myGo.ReturnStatement;
import org.xtext.compiler.go.myGo.TypeDeclaration;
import org.xtext.compiler.go.myGo.Value;
import org.xtext.compiler.go.myGo.Variable;
import org.xtext.compiler.go.myGo.VariableDeclaration;
import org.xtext.compiler.go.services.MyGoGrammarAccess;

@SuppressWarnings("all")
public class MyGoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyGoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyGoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyGoPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case MyGoPackage.BODY:
				sequence_Body(context, (Body) semanticObject); 
				return; 
			case MyGoPackage.DECLARATIONS:
				sequence_Declarations(context, (Declarations) semanticObject); 
				return; 
			case MyGoPackage.EXPLICIT_CAST:
				sequence_ExplicitCast(context, (ExplicitCast) semanticObject); 
				return; 
			case MyGoPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case MyGoPackage.EXPRESSION2:
				sequence_Expression2(context, (Expression2) semanticObject); 
				return; 
			case MyGoPackage.EXPRESSION3:
				sequence_Expression3(context, (Expression3) semanticObject); 
				return; 
			case MyGoPackage.EXPRESSION4:
				sequence_Expression4(context, (Expression4) semanticObject); 
				return; 
			case MyGoPackage.EXPRESSION5:
				sequence_Expression5(context, (Expression5) semanticObject); 
				return; 
			case MyGoPackage.FOR_RANGE:
				sequence_ForRange(context, (ForRange) semanticObject); 
				return; 
			case MyGoPackage.FUNC_CALL:
				sequence_FuncCall(context, (FuncCall) semanticObject); 
				return; 
			case MyGoPackage.FUNCTION_DECLARATION:
				sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
				return; 
			case MyGoPackage.ID_TYPE:
				sequence_IdType(context, (IdType) semanticObject); 
				return; 
			case MyGoPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyGoPackage.PARAMETERS_DECLARATION:
				sequence_ParametersDeclaration(context, (ParametersDeclaration) semanticObject); 
				return; 
			case MyGoPackage.PARAMETERS_VALUES:
				sequence_ParametersValues(context, (ParametersValues) semanticObject); 
				return; 
			case MyGoPackage.RECEIVER:
				sequence_Receiver(context, (Receiver) semanticObject); 
				return; 
			case MyGoPackage.RECEIVER_INSTANCE:
				sequence_ReceiverInstance(context, (ReceiverInstance) semanticObject); 
				return; 
			case MyGoPackage.RETURN_STATEMENT:
				sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
				return; 
			case MyGoPackage.TYPE_DECLARATION:
				sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
				return; 
			case MyGoPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case MyGoPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MyGoPackage.VARIABLE_DECLARATION:
				sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     LineCommand returns Assignment
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     (id=ID expression=Expression)
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.ASSIGNMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.ASSIGNMENT__ID));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.ASSIGNMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.ASSIGNMENT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Body returns Body
	 *
	 * Constraint:
	 *     lineCommand+=LineCommand*
	 */
	protected void sequence_Body(ISerializationContext context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declarations returns Declarations
	 *
	 * Constraint:
	 *     (functionDeclaration=FunctionDeclaration | typeDeclaration=TypeDeclaration)
	 */
	protected void sequence_Declarations(ISerializationContext context, Declarations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExplicitCast returns ExplicitCast
	 *
	 * Constraint:
	 *     (type=Type expression=Expression)
	 */
	protected void sequence_ExplicitCast(ISerializationContext context, ExplicitCast semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPLICIT_CAST__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPLICIT_CAST__TYPE));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPLICIT_CAST__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPLICIT_CAST__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExplicitCastAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getExplicitCastAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression2
	 *     Expression.Expression_1_0 returns Expression2
	 *     Expression2 returns Expression2
	 *     Expression2.Expression2_1_0 returns Expression2
	 *     Expression3 returns Expression2
	 *     Expression3.Expression3_1_0 returns Expression2
	 *     Expression4 returns Expression2
	 *     Expression4.Expression4_1_0 returns Expression2
	 *     Expression5 returns Expression2
	 *     Expression5.Expression5_1_0 returns Expression2
	 *     UnaryExpr returns Expression2
	 *
	 * Constraint:
	 *     (left=Expression2_Expression2_1_0 binaryOp=BinaryOpPrecedence2 right=Expression3)
	 */
	protected void sequence_Expression2(ISerializationContext context, Expression2 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression2Access().getExpression2LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression2Access().getBinaryOpBinaryOpPrecedence2ParserRuleCall_1_1_0(), semanticObject.getBinaryOp());
		feeder.accept(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression3
	 *     Expression.Expression_1_0 returns Expression3
	 *     Expression2 returns Expression3
	 *     Expression2.Expression2_1_0 returns Expression3
	 *     Expression3 returns Expression3
	 *     Expression3.Expression3_1_0 returns Expression3
	 *     Expression4 returns Expression3
	 *     Expression4.Expression4_1_0 returns Expression3
	 *     Expression5 returns Expression3
	 *     Expression5.Expression5_1_0 returns Expression3
	 *     UnaryExpr returns Expression3
	 *
	 * Constraint:
	 *     (left=Expression3_Expression3_1_0 binaryOp=BinaryOpPrecedence3 right=Expression4)
	 */
	protected void sequence_Expression3(ISerializationContext context, Expression3 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression3Access().getExpression3LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression3Access().getBinaryOpBinaryOpPrecedence3ParserRuleCall_1_1_0(), semanticObject.getBinaryOp());
		feeder.accept(grammarAccess.getExpression3Access().getRightExpression4ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression4
	 *     Expression.Expression_1_0 returns Expression4
	 *     Expression2 returns Expression4
	 *     Expression2.Expression2_1_0 returns Expression4
	 *     Expression3 returns Expression4
	 *     Expression3.Expression3_1_0 returns Expression4
	 *     Expression4 returns Expression4
	 *     Expression4.Expression4_1_0 returns Expression4
	 *     Expression5 returns Expression4
	 *     Expression5.Expression5_1_0 returns Expression4
	 *     UnaryExpr returns Expression4
	 *
	 * Constraint:
	 *     (left=Expression4_Expression4_1_0 binaryOp=BinaryOpPrecedence4 right=Expression5)
	 */
	protected void sequence_Expression4(ISerializationContext context, Expression4 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression4Access().getExpression4LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression4Access().getBinaryOpBinaryOpPrecedence4ParserRuleCall_1_1_0(), semanticObject.getBinaryOp());
		feeder.accept(grammarAccess.getExpression4Access().getRightExpression5ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression5
	 *     Expression.Expression_1_0 returns Expression5
	 *     Expression2 returns Expression5
	 *     Expression2.Expression2_1_0 returns Expression5
	 *     Expression3 returns Expression5
	 *     Expression3.Expression3_1_0 returns Expression5
	 *     Expression4 returns Expression5
	 *     Expression4.Expression4_1_0 returns Expression5
	 *     Expression5 returns Expression5
	 *     Expression5.Expression5_1_0 returns Expression5
	 *     UnaryExpr returns Expression5
	 *
	 * Constraint:
	 *     (left=Expression5_Expression5_1_0 binaryOp=BinaryOpPrecedence5 right=UnaryExpr)
	 */
	protected void sequence_Expression5(ISerializationContext context, Expression5 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression5Access().getExpression5LeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression5Access().getBinaryOpBinaryOpPrecedence5ParserRuleCall_1_1_0(), semanticObject.getBinaryOp());
		feeder.accept(grammarAccess.getExpression5Access().getRightUnaryExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *     Expression.Expression_1_0 returns Expression
	 *     Expression2 returns Expression
	 *     Expression2.Expression2_1_0 returns Expression
	 *     Expression3 returns Expression
	 *     Expression3.Expression3_1_0 returns Expression
	 *     Expression4 returns Expression
	 *     Expression4.Expression4_1_0 returns Expression
	 *     Expression5 returns Expression
	 *     Expression5.Expression5_1_0 returns Expression
	 *     UnaryExpr returns Expression
	 *
	 * Constraint:
	 *     (left=Expression_Expression_1_0 binaryOp=BinaryOpPrecedence1 right=Expression2)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__BINARY_OP));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpressionAccess().getBinaryOpBinaryOpPrecedence1ParserRuleCall_1_1_0(), semanticObject.getBinaryOp());
		feeder.accept(grammarAccess.getExpressionAccess().getRightExpression2ParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LineCommand returns ForRange
	 *     ForRange returns ForRange
	 *
	 * Constraint:
	 *     ((id1=ID expression=Expression lineCommand+=LineCommand*) | (id1=ID id2=ID expression=Expression lineCommand+=LineCommand*))
	 */
	protected void sequence_ForRange(ISerializationContext context, ForRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LineCommand returns FuncCall
	 *     FuncCall returns FuncCall
	 *     Expression returns FuncCall
	 *     Expression.Expression_1_0 returns FuncCall
	 *     Expression2 returns FuncCall
	 *     Expression2.Expression2_1_0 returns FuncCall
	 *     Expression3 returns FuncCall
	 *     Expression3.Expression3_1_0 returns FuncCall
	 *     Expression4 returns FuncCall
	 *     Expression4.Expression4_1_0 returns FuncCall
	 *     Expression5 returns FuncCall
	 *     Expression5.Expression5_1_0 returns FuncCall
	 *     UnaryExpr returns FuncCall
	 *
	 * Constraint:
	 *     (receiverInstance=ReceiverInstance? id=ID parametersValues=ParametersValues)
	 */
	protected void sequence_FuncCall(ISerializationContext context, FuncCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FunctionDeclaration returns FunctionDeclaration
	 *
	 * Constraint:
	 *     (receiver=Receiver? id=ID parameters=ParametersDeclaration? type=Type? body=Body)
	 */
	protected void sequence_FunctionDeclaration(ISerializationContext context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IdType returns IdType
	 *
	 * Constraint:
	 *     (id=ID type=Type)
	 */
	protected void sequence_IdType(ISerializationContext context, IdType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.ID_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.ID_TYPE__ID));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.ID_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.ID_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIdTypeAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getIdTypeAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (package+=Package imports+=Imports declarations+=Declarations*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParametersDeclaration returns ParametersDeclaration
	 *
	 * Constraint:
	 *     (idType+=IdType idType+=IdType*)
	 */
	protected void sequence_ParametersDeclaration(ISerializationContext context, ParametersDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParametersValues returns ParametersValues
	 *
	 * Constraint:
	 *     (expression+=Expression expression+=Expression*)?
	 */
	protected void sequence_ParametersValues(ISerializationContext context, ParametersValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ReceiverInstance returns ReceiverInstance
	 *
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_ReceiverInstance(ISerializationContext context, ReceiverInstance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.RECEIVER_INSTANCE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.RECEIVER_INSTANCE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReceiverInstanceAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Receiver returns Receiver
	 *
	 * Constraint:
	 *     (idName=ID idType=ID)
	 */
	protected void sequence_Receiver(ISerializationContext context, Receiver semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.RECEIVER__ID_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.RECEIVER__ID_NAME));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.RECEIVER__ID_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.RECEIVER__ID_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReceiverAccess().getIdNameIDTerminalRuleCall_1_0(), semanticObject.getIdName());
		feeder.accept(grammarAccess.getReceiverAccess().getIdTypeIDTerminalRuleCall_2_0(), semanticObject.getIdType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LineCommand returns ReturnStatement
	 *     ReturnStatement returns ReturnStatement
	 *
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_ReturnStatement(ISerializationContext context, ReturnStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.RETURN_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.RETURN_STATEMENT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDeclaration returns TypeDeclaration
	 *
	 * Constraint:
	 *     (id=ID type=Type)
	 */
	protected void sequence_TypeDeclaration(ISerializationContext context, TypeDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.TYPE_DECLARATION__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.TYPE_DECLARATION__ID));
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.TYPE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.TYPE_DECLARATION__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getTypeDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Value returns Value
	 *     Expression returns Value
	 *     Expression.Expression_1_0 returns Value
	 *     Expression2 returns Value
	 *     Expression2.Expression2_1_0 returns Value
	 *     Expression3 returns Value
	 *     Expression3.Expression3_1_0 returns Value
	 *     Expression4 returns Value
	 *     Expression4.Expression4_1_0 returns Value
	 *     Expression5 returns Value
	 *     Expression5.Expression5_1_0 returns Value
	 *     UnaryExpr returns Value
	 *
	 * Constraint:
	 *     (intValue=IntValue | floatValue=FloatValue | stringValue=StringValue | boolValue=BoolValue)
	 */
	protected void sequence_Value(ISerializationContext context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LineCommand returns VariableDeclaration
	 *     VariableDeclaration returns VariableDeclaration
	 *
	 * Constraint:
	 *     ((ids+=ID ids+=ID* expression=Expression) | (ids+=ID ids+=ID* type=Type) | (ids+=ID ids+=ID* type=Type expression=Expression))
	 */
	protected void sequence_VariableDeclaration(ISerializationContext context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Variable
	 *     Expression.Expression_1_0 returns Variable
	 *     Expression2 returns Variable
	 *     Expression2.Expression2_1_0 returns Variable
	 *     Expression3 returns Variable
	 *     Expression3.Expression3_1_0 returns Variable
	 *     Expression4 returns Variable
	 *     Expression4.Expression4_1_0 returns Variable
	 *     Expression5 returns Variable
	 *     Expression5.Expression5_1_0 returns Variable
	 *     UnaryExpr returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyGoPackage.Literals.VARIABLE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyGoPackage.Literals.VARIABLE__ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
}
