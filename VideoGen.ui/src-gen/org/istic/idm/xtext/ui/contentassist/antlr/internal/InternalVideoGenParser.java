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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MP4'", "'FLV'", "'MPEGTS'", "'MPEG'", "'WEBM'", "'WMV'", "'AVI'", "'VideoGen'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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


    // $ANTLR start "ruleMimetypes_Enum"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:229:1: ruleMimetypes_Enum : ( ( rule__Mimetypes_Enum__Alternatives ) ) ;
    public final void ruleMimetypes_Enum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ( ( rule__Mimetypes_Enum__Alternatives ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:235:1: ( rule__Mimetypes_Enum__Alternatives )
            {
             before(grammarAccess.getMimetypes_EnumAccess().getAlternatives()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:236:1: ( rule__Mimetypes_Enum__Alternatives )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:236:2: rule__Mimetypes_Enum__Alternatives
            {
            pushFollow(FOLLOW_rule__Mimetypes_Enum__Alternatives_in_ruleMimetypes_Enum431);
            rule__Mimetypes_Enum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMimetypes_EnumAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMimetypes_Enum"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:247:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:251:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 22:
            case 26:
                {
                alt1=2;
                }
                break;
            case 23:
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:253:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:254:1: ( rule__Statement__Group_0__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:254:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives466);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:259:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:260:1: ( rule__Statement__Group_1__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:260:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives484);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:264:6: ( ruleAlternatives )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:264:6: ( ruleAlternatives )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:265:1: ruleAlternatives
                    {
                     before(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives502);
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


    // $ANTLR start "rule__Mimetypes_Enum__Alternatives"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: rule__Mimetypes_Enum__Alternatives : ( ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) );
    public final void rule__Mimetypes_Enum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:279:1: ( ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:280:1: ( ( 'MP4' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:280:1: ( ( 'MP4' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:281:1: ( 'MP4' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:282:1: ( 'MP4' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:282:3: 'MP4'
                    {
                    match(input,13,FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives535); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:287:6: ( ( 'FLV' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:287:6: ( ( 'FLV' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:288:1: ( 'FLV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:289:1: ( 'FLV' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:289:3: 'FLV'
                    {
                    match(input,14,FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives556); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:294:6: ( ( 'MPEGTS' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:294:6: ( ( 'MPEGTS' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:295:1: ( 'MPEGTS' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_2()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:296:1: ( 'MPEGTS' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:296:3: 'MPEGTS'
                    {
                    match(input,15,FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives577); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:301:6: ( ( 'MPEG' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:301:6: ( ( 'MPEG' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:302:1: ( 'MPEG' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_3()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:303:1: ( 'MPEG' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:303:3: 'MPEG'
                    {
                    match(input,16,FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives598); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:308:6: ( ( 'WEBM' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:308:6: ( ( 'WEBM' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:309:1: ( 'WEBM' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_4()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:310:1: ( 'WEBM' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:310:3: 'WEBM'
                    {
                    match(input,17,FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives619); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:315:6: ( ( 'WMV' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:315:6: ( ( 'WMV' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:316:1: ( 'WMV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_5()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:317:1: ( 'WMV' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:317:3: 'WMV'
                    {
                    match(input,18,FOLLOW_18_in_rule__Mimetypes_Enum__Alternatives640); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:322:6: ( ( 'AVI' ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:322:6: ( ( 'AVI' ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:323:1: ( 'AVI' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_6()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:324:1: ( 'AVI' )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:324:3: 'AVI'
                    {
                    match(input,19,FOLLOW_19_in_rule__Mimetypes_Enum__Alternatives661); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__Mimetypes_Enum__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:336:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:340:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:341:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0694);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0697);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:348:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:352:1: ( ( 'VideoGen' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:353:1: ( 'VideoGen' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:353:1: ( 'VideoGen' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:354:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__VideoGen__Group__0__Impl725); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:367:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:371:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:372:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1756);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1759);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:379:1: rule__VideoGen__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:383:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:384:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:384:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:385:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGen__Group__1__Impl786); 
             after(grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:396:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:400:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:401:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2815);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2818);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:408:1: rule__VideoGen__Group__2__Impl : ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:412:1: ( ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:413:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:413:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:414:1: ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:414:1: ( ( rule__VideoGen__StatementsAssignment_2 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:415:1: ( rule__VideoGen__StatementsAssignment_2 )
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:416:1: ( rule__VideoGen__StatementsAssignment_2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:416:2: rule__VideoGen__StatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl847);
            rule__VideoGen__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:419:1: ( ( rule__VideoGen__StatementsAssignment_2 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:420:1: ( rule__VideoGen__StatementsAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:421:1: ( rule__VideoGen__StatementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=21 && LA3_0<=23)||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:421:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl859);
            	    rule__VideoGen__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:432:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:436:1: ( rule__VideoGen__Group__3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:437:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3892);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:443:1: rule__VideoGen__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:447:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:448:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:448:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:449:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGen__Group__3__Impl919); 
             after(grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:468:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:472:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:473:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0956);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0959);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:480:1: rule__Statement__Group_0__0__Impl : ( '@Optional' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:484:1: ( ( '@Optional' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:485:1: ( '@Optional' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:485:1: ( '@Optional' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:486:1: '@Optional'
            {
             before(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group_0__0__Impl987); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:499:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:503:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:504:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11018);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:510:1: rule__Statement__Group_0__1__Impl : ( ruleOptional ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:514:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:515:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:515:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:516:1: ruleOptional
            {
             before(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1045);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:531:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:535:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:536:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01078);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01081);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:543:1: rule__Statement__Group_1__0__Impl : ( ( '@Mandatory' )? ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:547:1: ( ( ( '@Mandatory' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:548:1: ( ( '@Mandatory' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:548:1: ( ( '@Mandatory' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:549:1: ( '@Mandatory' )?
            {
             before(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:550:1: ( '@Mandatory' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:551:2: '@Mandatory'
                    {
                    match(input,22,FOLLOW_22_in_rule__Statement__Group_1__0__Impl1110); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:562:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:566:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:567:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11143);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:573:1: rule__Statement__Group_1__1__Impl : ( ruleMandatory ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:577:1: ( ( ruleMandatory ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:578:1: ( ruleMandatory )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:578:1: ( ruleMandatory )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:579:1: ruleMandatory
            {
             before(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1170);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:594:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:598:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:599:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01203);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01206);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:606:1: rule__Alternatives__Group__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:610:1: ( ( 'Alternatives' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:611:1: ( 'Alternatives' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:611:1: ( 'Alternatives' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:612:1: 'Alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Alternatives__Group__0__Impl1234); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:625:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:629:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:630:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11265);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11268);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:637:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:641:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:642:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:642:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:643:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:644:1: ( rule__Alternatives__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:644:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1295);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:654:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:658:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:659:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21325);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21328);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:666:1: rule__Alternatives__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:670:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:671:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:671:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:672:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Alternatives__Group__2__Impl1355); 
             after(grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:683:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:687:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:688:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31384);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31387);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:695:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:699:1: ( ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:700:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:700:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:701:1: ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:701:1: ( ( rule__Alternatives__OptionsAssignment_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:702:1: ( rule__Alternatives__OptionsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:703:1: ( rule__Alternatives__OptionsAssignment_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:703:2: rule__Alternatives__OptionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1416);
            rule__Alternatives__OptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:706:1: ( ( rule__Alternatives__OptionsAssignment_3 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: ( rule__Alternatives__OptionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:708:1: ( rule__Alternatives__OptionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:708:2: rule__Alternatives__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1428);
            	    rule__Alternatives__OptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:719:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:723:1: ( rule__Alternatives__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:724:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41461);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:730:1: rule__Alternatives__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:734:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:735:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:735:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:736:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Alternatives__Group__4__Impl1488); 
             after(grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:761:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:762:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01527);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01530);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:769:1: rule__Optional__Group__0__Impl : ( ( rule__Optional__Group_0__0 )? ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:773:1: ( ( ( rule__Optional__Group_0__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:774:1: ( ( rule__Optional__Group_0__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:774:1: ( ( rule__Optional__Group_0__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:775:1: ( rule__Optional__Group_0__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:776:1: ( rule__Optional__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:776:2: rule__Optional__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1557);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:786:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:790:1: ( rule__Optional__Group__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:791:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11588);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:797:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__SequenceAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:801:1: ( ( ( rule__Optional__SequenceAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:802:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:802:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:803:1: ( rule__Optional__SequenceAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:804:1: ( rule__Optional__SequenceAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:804:2: rule__Optional__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1615);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:818:1: rule__Optional__Group_0__0 : rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 ;
    public final void rule__Optional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:822:1: ( rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:823:2: rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01649);
            rule__Optional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01652);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:830:1: rule__Optional__Group_0__0__Impl : ( '@Probability(' ) ;
    public final void rule__Optional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:834:1: ( ( '@Probability(' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:835:1: ( '@Probability(' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:835:1: ( '@Probability(' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:836:1: '@Probability('
            {
             before(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Optional__Group_0__0__Impl1680); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:849:1: rule__Optional__Group_0__1 : rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 ;
    public final void rule__Optional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:853:1: ( rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:854:2: rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11711);
            rule__Optional__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11714);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: rule__Optional__Group_0__1__Impl : ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) ;
    public final void rule__Optional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:865:1: ( ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:866:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:866:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:867:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            {
             before(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:868:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:868:2: rule__Optional__ProbabilityAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1741);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:878:1: rule__Optional__Group_0__2 : rule__Optional__Group_0__2__Impl ;
    public final void rule__Optional__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:882:1: ( rule__Optional__Group_0__2__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:883:2: rule__Optional__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21771);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:889:1: rule__Optional__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Optional__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:893:1: ( ( ')' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:1: ( ')' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:894:1: ( ')' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:895:1: ')'
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__Optional__Group_0__2__Impl1799); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:914:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:918:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:919:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01836);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01839);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:926:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:930:1: ( ( 'Sequence' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:931:1: ( 'Sequence' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:931:1: ( 'Sequence' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:932:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Sequence__Group__0__Impl1867); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:945:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:949:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:950:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11898);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11901);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:957:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:961:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:962:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:962:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:963:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:964:1: ( rule__Sequence__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:964:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1928);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:974:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:978:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:979:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21958);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21961);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:986:1: rule__Sequence__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:990:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:991:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:991:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:992:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Sequence__Group__2__Impl1988); 
             after(grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1003:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1007:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1008:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32017);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32020);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1015:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__UnorderedGroup_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1019:1: ( ( ( rule__Sequence__UnorderedGroup_3 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1020:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1020:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1021:1: ( rule__Sequence__UnorderedGroup_3 )
            {
             before(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1022:1: ( rule__Sequence__UnorderedGroup_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1022:2: rule__Sequence__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2047);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1032:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1036:1: ( rule__Sequence__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1037:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42077);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1043:1: rule__Sequence__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1047:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1048:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1048:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1049:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Sequence__Group__4__Impl2104); 
             after(grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1070:1: rule__Sequence__Group_3_0__0 : rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 ;
    public final void rule__Sequence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1074:1: ( rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1075:2: rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02143);
            rule__Sequence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02146);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:1: rule__Sequence__Group_3_0__0__Impl : ( ( rule__Sequence__Group_3_0_0__0 ) ) ;
    public final void rule__Sequence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1086:1: ( ( ( rule__Sequence__Group_3_0_0__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1087:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1087:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1088:1: ( rule__Sequence__Group_3_0_0__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1089:1: ( rule__Sequence__Group_3_0_0__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1089:2: rule__Sequence__Group_3_0_0__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2173);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1099:1: rule__Sequence__Group_3_0__1 : rule__Sequence__Group_3_0__1__Impl ;
    public final void rule__Sequence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1103:1: ( rule__Sequence__Group_3_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1104:2: rule__Sequence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12203);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1110:1: rule__Sequence__Group_3_0__1__Impl : ( ( rule__Sequence__Group_3_0_1__0 )? ) ;
    public final void rule__Sequence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1114:1: ( ( ( rule__Sequence__Group_3_0_1__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1115:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1115:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1116:1: ( rule__Sequence__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1117:1: ( rule__Sequence__Group_3_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1117:2: rule__Sequence__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2230);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1131:1: rule__Sequence__Group_3_0_0__0 : rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 ;
    public final void rule__Sequence__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1135:1: ( rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1136:2: rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02265);
            rule__Sequence__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02268);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1143:1: rule__Sequence__Group_3_0_0__0__Impl : ( ( 'url=' )? ) ;
    public final void rule__Sequence__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1147:1: ( ( ( 'url=' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1148:1: ( ( 'url=' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1148:1: ( ( 'url=' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1149:1: ( 'url=' )?
            {
             before(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1150:1: ( 'url=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1151:2: 'url='
                    {
                    match(input,27,FOLLOW_27_in_rule__Sequence__Group_3_0_0__0__Impl2297); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1162:1: rule__Sequence__Group_3_0_0__1 : rule__Sequence__Group_3_0_0__1__Impl ;
    public final void rule__Sequence__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1166:1: ( rule__Sequence__Group_3_0_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1167:2: rule__Sequence__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12330);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1173:1: rule__Sequence__Group_3_0_0__1__Impl : ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) ;
    public final void rule__Sequence__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1177:1: ( ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1178:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1178:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1179:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            {
             before(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1180:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1180:2: rule__Sequence__UrlAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2357);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1194:1: rule__Sequence__Group_3_0_1__0 : rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 ;
    public final void rule__Sequence__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1198:1: ( rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1199:2: rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02391);
            rule__Sequence__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02394);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1206:1: rule__Sequence__Group_3_0_1__0__Impl : ( 'description=' ) ;
    public final void rule__Sequence__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1210:1: ( ( 'description=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1211:1: ( 'description=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1211:1: ( 'description=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1212:1: 'description='
            {
             before(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Sequence__Group_3_0_1__0__Impl2422); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1225:1: rule__Sequence__Group_3_0_1__1 : rule__Sequence__Group_3_0_1__1__Impl ;
    public final void rule__Sequence__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1229:1: ( rule__Sequence__Group_3_0_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1230:2: rule__Sequence__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12453);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1236:1: rule__Sequence__Group_3_0_1__1__Impl : ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) ;
    public final void rule__Sequence__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1240:1: ( ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1241:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1241:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1242:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1243:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1243:2: rule__Sequence__DescriptionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2480);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1257:1: rule__Sequence__Group_3_1__0 : rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 ;
    public final void rule__Sequence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1261:1: ( rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1262:2: rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02514);
            rule__Sequence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02517);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1269:1: rule__Sequence__Group_3_1__0__Impl : ( 'length=' ) ;
    public final void rule__Sequence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1273:1: ( ( 'length=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1274:1: ( 'length=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1274:1: ( 'length=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1275:1: 'length='
            {
             before(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Sequence__Group_3_1__0__Impl2545); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1288:1: rule__Sequence__Group_3_1__1 : rule__Sequence__Group_3_1__1__Impl ;
    public final void rule__Sequence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1292:1: ( rule__Sequence__Group_3_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1293:2: rule__Sequence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12576);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1299:1: rule__Sequence__Group_3_1__1__Impl : ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) ;
    public final void rule__Sequence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1303:1: ( ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1304:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1304:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1305:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1306:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1306:2: rule__Sequence__LengthAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2603);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1320:1: rule__Sequence__Group_3_2__0 : rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 ;
    public final void rule__Sequence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1324:1: ( rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1325:2: rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02637);
            rule__Sequence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02640);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1332:1: rule__Sequence__Group_3_2__0__Impl : ( 'mimetype=' ) ;
    public final void rule__Sequence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1336:1: ( ( 'mimetype=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1337:1: ( 'mimetype=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1337:1: ( 'mimetype=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1338:1: 'mimetype='
            {
             before(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Sequence__Group_3_2__0__Impl2668); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1351:1: rule__Sequence__Group_3_2__1 : rule__Sequence__Group_3_2__1__Impl ;
    public final void rule__Sequence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1355:1: ( rule__Sequence__Group_3_2__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1356:2: rule__Sequence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12699);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1362:1: rule__Sequence__Group_3_2__1__Impl : ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) ;
    public final void rule__Sequence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1366:1: ( ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1367:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1367:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1368:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1369:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1369:2: rule__Sequence__MimetypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2726);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1384:1: rule__Sequence__UnorderedGroup_3 : rule__Sequence__UnorderedGroup_3__0 {...}?;
    public final void rule__Sequence__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1389:1: ( rule__Sequence__UnorderedGroup_3__0 {...}?)
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1390:2: rule__Sequence__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32761);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1401:1: rule__Sequence__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Sequence__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1406:1: ( ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1407:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1407:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==27) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt9=2;
            }
            else if ( LA9_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1409:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1409:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1410:5: {...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1410:105: ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1411:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1417:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1419:7: ( rule__Sequence__Group_3_0__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1420:7: ( rule__Sequence__Group_3_0__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1420:8: rule__Sequence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2850);
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1426:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1426:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1427:5: {...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1427:105: ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1428:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1434:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1436:7: ( rule__Sequence__Group_3_1__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1437:7: ( rule__Sequence__Group_3_1__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1437:8: rule__Sequence__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2941);
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1443:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1443:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1444:5: {...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1444:105: ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1445:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1451:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1453:7: ( rule__Sequence__Group_3_2__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_2()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1454:7: ( rule__Sequence__Group_3_2__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1454:8: rule__Sequence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3032);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1469:1: rule__Sequence__UnorderedGroup_3__0 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? ;
    public final void rule__Sequence__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1473:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1474:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03091);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1475:2: ( rule__Sequence__UnorderedGroup_3__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==27) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1475:2: rule__Sequence__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03094);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:1: rule__Sequence__UnorderedGroup_3__1 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? ;
    public final void rule__Sequence__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1486:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1487:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13119);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1488:2: ( rule__Sequence__UnorderedGroup_3__2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==27) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1488:2: rule__Sequence__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13122);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1495:1: rule__Sequence__UnorderedGroup_3__2 : rule__Sequence__UnorderedGroup_3__Impl ;
    public final void rule__Sequence__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1499:1: ( rule__Sequence__UnorderedGroup_3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1500:2: rule__Sequence__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23147);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1513:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1517:1: ( ( ruleStatement ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1518:1: ( ruleStatement )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1518:1: ( ruleStatement )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1519:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23181);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1528:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1532:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1533:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1533:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1534:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13212); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1543:1: rule__Alternatives__OptionsAssignment_3 : ( ruleOptional ) ;
    public final void rule__Alternatives__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1547:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1548:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1548:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1549:1: ruleOptional
            {
             before(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33243);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1558:1: rule__Mandatory__SequenceAssignment : ( ruleSequence ) ;
    public final void rule__Mandatory__SequenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1562:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1563:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1563:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1564:1: ruleSequence
            {
             before(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3274);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1573:1: rule__Optional__ProbabilityAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Optional__ProbabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1577:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1578:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1578:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1579:1: RULE_INT
            {
             before(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13305); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1588:1: rule__Optional__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Optional__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1592:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1593:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1593:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1594:1: ruleSequence
            {
             before(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13336);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1603:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1607:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1608:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1608:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1609:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13367); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1618:1: rule__Sequence__UrlAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__UrlAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1622:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1623:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1623:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1624:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13398); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1633:1: rule__Sequence__DescriptionAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__DescriptionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1637:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1638:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1638:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1639:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13429); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1648:1: rule__Sequence__LengthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Sequence__LengthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1652:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1653:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1653:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1654:1: RULE_INT
            {
             before(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13460); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1663:1: rule__Sequence__MimetypeAssignment_3_2_1 : ( ruleMimetypes_Enum ) ;
    public final void rule__Sequence__MimetypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1667:1: ( ( ruleMimetypes_Enum ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1668:1: ( ruleMimetypes_Enum )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1668:1: ( ruleMimetypes_Enum )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1669:1: ruleMimetypes_Enum
            {
             before(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13491);
            ruleMimetypes_Enum();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 

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
    public static final BitSet FOLLOW_rule__Mimetypes_Enum__Alternatives_in_ruleMimetypes_Enum431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mimetypes_Enum__Alternatives640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Mimetypes_Enum__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VideoGen__Group__0__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1756 = new BitSet(new long[]{0x0000000004E00000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGen__Group__1__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2815 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl847 = new BitSet(new long[]{0x0000000004E00002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl859 = new BitSet(new long[]{0x0000000004E00002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGen__Group__3__Impl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0956 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group_0__0__Impl987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01078 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_1__0__Impl1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Alternatives__Group__0__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21325 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Alternatives__Group__2__Impl1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1416 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1428 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Alternatives__Group__4__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01527 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01649 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Optional__Group_0__0__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11711 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Optional__Group_0__2__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01836 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Sequence__Group__0__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21958 = new BitSet(new long[]{0x0000000068000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Sequence__Group__2__Impl1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Sequence__Group__4__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02143 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02265 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Sequence__Group_3_0_0__0__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02391 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Sequence__Group_3_0_1__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02514 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Sequence__Group_3_1__0__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02637 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Sequence__Group_3_2__0__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03091 = new BitSet(new long[]{0x0000000068000102L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13119 = new BitSet(new long[]{0x0000000068000102L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13491 = new BitSet(new long[]{0x0000000000000002L});

}
