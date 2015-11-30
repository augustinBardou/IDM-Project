package org.istic.idm.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.istic.idm.xtext.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g"; }


     
     	private VideoGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVideoGen"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen61);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleStatement"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:89:1: ( ruleStatement EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:104:1: ( rule__Statement__Alternatives )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement154);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAlternative"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( ruleAlternative EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative181);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternative__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternative__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__Alternative__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0_in_ruleAlternative214);
            rule__Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleVideoSeq : ruleVideoSeq EOF ;
    public final void entryRuleVideoSeq() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleVideoSeq EOF
            {
             before(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq241);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoSeq248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleVideoSeq : ( ( rule__VideoSeq__Group__0 ) ) ;
    public final void ruleVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__VideoSeq__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__VideoSeq__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__VideoSeq__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__VideoSeq__Group__0 )
            {
             before(grammarAccess.getVideoSeqAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__VideoSeq__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__VideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq274);
            rule__VideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRuleMandatoryVideoSeq : ruleMandatoryVideoSeq EOF ;
    public final void entryRuleMandatoryVideoSeq() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( ruleMandatoryVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: ruleMandatoryVideoSeq EOF
            {
             before(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq301);
            ruleMandatoryVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryVideoSeq308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: ruleMandatoryVideoSeq : ( ( rule__MandatoryVideoSeq__Group__0 ) ) ;
    public final void ruleMandatoryVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__MandatoryVideoSeq__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__MandatoryVideoSeq__Group__0 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__MandatoryVideoSeq__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__MandatoryVideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0_in_ruleMandatoryVideoSeq334);
            rule__MandatoryVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRuleOptionalVideoSeq : ruleOptionalVideoSeq EOF ;
    public final void entryRuleOptionalVideoSeq() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( ruleOptionalVideoSeq EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: ruleOptionalVideoSeq EOF
            {
             before(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq361);
            ruleOptionalVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalVideoSeq368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: ruleOptionalVideoSeq : ( ( rule__OptionalVideoSeq__Group__0 ) ) ;
    public final void ruleOptionalVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__OptionalVideoSeq__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__OptionalVideoSeq__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__OptionalVideoSeq__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__OptionalVideoSeq__Group__0 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__OptionalVideoSeq__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__OptionalVideoSeq__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0_in_ruleOptionalVideoSeq394);
            rule__OptionalVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalVideoSeq"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:228:1: rule__Statement__Alternatives : ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternative ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:232:1: ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternative ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ruleMandatoryVideoSeq )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ruleMandatoryVideoSeq )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ruleMandatoryVideoSeq
                    {
                     before(grammarAccess.getStatementAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryVideoSeq_in_rule__Statement__Alternatives430);
                    ruleMandatoryVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMandatoryVideoSeqParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleOptionalVideoSeq )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleOptionalVideoSeq )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:240:1: ruleOptionalVideoSeq
                    {
                     before(grammarAccess.getStatementAccess().getOptionalVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalVideoSeq_in_rule__Statement__Alternatives447);
                    ruleOptionalVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getOptionalVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternative )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternative )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:246:1: ruleAlternative
                    {
                     before(grammarAccess.getStatementAccess().getAlternativeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternative_in_rule__Statement__Alternatives464);
                    ruleAlternative();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAlternativeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:258:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:262:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:263:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:270:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:274:1: ( ( 'VideoGen' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:276:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__VideoGen__Group__0__Impl525); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:289:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:293:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:294:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:301:1: rule__VideoGen__Group__1__Impl : ( '{' ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:305:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:307:1: '{'
            {
             before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__VideoGen__Group__1__Impl587); 
             after(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:320:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:324:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:325:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2618);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2621);
            rule__VideoGen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:332:1: rule__VideoGen__Group__2__Impl : ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:336:1: ( ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:337:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:337:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:338:1: ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:338:1: ( ( rule__VideoGen__StatementsAssignment_2 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:339:1: ( rule__VideoGen__StatementsAssignment_2 )
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:340:1: ( rule__VideoGen__StatementsAssignment_2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:340:2: rule__VideoGen__StatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl650);
            rule__VideoGen__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:343:1: ( ( rule__VideoGen__StatementsAssignment_2 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:344:1: ( rule__VideoGen__StatementsAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:345:1: ( rule__VideoGen__StatementsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:345:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl662);
            	    rule__VideoGen__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__Group__3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:356:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:360:1: ( rule__VideoGen__Group__3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:361:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3695);
            rule__VideoGen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3"


    // $ANTLR start "rule__VideoGen__Group__3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:367:1: rule__VideoGen__Group__3__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:371:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:372:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:372:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:373:1: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__VideoGen__Group__3__Impl723); 
             after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:394:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:398:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:399:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__0762);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__0765);
            rule__Alternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:406:1: rule__Alternative__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:410:1: ( ( 'alternatives' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:411:1: ( 'alternatives' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:411:1: ( 'alternatives' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:412:1: 'alternatives'
            {
             before(grammarAccess.getAlternativeAccess().getAlternativesKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Alternative__Group__0__Impl793); 
             after(grammarAccess.getAlternativeAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0__Impl"


    // $ANTLR start "rule__Alternative__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:425:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:429:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:430:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__1824);
            rule__Alternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__2_in_rule__Alternative__Group__1827);
            rule__Alternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:437:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__NameAssignment_1 ) ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:441:1: ( ( ( rule__Alternative__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:442:1: ( ( rule__Alternative__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:442:1: ( ( rule__Alternative__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:443:1: ( rule__Alternative__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativeAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:444:1: ( rule__Alternative__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:444:2: rule__Alternative__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternative__NameAssignment_1_in_rule__Alternative__Group__1__Impl854);
            rule__Alternative__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:454:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:458:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:459:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_rule__Alternative__Group__2__Impl_in_rule__Alternative__Group__2884);
            rule__Alternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__3_in_rule__Alternative__Group__2887);
            rule__Alternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__2"


    // $ANTLR start "rule__Alternative__Group__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:466:1: rule__Alternative__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:470:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:471:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:471:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:472:1: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Alternative__Group__2__Impl915); 
             after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__2__Impl"


    // $ANTLR start "rule__Alternative__Group__3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:485:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl rule__Alternative__Group__4 ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:489:1: ( rule__Alternative__Group__3__Impl rule__Alternative__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:490:2: rule__Alternative__Group__3__Impl rule__Alternative__Group__4
            {
            pushFollow(FOLLOW_rule__Alternative__Group__3__Impl_in_rule__Alternative__Group__3946);
            rule__Alternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__4_in_rule__Alternative__Group__3949);
            rule__Alternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__3"


    // $ANTLR start "rule__Alternative__Group__3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:497:1: rule__Alternative__Group__3__Impl : ( ( ( rule__Alternative__VideoseqsAssignment_3 ) ) ( ( rule__Alternative__VideoseqsAssignment_3 )* ) ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:501:1: ( ( ( ( rule__Alternative__VideoseqsAssignment_3 ) ) ( ( rule__Alternative__VideoseqsAssignment_3 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:502:1: ( ( ( rule__Alternative__VideoseqsAssignment_3 ) ) ( ( rule__Alternative__VideoseqsAssignment_3 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:502:1: ( ( ( rule__Alternative__VideoseqsAssignment_3 ) ) ( ( rule__Alternative__VideoseqsAssignment_3 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:503:1: ( ( rule__Alternative__VideoseqsAssignment_3 ) ) ( ( rule__Alternative__VideoseqsAssignment_3 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:503:1: ( ( rule__Alternative__VideoseqsAssignment_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:504:1: ( rule__Alternative__VideoseqsAssignment_3 )
            {
             before(grammarAccess.getAlternativeAccess().getVideoseqsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:505:1: ( rule__Alternative__VideoseqsAssignment_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:505:2: rule__Alternative__VideoseqsAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternative__VideoseqsAssignment_3_in_rule__Alternative__Group__3__Impl978);
            rule__Alternative__VideoseqsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getVideoseqsAssignment_3()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:508:1: ( ( rule__Alternative__VideoseqsAssignment_3 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:509:1: ( rule__Alternative__VideoseqsAssignment_3 )*
            {
             before(grammarAccess.getAlternativeAccess().getVideoseqsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:510:1: ( rule__Alternative__VideoseqsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:510:2: rule__Alternative__VideoseqsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternative__VideoseqsAssignment_3_in_rule__Alternative__Group__3__Impl990);
            	    rule__Alternative__VideoseqsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getVideoseqsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__3__Impl"


    // $ANTLR start "rule__Alternative__Group__4"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:521:1: rule__Alternative__Group__4 : rule__Alternative__Group__4__Impl ;
    public final void rule__Alternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:525:1: ( rule__Alternative__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:526:2: rule__Alternative__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternative__Group__4__Impl_in_rule__Alternative__Group__41023);
            rule__Alternative__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__4"


    // $ANTLR start "rule__Alternative__Group__4__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:532:1: rule__Alternative__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:536:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:537:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:537:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:538:1: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Alternative__Group__4__Impl1051); 
             after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:561:1: rule__VideoSeq__Group__0 : rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 ;
    public final void rule__VideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:565:1: ( rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:566:2: rule__VideoSeq__Group__0__Impl rule__VideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01092);
            rule__VideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01095);
            rule__VideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0"


    // $ANTLR start "rule__VideoSeq__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:573:1: rule__VideoSeq__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:577:1: ( ( 'videoseq' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:578:1: ( 'videoseq' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:578:1: ( 'videoseq' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:579:1: 'videoseq'
            {
             before(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__VideoSeq__Group__0__Impl1123); 
             after(grammarAccess.getVideoSeqAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:592:1: rule__VideoSeq__Group__1 : rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 ;
    public final void rule__VideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:596:1: ( rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:597:2: rule__VideoSeq__Group__1__Impl rule__VideoSeq__Group__2
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11154);
            rule__VideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11157);
            rule__VideoSeq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1"


    // $ANTLR start "rule__VideoSeq__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:604:1: rule__VideoSeq__Group__1__Impl : ( ( rule__VideoSeq__NameAssignment_1 ) ) ;
    public final void rule__VideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:608:1: ( ( ( rule__VideoSeq__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:609:1: ( ( rule__VideoSeq__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:609:1: ( ( rule__VideoSeq__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:610:1: ( rule__VideoSeq__NameAssignment_1 )
            {
             before(grammarAccess.getVideoSeqAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:611:1: ( rule__VideoSeq__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:611:2: rule__VideoSeq__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VideoSeq__NameAssignment_1_in_rule__VideoSeq__Group__1__Impl1184);
            rule__VideoSeq__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:621:1: rule__VideoSeq__Group__2 : rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 ;
    public final void rule__VideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:625:1: ( rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:626:2: rule__VideoSeq__Group__2__Impl rule__VideoSeq__Group__3
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21214);
            rule__VideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21217);
            rule__VideoSeq__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2"


    // $ANTLR start "rule__VideoSeq__Group__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:633:1: rule__VideoSeq__Group__2__Impl : ( ( rule__VideoSeq__UrlAssignment_2 ) ) ;
    public final void rule__VideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:637:1: ( ( ( rule__VideoSeq__UrlAssignment_2 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:638:1: ( ( rule__VideoSeq__UrlAssignment_2 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:638:1: ( ( rule__VideoSeq__UrlAssignment_2 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:639:1: ( rule__VideoSeq__UrlAssignment_2 )
            {
             before(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:640:1: ( rule__VideoSeq__UrlAssignment_2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:640:2: rule__VideoSeq__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoSeq__UrlAssignment_2_in_rule__VideoSeq__Group__2__Impl1244);
            rule__VideoSeq__UrlAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getUrlAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__2__Impl"


    // $ANTLR start "rule__VideoSeq__Group__3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:650:1: rule__VideoSeq__Group__3 : rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 ;
    public final void rule__VideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:654:1: ( rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:655:2: rule__VideoSeq__Group__3__Impl rule__VideoSeq__Group__4
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31274);
            rule__VideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31277);
            rule__VideoSeq__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3"


    // $ANTLR start "rule__VideoSeq__Group__3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:662:1: rule__VideoSeq__Group__3__Impl : ( '{' ) ;
    public final void rule__VideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:666:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:667:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:667:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:668:1: '{'
            {
             before(grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__VideoSeq__Group__3__Impl1305); 
             after(grammarAccess.getVideoSeqAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__3__Impl"


    // $ANTLR start "rule__VideoSeq__Group__4"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:681:1: rule__VideoSeq__Group__4 : rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 ;
    public final void rule__VideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:685:1: ( rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:686:2: rule__VideoSeq__Group__4__Impl rule__VideoSeq__Group__5
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41336);
            rule__VideoSeq__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41339);
            rule__VideoSeq__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4"


    // $ANTLR start "rule__VideoSeq__Group__4__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:693:1: rule__VideoSeq__Group__4__Impl : ( ( rule__VideoSeq__Group_4__0 )? ) ;
    public final void rule__VideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:697:1: ( ( ( rule__VideoSeq__Group_4__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:698:1: ( ( rule__VideoSeq__Group_4__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:698:1: ( ( rule__VideoSeq__Group_4__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:699:1: ( rule__VideoSeq__Group_4__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_4()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:700:1: ( rule__VideoSeq__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:700:2: rule__VideoSeq__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_4__0_in_rule__VideoSeq__Group__4__Impl1366);
                    rule__VideoSeq__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__4__Impl"


    // $ANTLR start "rule__VideoSeq__Group__5"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:710:1: rule__VideoSeq__Group__5 : rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6 ;
    public final void rule__VideoSeq__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:714:1: ( rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:715:2: rule__VideoSeq__Group__5__Impl rule__VideoSeq__Group__6
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51397);
            rule__VideoSeq__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__6_in_rule__VideoSeq__Group__51400);
            rule__VideoSeq__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5"


    // $ANTLR start "rule__VideoSeq__Group__5__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:722:1: rule__VideoSeq__Group__5__Impl : ( ( rule__VideoSeq__Group_5__0 )? ) ;
    public final void rule__VideoSeq__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:726:1: ( ( ( rule__VideoSeq__Group_5__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:727:1: ( ( rule__VideoSeq__Group_5__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:727:1: ( ( rule__VideoSeq__Group_5__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:728:1: ( rule__VideoSeq__Group_5__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_5()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:729:1: ( rule__VideoSeq__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:729:2: rule__VideoSeq__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_5__0_in_rule__VideoSeq__Group__5__Impl1427);
                    rule__VideoSeq__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__5__Impl"


    // $ANTLR start "rule__VideoSeq__Group__6"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:739:1: rule__VideoSeq__Group__6 : rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7 ;
    public final void rule__VideoSeq__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:743:1: ( rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:744:2: rule__VideoSeq__Group__6__Impl rule__VideoSeq__Group__7
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__6__Impl_in_rule__VideoSeq__Group__61458);
            rule__VideoSeq__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group__7_in_rule__VideoSeq__Group__61461);
            rule__VideoSeq__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__6"


    // $ANTLR start "rule__VideoSeq__Group__6__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:751:1: rule__VideoSeq__Group__6__Impl : ( ( rule__VideoSeq__Group_6__0 )? ) ;
    public final void rule__VideoSeq__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:755:1: ( ( ( rule__VideoSeq__Group_6__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:756:1: ( ( rule__VideoSeq__Group_6__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:756:1: ( ( rule__VideoSeq__Group_6__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: ( rule__VideoSeq__Group_6__0 )?
            {
             before(grammarAccess.getVideoSeqAccess().getGroup_6()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:758:1: ( rule__VideoSeq__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:758:2: rule__VideoSeq__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__VideoSeq__Group_6__0_in_rule__VideoSeq__Group__6__Impl1488);
                    rule__VideoSeq__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoSeqAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__6__Impl"


    // $ANTLR start "rule__VideoSeq__Group__7"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:768:1: rule__VideoSeq__Group__7 : rule__VideoSeq__Group__7__Impl ;
    public final void rule__VideoSeq__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:772:1: ( rule__VideoSeq__Group__7__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:773:2: rule__VideoSeq__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group__7__Impl_in_rule__VideoSeq__Group__71519);
            rule__VideoSeq__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__7"


    // $ANTLR start "rule__VideoSeq__Group__7__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:779:1: rule__VideoSeq__Group__7__Impl : ( '}' ) ;
    public final void rule__VideoSeq__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:783:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:784:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:784:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:785:1: '}'
            {
             before(grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__VideoSeq__Group__7__Impl1547); 
             after(grammarAccess.getVideoSeqAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group__7__Impl"


    // $ANTLR start "rule__VideoSeq__Group_4__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:814:1: rule__VideoSeq__Group_4__0 : rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1 ;
    public final void rule__VideoSeq__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:818:1: ( rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:819:2: rule__VideoSeq__Group_4__0__Impl rule__VideoSeq__Group_4__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_4__0__Impl_in_rule__VideoSeq__Group_4__01594);
            rule__VideoSeq__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_4__1_in_rule__VideoSeq__Group_4__01597);
            rule__VideoSeq__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__0"


    // $ANTLR start "rule__VideoSeq__Group_4__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:826:1: rule__VideoSeq__Group_4__0__Impl : ( 'length=' ) ;
    public final void rule__VideoSeq__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:830:1: ( ( 'length=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:831:1: ( 'length=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:831:1: ( 'length=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:832:1: 'length='
            {
             before(grammarAccess.getVideoSeqAccess().getLengthKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__VideoSeq__Group_4__0__Impl1625); 
             after(grammarAccess.getVideoSeqAccess().getLengthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_4__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:845:1: rule__VideoSeq__Group_4__1 : rule__VideoSeq__Group_4__1__Impl ;
    public final void rule__VideoSeq__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:849:1: ( rule__VideoSeq__Group_4__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:850:2: rule__VideoSeq__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_4__1__Impl_in_rule__VideoSeq__Group_4__11656);
            rule__VideoSeq__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__1"


    // $ANTLR start "rule__VideoSeq__Group_4__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:856:1: rule__VideoSeq__Group_4__1__Impl : ( ( rule__VideoSeq__LengthAssignment_4_1 ) ) ;
    public final void rule__VideoSeq__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:860:1: ( ( ( rule__VideoSeq__LengthAssignment_4_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: ( ( rule__VideoSeq__LengthAssignment_4_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: ( ( rule__VideoSeq__LengthAssignment_4_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:862:1: ( rule__VideoSeq__LengthAssignment_4_1 )
            {
             before(grammarAccess.getVideoSeqAccess().getLengthAssignment_4_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:863:1: ( rule__VideoSeq__LengthAssignment_4_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:863:2: rule__VideoSeq__LengthAssignment_4_1
            {
            pushFollow(FOLLOW_rule__VideoSeq__LengthAssignment_4_1_in_rule__VideoSeq__Group_4__1__Impl1683);
            rule__VideoSeq__LengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_4__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group_5__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:877:1: rule__VideoSeq__Group_5__0 : rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1 ;
    public final void rule__VideoSeq__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:881:1: ( rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:882:2: rule__VideoSeq__Group_5__0__Impl rule__VideoSeq__Group_5__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_5__0__Impl_in_rule__VideoSeq__Group_5__01717);
            rule__VideoSeq__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_5__1_in_rule__VideoSeq__Group_5__01720);
            rule__VideoSeq__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__0"


    // $ANTLR start "rule__VideoSeq__Group_5__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:889:1: rule__VideoSeq__Group_5__0__Impl : ( 'desc=' ) ;
    public final void rule__VideoSeq__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:893:1: ( ( 'desc=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:1: ( 'desc=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:1: ( 'desc=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:895:1: 'desc='
            {
             before(grammarAccess.getVideoSeqAccess().getDescKeyword_5_0()); 
            match(input,17,FOLLOW_17_in_rule__VideoSeq__Group_5__0__Impl1748); 
             after(grammarAccess.getVideoSeqAccess().getDescKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_5__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:908:1: rule__VideoSeq__Group_5__1 : rule__VideoSeq__Group_5__1__Impl ;
    public final void rule__VideoSeq__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:912:1: ( rule__VideoSeq__Group_5__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:913:2: rule__VideoSeq__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_5__1__Impl_in_rule__VideoSeq__Group_5__11779);
            rule__VideoSeq__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__1"


    // $ANTLR start "rule__VideoSeq__Group_5__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:919:1: rule__VideoSeq__Group_5__1__Impl : ( ( rule__VideoSeq__DescAssignment_5_1 ) ) ;
    public final void rule__VideoSeq__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:923:1: ( ( ( rule__VideoSeq__DescAssignment_5_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:924:1: ( ( rule__VideoSeq__DescAssignment_5_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:924:1: ( ( rule__VideoSeq__DescAssignment_5_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:925:1: ( rule__VideoSeq__DescAssignment_5_1 )
            {
             before(grammarAccess.getVideoSeqAccess().getDescAssignment_5_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:926:1: ( rule__VideoSeq__DescAssignment_5_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:926:2: rule__VideoSeq__DescAssignment_5_1
            {
            pushFollow(FOLLOW_rule__VideoSeq__DescAssignment_5_1_in_rule__VideoSeq__Group_5__1__Impl1806);
            rule__VideoSeq__DescAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getDescAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_5__1__Impl"


    // $ANTLR start "rule__VideoSeq__Group_6__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:940:1: rule__VideoSeq__Group_6__0 : rule__VideoSeq__Group_6__0__Impl rule__VideoSeq__Group_6__1 ;
    public final void rule__VideoSeq__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:944:1: ( rule__VideoSeq__Group_6__0__Impl rule__VideoSeq__Group_6__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:945:2: rule__VideoSeq__Group_6__0__Impl rule__VideoSeq__Group_6__1
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_6__0__Impl_in_rule__VideoSeq__Group_6__01840);
            rule__VideoSeq__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoSeq__Group_6__1_in_rule__VideoSeq__Group_6__01843);
            rule__VideoSeq__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_6__0"


    // $ANTLR start "rule__VideoSeq__Group_6__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:952:1: rule__VideoSeq__Group_6__0__Impl : ( 'prob=' ) ;
    public final void rule__VideoSeq__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:956:1: ( ( 'prob=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:957:1: ( 'prob=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:957:1: ( 'prob=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:958:1: 'prob='
            {
             before(grammarAccess.getVideoSeqAccess().getProbKeyword_6_0()); 
            match(input,18,FOLLOW_18_in_rule__VideoSeq__Group_6__0__Impl1871); 
             after(grammarAccess.getVideoSeqAccess().getProbKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_6__0__Impl"


    // $ANTLR start "rule__VideoSeq__Group_6__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:971:1: rule__VideoSeq__Group_6__1 : rule__VideoSeq__Group_6__1__Impl ;
    public final void rule__VideoSeq__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:975:1: ( rule__VideoSeq__Group_6__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:976:2: rule__VideoSeq__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__VideoSeq__Group_6__1__Impl_in_rule__VideoSeq__Group_6__11902);
            rule__VideoSeq__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_6__1"


    // $ANTLR start "rule__VideoSeq__Group_6__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:982:1: rule__VideoSeq__Group_6__1__Impl : ( ( rule__VideoSeq__ProbAssignment_6_1 ) ) ;
    public final void rule__VideoSeq__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:986:1: ( ( ( rule__VideoSeq__ProbAssignment_6_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:987:1: ( ( rule__VideoSeq__ProbAssignment_6_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:987:1: ( ( rule__VideoSeq__ProbAssignment_6_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:988:1: ( rule__VideoSeq__ProbAssignment_6_1 )
            {
             before(grammarAccess.getVideoSeqAccess().getProbAssignment_6_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:989:1: ( rule__VideoSeq__ProbAssignment_6_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:989:2: rule__VideoSeq__ProbAssignment_6_1
            {
            pushFollow(FOLLOW_rule__VideoSeq__ProbAssignment_6_1_in_rule__VideoSeq__Group_6__1__Impl1929);
            rule__VideoSeq__ProbAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getProbAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Group_6__1__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1003:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1007:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__01963);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__01966);
            rule__MandatoryVideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1015:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1019:1: ( ( 'mandatory' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1020:1: ( 'mandatory' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1020:1: ( 'mandatory' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1021:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__MandatoryVideoSeq__Group__0__Impl1994); 
             after(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1034:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1038:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1039:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__12025);
            rule__MandatoryVideoSeq__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1045:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__VideoseqAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1049:1: ( ( ( rule__MandatoryVideoSeq__VideoseqAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1050:1: ( ( rule__MandatoryVideoSeq__VideoseqAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1050:1: ( ( rule__MandatoryVideoSeq__VideoseqAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1051:1: ( rule__MandatoryVideoSeq__VideoseqAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoseqAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1052:1: ( rule__MandatoryVideoSeq__VideoseqAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1052:2: rule__MandatoryVideoSeq__VideoseqAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryVideoSeq__VideoseqAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl2052);
            rule__MandatoryVideoSeq__VideoseqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getVideoseqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1066:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1070:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1071:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__02086);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__02089);
            rule__OptionalVideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__0"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1078:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:1: ( ( 'optional' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1083:1: ( 'optional' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1083:1: ( 'optional' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1084:1: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__OptionalVideoSeq__Group__0__Impl2117); 
             after(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1097:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1101:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1102:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__12148);
            rule__OptionalVideoSeq__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__1"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1108:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__VideoseqAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1112:1: ( ( ( rule__OptionalVideoSeq__VideoseqAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1113:1: ( ( rule__OptionalVideoSeq__VideoseqAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1113:1: ( ( rule__OptionalVideoSeq__VideoseqAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1114:1: ( rule__OptionalVideoSeq__VideoseqAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoseqAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1115:1: ( rule__OptionalVideoSeq__VideoseqAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1115:2: rule__OptionalVideoSeq__VideoseqAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalVideoSeq__VideoseqAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl2175);
            rule__OptionalVideoSeq__VideoseqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getVideoseqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__StatementsAssignment_2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1130:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1134:1: ( ( ruleStatement ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1135:1: ( ruleStatement )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1135:1: ( ruleStatement )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1136:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_22214);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__StatementsAssignment_2"


    // $ANTLR start "rule__Alternative__NameAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1145:1: rule__Alternative__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternative__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1149:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1150:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1150:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1151:1: RULE_ID
            {
             before(grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternative__NameAssignment_12245); 
             after(grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__NameAssignment_1"


    // $ANTLR start "rule__Alternative__VideoseqsAssignment_3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1160:1: rule__Alternative__VideoseqsAssignment_3 : ( ruleVideoSeq ) ;
    public final void rule__Alternative__VideoseqsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1164:1: ( ( ruleVideoSeq ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1165:1: ( ruleVideoSeq )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1165:1: ( ruleVideoSeq )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1166:1: ruleVideoSeq
            {
             before(grammarAccess.getAlternativeAccess().getVideoseqsVideoSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__Alternative__VideoseqsAssignment_32276);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getVideoseqsVideoSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__VideoseqsAssignment_3"


    // $ANTLR start "rule__VideoSeq__NameAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1175:1: rule__VideoSeq__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoSeq__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1179:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1180:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1180:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1181:1: RULE_ID
            {
             before(grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VideoSeq__NameAssignment_12307); 
             after(grammarAccess.getVideoSeqAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__NameAssignment_1"


    // $ANTLR start "rule__VideoSeq__UrlAssignment_2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1190:1: rule__VideoSeq__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1194:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1195:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1195:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1196:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__UrlAssignment_22338); 
             after(grammarAccess.getVideoSeqAccess().getUrlSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__UrlAssignment_2"


    // $ANTLR start "rule__VideoSeq__LengthAssignment_4_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1205:1: rule__VideoSeq__LengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__VideoSeq__LengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1209:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1210:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1210:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1211:1: RULE_INT
            {
             before(grammarAccess.getVideoSeqAccess().getLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoSeq__LengthAssignment_4_12369); 
             after(grammarAccess.getVideoSeqAccess().getLengthINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__LengthAssignment_4_1"


    // $ANTLR start "rule__VideoSeq__DescAssignment_5_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1220:1: rule__VideoSeq__DescAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__VideoSeq__DescAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1224:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1225:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1225:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1226:1: RULE_STRING
            {
             before(grammarAccess.getVideoSeqAccess().getDescSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VideoSeq__DescAssignment_5_12400); 
             after(grammarAccess.getVideoSeqAccess().getDescSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__DescAssignment_5_1"


    // $ANTLR start "rule__VideoSeq__ProbAssignment_6_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1235:1: rule__VideoSeq__ProbAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__VideoSeq__ProbAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1239:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1240:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1240:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1241:1: RULE_INT
            {
             before(grammarAccess.getVideoSeqAccess().getProbINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VideoSeq__ProbAssignment_6_12431); 
             after(grammarAccess.getVideoSeqAccess().getProbINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__ProbAssignment_6_1"


    // $ANTLR start "rule__MandatoryVideoSeq__VideoseqAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1250:1: rule__MandatoryVideoSeq__VideoseqAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__MandatoryVideoSeq__VideoseqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1254:1: ( ( ruleVideoSeq ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1255:1: ( ruleVideoSeq )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1255:1: ( ruleVideoSeq )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1256:1: ruleVideoSeq
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__MandatoryVideoSeq__VideoseqAssignment_12462);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__VideoseqAssignment_1"


    // $ANTLR start "rule__OptionalVideoSeq__VideoseqAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1265:1: rule__OptionalVideoSeq__VideoseqAssignment_1 : ( ruleVideoSeq ) ;
    public final void rule__OptionalVideoSeq__VideoseqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1269:1: ( ( ruleVideoSeq ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1270:1: ( ruleVideoSeq )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1270:1: ( ruleVideoSeq )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1271:1: ruleVideoSeq
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVideoSeq_in_rule__OptionalVideoSeq__VideoseqAssignment_12493);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqAccess().getVideoseqVideoSeqParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__VideoseqAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0_in_ruleAlternative214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_entryRuleVideoSeq241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoSeq248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0_in_ruleVideoSeq274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_entryRuleMandatoryVideoSeq301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryVideoSeq308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0_in_ruleMandatoryVideoSeq334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_entryRuleOptionalVideoSeq361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalVideoSeq368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0_in_ruleOptionalVideoSeq394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryVideoSeq_in_rule__Statement__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalVideoSeq_in_rule__Statement__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_rule__Statement__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VideoGen__Group__0__Impl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VideoGen__Group__1__Impl587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2618 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl650 = new BitSet(new long[]{0x0000000000184002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl662 = new BitSet(new long[]{0x0000000000184002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGen__Group__3__Impl723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__0762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__0765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Alternative__Group__0__Impl793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__1824 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Alternative__Group__2_in_rule__Alternative__Group__1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__NameAssignment_1_in_rule__Alternative__Group__1__Impl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__2__Impl_in_rule__Alternative__Group__2884 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Alternative__Group__3_in_rule__Alternative__Group__2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Alternative__Group__2__Impl915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__3__Impl_in_rule__Alternative__Group__3946 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Alternative__Group__4_in_rule__Alternative__Group__3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__VideoseqsAssignment_3_in_rule__Alternative__Group__3__Impl978 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Alternative__VideoseqsAssignment_3_in_rule__Alternative__Group__3__Impl990 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__4__Impl_in_rule__Alternative__Group__41023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Alternative__Group__4__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__0__Impl_in_rule__VideoSeq__Group__01092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1_in_rule__VideoSeq__Group__01095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__VideoSeq__Group__0__Impl1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__1__Impl_in_rule__VideoSeq__Group__11154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2_in_rule__VideoSeq__Group__11157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__NameAssignment_1_in_rule__VideoSeq__Group__1__Impl1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__2__Impl_in_rule__VideoSeq__Group__21214 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3_in_rule__VideoSeq__Group__21217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__UrlAssignment_2_in_rule__VideoSeq__Group__2__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__3__Impl_in_rule__VideoSeq__Group__31274 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4_in_rule__VideoSeq__Group__31277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VideoSeq__Group__3__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__4__Impl_in_rule__VideoSeq__Group__41336 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5_in_rule__VideoSeq__Group__41339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__0_in_rule__VideoSeq__Group__4__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__5__Impl_in_rule__VideoSeq__Group__51397 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__6_in_rule__VideoSeq__Group__51400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__0_in_rule__VideoSeq__Group__5__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__6__Impl_in_rule__VideoSeq__Group__61458 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__7_in_rule__VideoSeq__Group__61461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_6__0_in_rule__VideoSeq__Group__6__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group__7__Impl_in_rule__VideoSeq__Group__71519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoSeq__Group__7__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__0__Impl_in_rule__VideoSeq__Group_4__01594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__1_in_rule__VideoSeq__Group_4__01597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__VideoSeq__Group_4__0__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_4__1__Impl_in_rule__VideoSeq__Group_4__11656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__LengthAssignment_4_1_in_rule__VideoSeq__Group_4__1__Impl1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__0__Impl_in_rule__VideoSeq__Group_5__01717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__1_in_rule__VideoSeq__Group_5__01720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__VideoSeq__Group_5__0__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_5__1__Impl_in_rule__VideoSeq__Group_5__11779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__DescAssignment_5_1_in_rule__VideoSeq__Group_5__1__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_6__0__Impl_in_rule__VideoSeq__Group_6__01840 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_6__1_in_rule__VideoSeq__Group_6__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoSeq__Group_6__0__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__Group_6__1__Impl_in_rule__VideoSeq__Group_6__11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoSeq__ProbAssignment_6_1_in_rule__VideoSeq__Group_6__1__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__0__Impl_in_rule__MandatoryVideoSeq__Group__01963 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1_in_rule__MandatoryVideoSeq__Group__01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MandatoryVideoSeq__Group__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__Group__1__Impl_in_rule__MandatoryVideoSeq__Group__12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryVideoSeq__VideoseqAssignment_1_in_rule__MandatoryVideoSeq__Group__1__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__0__Impl_in_rule__OptionalVideoSeq__Group__02086 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1_in_rule__OptionalVideoSeq__Group__02089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OptionalVideoSeq__Group__0__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__Group__1__Impl_in_rule__OptionalVideoSeq__Group__12148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalVideoSeq__VideoseqAssignment_1_in_rule__OptionalVideoSeq__Group__1__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_22214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternative__NameAssignment_12245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__Alternative__VideoseqsAssignment_32276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VideoSeq__NameAssignment_12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__UrlAssignment_22338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoSeq__LengthAssignment_4_12369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VideoSeq__DescAssignment_5_12400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VideoSeq__ProbAssignment_6_12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__MandatoryVideoSeq__VideoseqAssignment_12462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVideoSeq_in_rule__OptionalVideoSeq__VideoseqAssignment_12493 = new BitSet(new long[]{0x0000000000000002L});

}