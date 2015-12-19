package org.istic.idm.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.istic.idm.xtext.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'Optional'", "'Mandatory'", "'Alternatives'", "'probability='", "'Sequence'", "'description='", "'length='", "'mimetype='"
    };
    public static final int RULE_END=5;
    public static final int RULE_BEGIN=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;
     	
        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:67:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:68:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:69:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

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
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:76:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen' this_BEGIN_1= RULE_BEGIN ( (lv_statements_2_0= ruleStatement ) )+ this_END_3= RULE_END ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:79:28: ( (otherlv_0= 'VideoGen' this_BEGIN_1= RULE_BEGIN ( (lv_statements_2_0= ruleStatement ) )+ this_END_3= RULE_END ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' this_BEGIN_1= RULE_BEGIN ( (lv_statements_2_0= ruleStatement ) )+ this_END_3= RULE_END )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' this_BEGIN_1= RULE_BEGIN ( (lv_statements_2_0= ruleStatement ) )+ this_END_3= RULE_END )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:3: otherlv_0= 'VideoGen' this_BEGIN_1= RULE_BEGIN ( (lv_statements_2_0= ruleStatement ) )+ this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleVideoGen133); 
             
                newLeafNode(this_BEGIN_1, grammarAccess.getVideoGenAccess().getBEGINTerminalRuleCall_1()); 
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:88:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:89:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:90:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleVideoGen153);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            this_END_3=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleVideoGen165); 
             
                newLeafNode(this_END_3, grammarAccess.getVideoGenAccess().getENDTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleStatement"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:118:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:119:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:120:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement200);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement210); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:127:1: ruleStatement returns [EObject current=null] : ( (otherlv_0= 'Optional' this_Optional_1= ruleOptional ) | (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Optional_1 = null;

        EObject this_Mandatory_3 = null;

        EObject this_Alternatives_4 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:130:28: ( ( (otherlv_0= 'Optional' this_Optional_1= ruleOptional ) | (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: ( (otherlv_0= 'Optional' this_Optional_1= ruleOptional ) | (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: ( (otherlv_0= 'Optional' this_Optional_1= ruleOptional ) | (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:2: (otherlv_0= 'Optional' this_Optional_1= ruleOptional )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:2: (otherlv_0= 'Optional' this_Optional_1= ruleOptional )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:4: otherlv_0= 'Optional' this_Optional_1= ruleOptional
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleStatement248); 

                        	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOptionalKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleStatement270);
                    this_Optional_1=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:145:6: (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:145:6: (otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:145:8: otherlv_2= 'Mandatory' this_Mandatory_3= ruleMandatory
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStatement289); 

                        	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getMandatoryKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleStatement311);
                    this_Mandatory_3=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:160:5: this_Alternatives_4= ruleAlternatives
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternatives_in_ruleStatement339);
                    this_Alternatives_4=ruleAlternatives();

                    state._fsp--;

                     
                            current = this_Alternatives_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAlternatives"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:176:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:177:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:178:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives374);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives384); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:185:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_options_3_0= ruleOptional ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:188:28: ( (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_options_3_0= ruleOptional ) )+ this_END_4= RULE_END ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:189:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_options_3_0= ruleOptional ) )+ this_END_4= RULE_END )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:189:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_options_3_0= ruleOptional ) )+ this_END_4= RULE_END )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:189:3: otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_options_3_0= ruleOptional ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternatives421); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:194:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:194:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternatives438); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleAlternatives454); 
             
                newLeafNode(this_BEGIN_2, grammarAccess.getAlternativesAccess().getBEGINTerminalRuleCall_2()); 
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:215:1: ( (lv_options_3_0= ruleOptional ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:216:1: (lv_options_3_0= ruleOptional )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:216:1: (lv_options_3_0= ruleOptional )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:217:3: lv_options_3_0= ruleOptional
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptional_in_ruleAlternatives474);
            	    lv_options_3_0=ruleOptional();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_3_0, 
            	            		"Optional");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleAlternatives486); 
             
                newLeafNode(this_END_4, grammarAccess.getAlternativesAccess().getENDTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleMandatory"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:245:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:246:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:247:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory521);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory531); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:254:1: ruleMandatory returns [EObject current=null] : ( (lv_sequence_0_0= ruleSequence ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:257:28: ( ( (lv_sequence_0_0= ruleSequence ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:258:1: ( (lv_sequence_0_0= ruleSequence ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:258:1: ( (lv_sequence_0_0= ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:259:1: (lv_sequence_0_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:259:1: (lv_sequence_0_0= ruleSequence )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:260:3: lv_sequence_0_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleMandatory576);
            lv_sequence_0_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_0_0, 
                    		"Sequence");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:284:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:285:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:286:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional611);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional621); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:293:1: ruleOptional returns [EObject current=null] : ( ( (lv_sequence_0_0= ruleSequence ) ) ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_probability_2_0=null;
        EObject lv_sequence_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:296:28: ( ( ( (lv_sequence_0_0= ruleSequence ) ) ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )? ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:297:1: ( ( (lv_sequence_0_0= ruleSequence ) ) ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )? )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:297:1: ( ( (lv_sequence_0_0= ruleSequence ) ) ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )? )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:297:2: ( (lv_sequence_0_0= ruleSequence ) ) ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )?
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:297:2: ( (lv_sequence_0_0= ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:298:1: (lv_sequence_0_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:298:1: (lv_sequence_0_0= ruleSequence )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:299:3: lv_sequence_0_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleOptional667);
            lv_sequence_0_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_0_0, 
                    		"Sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:315:2: ( (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:315:3: (otherlv_1= 'probability=' )? ( (lv_probability_2_0= RULE_INT ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:315:3: (otherlv_1= 'probability=' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==17) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:315:5: otherlv_1= 'probability='
                            {
                            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOptional681); 

                                	newLeafNode(otherlv_1, grammarAccess.getOptionalAccess().getProbabilityKeyword_1_0());
                                

                            }
                            break;

                    }

                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:319:3: ( (lv_probability_2_0= RULE_INT ) )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:320:1: (lv_probability_2_0= RULE_INT )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:320:1: (lv_probability_2_0= RULE_INT )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:321:3: lv_probability_2_0= RULE_INT
                    {
                    lv_probability_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOptional700); 

                    			newLeafNode(lv_probability_2_0, grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probability",
                            		lv_probability_2_0, 
                            		"INT");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleSequence"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:345:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:346:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:347:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence743);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence753); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:354:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) this_END_11= RULE_END ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_url_2_0=null;
        Token this_BEGIN_3=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        Token lv_length_8_0=null;
        Token otherlv_9=null;
        Token lv_mimetype_10_0=null;
        Token this_END_11=null;

         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:357:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) this_END_11= RULE_END ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:358:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) this_END_11= RULE_END )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:358:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) this_END_11= RULE_END )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:358:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) this_END_11= RULE_END
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSequence790); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:362:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:363:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:363:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:364:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence807); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:380:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:381:1: (lv_url_2_0= RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:381:1: (lv_url_2_0= RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:382:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence829); 

            			newLeafNode(lv_url_2_0, grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
                    		"STRING");
            	    

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleSequence845); 
             
                newLeafNode(this_BEGIN_3, grammarAccess.getSequenceAccess().getBEGINTerminalRuleCall_3()); 
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:402:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:404:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:404:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:405:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:408:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )* )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:409:3: ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:409:3: ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) )*
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:411:4: ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:411:4: ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:412:5: {...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:412:105: ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:413:6: ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:416:6: ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:416:7: {...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:416:16: (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:416:18: otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSequence902); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getDescriptionKeyword_4_0_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:420:1: ( (lv_description_6_0= RULE_STRING ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:421:1: (lv_description_6_0= RULE_STRING )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:421:1: (lv_description_6_0= RULE_STRING )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:422:3: lv_description_6_0= RULE_STRING
            	    {
            	    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence919); 

            	    			newLeafNode(lv_description_6_0, grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_4_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:445:4: ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:445:4: ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:446:5: {...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:446:105: ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:447:6: ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:450:6: ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:450:7: {...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:450:16: (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:450:18: otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleSequence992); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getLengthKeyword_4_1_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:454:1: ( (lv_length_8_0= RULE_INT ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:455:1: (lv_length_8_0= RULE_INT )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:455:1: (lv_length_8_0= RULE_INT )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:456:3: lv_length_8_0= RULE_INT
            	    {
            	    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSequence1009); 

            	    			newLeafNode(lv_length_8_0, grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_4_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"length",
            	            		lv_length_8_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:479:4: ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:479:4: ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:480:5: {...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:480:105: ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:481:6: ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:484:6: ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:484:7: {...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:484:16: (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:484:18: otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSequence1082); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSequenceAccess().getMimetypeKeyword_4_2_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:488:1: ( (lv_mimetype_10_0= RULE_STRING ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:489:1: (lv_mimetype_10_0= RULE_STRING )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:489:1: (lv_mimetype_10_0= RULE_STRING )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:490:3: lv_mimetype_10_0= RULE_STRING
            	    {
            	    lv_mimetype_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence1099); 

            	    			newLeafNode(lv_mimetype_10_0, grammarAccess.getSequenceAccess().getMimetypeSTRINGTerminalRuleCall_4_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"mimetype",
            	            		lv_mimetype_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	

            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleSequence1156); 
             
                newLeafNode(this_END_11, grammarAccess.getSequenceAccess().getENDTerminalRuleCall_5()); 
                

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
    // $ANTLR end "ruleSequence"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleVideoGen133 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVideoGen153 = new BitSet(new long[]{0x000000000001C020L});
    public static final BitSet FOLLOW_RULE_END_in_ruleVideoGen165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStatement248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleStatement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleStatement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleStatement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternatives421 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternatives438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleAlternatives454 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleAlternatives474 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_RULE_END_in_ruleAlternatives486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleMandatory576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleOptional667 = new BitSet(new long[]{0x0000000000020082L});
    public static final BitSet FOLLOW_17_in_ruleOptional681 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOptional700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSequence790 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence807 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleSequence845 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_19_in_ruleSequence902 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence919 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_20_in_ruleSequence992 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSequence1009 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_21_in_ruleSequence1082 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence1099 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_RULE_END_in_ruleSequence1156 = new BitSet(new long[]{0x0000000000000002L});

}
