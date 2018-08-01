package org.xtext.compiler.go.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.compiler.go.services.MyGoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyGoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'func'", "'('", "')'", "'{'", "'}'", "';'", "'='", "'for'", "':='", "'range'", "','", "'int'", "'float64'", "'bool'", "'string'", "'type'", "'.'", "'true'", "'false'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'|'", "'^'", "'*'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'&^'", "'var'", "'return'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyGoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyGoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyGoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyGo.g"; }



     	private MyGoGrammarAccess grammarAccess;

        public InternalMyGoParser(TokenStream input, MyGoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyGoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyGo.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyGo.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyGo.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyGo.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImports ) ) ( (lv_declarations_2_0= ruleDeclarations ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_package_0_0 = null;

        AntlrDatatypeRuleToken lv_imports_1_0 = null;

        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:77:2: ( ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImports ) ) ( (lv_declarations_2_0= ruleDeclarations ) )* ) )
            // InternalMyGo.g:78:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImports ) ) ( (lv_declarations_2_0= ruleDeclarations ) )* )
            {
            // InternalMyGo.g:78:2: ( ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImports ) ) ( (lv_declarations_2_0= ruleDeclarations ) )* )
            // InternalMyGo.g:79:3: ( (lv_package_0_0= rulePackage ) ) ( (lv_imports_1_0= ruleImports ) ) ( (lv_declarations_2_0= ruleDeclarations ) )*
            {
            // InternalMyGo.g:79:3: ( (lv_package_0_0= rulePackage ) )
            // InternalMyGo.g:80:4: (lv_package_0_0= rulePackage )
            {
            // InternalMyGo.g:80:4: (lv_package_0_0= rulePackage )
            // InternalMyGo.g:81:5: lv_package_0_0= rulePackage
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPackagePackageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_package_0_0=rulePackage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"package",
            						lv_package_0_0,
            						"org.xtext.compiler.go.MyGo.Package");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyGo.g:98:3: ( (lv_imports_1_0= ruleImports ) )
            // InternalMyGo.g:99:4: (lv_imports_1_0= ruleImports )
            {
            // InternalMyGo.g:99:4: (lv_imports_1_0= ruleImports )
            // InternalMyGo.g:100:5: lv_imports_1_0= ruleImports
            {

            					newCompositeNode(grammarAccess.getModelAccess().getImportsImportsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_imports_1_0=ruleImports();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"imports",
            						lv_imports_1_0,
            						"org.xtext.compiler.go.MyGo.Imports");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyGo.g:117:3: ( (lv_declarations_2_0= ruleDeclarations ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyGo.g:118:4: (lv_declarations_2_0= ruleDeclarations )
            	    {
            	    // InternalMyGo.g:118:4: (lv_declarations_2_0= ruleDeclarations )
            	    // InternalMyGo.g:119:5: lv_declarations_2_0= ruleDeclarations
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclarations();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"org.xtext.compiler.go.MyGo.Declarations");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclarations"
    // InternalMyGo.g:140:1: entryRuleDeclarations returns [EObject current=null] : iv_ruleDeclarations= ruleDeclarations EOF ;
    public final EObject entryRuleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarations = null;


        try {
            // InternalMyGo.g:140:53: (iv_ruleDeclarations= ruleDeclarations EOF )
            // InternalMyGo.g:141:2: iv_ruleDeclarations= ruleDeclarations EOF
            {
             newCompositeNode(grammarAccess.getDeclarationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarations=ruleDeclarations();

            state._fsp--;

             current =iv_ruleDeclarations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarations"


    // $ANTLR start "ruleDeclarations"
    // InternalMyGo.g:147:1: ruleDeclarations returns [EObject current=null] : ( ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) ) | ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) ) ) ;
    public final EObject ruleDeclarations() throws RecognitionException {
        EObject current = null;

        EObject lv_functionDeclaration_0_0 = null;

        EObject lv_typeDeclaration_1_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:153:2: ( ( ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) ) | ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) ) ) )
            // InternalMyGo.g:154:2: ( ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) ) | ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) ) )
            {
            // InternalMyGo.g:154:2: ( ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) ) | ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyGo.g:155:3: ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) )
                    {
                    // InternalMyGo.g:155:3: ( (lv_functionDeclaration_0_0= ruleFunctionDeclaration ) )
                    // InternalMyGo.g:156:4: (lv_functionDeclaration_0_0= ruleFunctionDeclaration )
                    {
                    // InternalMyGo.g:156:4: (lv_functionDeclaration_0_0= ruleFunctionDeclaration )
                    // InternalMyGo.g:157:5: lv_functionDeclaration_0_0= ruleFunctionDeclaration
                    {

                    					newCompositeNode(grammarAccess.getDeclarationsAccess().getFunctionDeclarationFunctionDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_functionDeclaration_0_0=ruleFunctionDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    					}
                    					set(
                    						current,
                    						"functionDeclaration",
                    						lv_functionDeclaration_0_0,
                    						"org.xtext.compiler.go.MyGo.FunctionDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGo.g:175:3: ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) )
                    {
                    // InternalMyGo.g:175:3: ( (lv_typeDeclaration_1_0= ruleTypeDeclaration ) )
                    // InternalMyGo.g:176:4: (lv_typeDeclaration_1_0= ruleTypeDeclaration )
                    {
                    // InternalMyGo.g:176:4: (lv_typeDeclaration_1_0= ruleTypeDeclaration )
                    // InternalMyGo.g:177:5: lv_typeDeclaration_1_0= ruleTypeDeclaration
                    {

                    					newCompositeNode(grammarAccess.getDeclarationsAccess().getTypeDeclarationTypeDeclarationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeDeclaration_1_0=ruleTypeDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarationsRule());
                    					}
                    					set(
                    						current,
                    						"typeDeclaration",
                    						lv_typeDeclaration_1_0,
                    						"org.xtext.compiler.go.MyGo.TypeDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarations"


    // $ANTLR start "entryRulePackage"
    // InternalMyGo.g:198:1: entryRulePackage returns [String current=null] : iv_rulePackage= rulePackage EOF ;
    public final String entryRulePackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage = null;


        try {
            // InternalMyGo.g:198:47: (iv_rulePackage= rulePackage EOF )
            // InternalMyGo.g:199:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMyGo.g:205:1: rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyGo.g:211:2: ( (kw= 'package' this_ID_1= RULE_ID ) )
            // InternalMyGo.g:212:2: (kw= 'package' this_ID_1= RULE_ID )
            {
            // InternalMyGo.g:212:2: (kw= 'package' this_ID_1= RULE_ID )
            // InternalMyGo.g:213:3: kw= 'package' this_ID_1= RULE_ID
            {
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getPackageAccess().getIDTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleImports"
    // InternalMyGo.g:229:1: entryRuleImports returns [String current=null] : iv_ruleImports= ruleImports EOF ;
    public final String entryRuleImports() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImports = null;


        try {
            // InternalMyGo.g:229:47: (iv_ruleImports= ruleImports EOF )
            // InternalMyGo.g:230:2: iv_ruleImports= ruleImports EOF
            {
             newCompositeNode(grammarAccess.getImportsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImports=ruleImports();

            state._fsp--;

             current =iv_ruleImports.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImports"


    // $ANTLR start "ruleImports"
    // InternalMyGo.g:236:1: ruleImports returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' this_STRING_1= RULE_STRING )* ;
    public final AntlrDatatypeRuleToken ruleImports() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalMyGo.g:242:2: ( (kw= 'import' this_STRING_1= RULE_STRING )* )
            // InternalMyGo.g:243:2: (kw= 'import' this_STRING_1= RULE_STRING )*
            {
            // InternalMyGo.g:243:2: (kw= 'import' this_STRING_1= RULE_STRING )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyGo.g:244:3: kw= 'import' this_STRING_1= RULE_STRING
            	    {
            	    kw=(Token)match(input,12,FOLLOW_6); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getImportsAccess().getImportKeyword_0());
            	    		
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    			current.merge(this_STRING_1);
            	    		

            	    			newLeafNode(this_STRING_1, grammarAccess.getImportsAccess().getSTRINGTerminalRuleCall_1());
            	    		

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImports"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalMyGo.g:260:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalMyGo.g:260:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalMyGo.g:261:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalMyGo.g:267:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParametersDeclaration ) )? otherlv_5= ')' ( (lv_type_6_0= ruleType ) )? otherlv_7= '{' ( (lv_body_8_0= ruleBody ) ) otherlv_9= '}' ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_receiver_1_0 = null;

        EObject lv_parameters_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:273:2: ( (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParametersDeclaration ) )? otherlv_5= ')' ( (lv_type_6_0= ruleType ) )? otherlv_7= '{' ( (lv_body_8_0= ruleBody ) ) otherlv_9= '}' ) )
            // InternalMyGo.g:274:2: (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParametersDeclaration ) )? otherlv_5= ')' ( (lv_type_6_0= ruleType ) )? otherlv_7= '{' ( (lv_body_8_0= ruleBody ) ) otherlv_9= '}' )
            {
            // InternalMyGo.g:274:2: (otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParametersDeclaration ) )? otherlv_5= ')' ( (lv_type_6_0= ruleType ) )? otherlv_7= '{' ( (lv_body_8_0= ruleBody ) ) otherlv_9= '}' )
            // InternalMyGo.g:275:3: otherlv_0= 'func' ( (lv_receiver_1_0= ruleReceiver ) )? ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_parameters_4_0= ruleParametersDeclaration ) )? otherlv_5= ')' ( (lv_type_6_0= ruleType ) )? otherlv_7= '{' ( (lv_body_8_0= ruleBody ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
            		
            // InternalMyGo.g:279:3: ( (lv_receiver_1_0= ruleReceiver ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyGo.g:280:4: (lv_receiver_1_0= ruleReceiver )
                    {
                    // InternalMyGo.g:280:4: (lv_receiver_1_0= ruleReceiver )
                    // InternalMyGo.g:281:5: lv_receiver_1_0= ruleReceiver
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getReceiverReceiverParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_receiver_1_0=ruleReceiver();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"receiver",
                    						lv_receiver_1_0,
                    						"org.xtext.compiler.go.MyGo.Receiver");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyGo.g:298:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMyGo.g:299:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMyGo.g:299:4: (lv_id_2_0= RULE_ID )
            // InternalMyGo.g:300:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_id_2_0, grammarAccess.getFunctionDeclarationAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyGo.g:320:3: ( (lv_parameters_4_0= ruleParametersDeclaration ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyGo.g:321:4: (lv_parameters_4_0= ruleParametersDeclaration )
                    {
                    // InternalMyGo.g:321:4: (lv_parameters_4_0= ruleParametersDeclaration )
                    // InternalMyGo.g:322:5: lv_parameters_4_0= ruleParametersDeclaration
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersParametersDeclarationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleParametersDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_4_0,
                    						"org.xtext.compiler.go.MyGo.ParametersDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_5());
            		
            // InternalMyGo.g:343:3: ( (lv_type_6_0= ruleType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=24 && LA6_0<=27)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyGo.g:344:4: (lv_type_6_0= ruleType )
                    {
                    // InternalMyGo.g:344:4: (lv_type_6_0= ruleType )
                    // InternalMyGo.g:345:5: lv_type_6_0= ruleType
                    {

                    					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_6_0,
                    						"org.xtext.compiler.go.MyGo.Type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMyGo.g:366:3: ( (lv_body_8_0= ruleBody ) )
            // InternalMyGo.g:367:4: (lv_body_8_0= ruleBody )
            {
            // InternalMyGo.g:367:4: (lv_body_8_0= ruleBody )
            // InternalMyGo.g:368:5: lv_body_8_0= ruleBody
            {

            					newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_body_8_0=ruleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_8_0,
            						"org.xtext.compiler.go.MyGo.Body");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleReceiver"
    // InternalMyGo.g:393:1: entryRuleReceiver returns [EObject current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final EObject entryRuleReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiver = null;


        try {
            // InternalMyGo.g:393:49: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalMyGo.g:394:2: iv_ruleReceiver= ruleReceiver EOF
            {
             newCompositeNode(grammarAccess.getReceiverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiver=ruleReceiver();

            state._fsp--;

             current =iv_ruleReceiver; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalMyGo.g:400:1: ruleReceiver returns [EObject current=null] : (otherlv_0= '(' ( (lv_idName_1_0= RULE_ID ) ) ( (lv_idType_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idName_1_0=null;
        Token lv_idType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyGo.g:406:2: ( (otherlv_0= '(' ( (lv_idName_1_0= RULE_ID ) ) ( (lv_idType_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalMyGo.g:407:2: (otherlv_0= '(' ( (lv_idName_1_0= RULE_ID ) ) ( (lv_idType_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalMyGo.g:407:2: (otherlv_0= '(' ( (lv_idName_1_0= RULE_ID ) ) ( (lv_idType_2_0= RULE_ID ) ) otherlv_3= ')' )
            // InternalMyGo.g:408:3: otherlv_0= '(' ( (lv_idName_1_0= RULE_ID ) ) ( (lv_idType_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyGo.g:412:3: ( (lv_idName_1_0= RULE_ID ) )
            // InternalMyGo.g:413:4: (lv_idName_1_0= RULE_ID )
            {
            // InternalMyGo.g:413:4: (lv_idName_1_0= RULE_ID )
            // InternalMyGo.g:414:5: lv_idName_1_0= RULE_ID
            {
            lv_idName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_idName_1_0, grammarAccess.getReceiverAccess().getIdNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"idName",
            						lv_idName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyGo.g:430:3: ( (lv_idType_2_0= RULE_ID ) )
            // InternalMyGo.g:431:4: (lv_idType_2_0= RULE_ID )
            {
            // InternalMyGo.g:431:4: (lv_idType_2_0= RULE_ID )
            // InternalMyGo.g:432:5: lv_idType_2_0= RULE_ID
            {
            lv_idType_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_idType_2_0, grammarAccess.getReceiverAccess().getIdTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"idType",
            						lv_idType_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getReceiverAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleBody"
    // InternalMyGo.g:456:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalMyGo.g:456:45: (iv_ruleBody= ruleBody EOF )
            // InternalMyGo.g:457:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyGo.g:463:1: ruleBody returns [EObject current=null] : ( () ( (lv_lineCommand_1_0= ruleLineCommand ) )* ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_lineCommand_1_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:469:2: ( ( () ( (lv_lineCommand_1_0= ruleLineCommand ) )* ) )
            // InternalMyGo.g:470:2: ( () ( (lv_lineCommand_1_0= ruleLineCommand ) )* )
            {
            // InternalMyGo.g:470:2: ( () ( (lv_lineCommand_1_0= ruleLineCommand ) )* )
            // InternalMyGo.g:471:3: () ( (lv_lineCommand_1_0= ruleLineCommand ) )*
            {
            // InternalMyGo.g:471:3: ()
            // InternalMyGo.g:472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBodyAccess().getBodyAction_0(),
            					current);
            			

            }

            // InternalMyGo.g:478:3: ( (lv_lineCommand_1_0= ruleLineCommand ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==20||(LA7_0>=51 && LA7_0<=52)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyGo.g:479:4: (lv_lineCommand_1_0= ruleLineCommand )
            	    {
            	    // InternalMyGo.g:479:4: (lv_lineCommand_1_0= ruleLineCommand )
            	    // InternalMyGo.g:480:5: lv_lineCommand_1_0= ruleLineCommand
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getLineCommandLineCommandParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_lineCommand_1_0=ruleLineCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lineCommand",
            	    						lv_lineCommand_1_0,
            	    						"org.xtext.compiler.go.MyGo.LineCommand");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleLineCommand"
    // InternalMyGo.g:501:1: entryRuleLineCommand returns [EObject current=null] : iv_ruleLineCommand= ruleLineCommand EOF ;
    public final EObject entryRuleLineCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineCommand = null;


        try {
            // InternalMyGo.g:501:52: (iv_ruleLineCommand= ruleLineCommand EOF )
            // InternalMyGo.g:502:2: iv_ruleLineCommand= ruleLineCommand EOF
            {
             newCompositeNode(grammarAccess.getLineCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineCommand=ruleLineCommand();

            state._fsp--;

             current =iv_ruleLineCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineCommand"


    // $ANTLR start "ruleLineCommand"
    // InternalMyGo.g:508:1: ruleLineCommand returns [EObject current=null] : ( (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? ) | (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? ) | (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? ) | (this_ForRange_6= ruleForRange (otherlv_7= ';' )? ) | (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? ) ) ;
    public final EObject ruleLineCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_FuncCall_0 = null;

        EObject this_VariableDeclaration_2 = null;

        EObject this_ReturnStatement_4 = null;

        EObject this_ForRange_6 = null;

        EObject this_Assignment_8 = null;



        	enterRule();

        try {
            // InternalMyGo.g:514:2: ( ( (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? ) | (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? ) | (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? ) | (this_ForRange_6= ruleForRange (otherlv_7= ';' )? ) | (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? ) ) )
            // InternalMyGo.g:515:2: ( (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? ) | (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? ) | (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? ) | (this_ForRange_6= ruleForRange (otherlv_7= ';' )? ) | (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? ) )
            {
            // InternalMyGo.g:515:2: ( (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? ) | (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? ) | (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? ) | (this_ForRange_6= ruleForRange (otherlv_7= ';' )? ) | (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==14||LA13_1==29) ) {
                    alt13=1;
                }
                else if ( (LA13_1==19) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 52:
                {
                alt13=3;
                }
                break;
            case 20:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyGo.g:516:3: (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? )
                    {
                    // InternalMyGo.g:516:3: (this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )? )
                    // InternalMyGo.g:517:4: this_FuncCall_0= ruleFuncCall (otherlv_1= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getLineCommandAccess().getFuncCallParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_FuncCall_0=ruleFuncCall();

                    state._fsp--;


                    				current = this_FuncCall_0;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyGo.g:525:4: (otherlv_1= ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==18) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMyGo.g:526:5: otherlv_1= ';'
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getLineCommandAccess().getSemicolonKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGo.g:533:3: (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? )
                    {
                    // InternalMyGo.g:533:3: (this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )? )
                    // InternalMyGo.g:534:4: this_VariableDeclaration_2= ruleVariableDeclaration (otherlv_3= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getLineCommandAccess().getVariableDeclarationParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_VariableDeclaration_2=ruleVariableDeclaration();

                    state._fsp--;


                    				current = this_VariableDeclaration_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyGo.g:542:4: (otherlv_3= ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==18) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyGo.g:543:5: otherlv_3= ';'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getLineCommandAccess().getSemicolonKeyword_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyGo.g:550:3: (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? )
                    {
                    // InternalMyGo.g:550:3: (this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )? )
                    // InternalMyGo.g:551:4: this_ReturnStatement_4= ruleReturnStatement (otherlv_5= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getLineCommandAccess().getReturnStatementParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_ReturnStatement_4=ruleReturnStatement();

                    state._fsp--;


                    				current = this_ReturnStatement_4;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyGo.g:559:4: (otherlv_5= ';' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyGo.g:560:5: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getLineCommandAccess().getSemicolonKeyword_2_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyGo.g:567:3: (this_ForRange_6= ruleForRange (otherlv_7= ';' )? )
                    {
                    // InternalMyGo.g:567:3: (this_ForRange_6= ruleForRange (otherlv_7= ';' )? )
                    // InternalMyGo.g:568:4: this_ForRange_6= ruleForRange (otherlv_7= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getLineCommandAccess().getForRangeParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_ForRange_6=ruleForRange();

                    state._fsp--;


                    				current = this_ForRange_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyGo.g:576:4: (otherlv_7= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==18) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyGo.g:577:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getLineCommandAccess().getSemicolonKeyword_3_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyGo.g:584:3: (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? )
                    {
                    // InternalMyGo.g:584:3: (this_Assignment_8= ruleAssignment (otherlv_9= ';' )? )
                    // InternalMyGo.g:585:4: this_Assignment_8= ruleAssignment (otherlv_9= ';' )?
                    {

                    				newCompositeNode(grammarAccess.getLineCommandAccess().getAssignmentParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_Assignment_8=ruleAssignment();

                    state._fsp--;


                    				current = this_Assignment_8;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalMyGo.g:593:4: (otherlv_9= ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyGo.g:594:5: otherlv_9= ';'
                            {
                            otherlv_9=(Token)match(input,18,FOLLOW_2); 

                            					newLeafNode(otherlv_9, grammarAccess.getLineCommandAccess().getSemicolonKeyword_4_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineCommand"


    // $ANTLR start "entryRuleAssignment"
    // InternalMyGo.g:604:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMyGo.g:604:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMyGo.g:605:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMyGo.g:611:1: ruleAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:617:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalMyGo.g:618:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalMyGo.g:618:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalMyGo.g:619:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalMyGo.g:619:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyGo.g:620:4: (lv_id_0_0= RULE_ID )
            {
            // InternalMyGo.g:620:4: (lv_id_0_0= RULE_ID )
            // InternalMyGo.g:621:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_id_0_0, grammarAccess.getAssignmentAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalMyGo.g:641:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMyGo.g:642:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMyGo.g:642:4: (lv_expression_2_0= ruleExpression )
            // InternalMyGo.g:643:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.compiler.go.MyGo.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleForRange"
    // InternalMyGo.g:664:1: entryRuleForRange returns [EObject current=null] : iv_ruleForRange= ruleForRange EOF ;
    public final EObject entryRuleForRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForRange = null;


        try {
            // InternalMyGo.g:664:49: (iv_ruleForRange= ruleForRange EOF )
            // InternalMyGo.g:665:2: iv_ruleForRange= ruleForRange EOF
            {
             newCompositeNode(grammarAccess.getForRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForRange=ruleForRange();

            state._fsp--;

             current =iv_ruleForRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForRange"


    // $ANTLR start "ruleForRange"
    // InternalMyGo.g:671:1: ruleForRange returns [EObject current=null] : ( (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' ) | (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' ) ) ;
    public final EObject ruleForRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id1_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_id1_9_0=null;
        Token otherlv_10=null;
        Token lv_id2_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_expression_4_0 = null;

        EObject lv_lineCommand_6_0 = null;

        EObject lv_expression_14_0 = null;

        EObject lv_lineCommand_16_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:677:2: ( ( (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' ) | (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' ) ) )
            // InternalMyGo.g:678:2: ( (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' ) | (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' ) )
            {
            // InternalMyGo.g:678:2: ( (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' ) | (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==21) ) {
                        alt16=1;
                    }
                    else if ( (LA16_2==23) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyGo.g:679:3: (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' )
                    {
                    // InternalMyGo.g:679:3: (otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}' )
                    // InternalMyGo.g:680:4: otherlv_0= 'for' ( (lv_id1_1_0= RULE_ID ) ) otherlv_2= ':=' otherlv_3= 'range' ( (lv_expression_4_0= ruleExpression ) ) otherlv_5= '{' ( (lv_lineCommand_6_0= ruleLineCommand ) )* otherlv_7= '}'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getForRangeAccess().getForKeyword_0_0());
                    			
                    // InternalMyGo.g:684:4: ( (lv_id1_1_0= RULE_ID ) )
                    // InternalMyGo.g:685:5: (lv_id1_1_0= RULE_ID )
                    {
                    // InternalMyGo.g:685:5: (lv_id1_1_0= RULE_ID )
                    // InternalMyGo.g:686:6: lv_id1_1_0= RULE_ID
                    {
                    lv_id1_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_id1_1_0, grammarAccess.getForRangeAccess().getId1IDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id1",
                    							lv_id1_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getForRangeAccess().getColonEqualsSignKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getForRangeAccess().getRangeKeyword_0_3());
                    			
                    // InternalMyGo.g:710:4: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalMyGo.g:711:5: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalMyGo.g:711:5: (lv_expression_4_0= ruleExpression )
                    // InternalMyGo.g:712:6: lv_expression_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getForRangeAccess().getExpressionExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForRangeRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_4_0,
                    							"org.xtext.compiler.go.MyGo.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getForRangeAccess().getLeftCurlyBracketKeyword_0_5());
                    			
                    // InternalMyGo.g:733:4: ( (lv_lineCommand_6_0= ruleLineCommand ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID||LA14_0==20||(LA14_0>=51 && LA14_0<=52)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyGo.g:734:5: (lv_lineCommand_6_0= ruleLineCommand )
                    	    {
                    	    // InternalMyGo.g:734:5: (lv_lineCommand_6_0= ruleLineCommand )
                    	    // InternalMyGo.g:735:6: lv_lineCommand_6_0= ruleLineCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getForRangeAccess().getLineCommandLineCommandParserRuleCall_0_6_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_lineCommand_6_0=ruleLineCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getForRangeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lineCommand",
                    	    							lv_lineCommand_6_0,
                    	    							"org.xtext.compiler.go.MyGo.LineCommand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getForRangeAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyGo.g:758:3: (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' )
                    {
                    // InternalMyGo.g:758:3: (otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}' )
                    // InternalMyGo.g:759:4: otherlv_8= 'for' ( (lv_id1_9_0= RULE_ID ) ) otherlv_10= ',' ( (lv_id2_11_0= RULE_ID ) ) otherlv_12= ':=' otherlv_13= 'range' ( (lv_expression_14_0= ruleExpression ) ) otherlv_15= '{' ( (lv_lineCommand_16_0= ruleLineCommand ) )* otherlv_17= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getForRangeAccess().getForKeyword_1_0());
                    			
                    // InternalMyGo.g:763:4: ( (lv_id1_9_0= RULE_ID ) )
                    // InternalMyGo.g:764:5: (lv_id1_9_0= RULE_ID )
                    {
                    // InternalMyGo.g:764:5: (lv_id1_9_0= RULE_ID )
                    // InternalMyGo.g:765:6: lv_id1_9_0= RULE_ID
                    {
                    lv_id1_9_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_id1_9_0, grammarAccess.getForRangeAccess().getId1IDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id1",
                    							lv_id1_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getForRangeAccess().getCommaKeyword_1_2());
                    			
                    // InternalMyGo.g:785:4: ( (lv_id2_11_0= RULE_ID ) )
                    // InternalMyGo.g:786:5: (lv_id2_11_0= RULE_ID )
                    {
                    // InternalMyGo.g:786:5: (lv_id2_11_0= RULE_ID )
                    // InternalMyGo.g:787:6: lv_id2_11_0= RULE_ID
                    {
                    lv_id2_11_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(lv_id2_11_0, grammarAccess.getForRangeAccess().getId2IDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getForRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id2",
                    							lv_id2_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getForRangeAccess().getColonEqualsSignKeyword_1_4());
                    			
                    otherlv_13=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getForRangeAccess().getRangeKeyword_1_5());
                    			
                    // InternalMyGo.g:811:4: ( (lv_expression_14_0= ruleExpression ) )
                    // InternalMyGo.g:812:5: (lv_expression_14_0= ruleExpression )
                    {
                    // InternalMyGo.g:812:5: (lv_expression_14_0= ruleExpression )
                    // InternalMyGo.g:813:6: lv_expression_14_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getForRangeAccess().getExpressionExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_expression_14_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForRangeRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_14_0,
                    							"org.xtext.compiler.go.MyGo.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getForRangeAccess().getLeftCurlyBracketKeyword_1_7());
                    			
                    // InternalMyGo.g:834:4: ( (lv_lineCommand_16_0= ruleLineCommand ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID||LA15_0==20||(LA15_0>=51 && LA15_0<=52)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyGo.g:835:5: (lv_lineCommand_16_0= ruleLineCommand )
                    	    {
                    	    // InternalMyGo.g:835:5: (lv_lineCommand_16_0= ruleLineCommand )
                    	    // InternalMyGo.g:836:6: lv_lineCommand_16_0= ruleLineCommand
                    	    {

                    	    						newCompositeNode(grammarAccess.getForRangeAccess().getLineCommandLineCommandParserRuleCall_1_8_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_lineCommand_16_0=ruleLineCommand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getForRangeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"lineCommand",
                    	    							lv_lineCommand_16_0,
                    	    							"org.xtext.compiler.go.MyGo.LineCommand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getForRangeAccess().getRightCurlyBracketKeyword_1_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForRange"


    // $ANTLR start "entryRuleParametersDeclaration"
    // InternalMyGo.g:862:1: entryRuleParametersDeclaration returns [EObject current=null] : iv_ruleParametersDeclaration= ruleParametersDeclaration EOF ;
    public final EObject entryRuleParametersDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersDeclaration = null;


        try {
            // InternalMyGo.g:862:62: (iv_ruleParametersDeclaration= ruleParametersDeclaration EOF )
            // InternalMyGo.g:863:2: iv_ruleParametersDeclaration= ruleParametersDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParametersDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametersDeclaration=ruleParametersDeclaration();

            state._fsp--;

             current =iv_ruleParametersDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersDeclaration"


    // $ANTLR start "ruleParametersDeclaration"
    // InternalMyGo.g:869:1: ruleParametersDeclaration returns [EObject current=null] : ( ( (lv_idType_0_0= ruleIdType ) ) (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )* ) ;
    public final EObject ruleParametersDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_idType_0_0 = null;

        EObject lv_idType_2_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:875:2: ( ( ( (lv_idType_0_0= ruleIdType ) ) (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )* ) )
            // InternalMyGo.g:876:2: ( ( (lv_idType_0_0= ruleIdType ) ) (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )* )
            {
            // InternalMyGo.g:876:2: ( ( (lv_idType_0_0= ruleIdType ) ) (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )* )
            // InternalMyGo.g:877:3: ( (lv_idType_0_0= ruleIdType ) ) (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )*
            {
            // InternalMyGo.g:877:3: ( (lv_idType_0_0= ruleIdType ) )
            // InternalMyGo.g:878:4: (lv_idType_0_0= ruleIdType )
            {
            // InternalMyGo.g:878:4: (lv_idType_0_0= ruleIdType )
            // InternalMyGo.g:879:5: lv_idType_0_0= ruleIdType
            {

            					newCompositeNode(grammarAccess.getParametersDeclarationAccess().getIdTypeIdTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_idType_0_0=ruleIdType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametersDeclarationRule());
            					}
            					add(
            						current,
            						"idType",
            						lv_idType_0_0,
            						"org.xtext.compiler.go.MyGo.IdType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyGo.g:896:3: (otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyGo.g:897:4: otherlv_1= ',' ( (lv_idType_2_0= ruleIdType ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParametersDeclarationAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyGo.g:901:4: ( (lv_idType_2_0= ruleIdType ) )
            	    // InternalMyGo.g:902:5: (lv_idType_2_0= ruleIdType )
            	    {
            	    // InternalMyGo.g:902:5: (lv_idType_2_0= ruleIdType )
            	    // InternalMyGo.g:903:6: lv_idType_2_0= ruleIdType
            	    {

            	    						newCompositeNode(grammarAccess.getParametersDeclarationAccess().getIdTypeIdTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_idType_2_0=ruleIdType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParametersDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"idType",
            	    							lv_idType_2_0,
            	    							"org.xtext.compiler.go.MyGo.IdType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersDeclaration"


    // $ANTLR start "entryRuleParametersValues"
    // InternalMyGo.g:925:1: entryRuleParametersValues returns [EObject current=null] : iv_ruleParametersValues= ruleParametersValues EOF ;
    public final EObject entryRuleParametersValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametersValues = null;


        try {
            // InternalMyGo.g:925:57: (iv_ruleParametersValues= ruleParametersValues EOF )
            // InternalMyGo.g:926:2: iv_ruleParametersValues= ruleParametersValues EOF
            {
             newCompositeNode(grammarAccess.getParametersValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametersValues=ruleParametersValues();

            state._fsp--;

             current =iv_ruleParametersValues; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParametersValues"


    // $ANTLR start "ruleParametersValues"
    // InternalMyGo.g:932:1: ruleParametersValues returns [EObject current=null] : ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleParametersValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:938:2: ( ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? ) )
            // InternalMyGo.g:939:2: ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? )
            {
            // InternalMyGo.g:939:2: ( () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )? )
            // InternalMyGo.g:940:3: () ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            {
            // InternalMyGo.g:940:3: ()
            // InternalMyGo.g:941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametersValuesAccess().getParametersValuesAction_0(),
            					current);
            			

            }

            // InternalMyGo.g:947:3: ( ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==14||(LA19_0>=30 && LA19_0<=31)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyGo.g:948:4: ( (lv_expression_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    {
                    // InternalMyGo.g:948:4: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalMyGo.g:949:5: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalMyGo.g:949:5: (lv_expression_1_0= ruleExpression )
                    // InternalMyGo.g:950:6: lv_expression_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getParametersValuesAccess().getExpressionExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametersValuesRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_1_0,
                    							"org.xtext.compiler.go.MyGo.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyGo.g:967:4: (otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==23) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyGo.g:968:5: otherlv_2= ',' ( (lv_expression_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_19); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParametersValuesAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyGo.g:972:5: ( (lv_expression_3_0= ruleExpression ) )
                    	    // InternalMyGo.g:973:6: (lv_expression_3_0= ruleExpression )
                    	    {
                    	    // InternalMyGo.g:973:6: (lv_expression_3_0= ruleExpression )
                    	    // InternalMyGo.g:974:7: lv_expression_3_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getParametersValuesAccess().getExpressionExpressionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_expression_3_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParametersValuesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_3_0,
                    	    								"org.xtext.compiler.go.MyGo.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParametersValues"


    // $ANTLR start "entryRuleType"
    // InternalMyGo.g:997:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyGo.g:997:44: (iv_ruleType= ruleType EOF )
            // InternalMyGo.g:998:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyGo.g:1004:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'float64' | kw= 'bool' | kw= 'string' | this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalMyGo.g:1010:2: ( (kw= 'int' | kw= 'float64' | kw= 'bool' | kw= 'string' | this_ID_4= RULE_ID ) )
            // InternalMyGo.g:1011:2: (kw= 'int' | kw= 'float64' | kw= 'bool' | kw= 'string' | this_ID_4= RULE_ID )
            {
            // InternalMyGo.g:1011:2: (kw= 'int' | kw= 'float64' | kw= 'bool' | kw= 'string' | this_ID_4= RULE_ID )
            int alt20=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            case 27:
                {
                alt20=4;
                }
                break;
            case RULE_ID:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyGo.g:1012:3: kw= 'int'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:1018:3: kw= 'float64'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getFloat64Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyGo.g:1024:3: kw= 'bool'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBoolKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyGo.g:1030:3: kw= 'string'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyGo.g:1036:3: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_4);
                    		

                    			newLeafNode(this_ID_4, grammarAccess.getTypeAccess().getIDTerminalRuleCall_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeDeclaration"
    // InternalMyGo.g:1047:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // InternalMyGo.g:1047:56: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // InternalMyGo.g:1048:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;

             current =iv_ruleTypeDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // InternalMyGo.g:1054:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1060:2: ( (otherlv_0= 'type' ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMyGo.g:1061:2: (otherlv_0= 'type' ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMyGo.g:1061:2: (otherlv_0= 'type' ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) ) )
            // InternalMyGo.g:1062:3: otherlv_0= 'type' ( (lv_id_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
            		
            // InternalMyGo.g:1066:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyGo.g:1067:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyGo.g:1067:4: (lv_id_1_0= RULE_ID )
            // InternalMyGo.g:1068:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTypeDeclarationAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyGo.g:1084:3: ( (lv_type_2_0= ruleType ) )
            // InternalMyGo.g:1085:4: (lv_type_2_0= ruleType )
            {
            // InternalMyGo.g:1085:4: (lv_type_2_0= ruleType )
            // InternalMyGo.g:1086:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.compiler.go.MyGo.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleValue"
    // InternalMyGo.g:1107:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyGo.g:1107:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyGo.g:1108:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyGo.g:1114:1: ruleValue returns [EObject current=null] : ( ( (lv_intValue_0_0= ruleIntValue ) ) | ( (lv_floatValue_1_0= ruleFloatValue ) ) | ( (lv_stringValue_2_0= ruleStringValue ) ) | ( (lv_boolValue_3_0= ruleBoolValue ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_intValue_0_0 = null;

        AntlrDatatypeRuleToken lv_floatValue_1_0 = null;

        AntlrDatatypeRuleToken lv_stringValue_2_0 = null;

        AntlrDatatypeRuleToken lv_boolValue_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1120:2: ( ( ( (lv_intValue_0_0= ruleIntValue ) ) | ( (lv_floatValue_1_0= ruleFloatValue ) ) | ( (lv_stringValue_2_0= ruleStringValue ) ) | ( (lv_boolValue_3_0= ruleBoolValue ) ) ) )
            // InternalMyGo.g:1121:2: ( ( (lv_intValue_0_0= ruleIntValue ) ) | ( (lv_floatValue_1_0= ruleFloatValue ) ) | ( (lv_stringValue_2_0= ruleStringValue ) ) | ( (lv_boolValue_3_0= ruleBoolValue ) ) )
            {
            // InternalMyGo.g:1121:2: ( ( (lv_intValue_0_0= ruleIntValue ) ) | ( (lv_floatValue_1_0= ruleFloatValue ) ) | ( (lv_stringValue_2_0= ruleStringValue ) ) | ( (lv_boolValue_3_0= ruleBoolValue ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==29) ) {
                    alt21=2;
                }
                else if ( (LA21_1==EOF||LA21_1==RULE_ID||(LA21_1>=15 && LA21_1<=18)||LA21_1==20||LA21_1==23||(LA21_1>=32 && LA21_1<=52)) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt21=3;
                }
                break;
            case 30:
            case 31:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyGo.g:1122:3: ( (lv_intValue_0_0= ruleIntValue ) )
                    {
                    // InternalMyGo.g:1122:3: ( (lv_intValue_0_0= ruleIntValue ) )
                    // InternalMyGo.g:1123:4: (lv_intValue_0_0= ruleIntValue )
                    {
                    // InternalMyGo.g:1123:4: (lv_intValue_0_0= ruleIntValue )
                    // InternalMyGo.g:1124:5: lv_intValue_0_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getIntValueIntValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_intValue_0_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"intValue",
                    						lv_intValue_0_0,
                    						"org.xtext.compiler.go.MyGo.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGo.g:1142:3: ( (lv_floatValue_1_0= ruleFloatValue ) )
                    {
                    // InternalMyGo.g:1142:3: ( (lv_floatValue_1_0= ruleFloatValue ) )
                    // InternalMyGo.g:1143:4: (lv_floatValue_1_0= ruleFloatValue )
                    {
                    // InternalMyGo.g:1143:4: (lv_floatValue_1_0= ruleFloatValue )
                    // InternalMyGo.g:1144:5: lv_floatValue_1_0= ruleFloatValue
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getFloatValueFloatValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_floatValue_1_0=ruleFloatValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"floatValue",
                    						lv_floatValue_1_0,
                    						"org.xtext.compiler.go.MyGo.FloatValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyGo.g:1162:3: ( (lv_stringValue_2_0= ruleStringValue ) )
                    {
                    // InternalMyGo.g:1162:3: ( (lv_stringValue_2_0= ruleStringValue ) )
                    // InternalMyGo.g:1163:4: (lv_stringValue_2_0= ruleStringValue )
                    {
                    // InternalMyGo.g:1163:4: (lv_stringValue_2_0= ruleStringValue )
                    // InternalMyGo.g:1164:5: lv_stringValue_2_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getStringValueStringValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_stringValue_2_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"stringValue",
                    						lv_stringValue_2_0,
                    						"org.xtext.compiler.go.MyGo.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyGo.g:1182:3: ( (lv_boolValue_3_0= ruleBoolValue ) )
                    {
                    // InternalMyGo.g:1182:3: ( (lv_boolValue_3_0= ruleBoolValue ) )
                    // InternalMyGo.g:1183:4: (lv_boolValue_3_0= ruleBoolValue )
                    {
                    // InternalMyGo.g:1183:4: (lv_boolValue_3_0= ruleBoolValue )
                    // InternalMyGo.g:1184:5: lv_boolValue_3_0= ruleBoolValue
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getBoolValueBoolValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_boolValue_3_0=ruleBoolValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"boolValue",
                    						lv_boolValue_3_0,
                    						"org.xtext.compiler.go.MyGo.BoolValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalMyGo.g:1205:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalMyGo.g:1205:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalMyGo.g:1206:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalMyGo.g:1212:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMyGo.g:1218:2: (this_INT_0= RULE_INT )
            // InternalMyGo.g:1219:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalMyGo.g:1229:1: entryRuleFloatValue returns [String current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final String entryRuleFloatValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatValue = null;


        try {
            // InternalMyGo.g:1229:50: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalMyGo.g:1230:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalMyGo.g:1236:1: ruleFloatValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloatValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyGo.g:1242:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMyGo.g:1243:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMyGo.g:1243:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMyGo.g:1244:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,29,FOLLOW_26); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatValueAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFloatValueAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalMyGo.g:1267:1: entryRuleStringValue returns [String current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final String entryRuleStringValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringValue = null;


        try {
            // InternalMyGo.g:1267:51: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMyGo.g:1268:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMyGo.g:1274:1: ruleStringValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalMyGo.g:1280:2: (this_STRING_0= RULE_STRING )
            // InternalMyGo.g:1281:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getStringValueAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalMyGo.g:1291:1: entryRuleBoolValue returns [String current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final String entryRuleBoolValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolValue = null;


        try {
            // InternalMyGo.g:1291:49: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalMyGo.g:1292:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
             newCompositeNode(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;

             current =iv_ruleBoolValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalMyGo.g:1298:1: ruleBoolValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:1304:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyGo.g:1305:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyGo.g:1305:2: (kw= 'true' | kw= 'false' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyGo.g:1306:3: kw= 'true'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolValueAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:1312:3: kw= 'false'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolValueAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleIdType"
    // InternalMyGo.g:1321:1: entryRuleIdType returns [EObject current=null] : iv_ruleIdType= ruleIdType EOF ;
    public final EObject entryRuleIdType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdType = null;


        try {
            // InternalMyGo.g:1321:47: (iv_ruleIdType= ruleIdType EOF )
            // InternalMyGo.g:1322:2: iv_ruleIdType= ruleIdType EOF
            {
             newCompositeNode(grammarAccess.getIdTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdType=ruleIdType();

            state._fsp--;

             current =iv_ruleIdType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdType"


    // $ANTLR start "ruleIdType"
    // InternalMyGo.g:1328:1: ruleIdType returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject ruleIdType() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1334:2: ( ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) )
            // InternalMyGo.g:1335:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalMyGo.g:1335:2: ( ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            // InternalMyGo.g:1336:3: ( (lv_id_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) )
            {
            // InternalMyGo.g:1336:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyGo.g:1337:4: (lv_id_0_0= RULE_ID )
            {
            // InternalMyGo.g:1337:4: (lv_id_0_0= RULE_ID )
            // InternalMyGo.g:1338:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_id_0_0, grammarAccess.getIdTypeAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyGo.g:1354:3: ( (lv_type_1_0= ruleType ) )
            // InternalMyGo.g:1355:4: (lv_type_1_0= ruleType )
            {
            // InternalMyGo.g:1355:4: (lv_type_1_0= ruleType )
            // InternalMyGo.g:1356:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getIdTypeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.compiler.go.MyGo.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdType"


    // $ANTLR start "entryRuleFuncCall"
    // InternalMyGo.g:1377:1: entryRuleFuncCall returns [EObject current=null] : iv_ruleFuncCall= ruleFuncCall EOF ;
    public final EObject entryRuleFuncCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCall = null;


        try {
            // InternalMyGo.g:1377:49: (iv_ruleFuncCall= ruleFuncCall EOF )
            // InternalMyGo.g:1378:2: iv_ruleFuncCall= ruleFuncCall EOF
            {
             newCompositeNode(grammarAccess.getFuncCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncCall=ruleFuncCall();

            state._fsp--;

             current =iv_ruleFuncCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncCall"


    // $ANTLR start "ruleFuncCall"
    // InternalMyGo.g:1384:1: ruleFuncCall returns [EObject current=null] : ( ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )? ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametersValues_3_0= ruleParametersValues ) ) otherlv_4= ')' ) ;
    public final EObject ruleFuncCall() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_receiverInstance_0_0 = null;

        EObject lv_parametersValues_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1390:2: ( ( ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )? ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametersValues_3_0= ruleParametersValues ) ) otherlv_4= ')' ) )
            // InternalMyGo.g:1391:2: ( ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )? ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametersValues_3_0= ruleParametersValues ) ) otherlv_4= ')' )
            {
            // InternalMyGo.g:1391:2: ( ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )? ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametersValues_3_0= ruleParametersValues ) ) otherlv_4= ')' )
            // InternalMyGo.g:1392:3: ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )? ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parametersValues_3_0= ruleParametersValues ) ) otherlv_4= ')'
            {
            // InternalMyGo.g:1392:3: ( (lv_receiverInstance_0_0= ruleReceiverInstance ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==29) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMyGo.g:1393:4: (lv_receiverInstance_0_0= ruleReceiverInstance )
                    {
                    // InternalMyGo.g:1393:4: (lv_receiverInstance_0_0= ruleReceiverInstance )
                    // InternalMyGo.g:1394:5: lv_receiverInstance_0_0= ruleReceiverInstance
                    {

                    					newCompositeNode(grammarAccess.getFuncCallAccess().getReceiverInstanceReceiverInstanceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_receiverInstance_0_0=ruleReceiverInstance();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFuncCallRule());
                    					}
                    					set(
                    						current,
                    						"receiverInstance",
                    						lv_receiverInstance_0_0,
                    						"org.xtext.compiler.go.MyGo.ReceiverInstance");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyGo.g:1411:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMyGo.g:1412:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMyGo.g:1412:4: (lv_id_1_0= RULE_ID )
            // InternalMyGo.g:1413:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_id_1_0, grammarAccess.getFuncCallAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getFuncCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyGo.g:1433:3: ( (lv_parametersValues_3_0= ruleParametersValues ) )
            // InternalMyGo.g:1434:4: (lv_parametersValues_3_0= ruleParametersValues )
            {
            // InternalMyGo.g:1434:4: (lv_parametersValues_3_0= ruleParametersValues )
            // InternalMyGo.g:1435:5: lv_parametersValues_3_0= ruleParametersValues
            {

            					newCompositeNode(grammarAccess.getFuncCallAccess().getParametersValuesParametersValuesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_parametersValues_3_0=ruleParametersValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncCallRule());
            					}
            					set(
            						current,
            						"parametersValues",
            						lv_parametersValues_3_0,
            						"org.xtext.compiler.go.MyGo.ParametersValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFuncCallAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncCall"


    // $ANTLR start "entryRuleReceiverInstance"
    // InternalMyGo.g:1460:1: entryRuleReceiverInstance returns [EObject current=null] : iv_ruleReceiverInstance= ruleReceiverInstance EOF ;
    public final EObject entryRuleReceiverInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverInstance = null;


        try {
            // InternalMyGo.g:1460:57: (iv_ruleReceiverInstance= ruleReceiverInstance EOF )
            // InternalMyGo.g:1461:2: iv_ruleReceiverInstance= ruleReceiverInstance EOF
            {
             newCompositeNode(grammarAccess.getReceiverInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiverInstance=ruleReceiverInstance();

            state._fsp--;

             current =iv_ruleReceiverInstance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReceiverInstance"


    // $ANTLR start "ruleReceiverInstance"
    // InternalMyGo.g:1467:1: ruleReceiverInstance returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' ) ;
    public final EObject ruleReceiverInstance() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyGo.g:1473:2: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' ) )
            // InternalMyGo.g:1474:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )
            {
            // InternalMyGo.g:1474:2: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.' )
            // InternalMyGo.g:1475:3: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '.'
            {
            // InternalMyGo.g:1475:3: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyGo.g:1476:4: (lv_id_0_0= RULE_ID )
            {
            // InternalMyGo.g:1476:4: (lv_id_0_0= RULE_ID )
            // InternalMyGo.g:1477:5: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_id_0_0, grammarAccess.getReceiverInstanceAccess().getIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReceiverInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReceiverInstanceAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReceiverInstance"


    // $ANTLR start "entryRuleExpression"
    // InternalMyGo.g:1501:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyGo.g:1501:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyGo.g:1502:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyGo.g:1508:1: ruleExpression returns [EObject current=null] : (this_Expression2_0= ruleExpression2 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression2_0 = null;

        AntlrDatatypeRuleToken lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1514:2: ( (this_Expression2_0= ruleExpression2 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )* ) )
            // InternalMyGo.g:1515:2: (this_Expression2_0= ruleExpression2 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )* )
            {
            // InternalMyGo.g:1515:2: (this_Expression2_0= ruleExpression2 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )* )
            // InternalMyGo.g:1516:3: this_Expression2_0= ruleExpression2 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getExpression2ParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Expression2_0=ruleExpression2();

            state._fsp--;


            			current = this_Expression2_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyGo.g:1524:3: ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==32) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyGo.g:1525:4: () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) ) ( (lv_right_3_0= ruleExpression2 ) )
            	    {
            	    // InternalMyGo.g:1525:4: ()
            	    // InternalMyGo.g:1526:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyGo.g:1532:4: ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 ) )
            	    // InternalMyGo.g:1533:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 )
            	    {
            	    // InternalMyGo.g:1533:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence1 )
            	    // InternalMyGo.g:1534:6: lv_binaryOp_2_0= ruleBinaryOpPrecedence1
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getBinaryOpBinaryOpPrecedence1ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_binaryOp_2_0=ruleBinaryOpPrecedence1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"binaryOp",
            	    							lv_binaryOp_2_0,
            	    							"org.xtext.compiler.go.MyGo.BinaryOpPrecedence1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyGo.g:1551:4: ( (lv_right_3_0= ruleExpression2 ) )
            	    // InternalMyGo.g:1552:5: (lv_right_3_0= ruleExpression2 )
            	    {
            	    // InternalMyGo.g:1552:5: (lv_right_3_0= ruleExpression2 )
            	    // InternalMyGo.g:1553:6: lv_right_3_0= ruleExpression2
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightExpression2ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleExpression2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.compiler.go.MyGo.Expression2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression2"
    // InternalMyGo.g:1575:1: entryRuleExpression2 returns [EObject current=null] : iv_ruleExpression2= ruleExpression2 EOF ;
    public final EObject entryRuleExpression2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression2 = null;


        try {
            // InternalMyGo.g:1575:52: (iv_ruleExpression2= ruleExpression2 EOF )
            // InternalMyGo.g:1576:2: iv_ruleExpression2= ruleExpression2 EOF
            {
             newCompositeNode(grammarAccess.getExpression2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression2=ruleExpression2();

            state._fsp--;

             current =iv_ruleExpression2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression2"


    // $ANTLR start "ruleExpression2"
    // InternalMyGo.g:1582:1: ruleExpression2 returns [EObject current=null] : (this_Expression3_0= ruleExpression3 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )* ) ;
    public final EObject ruleExpression2() throws RecognitionException {
        EObject current = null;

        EObject this_Expression3_0 = null;

        AntlrDatatypeRuleToken lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1588:2: ( (this_Expression3_0= ruleExpression3 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )* ) )
            // InternalMyGo.g:1589:2: (this_Expression3_0= ruleExpression3 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )* )
            {
            // InternalMyGo.g:1589:2: (this_Expression3_0= ruleExpression3 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )* )
            // InternalMyGo.g:1590:3: this_Expression3_0= ruleExpression3 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression2Access().getExpression3ParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Expression3_0=ruleExpression3();

            state._fsp--;


            			current = this_Expression3_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyGo.g:1598:3: ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyGo.g:1599:4: () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) ) ( (lv_right_3_0= ruleExpression3 ) )
            	    {
            	    // InternalMyGo.g:1599:4: ()
            	    // InternalMyGo.g:1600:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression2Access().getExpression2LeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyGo.g:1606:4: ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 ) )
            	    // InternalMyGo.g:1607:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 )
            	    {
            	    // InternalMyGo.g:1607:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence2 )
            	    // InternalMyGo.g:1608:6: lv_binaryOp_2_0= ruleBinaryOpPrecedence2
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getBinaryOpBinaryOpPrecedence2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_binaryOp_2_0=ruleBinaryOpPrecedence2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"binaryOp",
            	    							lv_binaryOp_2_0,
            	    							"org.xtext.compiler.go.MyGo.BinaryOpPrecedence2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyGo.g:1625:4: ( (lv_right_3_0= ruleExpression3 ) )
            	    // InternalMyGo.g:1626:5: (lv_right_3_0= ruleExpression3 )
            	    {
            	    // InternalMyGo.g:1626:5: (lv_right_3_0= ruleExpression3 )
            	    // InternalMyGo.g:1627:6: lv_right_3_0= ruleExpression3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression2Access().getRightExpression3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleExpression3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression2Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.compiler.go.MyGo.Expression3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression2"


    // $ANTLR start "entryRuleExpression3"
    // InternalMyGo.g:1649:1: entryRuleExpression3 returns [EObject current=null] : iv_ruleExpression3= ruleExpression3 EOF ;
    public final EObject entryRuleExpression3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression3 = null;


        try {
            // InternalMyGo.g:1649:52: (iv_ruleExpression3= ruleExpression3 EOF )
            // InternalMyGo.g:1650:2: iv_ruleExpression3= ruleExpression3 EOF
            {
             newCompositeNode(grammarAccess.getExpression3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression3=ruleExpression3();

            state._fsp--;

             current =iv_ruleExpression3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression3"


    // $ANTLR start "ruleExpression3"
    // InternalMyGo.g:1656:1: ruleExpression3 returns [EObject current=null] : (this_Expression4_0= ruleExpression4 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )* ) ;
    public final EObject ruleExpression3() throws RecognitionException {
        EObject current = null;

        EObject this_Expression4_0 = null;

        AntlrDatatypeRuleToken lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1662:2: ( (this_Expression4_0= ruleExpression4 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )* ) )
            // InternalMyGo.g:1663:2: (this_Expression4_0= ruleExpression4 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )* )
            {
            // InternalMyGo.g:1663:2: (this_Expression4_0= ruleExpression4 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )* )
            // InternalMyGo.g:1664:3: this_Expression4_0= ruleExpression4 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression3Access().getExpression4ParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_Expression4_0=ruleExpression4();

            state._fsp--;


            			current = this_Expression4_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyGo.g:1672:3: ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=34 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyGo.g:1673:4: () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) ) ( (lv_right_3_0= ruleExpression4 ) )
            	    {
            	    // InternalMyGo.g:1673:4: ()
            	    // InternalMyGo.g:1674:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression3Access().getExpression3LeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyGo.g:1680:4: ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 ) )
            	    // InternalMyGo.g:1681:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 )
            	    {
            	    // InternalMyGo.g:1681:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence3 )
            	    // InternalMyGo.g:1682:6: lv_binaryOp_2_0= ruleBinaryOpPrecedence3
            	    {

            	    						newCompositeNode(grammarAccess.getExpression3Access().getBinaryOpBinaryOpPrecedence3ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_binaryOp_2_0=ruleBinaryOpPrecedence3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"binaryOp",
            	    							lv_binaryOp_2_0,
            	    							"org.xtext.compiler.go.MyGo.BinaryOpPrecedence3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyGo.g:1699:4: ( (lv_right_3_0= ruleExpression4 ) )
            	    // InternalMyGo.g:1700:5: (lv_right_3_0= ruleExpression4 )
            	    {
            	    // InternalMyGo.g:1700:5: (lv_right_3_0= ruleExpression4 )
            	    // InternalMyGo.g:1701:6: lv_right_3_0= ruleExpression4
            	    {

            	    						newCompositeNode(grammarAccess.getExpression3Access().getRightExpression4ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleExpression4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression3Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.compiler.go.MyGo.Expression4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression3"


    // $ANTLR start "entryRuleExpression4"
    // InternalMyGo.g:1723:1: entryRuleExpression4 returns [EObject current=null] : iv_ruleExpression4= ruleExpression4 EOF ;
    public final EObject entryRuleExpression4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression4 = null;


        try {
            // InternalMyGo.g:1723:52: (iv_ruleExpression4= ruleExpression4 EOF )
            // InternalMyGo.g:1724:2: iv_ruleExpression4= ruleExpression4 EOF
            {
             newCompositeNode(grammarAccess.getExpression4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression4=ruleExpression4();

            state._fsp--;

             current =iv_ruleExpression4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression4"


    // $ANTLR start "ruleExpression4"
    // InternalMyGo.g:1730:1: ruleExpression4 returns [EObject current=null] : (this_Expression5_0= ruleExpression5 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )* ) ;
    public final EObject ruleExpression4() throws RecognitionException {
        EObject current = null;

        EObject this_Expression5_0 = null;

        AntlrDatatypeRuleToken lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1736:2: ( (this_Expression5_0= ruleExpression5 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )* ) )
            // InternalMyGo.g:1737:2: (this_Expression5_0= ruleExpression5 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )* )
            {
            // InternalMyGo.g:1737:2: (this_Expression5_0= ruleExpression5 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )* )
            // InternalMyGo.g:1738:3: this_Expression5_0= ruleExpression5 ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression4Access().getExpression5ParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_Expression5_0=ruleExpression5();

            state._fsp--;


            			current = this_Expression5_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyGo.g:1746:3: ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=40 && LA27_0<=43)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyGo.g:1747:4: () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) ) ( (lv_right_3_0= ruleExpression5 ) )
            	    {
            	    // InternalMyGo.g:1747:4: ()
            	    // InternalMyGo.g:1748:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression4Access().getExpression4LeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyGo.g:1754:4: ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 ) )
            	    // InternalMyGo.g:1755:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 )
            	    {
            	    // InternalMyGo.g:1755:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence4 )
            	    // InternalMyGo.g:1756:6: lv_binaryOp_2_0= ruleBinaryOpPrecedence4
            	    {

            	    						newCompositeNode(grammarAccess.getExpression4Access().getBinaryOpBinaryOpPrecedence4ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_binaryOp_2_0=ruleBinaryOpPrecedence4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression4Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"binaryOp",
            	    							lv_binaryOp_2_0,
            	    							"org.xtext.compiler.go.MyGo.BinaryOpPrecedence4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyGo.g:1773:4: ( (lv_right_3_0= ruleExpression5 ) )
            	    // InternalMyGo.g:1774:5: (lv_right_3_0= ruleExpression5 )
            	    {
            	    // InternalMyGo.g:1774:5: (lv_right_3_0= ruleExpression5 )
            	    // InternalMyGo.g:1775:6: lv_right_3_0= ruleExpression5
            	    {

            	    						newCompositeNode(grammarAccess.getExpression4Access().getRightExpression5ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleExpression5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression4Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.compiler.go.MyGo.Expression5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression4"


    // $ANTLR start "entryRuleExpression5"
    // InternalMyGo.g:1797:1: entryRuleExpression5 returns [EObject current=null] : iv_ruleExpression5= ruleExpression5 EOF ;
    public final EObject entryRuleExpression5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression5 = null;


        try {
            // InternalMyGo.g:1797:52: (iv_ruleExpression5= ruleExpression5 EOF )
            // InternalMyGo.g:1798:2: iv_ruleExpression5= ruleExpression5 EOF
            {
             newCompositeNode(grammarAccess.getExpression5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression5=ruleExpression5();

            state._fsp--;

             current =iv_ruleExpression5; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression5"


    // $ANTLR start "ruleExpression5"
    // InternalMyGo.g:1804:1: ruleExpression5 returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleExpression5() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpr_0 = null;

        AntlrDatatypeRuleToken lv_binaryOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1810:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* ) )
            // InternalMyGo.g:1811:2: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            {
            // InternalMyGo.g:1811:2: (this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )* )
            // InternalMyGo.g:1812:3: this_UnaryExpr_0= ruleUnaryExpr ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression5Access().getUnaryExprParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;


            			current = this_UnaryExpr_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyGo.g:1820:3: ( () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=44 && LA28_0<=50)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyGo.g:1821:4: () ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) ) ( (lv_right_3_0= ruleUnaryExpr ) )
            	    {
            	    // InternalMyGo.g:1821:4: ()
            	    // InternalMyGo.g:1822:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression5Access().getExpression5LeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyGo.g:1828:4: ( (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 ) )
            	    // InternalMyGo.g:1829:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 )
            	    {
            	    // InternalMyGo.g:1829:5: (lv_binaryOp_2_0= ruleBinaryOpPrecedence5 )
            	    // InternalMyGo.g:1830:6: lv_binaryOp_2_0= ruleBinaryOpPrecedence5
            	    {

            	    						newCompositeNode(grammarAccess.getExpression5Access().getBinaryOpBinaryOpPrecedence5ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_binaryOp_2_0=ruleBinaryOpPrecedence5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"binaryOp",
            	    							lv_binaryOp_2_0,
            	    							"org.xtext.compiler.go.MyGo.BinaryOpPrecedence5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMyGo.g:1847:4: ( (lv_right_3_0= ruleUnaryExpr ) )
            	    // InternalMyGo.g:1848:5: (lv_right_3_0= ruleUnaryExpr )
            	    {
            	    // InternalMyGo.g:1848:5: (lv_right_3_0= ruleUnaryExpr )
            	    // InternalMyGo.g:1849:6: lv_right_3_0= ruleUnaryExpr
            	    {

            	    						newCompositeNode(grammarAccess.getExpression5Access().getRightUnaryExprParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=ruleUnaryExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression5Rule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.compiler.go.MyGo.UnaryExpr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression5"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalMyGo.g:1871:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalMyGo.g:1871:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalMyGo.g:1872:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalMyGo.g:1878:1: ruleUnaryExpr returns [EObject current=null] : (this_Value_0= ruleValue | this_Variable_1= ruleVariable | this_FuncCall_2= ruleFuncCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Value_0 = null;

        EObject this_Variable_1 = null;

        EObject this_FuncCall_2 = null;

        EObject this_Expression_4 = null;



        	enterRule();

        try {
            // InternalMyGo.g:1884:2: ( (this_Value_0= ruleValue | this_Variable_1= ruleVariable | this_FuncCall_2= ruleFuncCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // InternalMyGo.g:1885:2: (this_Value_0= ruleValue | this_Variable_1= ruleVariable | this_FuncCall_2= ruleFuncCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // InternalMyGo.g:1885:2: (this_Value_0= ruleValue | this_Variable_1= ruleVariable | this_FuncCall_2= ruleFuncCall | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 30:
            case 31:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==14||LA29_2==29) ) {
                    alt29=3;
                }
                else if ( (LA29_2==EOF||LA29_2==RULE_ID||(LA29_2>=15 && LA29_2<=18)||LA29_2==20||LA29_2==23||(LA29_2>=32 && LA29_2<=52)) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyGo.g:1886:3: this_Value_0= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getUnaryExprAccess().getValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_0=ruleValue();

                    state._fsp--;


                    			current = this_Value_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:1895:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getUnaryExprAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyGo.g:1904:3: this_FuncCall_2= ruleFuncCall
                    {

                    			newCompositeNode(grammarAccess.getUnaryExprAccess().getFuncCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuncCall_2=ruleFuncCall();

                    state._fsp--;


                    			current = this_FuncCall_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyGo.g:1913:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // InternalMyGo.g:1913:3: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // InternalMyGo.g:1914:4: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getUnaryExprAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getUnaryExprAccess().getExpressionParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Expression_4=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getUnaryExprAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleVariable"
    // InternalMyGo.g:1935:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyGo.g:1935:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyGo.g:1936:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyGo.g:1942:1: ruleVariable returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyGo.g:1948:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyGo.g:1949:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyGo.g:1949:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyGo.g:1950:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyGo.g:1950:3: (lv_id_0_0= RULE_ID )
            // InternalMyGo.g:1951:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getVariableAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBinaryOpPrecedence1"
    // InternalMyGo.g:1970:1: entryRuleBinaryOpPrecedence1 returns [String current=null] : iv_ruleBinaryOpPrecedence1= ruleBinaryOpPrecedence1 EOF ;
    public final String entryRuleBinaryOpPrecedence1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpPrecedence1 = null;


        try {
            // InternalMyGo.g:1970:59: (iv_ruleBinaryOpPrecedence1= ruleBinaryOpPrecedence1 EOF )
            // InternalMyGo.g:1971:2: iv_ruleBinaryOpPrecedence1= ruleBinaryOpPrecedence1 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpPrecedence1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOpPrecedence1=ruleBinaryOpPrecedence1();

            state._fsp--;

             current =iv_ruleBinaryOpPrecedence1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOpPrecedence1"


    // $ANTLR start "ruleBinaryOpPrecedence1"
    // InternalMyGo.g:1977:1: ruleBinaryOpPrecedence1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleBinaryOpPrecedence1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:1983:2: (kw= '||' )
            // InternalMyGo.g:1984:2: kw= '||'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBinaryOpPrecedence1Access().getVerticalLineVerticalLineKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOpPrecedence1"


    // $ANTLR start "entryRuleBinaryOpPrecedence2"
    // InternalMyGo.g:1992:1: entryRuleBinaryOpPrecedence2 returns [String current=null] : iv_ruleBinaryOpPrecedence2= ruleBinaryOpPrecedence2 EOF ;
    public final String entryRuleBinaryOpPrecedence2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpPrecedence2 = null;


        try {
            // InternalMyGo.g:1992:59: (iv_ruleBinaryOpPrecedence2= ruleBinaryOpPrecedence2 EOF )
            // InternalMyGo.g:1993:2: iv_ruleBinaryOpPrecedence2= ruleBinaryOpPrecedence2 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpPrecedence2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOpPrecedence2=ruleBinaryOpPrecedence2();

            state._fsp--;

             current =iv_ruleBinaryOpPrecedence2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOpPrecedence2"


    // $ANTLR start "ruleBinaryOpPrecedence2"
    // InternalMyGo.g:1999:1: ruleBinaryOpPrecedence2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleBinaryOpPrecedence2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:2005:2: (kw= '&&' )
            // InternalMyGo.g:2006:2: kw= '&&'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBinaryOpPrecedence2Access().getAmpersandAmpersandKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOpPrecedence2"


    // $ANTLR start "entryRuleBinaryOpPrecedence3"
    // InternalMyGo.g:2014:1: entryRuleBinaryOpPrecedence3 returns [String current=null] : iv_ruleBinaryOpPrecedence3= ruleBinaryOpPrecedence3 EOF ;
    public final String entryRuleBinaryOpPrecedence3() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpPrecedence3 = null;


        try {
            // InternalMyGo.g:2014:59: (iv_ruleBinaryOpPrecedence3= ruleBinaryOpPrecedence3 EOF )
            // InternalMyGo.g:2015:2: iv_ruleBinaryOpPrecedence3= ruleBinaryOpPrecedence3 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpPrecedence3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOpPrecedence3=ruleBinaryOpPrecedence3();

            state._fsp--;

             current =iv_ruleBinaryOpPrecedence3.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOpPrecedence3"


    // $ANTLR start "ruleBinaryOpPrecedence3"
    // InternalMyGo.g:2021:1: ruleBinaryOpPrecedence3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpPrecedence3() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:2027:2: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // InternalMyGo.g:2028:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // InternalMyGo.g:2028:2: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt30=1;
                }
                break;
            case 35:
                {
                alt30=2;
                }
                break;
            case 36:
                {
                alt30=3;
                }
                break;
            case 37:
                {
                alt30=4;
                }
                break;
            case 38:
                {
                alt30=5;
                }
                break;
            case 39:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyGo.g:2029:3: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:2035:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyGo.g:2041:3: kw= '<'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getLessThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyGo.g:2047:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyGo.g:2053:3: kw= '>'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyGo.g:2059:3: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence3Access().getGreaterThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOpPrecedence3"


    // $ANTLR start "entryRuleBinaryOpPrecedence4"
    // InternalMyGo.g:2068:1: entryRuleBinaryOpPrecedence4 returns [String current=null] : iv_ruleBinaryOpPrecedence4= ruleBinaryOpPrecedence4 EOF ;
    public final String entryRuleBinaryOpPrecedence4() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpPrecedence4 = null;


        try {
            // InternalMyGo.g:2068:59: (iv_ruleBinaryOpPrecedence4= ruleBinaryOpPrecedence4 EOF )
            // InternalMyGo.g:2069:2: iv_ruleBinaryOpPrecedence4= ruleBinaryOpPrecedence4 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpPrecedence4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOpPrecedence4=ruleBinaryOpPrecedence4();

            state._fsp--;

             current =iv_ruleBinaryOpPrecedence4.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOpPrecedence4"


    // $ANTLR start "ruleBinaryOpPrecedence4"
    // InternalMyGo.g:2075:1: ruleBinaryOpPrecedence4 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '|' | kw= '^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpPrecedence4() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:2081:2: ( (kw= '+' | kw= '-' | kw= '|' | kw= '^' ) )
            // InternalMyGo.g:2082:2: (kw= '+' | kw= '-' | kw= '|' | kw= '^' )
            {
            // InternalMyGo.g:2082:2: (kw= '+' | kw= '-' | kw= '|' | kw= '^' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt31=1;
                }
                break;
            case 41:
                {
                alt31=2;
                }
                break;
            case 42:
                {
                alt31=3;
                }
                break;
            case 43:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyGo.g:2083:3: kw= '+'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence4Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:2089:3: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence4Access().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyGo.g:2095:3: kw= '|'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence4Access().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyGo.g:2101:3: kw= '^'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence4Access().getCircumflexAccentKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOpPrecedence4"


    // $ANTLR start "entryRuleBinaryOpPrecedence5"
    // InternalMyGo.g:2110:1: entryRuleBinaryOpPrecedence5 returns [String current=null] : iv_ruleBinaryOpPrecedence5= ruleBinaryOpPrecedence5 EOF ;
    public final String entryRuleBinaryOpPrecedence5() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpPrecedence5 = null;


        try {
            // InternalMyGo.g:2110:59: (iv_ruleBinaryOpPrecedence5= ruleBinaryOpPrecedence5 EOF )
            // InternalMyGo.g:2111:2: iv_ruleBinaryOpPrecedence5= ruleBinaryOpPrecedence5 EOF
            {
             newCompositeNode(grammarAccess.getBinaryOpPrecedence5Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOpPrecedence5=ruleBinaryOpPrecedence5();

            state._fsp--;

             current =iv_ruleBinaryOpPrecedence5.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryOpPrecedence5"


    // $ANTLR start "ruleBinaryOpPrecedence5"
    // InternalMyGo.g:2117:1: ruleBinaryOpPrecedence5 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpPrecedence5() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyGo.g:2123:2: ( (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' ) )
            // InternalMyGo.g:2124:2: (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )
            {
            // InternalMyGo.g:2124:2: (kw= '*' | kw= '/' | kw= '%' | kw= '<<' | kw= '>>' | kw= '&' | kw= '&^' )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt32=1;
                }
                break;
            case 45:
                {
                alt32=2;
                }
                break;
            case 46:
                {
                alt32=3;
                }
                break;
            case 47:
                {
                alt32=4;
                }
                break;
            case 48:
                {
                alt32=5;
                }
                break;
            case 49:
                {
                alt32=6;
                }
                break;
            case 50:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyGo.g:2125:3: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyGo.g:2131:3: kw= '/'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getSolidusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyGo.g:2137:3: kw= '%'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getPercentSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyGo.g:2143:3: kw= '<<'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getLessThanSignLessThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyGo.g:2149:3: kw= '>>'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getGreaterThanSignGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyGo.g:2155:3: kw= '&'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getAmpersandKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyGo.g:2161:3: kw= '&^'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBinaryOpPrecedence5Access().getAmpersandCircumflexAccentKeyword_6());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryOpPrecedence5"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMyGo.g:2170:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMyGo.g:2170:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMyGo.g:2171:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMyGo.g:2177:1: ruleVariableDeclaration returns [EObject current=null] : ( (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) | (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ids_1_0=null;
        Token otherlv_2=null;
        Token lv_ids_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_ids_7_0=null;
        Token otherlv_8=null;
        Token lv_ids_9_0=null;
        Token otherlv_11=null;
        Token lv_ids_12_0=null;
        Token otherlv_13=null;
        Token lv_ids_14_0=null;
        Token otherlv_16=null;
        EObject lv_expression_5_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;

        AntlrDatatypeRuleToken lv_type_15_0 = null;

        EObject lv_expression_17_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:2183:2: ( ( (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) | (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) ) ) )
            // InternalMyGo.g:2184:2: ( (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) | (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) ) )
            {
            // InternalMyGo.g:2184:2: ( (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) | (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) ) )
            int alt36=3;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalMyGo.g:2185:3: (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
                    {
                    // InternalMyGo.g:2185:3: (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
                    // InternalMyGo.g:2186:4: otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0_0());
                    			
                    // InternalMyGo.g:2190:4: ( (lv_ids_1_0= RULE_ID ) )
                    // InternalMyGo.g:2191:5: (lv_ids_1_0= RULE_ID )
                    {
                    // InternalMyGo.g:2191:5: (lv_ids_1_0= RULE_ID )
                    // InternalMyGo.g:2192:6: lv_ids_1_0= RULE_ID
                    {
                    lv_ids_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    						newLeafNode(lv_ids_1_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ids",
                    							lv_ids_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyGo.g:2208:4: (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==23) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyGo.g:2209:5: otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalMyGo.g:2213:5: ( (lv_ids_3_0= RULE_ID ) )
                    	    // InternalMyGo.g:2214:6: (lv_ids_3_0= RULE_ID )
                    	    {
                    	    // InternalMyGo.g:2214:6: (lv_ids_3_0= RULE_ID )
                    	    // InternalMyGo.g:2215:7: lv_ids_3_0= RULE_ID
                    	    {
                    	    lv_ids_3_0=(Token)match(input,RULE_ID,FOLLOW_33); 

                    	    							newLeafNode(lv_ids_3_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_0_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"ids",
                    	    								lv_ids_3_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_0_3());
                    			
                    // InternalMyGo.g:2236:4: ( (lv_expression_5_0= ruleExpression ) )
                    // InternalMyGo.g:2237:5: (lv_expression_5_0= ruleExpression )
                    {
                    // InternalMyGo.g:2237:5: (lv_expression_5_0= ruleExpression )
                    // InternalMyGo.g:2238:6: lv_expression_5_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.compiler.go.MyGo.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyGo.g:2257:3: (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) )
                    {
                    // InternalMyGo.g:2257:3: (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) )
                    // InternalMyGo.g:2258:4: otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableDeclarationAccess().getVarKeyword_1_0());
                    			
                    // InternalMyGo.g:2262:4: ( (lv_ids_7_0= RULE_ID ) )
                    // InternalMyGo.g:2263:5: (lv_ids_7_0= RULE_ID )
                    {
                    // InternalMyGo.g:2263:5: (lv_ids_7_0= RULE_ID )
                    // InternalMyGo.g:2264:6: lv_ids_7_0= RULE_ID
                    {
                    lv_ids_7_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(lv_ids_7_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ids",
                    							lv_ids_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyGo.g:2280:4: (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==23) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyGo.g:2281:5: otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMyGo.g:2285:5: ( (lv_ids_9_0= RULE_ID ) )
                    	    // InternalMyGo.g:2286:6: (lv_ids_9_0= RULE_ID )
                    	    {
                    	    // InternalMyGo.g:2286:6: (lv_ids_9_0= RULE_ID )
                    	    // InternalMyGo.g:2287:7: lv_ids_9_0= RULE_ID
                    	    {
                    	    lv_ids_9_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    	    							newLeafNode(lv_ids_9_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_1_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"ids",
                    	    								lv_ids_9_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    // InternalMyGo.g:2304:4: ( (lv_type_10_0= ruleType ) )
                    // InternalMyGo.g:2305:5: (lv_type_10_0= ruleType )
                    {
                    // InternalMyGo.g:2305:5: (lv_type_10_0= ruleType )
                    // InternalMyGo.g:2306:6: lv_type_10_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_10_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"org.xtext.compiler.go.MyGo.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyGo.g:2325:3: (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) )
                    {
                    // InternalMyGo.g:2325:3: (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) )
                    // InternalMyGo.g:2326:4: otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) )
                    {
                    otherlv_11=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getVariableDeclarationAccess().getVarKeyword_2_0());
                    			
                    // InternalMyGo.g:2330:4: ( (lv_ids_12_0= RULE_ID ) )
                    // InternalMyGo.g:2331:5: (lv_ids_12_0= RULE_ID )
                    {
                    // InternalMyGo.g:2331:5: (lv_ids_12_0= RULE_ID )
                    // InternalMyGo.g:2332:6: lv_ids_12_0= RULE_ID
                    {
                    lv_ids_12_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(lv_ids_12_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ids",
                    							lv_ids_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyGo.g:2348:4: (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==23) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyGo.g:2349:5: otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyGo.g:2353:5: ( (lv_ids_14_0= RULE_ID ) )
                    	    // InternalMyGo.g:2354:6: (lv_ids_14_0= RULE_ID )
                    	    {
                    	    // InternalMyGo.g:2354:6: (lv_ids_14_0= RULE_ID )
                    	    // InternalMyGo.g:2355:7: lv_ids_14_0= RULE_ID
                    	    {
                    	    lv_ids_14_0=(Token)match(input,RULE_ID,FOLLOW_34); 

                    	    							newLeafNode(lv_ids_14_0, grammarAccess.getVariableDeclarationAccess().getIdsIDTerminalRuleCall_2_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVariableDeclarationRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"ids",
                    	    								lv_ids_14_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalMyGo.g:2372:4: ( (lv_type_15_0= ruleType ) )
                    // InternalMyGo.g:2373:5: (lv_type_15_0= ruleType )
                    {
                    // InternalMyGo.g:2373:5: (lv_type_15_0= ruleType )
                    // InternalMyGo.g:2374:6: lv_type_15_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_15_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_15_0,
                    							"org.xtext.compiler.go.MyGo.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_4());
                    			
                    // InternalMyGo.g:2395:4: ( (lv_expression_17_0= ruleExpression ) )
                    // InternalMyGo.g:2396:5: (lv_expression_17_0= ruleExpression )
                    {
                    // InternalMyGo.g:2396:5: (lv_expression_17_0= ruleExpression )
                    // InternalMyGo.g:2397:6: lv_expression_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_17_0,
                    							"org.xtext.compiler.go.MyGo.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalMyGo.g:2419:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalMyGo.g:2419:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalMyGo.g:2420:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalMyGo.g:2426:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyGo.g:2432:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyGo.g:2433:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyGo.g:2433:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMyGo.g:2434:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
            		
            // InternalMyGo.g:2438:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyGo.g:2439:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyGo.g:2439:4: (lv_expression_1_0= ruleExpression )
            // InternalMyGo.g:2440:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.compiler.go.MyGo.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatement"

    // Delegated rules


    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\5\uffff\5\13\3\uffff";
    static final String dfa_3s = "\1\63\3\4\1\uffff\6\4\2\uffff";
    static final String dfa_4s = "\1\63\1\4\1\33\1\4\1\uffff\5\64\1\33\2\uffff";
    static final String dfa_5s = "\4\uffff\1\1\6\uffff\1\2\1\3";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\11\16\uffff\1\4\3\uffff\1\3\1\5\1\6\1\7\1\10",
            "\1\12",
            "",
            "\1\13\14\uffff\2\13\1\14\1\13\36\uffff\2\13",
            "\1\13\14\uffff\2\13\1\14\1\13\36\uffff\2\13",
            "\1\13\14\uffff\2\13\1\14\1\13\36\uffff\2\13",
            "\1\13\14\uffff\2\13\1\14\1\13\36\uffff\2\13",
            "\1\13\14\uffff\2\13\1\14\1\13\36\uffff\2\13",
            "\1\11\16\uffff\1\4\3\uffff\1\3\1\5\1\6\1\7\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2184:2: ( (otherlv_0= 'var' ( (lv_ids_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_ids_3_0= RULE_ID ) ) )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) | (otherlv_6= 'var' ( (lv_ids_7_0= RULE_ID ) ) (otherlv_8= ',' ( (lv_ids_9_0= RULE_ID ) ) )* ( (lv_type_10_0= ruleType ) ) ) | (otherlv_11= 'var' ( (lv_ids_12_0= RULE_ID ) ) (otherlv_13= ',' ( (lv_ids_14_0= RULE_ID ) ) )* ( (lv_type_15_0= ruleType ) ) otherlv_16= '=' ( (lv_expression_17_0= ruleExpression ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010003000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000F010010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0018000000120010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0018000000100012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0004070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000F000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C000C070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000FC00000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0007F00000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000F800010L});

}