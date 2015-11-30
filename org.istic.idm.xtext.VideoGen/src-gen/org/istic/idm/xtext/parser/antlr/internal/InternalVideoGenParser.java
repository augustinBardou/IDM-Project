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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'alternatives'", "'videoseq'", "'length='", "'desc='", "'prob='", "'mandatory'", "'optional'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:76:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:79:28: ( (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}' )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:80:3: otherlv_0= 'VideoGen' otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleVideoGen134); 

                	newLeafNode(otherlv_1, grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:88:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=19 && LA1_0<=20)) ) {
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
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleVideoGen155);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen168); 

                	newLeafNode(otherlv_3, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3());
                

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
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement204);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement214); 

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
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:127:1: ruleStatement returns [EObject current=null] : (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_Alternative_2= ruleAlternative ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryVideoSeq_0 = null;

        EObject this_OptionalVideoSeq_1 = null;

        EObject this_Alternative_2 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:130:28: ( (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_Alternative_2= ruleAlternative ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_Alternative_2= ruleAlternative )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:131:1: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_Alternative_2= ruleAlternative )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
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
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:132:5: this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_ruleStatement261);
                    this_MandatoryVideoSeq_0=ruleMandatoryVideoSeq();

                    state._fsp--;

                     
                            current = this_MandatoryVideoSeq_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:142:5: this_OptionalVideoSeq_1= ruleOptionalVideoSeq
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getOptionalVideoSeqParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_ruleStatement288);
                    this_OptionalVideoSeq_1=ruleOptionalVideoSeq();

                    state._fsp--;

                     
                            current = this_OptionalVideoSeq_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:152:5: this_Alternative_2= ruleAlternative
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAlternativeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternative_in_ruleStatement315);
                    this_Alternative_2=ruleAlternative();

                    state._fsp--;

                     
                            current = this_Alternative_2; 
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


    // $ANTLR start "entryRuleAlternative"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:168:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:169:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:170:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative350);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative360); 

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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:177:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videoseqs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:180:28: ( (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:1: (otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}' )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:181:3: otherlv_0= 'alternatives' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseqs_3_0= ruleVideoSeq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAlternative397); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getAlternativesKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:186:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternative414); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAlternative431); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:207:1: ( (lv_videoseqs_3_0= ruleVideoSeq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:208:1: (lv_videoseqs_3_0= ruleVideoSeq )
            	    {
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:208:1: (lv_videoseqs_3_0= ruleVideoSeq )
            	    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:209:3: lv_videoseqs_3_0= ruleVideoSeq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativeAccess().getVideoseqsVideoSeqParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVideoSeq_in_ruleAlternative452);
            	    lv_videoseqs_3_0=ruleVideoSeq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videoseqs",
            	            		lv_videoseqs_3_0, 
            	            		"VideoSeq");
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAlternative465); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:237:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:238:2: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:239:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq501);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq511); 

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
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:246:1: ruleVideoSeq returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )? (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )? (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_length_5_0=null;
        Token otherlv_6=null;
        Token lv_desc_7_0=null;
        Token otherlv_8=null;
        Token lv_prob_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:249:28: ( (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )? (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )? (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )? otherlv_10= '}' ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:1: (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )? (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )? (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:1: (otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )? (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )? (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )? otherlv_10= '}' )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:250:3: otherlv_0= 'videoseq' ( (lv_name_1_0= RULE_ID ) ) ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )? (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )? (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleVideoSeq548); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:254:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:255:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:255:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:256:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVideoSeq565); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:272:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:273:1: (lv_url_2_0= RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:273:1: (lv_url_2_0= RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:274:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq587); 

            			newLeafNode(lv_url_2_0, grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoSeqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"url",
                    		lv_url_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleVideoSeq604); 

                	newLeafNode(otherlv_3, grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:294:1: (otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:294:3: otherlv_4= 'length=' ( (lv_length_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleVideoSeq617); 

                        	newLeafNode(otherlv_4, grammarAccess.getVideoSeqAccess().getLengthKeyword_4_0());
                        
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:298:1: ( (lv_length_5_0= RULE_INT ) )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:299:1: (lv_length_5_0= RULE_INT )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:299:1: (lv_length_5_0= RULE_INT )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:300:3: lv_length_5_0= RULE_INT
                    {
                    lv_length_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoSeq634); 

                    			newLeafNode(lv_length_5_0, grammarAccess.getVideoSeqAccess().getLengthINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"length",
                            		lv_length_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:316:4: (otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:316:6: otherlv_6= 'desc=' ( (lv_desc_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleVideoSeq654); 

                        	newLeafNode(otherlv_6, grammarAccess.getVideoSeqAccess().getDescKeyword_5_0());
                        
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:320:1: ( (lv_desc_7_0= RULE_STRING ) )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:321:1: (lv_desc_7_0= RULE_STRING )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:321:1: (lv_desc_7_0= RULE_STRING )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:322:3: lv_desc_7_0= RULE_STRING
                    {
                    lv_desc_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVideoSeq671); 

                    			newLeafNode(lv_desc_7_0, grammarAccess.getVideoSeqAccess().getDescSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"desc",
                            		lv_desc_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:338:4: (otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:338:6: otherlv_8= 'prob=' ( (lv_prob_9_0= RULE_INT ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleVideoSeq691); 

                        	newLeafNode(otherlv_8, grammarAccess.getVideoSeqAccess().getProbKeyword_6_0());
                        
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:342:1: ( (lv_prob_9_0= RULE_INT ) )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:343:1: (lv_prob_9_0= RULE_INT )
                    {
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:343:1: (lv_prob_9_0= RULE_INT )
                    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:344:3: lv_prob_9_0= RULE_INT
                    {
                    lv_prob_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVideoSeq708); 

                    			newLeafNode(lv_prob_9_0, grammarAccess.getVideoSeqAccess().getProbINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoSeqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"prob",
                            		lv_prob_9_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleVideoSeq727); 

                	newLeafNode(otherlv_10, grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:372:1: entryRuleMandatoryVideoSeq returns [EObject current=null] : iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF ;
    public final EObject entryRuleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryVideoSeq = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:373:2: (iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:374:2: iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq763);
            iv_ruleMandatoryVideoSeq=ruleMandatoryVideoSeq();

            state._fsp--;

             current =iv_ruleMandatoryVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryVideoSeq773); 

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
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:381:1: ruleMandatoryVideoSeq returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoseq_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:384:28: ( (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:385:1: (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:385:1: (otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:385:3: otherlv_0= 'mandatory' ( (lv_videoseq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMandatoryVideoSeq810); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:389:1: ( (lv_videoseq_1_0= ruleVideoSeq ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:390:1: (lv_videoseq_1_0= ruleVideoSeq )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:390:1: (lv_videoseq_1_0= ruleVideoSeq )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:391:3: lv_videoseq_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleMandatoryVideoSeq831);
            lv_videoseq_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"videoseq",
                    		lv_videoseq_1_0, 
                    		"VideoSeq");
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
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:415:1: entryRuleOptionalVideoSeq returns [EObject current=null] : iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF ;
    public final EObject entryRuleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalVideoSeq = null;


        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:416:2: (iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:417:2: iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq867);
            iv_ruleOptionalVideoSeq=ruleOptionalVideoSeq();

            state._fsp--;

             current =iv_ruleOptionalVideoSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalVideoSeq877); 

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
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:424:1: ruleOptionalVideoSeq returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) ;
    public final EObject ruleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_videoseq_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:427:28: ( (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:1: (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:1: (otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:428:3: otherlv_0= 'optional' ( (lv_videoseq_1_0= ruleVideoSeq ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOptionalVideoSeq914); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
                
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:432:1: ( (lv_videoseq_1_0= ruleVideoSeq ) )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:433:1: (lv_videoseq_1_0= ruleVideoSeq )
            {
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:433:1: (lv_videoseq_1_0= ruleVideoSeq )
            // ../org.istic.idm.xtext.VideoGen/src-gen/org/istic/idm/xtext/parser/antlr/internal/InternalVideoGen.g:434:3: lv_videoseq_1_0= ruleVideoSeq
            {
             
            	        newCompositeNode(grammarAccess.getOptionalVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVideoSeq_in_ruleOptionalVideoSeq935);
            lv_videoseq_1_0=ruleVideoSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalVideoSeqRule());
            	        }
                   		set(
                   			current, 
                   			"videoseq",
                    		lv_videoseq_1_0, 
                    		"VideoSeq");
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
    // $ANTLR end "ruleOptionalVideoSeq"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVideoGen122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVideoGen134 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVideoGen155 = new BitSet(new long[]{0x0000000000186000L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_ruleStatement261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_ruleStatement288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleStatement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAlternative397 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternative414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAlternative431 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleAlternative452 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleAlternative465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleVideoSeq548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVideoSeq565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVideoSeq604 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_16_in_ruleVideoSeq617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoSeq634 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_17_in_ruleVideoSeq654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVideoSeq671 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_ruleVideoSeq691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVideoSeq708 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVideoSeq727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryVideoSeq773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMandatoryVideoSeq810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleMandatoryVideoSeq831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalVideoSeq877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOptionalVideoSeq914 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_ruleOptionalVideoSeq935 = new BitSet(new long[]{0x0000000000000002L});

}