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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MP4'", "'FLV'", "'MPEGTS'", "'MPEG'", "'WEBM'", "'WMV'", "'AVI'", "'VideoGen'", "'{'", "'}'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
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
                    match(input,11,FOLLOW_11_in_rule__Mimetypes_Enum__Alternatives535); 

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
                    match(input,12,FOLLOW_12_in_rule__Mimetypes_Enum__Alternatives556); 

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
                    match(input,13,FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives577); 

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
                    match(input,14,FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives598); 

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
                    match(input,15,FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives619); 

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
                    match(input,16,FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives640); 

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
                    match(input,17,FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives661); 

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
            match(input,18,FOLLOW_18_in_rule__VideoGen__Group__0__Impl725); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:379:1: rule__VideoGen__Group__1__Impl : ( '{' ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:383:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:384:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:384:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:385:1: '{'
            {
             before(grammarAccess.getVideoGenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__VideoGen__Group__1__Impl787); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:398:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:402:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:403:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2818);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2821);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:410:1: rule__VideoGen__Group__2__Impl : ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:414:1: ( ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:415:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:415:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:416:1: ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:416:1: ( ( rule__VideoGen__StatementsAssignment_2 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:417:1: ( rule__VideoGen__StatementsAssignment_2 )
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:418:1: ( rule__VideoGen__StatementsAssignment_2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:418:2: rule__VideoGen__StatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl850);
            rule__VideoGen__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:421:1: ( ( rule__VideoGen__StatementsAssignment_2 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:422:1: ( rule__VideoGen__StatementsAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:423:1: ( rule__VideoGen__StatementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=21 && LA3_0<=23)||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:423:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl862);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:434:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:438:1: ( rule__VideoGen__Group__3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:439:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3895);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:445:1: rule__VideoGen__Group__3__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:449:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:450:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:450:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:451:1: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__VideoGen__Group__3__Impl923); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:472:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:476:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:477:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0962);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0965);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:484:1: rule__Statement__Group_0__0__Impl : ( '@Optional' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:488:1: ( ( '@Optional' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:489:1: ( '@Optional' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:489:1: ( '@Optional' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:490:1: '@Optional'
            {
             before(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Statement__Group_0__0__Impl993); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:503:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:507:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:508:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11024);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:514:1: rule__Statement__Group_0__1__Impl : ( ruleOptional ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:518:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:519:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:519:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:520:1: ruleOptional
            {
             before(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1051);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:535:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:539:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:540:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01084);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01087);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:547:1: rule__Statement__Group_1__0__Impl : ( ( '@Mandatory' )? ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:551:1: ( ( ( '@Mandatory' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:552:1: ( ( '@Mandatory' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:552:1: ( ( '@Mandatory' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:553:1: ( '@Mandatory' )?
            {
             before(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:554:1: ( '@Mandatory' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:555:2: '@Mandatory'
                    {
                    match(input,22,FOLLOW_22_in_rule__Statement__Group_1__0__Impl1116); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:566:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:570:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:571:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11149);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:577:1: rule__Statement__Group_1__1__Impl : ( ruleMandatory ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:581:1: ( ( ruleMandatory ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:582:1: ( ruleMandatory )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:582:1: ( ruleMandatory )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:583:1: ruleMandatory
            {
             before(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1176);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:598:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:602:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:603:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01209);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01212);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:610:1: rule__Alternatives__Group__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:614:1: ( ( 'Alternatives' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:615:1: ( 'Alternatives' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:615:1: ( 'Alternatives' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:616:1: 'Alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Alternatives__Group__0__Impl1240); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:629:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:633:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:634:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11271);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11274);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:641:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:645:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:646:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:646:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:647:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:648:1: ( rule__Alternatives__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:648:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1301);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:658:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:662:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:663:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21331);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21334);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:670:1: rule__Alternatives__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:674:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:675:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:675:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:676:1: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Alternatives__Group__2__Impl1362); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:689:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:693:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:694:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31393);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31396);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:701:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:705:1: ( ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:706:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:706:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: ( ( rule__Alternatives__OptionsAssignment_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:708:1: ( rule__Alternatives__OptionsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:709:1: ( rule__Alternatives__OptionsAssignment_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:709:2: rule__Alternatives__OptionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1425);
            rule__Alternatives__OptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:712:1: ( ( rule__Alternatives__OptionsAssignment_3 )* )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:713:1: ( rule__Alternatives__OptionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:714:1: ( rule__Alternatives__OptionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:714:2: rule__Alternatives__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1437);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:725:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:729:1: ( rule__Alternatives__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:730:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41470);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:736:1: rule__Alternatives__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:740:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:741:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:741:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:742:1: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Alternatives__Group__4__Impl1498); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:765:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:769:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:770:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01539);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01542);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:777:1: rule__Optional__Group__0__Impl : ( ( rule__Optional__Group_0__0 )? ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:781:1: ( ( ( rule__Optional__Group_0__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:782:1: ( ( rule__Optional__Group_0__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:782:1: ( ( rule__Optional__Group_0__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:783:1: ( rule__Optional__Group_0__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:784:1: ( rule__Optional__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:784:2: rule__Optional__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1569);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:794:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:798:1: ( rule__Optional__Group__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:799:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11600);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:805:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__SequenceAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:809:1: ( ( ( rule__Optional__SequenceAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:810:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:810:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:811:1: ( rule__Optional__SequenceAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:812:1: ( rule__Optional__SequenceAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:812:2: rule__Optional__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1627);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:826:1: rule__Optional__Group_0__0 : rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 ;
    public final void rule__Optional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:830:1: ( rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:831:2: rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01661);
            rule__Optional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01664);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:838:1: rule__Optional__Group_0__0__Impl : ( '@Probability(' ) ;
    public final void rule__Optional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:842:1: ( ( '@Probability(' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( '@Probability(' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: ( '@Probability(' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:844:1: '@Probability('
            {
             before(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Optional__Group_0__0__Impl1692); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:857:1: rule__Optional__Group_0__1 : rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 ;
    public final void rule__Optional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:861:1: ( rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:862:2: rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11723);
            rule__Optional__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11726);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:869:1: rule__Optional__Group_0__1__Impl : ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) ;
    public final void rule__Optional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:874:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:874:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:875:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            {
             before(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:876:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:876:2: rule__Optional__ProbabilityAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1753);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:886:1: rule__Optional__Group_0__2 : rule__Optional__Group_0__2__Impl ;
    public final void rule__Optional__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:890:1: ( rule__Optional__Group_0__2__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:891:2: rule__Optional__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21783);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:897:1: rule__Optional__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Optional__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:901:1: ( ( ')' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:902:1: ( ')' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:902:1: ( ')' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:903:1: ')'
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__Optional__Group_0__2__Impl1811); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:922:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:926:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:927:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01848);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01851);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:934:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:938:1: ( ( 'Sequence' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:939:1: ( 'Sequence' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:939:1: ( 'Sequence' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:940:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Sequence__Group__0__Impl1879); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:953:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:957:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:958:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11910);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11913);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:965:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:969:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:970:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:970:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:971:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:972:1: ( rule__Sequence__NameAssignment_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:972:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1940);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:982:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:986:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:987:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21970);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21973);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:994:1: rule__Sequence__Group__2__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:998:1: ( ( '{' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:999:1: ( '{' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:999:1: ( '{' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1000:1: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__2__Impl2001); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1013:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1017:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1018:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32032);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32035);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1025:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__UnorderedGroup_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1029:1: ( ( ( rule__Sequence__UnorderedGroup_3 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1030:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1030:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1031:1: ( rule__Sequence__UnorderedGroup_3 )
            {
             before(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1032:1: ( rule__Sequence__UnorderedGroup_3 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1032:2: rule__Sequence__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2062);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1042:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1046:1: ( rule__Sequence__Group__4__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1047:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42092);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1053:1: rule__Sequence__Group__4__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1057:1: ( ( '}' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1058:1: ( '}' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1058:1: ( '}' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1059:1: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Sequence__Group__4__Impl2120); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:1: rule__Sequence__Group_3_0__0 : rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 ;
    public final void rule__Sequence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1086:1: ( rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1087:2: rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02161);
            rule__Sequence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02164);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1094:1: rule__Sequence__Group_3_0__0__Impl : ( ( rule__Sequence__Group_3_0_0__0 ) ) ;
    public final void rule__Sequence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1098:1: ( ( ( rule__Sequence__Group_3_0_0__0 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1099:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1099:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1100:1: ( rule__Sequence__Group_3_0_0__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1101:1: ( rule__Sequence__Group_3_0_0__0 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1101:2: rule__Sequence__Group_3_0_0__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2191);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1111:1: rule__Sequence__Group_3_0__1 : rule__Sequence__Group_3_0__1__Impl ;
    public final void rule__Sequence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1115:1: ( rule__Sequence__Group_3_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1116:2: rule__Sequence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12221);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1122:1: rule__Sequence__Group_3_0__1__Impl : ( ( rule__Sequence__Group_3_0_1__0 )? ) ;
    public final void rule__Sequence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1126:1: ( ( ( rule__Sequence__Group_3_0_1__0 )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1127:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1127:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1128:1: ( rule__Sequence__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1129:1: ( rule__Sequence__Group_3_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1129:2: rule__Sequence__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2248);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1143:1: rule__Sequence__Group_3_0_0__0 : rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 ;
    public final void rule__Sequence__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1147:1: ( rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1148:2: rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02283);
            rule__Sequence__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02286);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1155:1: rule__Sequence__Group_3_0_0__0__Impl : ( ( 'url=' )? ) ;
    public final void rule__Sequence__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1159:1: ( ( ( 'url=' )? ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1160:1: ( ( 'url=' )? )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1160:1: ( ( 'url=' )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1161:1: ( 'url=' )?
            {
             before(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1162:1: ( 'url=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1163:2: 'url='
                    {
                    match(input,27,FOLLOW_27_in_rule__Sequence__Group_3_0_0__0__Impl2315); 

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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1174:1: rule__Sequence__Group_3_0_0__1 : rule__Sequence__Group_3_0_0__1__Impl ;
    public final void rule__Sequence__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1178:1: ( rule__Sequence__Group_3_0_0__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1179:2: rule__Sequence__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12348);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1185:1: rule__Sequence__Group_3_0_0__1__Impl : ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) ;
    public final void rule__Sequence__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1189:1: ( ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1190:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1190:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1191:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            {
             before(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1192:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1192:2: rule__Sequence__UrlAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2375);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1206:1: rule__Sequence__Group_3_0_1__0 : rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 ;
    public final void rule__Sequence__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1210:1: ( rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1211:2: rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02409);
            rule__Sequence__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02412);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1218:1: rule__Sequence__Group_3_0_1__0__Impl : ( 'description=' ) ;
    public final void rule__Sequence__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1222:1: ( ( 'description=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1223:1: ( 'description=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1223:1: ( 'description=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1224:1: 'description='
            {
             before(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 
            match(input,28,FOLLOW_28_in_rule__Sequence__Group_3_0_1__0__Impl2440); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1237:1: rule__Sequence__Group_3_0_1__1 : rule__Sequence__Group_3_0_1__1__Impl ;
    public final void rule__Sequence__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1241:1: ( rule__Sequence__Group_3_0_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1242:2: rule__Sequence__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12471);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1248:1: rule__Sequence__Group_3_0_1__1__Impl : ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) ;
    public final void rule__Sequence__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1252:1: ( ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1253:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1253:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1254:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1255:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1255:2: rule__Sequence__DescriptionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2498);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1269:1: rule__Sequence__Group_3_1__0 : rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 ;
    public final void rule__Sequence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1273:1: ( rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1274:2: rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02532);
            rule__Sequence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02535);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1281:1: rule__Sequence__Group_3_1__0__Impl : ( 'length=' ) ;
    public final void rule__Sequence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1285:1: ( ( 'length=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1286:1: ( 'length=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1286:1: ( 'length=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1287:1: 'length='
            {
             before(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Sequence__Group_3_1__0__Impl2563); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1300:1: rule__Sequence__Group_3_1__1 : rule__Sequence__Group_3_1__1__Impl ;
    public final void rule__Sequence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1304:1: ( rule__Sequence__Group_3_1__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1305:2: rule__Sequence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12594);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1311:1: rule__Sequence__Group_3_1__1__Impl : ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) ;
    public final void rule__Sequence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1315:1: ( ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1316:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1316:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1317:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1318:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1318:2: rule__Sequence__LengthAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2621);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1332:1: rule__Sequence__Group_3_2__0 : rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 ;
    public final void rule__Sequence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1336:1: ( rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1337:2: rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02655);
            rule__Sequence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02658);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:1: rule__Sequence__Group_3_2__0__Impl : ( 'mimetype=' ) ;
    public final void rule__Sequence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1348:1: ( ( 'mimetype=' ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1349:1: ( 'mimetype=' )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1349:1: ( 'mimetype=' )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1350:1: 'mimetype='
            {
             before(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 
            match(input,30,FOLLOW_30_in_rule__Sequence__Group_3_2__0__Impl2686); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1363:1: rule__Sequence__Group_3_2__1 : rule__Sequence__Group_3_2__1__Impl ;
    public final void rule__Sequence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1367:1: ( rule__Sequence__Group_3_2__1__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1368:2: rule__Sequence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12717);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1374:1: rule__Sequence__Group_3_2__1__Impl : ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) ;
    public final void rule__Sequence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1378:1: ( ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1379:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1379:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1380:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1381:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1381:2: rule__Sequence__MimetypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2744);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1396:1: rule__Sequence__UnorderedGroup_3 : rule__Sequence__UnorderedGroup_3__0 {...}?;
    public final void rule__Sequence__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1401:1: ( rule__Sequence__UnorderedGroup_3__0 {...}?)
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1402:2: rule__Sequence__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32779);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1413:1: rule__Sequence__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Sequence__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1418:1: ( ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1419:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1419:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1421:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1421:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1422:5: {...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1422:105: ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1423:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1429:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1431:7: ( rule__Sequence__Group_3_0__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_0()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1432:7: ( rule__Sequence__Group_3_0__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1432:8: rule__Sequence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2868);
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1438:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1438:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1439:5: {...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1439:105: ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1440:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1446:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1448:7: ( rule__Sequence__Group_3_1__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_1()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1449:7: ( rule__Sequence__Group_3_1__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1449:8: rule__Sequence__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2959);
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1455:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1455:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1456:5: {...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1456:105: ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1457:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1463:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1465:7: ( rule__Sequence__Group_3_2__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_2()); 
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1466:7: ( rule__Sequence__Group_3_2__0 )
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1466:8: rule__Sequence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3050);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1481:1: rule__Sequence__UnorderedGroup_3__0 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? ;
    public final void rule__Sequence__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1485:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1486:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03109);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1487:2: ( rule__Sequence__UnorderedGroup_3__1 )?
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1487:2: rule__Sequence__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03112);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1494:1: rule__Sequence__UnorderedGroup_3__1 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? ;
    public final void rule__Sequence__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1498:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1499:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13137);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1500:2: ( rule__Sequence__UnorderedGroup_3__2 )?
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
                    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1500:2: rule__Sequence__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13140);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1507:1: rule__Sequence__UnorderedGroup_3__2 : rule__Sequence__UnorderedGroup_3__Impl ;
    public final void rule__Sequence__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1511:1: ( rule__Sequence__UnorderedGroup_3__Impl )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1512:2: rule__Sequence__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23165);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1525:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1529:1: ( ( ruleStatement ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1530:1: ( ruleStatement )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1530:1: ( ruleStatement )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1531:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23199);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1540:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1544:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1545:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1545:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1546:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13230); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1555:1: rule__Alternatives__OptionsAssignment_3 : ( ruleOptional ) ;
    public final void rule__Alternatives__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1559:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1560:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1560:1: ( ruleOptional )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1561:1: ruleOptional
            {
             before(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33261);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1570:1: rule__Mandatory__SequenceAssignment : ( ruleSequence ) ;
    public final void rule__Mandatory__SequenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1574:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1575:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1575:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1576:1: ruleSequence
            {
             before(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3292);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1585:1: rule__Optional__ProbabilityAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Optional__ProbabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1589:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1590:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1590:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1591:1: RULE_INT
            {
             before(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13323); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1600:1: rule__Optional__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Optional__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1604:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1605:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1605:1: ( ruleSequence )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1606:1: ruleSequence
            {
             before(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13354);
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1615:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1619:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1620:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1620:1: ( RULE_ID )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1621:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13385); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1630:1: rule__Sequence__UrlAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__UrlAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1634:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1635:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1635:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1636:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13416); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1645:1: rule__Sequence__DescriptionAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__DescriptionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1649:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1650:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1650:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1651:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13447); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1660:1: rule__Sequence__LengthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Sequence__LengthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1664:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1665:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1665:1: ( RULE_INT )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1666:1: RULE_INT
            {
             before(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13478); 
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
    // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1675:1: rule__Sequence__MimetypeAssignment_3_2_1 : ( ruleMimetypes_Enum ) ;
    public final void rule__Sequence__MimetypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1679:1: ( ( ruleMimetypes_Enum ) )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1680:1: ( ruleMimetypes_Enum )
            {
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1680:1: ( ruleMimetypes_Enum )
            // ../org.istic.idm.xtext.VideoGen.ui/src-gen/org/istic/idm/xtext/ui/contentassist/antlr/internal/InternalVideoGen.g:1681:1: ruleMimetypes_Enum
            {
             before(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13509);
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
    public static final BitSet FOLLOW_11_in_rule__Mimetypes_Enum__Alternatives535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Mimetypes_Enum__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__VideoGen__Group__0__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1756 = new BitSet(new long[]{0x0000000004E00000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VideoGen__Group__1__Impl787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2818 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl850 = new BitSet(new long[]{0x0000000004E00002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl862 = new BitSet(new long[]{0x0000000004E00002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VideoGen__Group__3__Impl923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0962 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Statement__Group_0__0__Impl993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01084 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_1__0__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Alternatives__Group__0__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21331 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Alternatives__Group__2__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31393 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1425 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1437 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Alternatives__Group__4__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01539 = new BitSet(new long[]{0x0000000005400000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Optional__Group_0__0__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11723 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Optional__Group_0__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Sequence__Group__0__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11910 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21970 = new BitSet(new long[]{0x0000000068000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__2__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group__4__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02161 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02283 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Sequence__Group_3_0_0__0__Impl2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02409 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Sequence__Group_3_0_1__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Sequence__Group_3_1__0__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02655 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Sequence__Group_3_2__0__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03109 = new BitSet(new long[]{0x0000000068000042L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13137 = new BitSet(new long[]{0x0000000068000042L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13509 = new BitSet(new long[]{0x0000000000000002L});

}
