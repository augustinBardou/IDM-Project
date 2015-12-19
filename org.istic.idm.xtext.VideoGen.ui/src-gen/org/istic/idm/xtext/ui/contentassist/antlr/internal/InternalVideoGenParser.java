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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'{'", "'}'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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


    // $ANTLR start "entryRuleAlternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( ruleAlternatives EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives181);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives188); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__Alternatives__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives214);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleMandatory"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleMandatory EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory241);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory248); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleMandatory : ( ( rule__Mandatory__SequenceAssignment ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__Mandatory__SequenceAssignment ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__Mandatory__SequenceAssignment )
            {
             before(grammarAccess.getMandatoryAccess().getSequenceAssignment()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__Mandatory__SequenceAssignment )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__Mandatory__SequenceAssignment
            {
            pushFollow(FOLLOW_rule__Mandatory__SequenceAssignment_in_ruleMandatory274);
            rule__Mandatory__SequenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getSequenceAssignment()); 

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( ruleOptional EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional301);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional308); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__Optional__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional334);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleSequence"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( ruleSequence EOF )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence361);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence368); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__Sequence__Group__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence394);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:228:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:232:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 15:
            case 19:
                {
                alt1=2;
                }
                break;
            case 16:
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:235:1: ( rule__Statement__Group_0__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:235:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives430);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:240:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:241:1: ( rule__Statement__Group_1__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:241:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives448);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternatives )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( ruleAlternatives )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:246:1: ruleAlternatives
                    {
                     before(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives466);
                    ruleAlternatives();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 

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
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0496);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0499);
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
            match(input,11,FOLLOW_11_in_rule__VideoGen__Group__0__Impl527); 
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
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1558);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1561);
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
            match(input,12,FOLLOW_12_in_rule__VideoGen__Group__1__Impl589); 
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
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2620);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2623);
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
            pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl652);
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

                if ( ((LA2_0>=14 && LA2_0<=16)||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:345:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl664);
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
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3697);
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
            match(input,13,FOLLOW_13_in_rule__VideoGen__Group__3__Impl725); 
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


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:394:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:398:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:399:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0764);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0767);
            rule__Statement__Group_0__1();

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
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:406:1: rule__Statement__Group_0__0__Impl : ( '@Optional' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:410:1: ( ( '@Optional' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:411:1: ( '@Optional' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:411:1: ( '@Optional' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:412:1: '@Optional'
            {
             before(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 
            match(input,14,FOLLOW_14_in_rule__Statement__Group_0__0__Impl795); 
             after(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 

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
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:425:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:429:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:430:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__1826);
            rule__Statement__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:436:1: rule__Statement__Group_0__1__Impl : ( ruleOptional ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:440:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:441:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:441:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:442:1: ruleOptional
            {
             before(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl853);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:457:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:461:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:462:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__0886);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__0889);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:469:1: rule__Statement__Group_1__0__Impl : ( ( '@Mandatory' )? ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:473:1: ( ( ( '@Mandatory' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:474:1: ( ( '@Mandatory' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:474:1: ( ( '@Mandatory' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:475:1: ( '@Mandatory' )?
            {
             before(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:476:1: ( '@Mandatory' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:477:2: '@Mandatory'
                    {
                    match(input,15,FOLLOW_15_in_rule__Statement__Group_1__0__Impl918); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 

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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:488:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:492:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:493:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__1951);
            rule__Statement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:499:1: rule__Statement__Group_1__1__Impl : ( ruleMandatory ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:503:1: ( ( ruleMandatory ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:504:1: ( ruleMandatory )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:504:1: ( ruleMandatory )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:505:1: ruleMandatory
            {
             before(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl978);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:520:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:524:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:525:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01011);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01014);
            rule__Alternatives__Group__1();

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
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:532:1: rule__Alternatives__Group__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:536:1: ( ( 'Alternatives' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:537:1: ( 'Alternatives' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:537:1: ( 'Alternatives' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:538:1: 'Alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Alternatives__Group__0__Impl1042); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 

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
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:551:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:555:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:556:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11073);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11076);
            rule__Alternatives__Group__2();

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
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:563:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:567:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:568:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:568:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:569:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:570:1: ( rule__Alternatives__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:570:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1103);
            rule__Alternatives__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:580:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:584:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:585:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21133);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21136);
            rule__Alternatives__Group__3();

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
    // $ANTLR end "rule__Alternatives__Group__2"


    // $ANTLR start "rule__Alternatives__Group__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:592:1: rule__Alternatives__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:596:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:597:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:597:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:598:1: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Alternatives__Group__2__Impl1164); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Alternatives__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group__3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:611:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:615:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:616:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31195);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31198);
            rule__Alternatives__Group__4();

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
    // $ANTLR end "rule__Alternatives__Group__3"


    // $ANTLR start "rule__Alternatives__Group__3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:623:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:627:1: ( ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:628:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:628:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:629:1: ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:629:1: ( ( rule__Alternatives__OptionsAssignment_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:630:1: ( rule__Alternatives__OptionsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:631:1: ( rule__Alternatives__OptionsAssignment_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:631:2: rule__Alternatives__OptionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1227);
            rule__Alternatives__OptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:634:1: ( ( rule__Alternatives__OptionsAssignment_3 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:635:1: ( rule__Alternatives__OptionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:636:1: ( rule__Alternatives__OptionsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:636:2: rule__Alternatives__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1239);
            	    rule__Alternatives__OptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

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
    // $ANTLR end "rule__Alternatives__Group__3__Impl"


    // $ANTLR start "rule__Alternatives__Group__4"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:647:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:651:1: ( rule__Alternatives__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:652:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41272);
            rule__Alternatives__Group__4__Impl();

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
    // $ANTLR end "rule__Alternatives__Group__4"


    // $ANTLR start "rule__Alternatives__Group__4__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:658:1: rule__Alternatives__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:662:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:663:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:663:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:664:1: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Alternatives__Group__4__Impl1300); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Alternatives__Group__4__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:687:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:691:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:692:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01341);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01344);
            rule__Optional__Group__1();

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
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:699:1: rule__Optional__Group__0__Impl : ( ( rule__Optional__Group_0__0 )? ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:703:1: ( ( ( rule__Optional__Group_0__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:704:1: ( ( rule__Optional__Group_0__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:704:1: ( ( rule__Optional__Group_0__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:705:1: ( rule__Optional__Group_0__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:706:1: ( rule__Optional__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:706:2: rule__Optional__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1371);
                    rule__Optional__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:716:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:720:1: ( rule__Optional__Group__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:721:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11402);
            rule__Optional__Group__1__Impl();

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
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:727:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__SequenceAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:731:1: ( ( ( rule__Optional__SequenceAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:732:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:732:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:733:1: ( rule__Optional__SequenceAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:734:1: ( rule__Optional__SequenceAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:734:2: rule__Optional__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1429);
            rule__Optional__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 

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
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group_0__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:748:1: rule__Optional__Group_0__0 : rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 ;
    public final void rule__Optional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:752:1: ( rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:753:2: rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01463);
            rule__Optional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01466);
            rule__Optional__Group_0__1();

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
    // $ANTLR end "rule__Optional__Group_0__0"


    // $ANTLR start "rule__Optional__Group_0__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:760:1: rule__Optional__Group_0__0__Impl : ( '@Probability(' ) ;
    public final void rule__Optional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:764:1: ( ( '@Probability(' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:765:1: ( '@Probability(' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:765:1: ( '@Probability(' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:766:1: '@Probability('
            {
             before(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__Optional__Group_0__0__Impl1494); 
             after(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 

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
    // $ANTLR end "rule__Optional__Group_0__0__Impl"


    // $ANTLR start "rule__Optional__Group_0__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:779:1: rule__Optional__Group_0__1 : rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 ;
    public final void rule__Optional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:783:1: ( rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:784:2: rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11525);
            rule__Optional__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11528);
            rule__Optional__Group_0__2();

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
    // $ANTLR end "rule__Optional__Group_0__1"


    // $ANTLR start "rule__Optional__Group_0__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:791:1: rule__Optional__Group_0__1__Impl : ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) ;
    public final void rule__Optional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:795:1: ( ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:796:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:796:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:797:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            {
             before(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:798:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:798:2: rule__Optional__ProbabilityAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1555);
            rule__Optional__ProbabilityAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 

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
    // $ANTLR end "rule__Optional__Group_0__1__Impl"


    // $ANTLR start "rule__Optional__Group_0__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:808:1: rule__Optional__Group_0__2 : rule__Optional__Group_0__2__Impl ;
    public final void rule__Optional__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:812:1: ( rule__Optional__Group_0__2__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:813:2: rule__Optional__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21585);
            rule__Optional__Group_0__2__Impl();

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
    // $ANTLR end "rule__Optional__Group_0__2"


    // $ANTLR start "rule__Optional__Group_0__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:819:1: rule__Optional__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Optional__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:823:1: ( ( ')' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:824:1: ( ')' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:824:1: ( ')' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:825:1: ')'
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__Optional__Group_0__2__Impl1613); 
             after(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Optional__Group_0__2__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:844:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:848:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:849:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01650);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01653);
            rule__Sequence__Group__1();

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
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:856:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:860:1: ( ( 'Sequence' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: ( 'Sequence' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: ( 'Sequence' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:862:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__0__Impl1681); 
             after(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 

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
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:875:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:879:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:880:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11712);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11715);
            rule__Sequence__Group__2();

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
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:887:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:891:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:892:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:892:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:893:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:1: ( rule__Sequence__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1742);
            rule__Sequence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:904:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:908:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:909:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21772);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21775);
            rule__Sequence__Group__3();

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
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:916:1: rule__Sequence__Group__2__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:920:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:921:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:921:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:922:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Sequence__Group__2__Impl1803); 
             after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:935:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:939:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:940:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31834);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31837);
            rule__Sequence__Group__4();

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
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:947:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__UnorderedGroup_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:951:1: ( ( ( rule__Sequence__UnorderedGroup_3 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:952:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:952:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:953:1: ( rule__Sequence__UnorderedGroup_3 )
            {
             before(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:954:1: ( rule__Sequence__UnorderedGroup_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:954:2: rule__Sequence__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl1864);
            rule__Sequence__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:964:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:968:1: ( rule__Sequence__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:969:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__41894);
            rule__Sequence__Group__4__Impl();

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
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:975:1: rule__Sequence__Group__4__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:979:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:980:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:980:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:981:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Sequence__Group__4__Impl1922); 
             after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1004:1: rule__Sequence__Group_3_0__0 : rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 ;
    public final void rule__Sequence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:1: ( rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1009:2: rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__01963);
            rule__Sequence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__01966);
            rule__Sequence__Group_3_0__1();

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
    // $ANTLR end "rule__Sequence__Group_3_0__0"


    // $ANTLR start "rule__Sequence__Group_3_0__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1016:1: rule__Sequence__Group_3_0__0__Impl : ( ( rule__Sequence__Group_3_0_0__0 ) ) ;
    public final void rule__Sequence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1020:1: ( ( ( rule__Sequence__Group_3_0_0__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1021:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1021:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1022:1: ( rule__Sequence__Group_3_0_0__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1023:1: ( rule__Sequence__Group_3_0_0__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1023:2: rule__Sequence__Group_3_0_0__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl1993);
            rule__Sequence__Group_3_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1033:1: rule__Sequence__Group_3_0__1 : rule__Sequence__Group_3_0__1__Impl ;
    public final void rule__Sequence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1037:1: ( rule__Sequence__Group_3_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1038:2: rule__Sequence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12023);
            rule__Sequence__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group_3_0__1"


    // $ANTLR start "rule__Sequence__Group_3_0__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1044:1: rule__Sequence__Group_3_0__1__Impl : ( ( rule__Sequence__Group_3_0_1__0 )? ) ;
    public final void rule__Sequence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1048:1: ( ( ( rule__Sequence__Group_3_0_1__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1049:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1049:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1050:1: ( rule__Sequence__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1051:1: ( rule__Sequence__Group_3_0_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1051:2: rule__Sequence__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2050);
                    rule__Sequence__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_0__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1065:1: rule__Sequence__Group_3_0_0__0 : rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 ;
    public final void rule__Sequence__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1069:1: ( rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1070:2: rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02085);
            rule__Sequence__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02088);
            rule__Sequence__Group_3_0_0__1();

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
    // $ANTLR end "rule__Sequence__Group_3_0_0__0"


    // $ANTLR start "rule__Sequence__Group_3_0_0__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1077:1: rule__Sequence__Group_3_0_0__0__Impl : ( ( 'url=' )? ) ;
    public final void rule__Sequence__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1081:1: ( ( ( 'url=' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:1: ( ( 'url=' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:1: ( ( 'url=' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1083:1: ( 'url=' )?
            {
             before(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1084:1: ( 'url=' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1085:2: 'url='
                    {
                    match(input,20,FOLLOW_20_in_rule__Sequence__Group_3_0_0__0__Impl2117); 

                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_0__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1096:1: rule__Sequence__Group_3_0_0__1 : rule__Sequence__Group_3_0_0__1__Impl ;
    public final void rule__Sequence__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1100:1: ( rule__Sequence__Group_3_0_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1101:2: rule__Sequence__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12150);
            rule__Sequence__Group_3_0_0__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group_3_0_0__1"


    // $ANTLR start "rule__Sequence__Group_3_0_0__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1107:1: rule__Sequence__Group_3_0_0__1__Impl : ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) ;
    public final void rule__Sequence__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1111:1: ( ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1112:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1112:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1113:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            {
             before(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1114:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1114:2: rule__Sequence__UrlAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2177);
            rule__Sequence__UrlAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_1__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1128:1: rule__Sequence__Group_3_0_1__0 : rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 ;
    public final void rule__Sequence__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1132:1: ( rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1133:2: rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02211);
            rule__Sequence__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02214);
            rule__Sequence__Group_3_0_1__1();

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
    // $ANTLR end "rule__Sequence__Group_3_0_1__0"


    // $ANTLR start "rule__Sequence__Group_3_0_1__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1140:1: rule__Sequence__Group_3_0_1__0__Impl : ( 'description=' ) ;
    public final void rule__Sequence__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1144:1: ( ( 'description=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1145:1: ( 'description=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1145:1: ( 'description=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1146:1: 'description='
            {
             before(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 
            match(input,21,FOLLOW_21_in_rule__Sequence__Group_3_0_1__0__Impl2242); 
             after(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_1__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1159:1: rule__Sequence__Group_3_0_1__1 : rule__Sequence__Group_3_0_1__1__Impl ;
    public final void rule__Sequence__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1163:1: ( rule__Sequence__Group_3_0_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1164:2: rule__Sequence__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12273);
            rule__Sequence__Group_3_0_1__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group_3_0_1__1"


    // $ANTLR start "rule__Sequence__Group_3_0_1__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1170:1: rule__Sequence__Group_3_0_1__1__Impl : ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) ;
    public final void rule__Sequence__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1174:1: ( ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1175:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1175:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1176:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1177:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1177:2: rule__Sequence__DescriptionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2300);
            rule__Sequence__DescriptionAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 

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
    // $ANTLR end "rule__Sequence__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_1__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1191:1: rule__Sequence__Group_3_1__0 : rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 ;
    public final void rule__Sequence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1195:1: ( rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1196:2: rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02334);
            rule__Sequence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02337);
            rule__Sequence__Group_3_1__1();

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
    // $ANTLR end "rule__Sequence__Group_3_1__0"


    // $ANTLR start "rule__Sequence__Group_3_1__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1203:1: rule__Sequence__Group_3_1__0__Impl : ( 'length=' ) ;
    public final void rule__Sequence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1207:1: ( ( 'length=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1208:1: ( 'length=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1208:1: ( 'length=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1209:1: 'length='
            {
             before(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Sequence__Group_3_1__0__Impl2365); 
             after(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Sequence__Group_3_1__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_1__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1222:1: rule__Sequence__Group_3_1__1 : rule__Sequence__Group_3_1__1__Impl ;
    public final void rule__Sequence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1226:1: ( rule__Sequence__Group_3_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1227:2: rule__Sequence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12396);
            rule__Sequence__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group_3_1__1"


    // $ANTLR start "rule__Sequence__Group_3_1__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1233:1: rule__Sequence__Group_3_1__1__Impl : ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) ;
    public final void rule__Sequence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1237:1: ( ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1238:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1238:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1239:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1240:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1240:2: rule__Sequence__LengthAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2423);
            rule__Sequence__LengthAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Sequence__Group_3_1__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_2__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1254:1: rule__Sequence__Group_3_2__0 : rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 ;
    public final void rule__Sequence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1258:1: ( rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1259:2: rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02457);
            rule__Sequence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02460);
            rule__Sequence__Group_3_2__1();

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
    // $ANTLR end "rule__Sequence__Group_3_2__0"


    // $ANTLR start "rule__Sequence__Group_3_2__0__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1266:1: rule__Sequence__Group_3_2__0__Impl : ( 'mimetype=' ) ;
    public final void rule__Sequence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1270:1: ( ( 'mimetype=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1271:1: ( 'mimetype=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1271:1: ( 'mimetype=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1272:1: 'mimetype='
            {
             before(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Sequence__Group_3_2__0__Impl2488); 
             after(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Sequence__Group_3_2__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_2__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1285:1: rule__Sequence__Group_3_2__1 : rule__Sequence__Group_3_2__1__Impl ;
    public final void rule__Sequence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1289:1: ( rule__Sequence__Group_3_2__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1290:2: rule__Sequence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12519);
            rule__Sequence__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Sequence__Group_3_2__1"


    // $ANTLR start "rule__Sequence__Group_3_2__1__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1296:1: rule__Sequence__Group_3_2__1__Impl : ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) ;
    public final void rule__Sequence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1300:1: ( ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1301:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1301:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1302:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1303:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1303:2: rule__Sequence__MimetypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2546);
            rule__Sequence__MimetypeAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Sequence__Group_3_2__1__Impl"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1318:1: rule__Sequence__UnorderedGroup_3 : rule__Sequence__UnorderedGroup_3__0 {...}?;
    public final void rule__Sequence__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1323:1: ( rule__Sequence__UnorderedGroup_3__0 {...}?)
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1324:2: rule__Sequence__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32581);
            rule__Sequence__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__Impl"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1335:1: rule__Sequence__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Sequence__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1340:1: ( ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1341:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1341:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||LA8_0==20) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt8=2;
            }
            else if ( LA8_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt8=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1343:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1343:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:5: {...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:105: ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1345:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1351:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1353:7: ( rule__Sequence__Group_3_0__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1354:7: ( rule__Sequence__Group_3_0__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1354:8: rule__Sequence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2670);
                    rule__Sequence__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1360:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1360:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1361:5: {...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1361:105: ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1362:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1368:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1370:7: ( rule__Sequence__Group_3_1__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1371:7: ( rule__Sequence__Group_3_1__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1371:8: rule__Sequence__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2761);
                    rule__Sequence__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1377:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1377:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1378:5: {...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1378:105: ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1379:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1385:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1387:7: ( rule__Sequence__Group_3_2__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_2()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1388:7: ( rule__Sequence__Group_3_2__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1388:8: rule__Sequence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl2852);
                    rule__Sequence__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1403:1: rule__Sequence__UnorderedGroup_3__0 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? ;
    public final void rule__Sequence__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1407:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1408:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__02911);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1409:2: ( rule__Sequence__UnorderedGroup_3__1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==20) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1409:2: rule__Sequence__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__02914);
                    rule__Sequence__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__0"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1416:1: rule__Sequence__UnorderedGroup_3__1 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? ;
    public final void rule__Sequence__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1420:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1421:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__12939);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1422:2: ( rule__Sequence__UnorderedGroup_3__2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==20) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1422:2: rule__Sequence__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__12942);
                    rule__Sequence__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__1"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1429:1: rule__Sequence__UnorderedGroup_3__2 : rule__Sequence__UnorderedGroup_3__Impl ;
    public final void rule__Sequence__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1433:1: ( rule__Sequence__UnorderedGroup_3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1434:2: rule__Sequence__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__22967);
            rule__Sequence__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__2"


    // $ANTLR start "rule__VideoGen__StatementsAssignment_2"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1447:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1451:1: ( ( ruleStatement ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1452:1: ( ruleStatement )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1452:1: ( ruleStatement )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1453:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23001);
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


    // $ANTLR start "rule__Alternatives__NameAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1462:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1466:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1467:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1467:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1468:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13032); 
             after(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Alternatives__NameAssignment_1"


    // $ANTLR start "rule__Alternatives__OptionsAssignment_3"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1477:1: rule__Alternatives__OptionsAssignment_3 : ( ruleOptional ) ;
    public final void rule__Alternatives__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1481:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1483:1: ruleOptional
            {
             before(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33063);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Alternatives__OptionsAssignment_3"


    // $ANTLR start "rule__Mandatory__SequenceAssignment"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1492:1: rule__Mandatory__SequenceAssignment : ( ruleSequence ) ;
    public final void rule__Mandatory__SequenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1496:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1497:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1497:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1498:1: ruleSequence
            {
             before(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3094);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 

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
    // $ANTLR end "rule__Mandatory__SequenceAssignment"


    // $ANTLR start "rule__Optional__ProbabilityAssignment_0_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1507:1: rule__Optional__ProbabilityAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Optional__ProbabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1511:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1512:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1512:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1513:1: RULE_INT
            {
             before(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13125); 
             after(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Optional__ProbabilityAssignment_0_1"


    // $ANTLR start "rule__Optional__SequenceAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1522:1: rule__Optional__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Optional__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1526:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1527:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1527:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1528:1: ruleSequence
            {
             before(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13156);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Optional__SequenceAssignment_1"


    // $ANTLR start "rule__Sequence__NameAssignment_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1537:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1541:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1542:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1542:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1543:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13187); 
             after(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sequence__NameAssignment_1"


    // $ANTLR start "rule__Sequence__UrlAssignment_3_0_0_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1552:1: rule__Sequence__UrlAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__UrlAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1556:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1557:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1557:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1558:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13218); 
             after(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 

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
    // $ANTLR end "rule__Sequence__UrlAssignment_3_0_0_1"


    // $ANTLR start "rule__Sequence__DescriptionAssignment_3_0_1_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1567:1: rule__Sequence__DescriptionAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__DescriptionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1571:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1572:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1572:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1573:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13249); 
             after(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 

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
    // $ANTLR end "rule__Sequence__DescriptionAssignment_3_0_1_1"


    // $ANTLR start "rule__Sequence__LengthAssignment_3_1_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1582:1: rule__Sequence__LengthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Sequence__LengthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1586:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1587:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1587:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1588:1: RULE_INT
            {
             before(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13280); 
             after(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Sequence__LengthAssignment_3_1_1"


    // $ANTLR start "rule__Sequence__MimetypeAssignment_3_2_1"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1597:1: rule__Sequence__MimetypeAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__MimetypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1601:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1602:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1602:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1603:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getMimetypeSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__MimetypeAssignment_3_2_13311); 
             after(grammarAccess.getSequenceAccess().getMimetypeSTRINGTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Sequence__MimetypeAssignment_3_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SequenceAssignment_in_ruleMandatory274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0496 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VideoGen__Group__0__Impl527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1558 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VideoGen__Group__1__Impl589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl652 = new BitSet(new long[]{0x000000000009C002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl664 = new BitSet(new long[]{0x000000000009C002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__VideoGen__Group__3__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0764 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statement__Group_0__0__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__0886 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__0889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Statement__Group_1__0__Impl918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Alternatives__Group__0__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11073 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21133 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Alternatives__Group__2__Impl1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31195 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1227 = new BitSet(new long[]{0x00000000000A8002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1239 = new BitSet(new long[]{0x00000000000A8002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Alternatives__Group__4__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01341 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01463 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Optional__Group_0__0__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11525 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Optional__Group_0__2__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__0__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11712 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21772 = new BitSet(new long[]{0x0000000000D00040L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sequence__Group__2__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__41894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sequence__Group__4__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__01963 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02085 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group_3_0_0__0__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Sequence__Group_3_0_1__0__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Sequence__Group_3_1__0__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Sequence__Group_3_2__0__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__02911 = new BitSet(new long[]{0x0000000000D00042L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__12939 = new BitSet(new long[]{0x0000000000D00042L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__22967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__MimetypeAssignment_3_2_13311 = new BitSet(new long[]{0x0000000000000002L});

}
