/*
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.compiler.go.services.MyGoGrammarAccess;

@SuppressWarnings("all")
public class MyGoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyGoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LineCommand_SemicolonKeyword_0_1_q;
	protected AbstractElementAlias match_LineCommand_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_LineCommand_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_LineCommand_SemicolonKeyword_3_1_q;
	protected AbstractElementAlias match_LineCommand_SemicolonKeyword_4_1_q;
	protected AbstractElementAlias match_UnaryExpr_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_UnaryExpr_LeftParenthesisKeyword_3_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyGoGrammarAccess) access;
		match_LineCommand_SemicolonKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLineCommandAccess().getSemicolonKeyword_0_1());
		match_LineCommand_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getLineCommandAccess().getSemicolonKeyword_1_1());
		match_LineCommand_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getLineCommandAccess().getSemicolonKeyword_2_1());
		match_LineCommand_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getLineCommandAccess().getSemicolonKeyword_3_1());
		match_LineCommand_SemicolonKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getLineCommandAccess().getSemicolonKeyword_4_1());
		match_UnaryExpr_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getUnaryExprAccess().getLeftParenthesisKeyword_3_0());
		match_UnaryExpr_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getUnaryExprAccess().getLeftParenthesisKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_LineCommand_SemicolonKeyword_0_1_q.equals(syntax))
				emit_LineCommand_SemicolonKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LineCommand_SemicolonKeyword_1_1_q.equals(syntax))
				emit_LineCommand_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LineCommand_SemicolonKeyword_2_1_q.equals(syntax))
				emit_LineCommand_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LineCommand_SemicolonKeyword_3_1_q.equals(syntax))
				emit_LineCommand_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LineCommand_SemicolonKeyword_4_1_q.equals(syntax))
				emit_LineCommand_SemicolonKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UnaryExpr_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_UnaryExpr_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UnaryExpr_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_UnaryExpr_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     parametersValues=ParametersValues ')' (ambiguity) (rule end)
	 */
	protected void emit_LineCommand_SemicolonKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression (ambiguity) (rule end)
	 *     type=Type (ambiguity) (rule end)
	 */
	protected void emit_LineCommand_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression (ambiguity) (rule end)
	 */
	protected void emit_LineCommand_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression '{' '}' (ambiguity) (rule end)
	 *     lineCommand+=LineCommand '}' (ambiguity) (rule end)
	 */
	protected void emit_LineCommand_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=Expression (ambiguity) (rule end)
	 */
	protected void emit_LineCommand_SemicolonKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) boolValue=BoolValue
	 *     (rule start) (ambiguity) floatValue=FloatValue
	 *     (rule start) (ambiguity) id=ID
	 *     (rule start) (ambiguity) intValue=IntValue
	 *     (rule start) (ambiguity) receiverInstance=ReceiverInstance
	 *     (rule start) (ambiguity) stringValue=StringValue
	 *     (rule start) (ambiguity) {Expression.left=}
	 *     (rule start) (ambiguity) {Expression2.left=}
	 *     (rule start) (ambiguity) {Expression3.left=}
	 *     (rule start) (ambiguity) {Expression4.left=}
	 *     (rule start) (ambiguity) {Expression5.left=}
	 */
	protected void emit_UnaryExpr_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Expression.left=}
	 *     (rule start) (ambiguity) {Expression2.left=}
	 *     (rule start) (ambiguity) {Expression3.left=}
	 *     (rule start) (ambiguity) {Expression4.left=}
	 *     (rule start) (ambiguity) {Expression5.left=}
	 */
	protected void emit_UnaryExpr_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
