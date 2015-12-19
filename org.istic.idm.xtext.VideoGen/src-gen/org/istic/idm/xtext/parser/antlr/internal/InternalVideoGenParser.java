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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'Alternatives'", "'Mandatory'", "'Optional'", "'Sequence'", "'description='", "'length='", "'mimetype='", "'probability='"
    };
    public static final int RULE_END=5;
    public static final int RULE_BEGIN=4;
    public static final int RULE_STRING=7;
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
    public static final int RULE_INT=8;
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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:127:1: ruleStatement returns [EObject current=null] : (this_Optional_0= ruleOptional | this_Mandatory_1= ruleMandatory | this_Alternatives_2= ruleAlternatives ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Optional_0 = null;

        EObject this_Mandatory_1 = null;

        EObject this_Alternatives_2 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:130:28: ( (this_Optional_0= ruleOptional | this_Mandatory_1= ruleMandatory | this_Alternatives_2= ruleAlternatives ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: (this_Optional_0= ruleOptional | this_Mandatory_1= ruleMandatory | this_Alternatives_2= ruleAlternatives )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: (this_Optional_0= ruleOptional | this_Mandatory_1= ruleMandatory | this_Alternatives_2= ruleAlternatives )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:132:5: this_Optional_0= ruleOptional
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleStatement257);
                    this_Optional_0=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:142:5: this_Mandatory_1= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleStatement284);
                    this_Mandatory_1=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:152:5: this_Alternatives_2= ruleAlternatives
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternatives_in_ruleStatement311);
                    this_Alternatives_2=ruleAlternatives();

                    state._fsp--;

                     
                            current = this_Alternatives_2; 
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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:168:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:169:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:170:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives346);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives356); 

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:177:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_sequences_3_0= ruleSequence ) )+ this_END_4= RULE_END ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_sequences_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:180:28: ( (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_sequences_3_0= ruleSequence ) )+ this_END_4= RULE_END ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_sequences_3_0= ruleSequence ) )+ this_END_4= RULE_END )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_sequences_3_0= ruleSequence ) )+ this_END_4= RULE_END )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:3: otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_sequences_3_0= ruleSequence ) )+ this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAlternatives393); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternatives410); 

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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleAlternatives426); 
             
                newLeafNode(this_BEGIN_2, grammarAccess.getAlternativesAccess().getBEGINTerminalRuleCall_2()); 
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:207:1: ( (lv_sequences_3_0= ruleSequence ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:208:1: (lv_sequences_3_0= ruleSequence )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:208:1: (lv_sequences_3_0= ruleSequence )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:209:3: lv_sequences_3_0= ruleSequence
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getSequencesSequenceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleAlternatives446);
            	    lv_sequences_3_0=ruleSequence();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sequences",
            	            		lv_sequences_3_0, 
            	            		"Sequence");
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleAlternatives458); 
             
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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:237:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:238:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:239:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory493);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory503); 

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:246:1: ruleMandatory returns [EObject current=null] : (otherlv_0= 'Mandatory' ( (lv_sequence_1_0= ruleSequence ) ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:249:28: ( (otherlv_0= 'Mandatory' ( (lv_sequence_1_0= ruleSequence ) ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:1: (otherlv_0= 'Mandatory' ( (lv_sequence_1_0= ruleSequence ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:1: (otherlv_0= 'Mandatory' ( (lv_sequence_1_0= ruleSequence ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:3: otherlv_0= 'Mandatory' ( (lv_sequence_1_0= ruleSequence ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMandatory540); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:254:1: ( (lv_sequence_1_0= ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:255:1: (lv_sequence_1_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:255:1: (lv_sequence_1_0= ruleSequence )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:256:3: lv_sequence_1_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleMandatory561);
            lv_sequence_1_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"Sequence");
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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:280:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:281:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:282:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional597);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional607); 

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:289:1: ruleOptional returns [EObject current=null] : (otherlv_0= 'Optional' ( (lv_sequence_1_0= ruleSequence ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sequence_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:292:28: ( (otherlv_0= 'Optional' ( (lv_sequence_1_0= ruleSequence ) ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:293:1: (otherlv_0= 'Optional' ( (lv_sequence_1_0= ruleSequence ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:293:1: (otherlv_0= 'Optional' ( (lv_sequence_1_0= ruleSequence ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:293:3: otherlv_0= 'Optional' ( (lv_sequence_1_0= ruleSequence ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOptional644); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:297:1: ( (lv_sequence_1_0= ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:298:1: (lv_sequence_1_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:298:1: (lv_sequence_1_0= ruleSequence )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:299:3: lv_sequence_1_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleOptional665);
            lv_sequence_1_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_1_0, 
                    		"Sequence");
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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleSequence"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:323:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:324:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:325:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence701);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence711); 

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:332:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) ) this_END_13= RULE_END ) ;
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
        Token otherlv_11=null;
        Token lv_probability_12_0=null;
        Token this_END_13=null;

         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:335:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) ) this_END_13= RULE_END ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) ) this_END_13= RULE_END )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:336:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) ) this_END_13= RULE_END )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:336:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) this_BEGIN_3= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) ) this_END_13= RULE_END
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSequence748); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:340:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:341:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:342:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence765); 

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

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:358:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_url_2_0= RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:359:1: (lv_url_2_0= RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:360:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence787); 

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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleSequence803); 
             
                newLeafNode(this_BEGIN_3, grammarAccess.getSequenceAccess().getBEGINTerminalRuleCall_3()); 
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:380:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:382:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:382:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:383:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:386:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )* )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:387:3: ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )*
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:387:3: ( ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) ) )*
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2) ) {
                    alt5=3;
                }
                else if ( (LA5_0==RULE_INT||LA5_0==21) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:389:4: ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:389:4: ({...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:390:5: {...}? => ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:390:105: ( ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:391:6: ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:394:6: ({...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:394:7: {...}? => (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:394:16: (otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:394:18: otherlv_5= 'description=' ( (lv_description_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSequence860); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getDescriptionKeyword_4_0_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:398:1: ( (lv_description_6_0= RULE_STRING ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:399:1: (lv_description_6_0= RULE_STRING )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:399:1: (lv_description_6_0= RULE_STRING )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:400:3: lv_description_6_0= RULE_STRING
            	    {
            	    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence877); 

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
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:423:4: ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:423:4: ({...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:424:5: {...}? => ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:424:105: ( ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:425:6: ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:6: ({...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:7: {...}? => (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:16: (otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:18: otherlv_7= 'length=' ( (lv_length_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSequence950); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSequenceAccess().getLengthKeyword_4_1_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:432:1: ( (lv_length_8_0= RULE_INT ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:433:1: (lv_length_8_0= RULE_INT )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:433:1: (lv_length_8_0= RULE_INT )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:434:3: lv_length_8_0= RULE_INT
            	    {
            	    lv_length_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSequence967); 

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
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:457:4: ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:457:4: ({...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:458:5: {...}? => ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:458:105: ( ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:459:6: ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:462:6: ({...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:462:7: {...}? => (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:462:16: (otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:462:18: otherlv_9= 'mimetype=' ( (lv_mimetype_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSequence1040); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSequenceAccess().getMimetypeKeyword_4_2_0());
            	        
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:466:1: ( (lv_mimetype_10_0= RULE_STRING ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:467:1: (lv_mimetype_10_0= RULE_STRING )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:467:1: (lv_mimetype_10_0= RULE_STRING )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:468:3: lv_mimetype_10_0= RULE_STRING
            	    {
            	    lv_mimetype_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence1057); 

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
            	case 4 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:491:4: ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:491:4: ({...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:492:5: {...}? => ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:492:105: ( ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:493:6: ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:6: ({...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:7: {...}? => ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:16: ( (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:17: (otherlv_11= 'probability=' )? ( (lv_probability_12_0= RULE_INT ) )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:17: (otherlv_11= 'probability=' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==21) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:496:19: otherlv_11= 'probability='
            	            {
            	            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleSequence1131); 

            	                	newLeafNode(otherlv_11, grammarAccess.getSequenceAccess().getProbabilityKeyword_4_3_0());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:500:3: ( (lv_probability_12_0= RULE_INT ) )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:501:1: (lv_probability_12_0= RULE_INT )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:501:1: (lv_probability_12_0= RULE_INT )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:502:3: lv_probability_12_0= RULE_INT
            	    {
            	    lv_probability_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSequence1150); 

            	    			newLeafNode(lv_probability_12_0, grammarAccess.getSequenceAccess().getProbabilityINTTerminalRuleCall_4_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"probability",
            	            		lv_probability_12_0, 
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

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_4());
            	

            }

            this_END_13=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleSequence1207); 
             
                newLeafNode(this_END_13, grammarAccess.getSequenceAccess().getENDTerminalRuleCall_5()); 
                

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
    public static final BitSet FOLLOW_ruleOptional_in_ruleStatement257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleStatement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleStatement311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAlternatives393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternatives410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleAlternatives426 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleAlternatives446 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_RULE_END_in_ruleAlternatives458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMandatory540 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleMandatory561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOptional644 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleOptional665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSequence748 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence765 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleSequence803 = new BitSet(new long[]{0x00000000003C0120L});
    public static final BitSet FOLLOW_18_in_ruleSequence860 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence877 = new BitSet(new long[]{0x00000000003C0120L});
    public static final BitSet FOLLOW_19_in_ruleSequence950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSequence967 = new BitSet(new long[]{0x00000000003C0120L});
    public static final BitSet FOLLOW_20_in_ruleSequence1040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence1057 = new BitSet(new long[]{0x00000000003C0120L});
    public static final BitSet FOLLOW_21_in_ruleSequence1131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSequence1150 = new BitSet(new long[]{0x00000000003C0120L});
    public static final BitSet FOLLOW_RULE_END_in_ruleSequence1207 = new BitSet(new long[]{0x0000000000000002L});

}
