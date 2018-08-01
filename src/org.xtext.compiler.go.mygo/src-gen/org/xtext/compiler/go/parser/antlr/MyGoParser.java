/*
 * generated by Xtext 2.14.0
 */
package org.xtext.compiler.go.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.compiler.go.parser.antlr.internal.InternalMyGoParser;
import org.xtext.compiler.go.services.MyGoGrammarAccess;

public class MyGoParser extends AbstractAntlrParser {

	@Inject
	private MyGoGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMyGoParser createParser(XtextTokenStream stream) {
		return new InternalMyGoParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MyGoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyGoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
