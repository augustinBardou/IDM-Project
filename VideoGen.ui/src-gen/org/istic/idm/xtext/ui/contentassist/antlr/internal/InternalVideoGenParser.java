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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'MP4'", "'FLV'", "'MPEGTS'", "'MPEG'", "'WEBM'", "'WMV'", "'AVI'", "'VideoGen'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='"
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
    public static final int T__31=31;
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
    public String getGrammarFileName() { return "InternalVideoGen.g"; }


     
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
    // InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalVideoGen.g:89:1: ( ruleStatement EOF )
            // InternalVideoGen.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            // InternalVideoGen.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalVideoGen.g:104:1: ( rule__Statement__Alternatives )
            // InternalVideoGen.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:116:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalVideoGen.g:117:1: ( ruleAlternatives EOF )
            // InternalVideoGen.g:118:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:125:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:129:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            // InternalVideoGen.g:131:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // InternalVideoGen.g:132:1: ( rule__Alternatives__Group__0 )
            // InternalVideoGen.g:132:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:144:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // InternalVideoGen.g:145:1: ( ruleMandatory EOF )
            // InternalVideoGen.g:146:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:153:1: ruleMandatory : ( ( rule__Mandatory__SequenceAssignment ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:157:2: ( ( ( rule__Mandatory__SequenceAssignment ) ) )
            // InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            {
            // InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            // InternalVideoGen.g:159:1: ( rule__Mandatory__SequenceAssignment )
            {
             before(grammarAccess.getMandatoryAccess().getSequenceAssignment()); 
            // InternalVideoGen.g:160:1: ( rule__Mandatory__SequenceAssignment )
            // InternalVideoGen.g:160:2: rule__Mandatory__SequenceAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:172:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // InternalVideoGen.g:173:1: ( ruleOptional EOF )
            // InternalVideoGen.g:174:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:181:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:185:2: ( ( ( rule__Optional__Group__0 ) ) )
            // InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            {
            // InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            // InternalVideoGen.g:187:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // InternalVideoGen.g:188:1: ( rule__Optional__Group__0 )
            // InternalVideoGen.g:188:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:200:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalVideoGen.g:201:1: ( ruleSequence EOF )
            // InternalVideoGen.g:202:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVideoGen.g:209:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:213:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            {
            // InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            // InternalVideoGen.g:215:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // InternalVideoGen.g:216:1: ( rule__Sequence__Group__0 )
            // InternalVideoGen.g:216:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:229:1: ruleMimetypes_Enum : ( ( rule__Mimetypes_Enum__Alternatives ) ) ;
    public final void ruleMimetypes_Enum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:233:1: ( ( ( rule__Mimetypes_Enum__Alternatives ) ) )
            // InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            {
            // InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            // InternalVideoGen.g:235:1: ( rule__Mimetypes_Enum__Alternatives )
            {
             before(grammarAccess.getMimetypes_EnumAccess().getAlternatives()); 
            // InternalVideoGen.g:236:1: ( rule__Mimetypes_Enum__Alternatives )
            // InternalVideoGen.g:236:2: rule__Mimetypes_Enum__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:247:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:251:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
            case 27:
                {
                alt1=2;
                }
                break;
            case 24:
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
                    // InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    // InternalVideoGen.g:253:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // InternalVideoGen.g:254:1: ( rule__Statement__Group_0__0 )
                    // InternalVideoGen.g:254:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    // InternalVideoGen.g:259:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalVideoGen.g:260:1: ( rule__Statement__Group_1__0 )
                    // InternalVideoGen.g:260:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:264:6: ( ruleAlternatives )
                    {
                    // InternalVideoGen.g:264:6: ( ruleAlternatives )
                    // InternalVideoGen.g:265:1: ruleAlternatives
                    {
                     before(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:275:1: rule__Mimetypes_Enum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) );
    public final void rule__Mimetypes_Enum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:279:1: ( ( ( 'NONE' ) ) | ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) )
            int alt2=8;
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
            case 20:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVideoGen.g:280:1: ( ( 'NONE' ) )
                    {
                    // InternalVideoGen.g:280:1: ( ( 'NONE' ) )
                    // InternalVideoGen.g:281:1: ( 'NONE' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 
                    // InternalVideoGen.g:282:1: ( 'NONE' )
                    // InternalVideoGen.g:282:3: 'NONE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:287:6: ( ( 'MP4' ) )
                    {
                    // InternalVideoGen.g:287:6: ( ( 'MP4' ) )
                    // InternalVideoGen.g:288:1: ( 'MP4' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 
                    // InternalVideoGen.g:289:1: ( 'MP4' )
                    // InternalVideoGen.g:289:3: 'MP4'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:294:6: ( ( 'FLV' ) )
                    {
                    // InternalVideoGen.g:294:6: ( ( 'FLV' ) )
                    // InternalVideoGen.g:295:1: ( 'FLV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 
                    // InternalVideoGen.g:296:1: ( 'FLV' )
                    // InternalVideoGen.g:296:3: 'FLV'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoGen.g:301:6: ( ( 'MPEGTS' ) )
                    {
                    // InternalVideoGen.g:301:6: ( ( 'MPEGTS' ) )
                    // InternalVideoGen.g:302:1: ( 'MPEGTS' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 
                    // InternalVideoGen.g:303:1: ( 'MPEGTS' )
                    // InternalVideoGen.g:303:3: 'MPEGTS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVideoGen.g:308:6: ( ( 'MPEG' ) )
                    {
                    // InternalVideoGen.g:308:6: ( ( 'MPEG' ) )
                    // InternalVideoGen.g:309:1: ( 'MPEG' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 
                    // InternalVideoGen.g:310:1: ( 'MPEG' )
                    // InternalVideoGen.g:310:3: 'MPEG'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVideoGen.g:315:6: ( ( 'WEBM' ) )
                    {
                    // InternalVideoGen.g:315:6: ( ( 'WEBM' ) )
                    // InternalVideoGen.g:316:1: ( 'WEBM' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 
                    // InternalVideoGen.g:317:1: ( 'WEBM' )
                    // InternalVideoGen.g:317:3: 'WEBM'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVideoGen.g:322:6: ( ( 'WMV' ) )
                    {
                    // InternalVideoGen.g:322:6: ( ( 'WMV' ) )
                    // InternalVideoGen.g:323:1: ( 'WMV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 
                    // InternalVideoGen.g:324:1: ( 'WMV' )
                    // InternalVideoGen.g:324:3: 'WMV'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVideoGen.g:329:6: ( ( 'AVI' ) )
                    {
                    // InternalVideoGen.g:329:6: ( ( 'AVI' ) )
                    // InternalVideoGen.g:330:1: ( 'AVI' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 
                    // InternalVideoGen.g:331:1: ( 'AVI' )
                    // InternalVideoGen.g:331:3: 'AVI'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 

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
    // InternalVideoGen.g:343:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:347:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // InternalVideoGen.g:348:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:355:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:359:1: ( ( 'VideoGen' ) )
            // InternalVideoGen.g:360:1: ( 'VideoGen' )
            {
            // InternalVideoGen.g:360:1: ( 'VideoGen' )
            // InternalVideoGen.g:361:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalVideoGen.g:374:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:378:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // InternalVideoGen.g:379:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:386:1: rule__VideoGen__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:390:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:391:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:391:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:392:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:403:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:407:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // InternalVideoGen.g:408:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:415:1: rule__VideoGen__Group__2__Impl : ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:419:1: ( ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) )
            // InternalVideoGen.g:420:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            {
            // InternalVideoGen.g:420:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            // InternalVideoGen.g:421:1: ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* )
            {
            // InternalVideoGen.g:421:1: ( ( rule__VideoGen__StatementsAssignment_2 ) )
            // InternalVideoGen.g:422:1: ( rule__VideoGen__StatementsAssignment_2 )
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // InternalVideoGen.g:423:1: ( rule__VideoGen__StatementsAssignment_2 )
            // InternalVideoGen.g:423:2: rule__VideoGen__StatementsAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__VideoGen__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }

            // InternalVideoGen.g:426:1: ( ( rule__VideoGen__StatementsAssignment_2 )* )
            // InternalVideoGen.g:427:1: ( rule__VideoGen__StatementsAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // InternalVideoGen.g:428:1: ( rule__VideoGen__StatementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=22 && LA3_0<=24)||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoGen.g:428:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
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
    // InternalVideoGen.g:439:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:443:1: ( rule__VideoGen__Group__3__Impl )
            // InternalVideoGen.g:444:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:450:1: rule__VideoGen__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:454:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:455:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:455:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:456:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:475:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:479:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalVideoGen.g:480:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:487:1: rule__Statement__Group_0__0__Impl : ( '@Optional' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:491:1: ( ( '@Optional' ) )
            // InternalVideoGen.g:492:1: ( '@Optional' )
            {
            // InternalVideoGen.g:492:1: ( '@Optional' )
            // InternalVideoGen.g:493:1: '@Optional'
            {
             before(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalVideoGen.g:506:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:510:1: ( rule__Statement__Group_0__1__Impl )
            // InternalVideoGen.g:511:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:517:1: rule__Statement__Group_0__1__Impl : ( ruleOptional ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:521:1: ( ( ruleOptional ) )
            // InternalVideoGen.g:522:1: ( ruleOptional )
            {
            // InternalVideoGen.g:522:1: ( ruleOptional )
            // InternalVideoGen.g:523:1: ruleOptional
            {
             before(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:538:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:542:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalVideoGen.g:543:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:550:1: rule__Statement__Group_1__0__Impl : ( ( '@Mandatory' )? ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:554:1: ( ( ( '@Mandatory' )? ) )
            // InternalVideoGen.g:555:1: ( ( '@Mandatory' )? )
            {
            // InternalVideoGen.g:555:1: ( ( '@Mandatory' )? )
            // InternalVideoGen.g:556:1: ( '@Mandatory' )?
            {
             before(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 
            // InternalVideoGen.g:557:1: ( '@Mandatory' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:558:2: '@Mandatory'
                    {
                    match(input,23,FOLLOW_2); 

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
    // InternalVideoGen.g:569:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:573:1: ( rule__Statement__Group_1__1__Impl )
            // InternalVideoGen.g:574:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:580:1: rule__Statement__Group_1__1__Impl : ( ruleMandatory ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:584:1: ( ( ruleMandatory ) )
            // InternalVideoGen.g:585:1: ( ruleMandatory )
            {
            // InternalVideoGen.g:585:1: ( ruleMandatory )
            // InternalVideoGen.g:586:1: ruleMandatory
            {
             before(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:601:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:605:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // InternalVideoGen.g:606:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:613:1: rule__Alternatives__Group__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:617:1: ( ( 'Alternatives' ) )
            // InternalVideoGen.g:618:1: ( 'Alternatives' )
            {
            // InternalVideoGen.g:618:1: ( 'Alternatives' )
            // InternalVideoGen.g:619:1: 'Alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalVideoGen.g:632:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:636:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // InternalVideoGen.g:637:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:644:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:648:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // InternalVideoGen.g:649:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // InternalVideoGen.g:649:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // InternalVideoGen.g:650:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // InternalVideoGen.g:651:1: ( rule__Alternatives__NameAssignment_1 )
            // InternalVideoGen.g:651:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:661:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:665:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // InternalVideoGen.g:666:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:673:1: rule__Alternatives__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:677:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:678:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:678:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:679:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:690:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:694:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // InternalVideoGen.g:695:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:702:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:706:1: ( ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) )
            // InternalVideoGen.g:707:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            {
            // InternalVideoGen.g:707:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            // InternalVideoGen.g:708:1: ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* )
            {
            // InternalVideoGen.g:708:1: ( ( rule__Alternatives__OptionsAssignment_3 ) )
            // InternalVideoGen.g:709:1: ( rule__Alternatives__OptionsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // InternalVideoGen.g:710:1: ( rule__Alternatives__OptionsAssignment_3 )
            // InternalVideoGen.g:710:2: rule__Alternatives__OptionsAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Alternatives__OptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }

            // InternalVideoGen.g:713:1: ( ( rule__Alternatives__OptionsAssignment_3 )* )
            // InternalVideoGen.g:714:1: ( rule__Alternatives__OptionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // InternalVideoGen.g:715:1: ( rule__Alternatives__OptionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVideoGen.g:715:2: rule__Alternatives__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
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
    // InternalVideoGen.g:726:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:730:1: ( rule__Alternatives__Group__4__Impl )
            // InternalVideoGen.g:731:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:737:1: rule__Alternatives__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:741:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:742:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:742:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:743:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:764:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:768:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // InternalVideoGen.g:769:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:776:1: rule__Optional__Group__0__Impl : ( ( rule__Optional__Group_0__0 )? ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:780:1: ( ( ( rule__Optional__Group_0__0 )? ) )
            // InternalVideoGen.g:781:1: ( ( rule__Optional__Group_0__0 )? )
            {
            // InternalVideoGen.g:781:1: ( ( rule__Optional__Group_0__0 )? )
            // InternalVideoGen.g:782:1: ( rule__Optional__Group_0__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_0()); 
            // InternalVideoGen.g:783:1: ( rule__Optional__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:783:2: rule__Optional__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:793:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:797:1: ( rule__Optional__Group__1__Impl )
            // InternalVideoGen.g:798:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:804:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__SequenceAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:808:1: ( ( ( rule__Optional__SequenceAssignment_1 ) ) )
            // InternalVideoGen.g:809:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            {
            // InternalVideoGen.g:809:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            // InternalVideoGen.g:810:1: ( rule__Optional__SequenceAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 
            // InternalVideoGen.g:811:1: ( rule__Optional__SequenceAssignment_1 )
            // InternalVideoGen.g:811:2: rule__Optional__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:825:1: rule__Optional__Group_0__0 : rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 ;
    public final void rule__Optional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:829:1: ( rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 )
            // InternalVideoGen.g:830:2: rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Optional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:837:1: rule__Optional__Group_0__0__Impl : ( '@Probability(' ) ;
    public final void rule__Optional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:841:1: ( ( '@Probability(' ) )
            // InternalVideoGen.g:842:1: ( '@Probability(' )
            {
            // InternalVideoGen.g:842:1: ( '@Probability(' )
            // InternalVideoGen.g:843:1: '@Probability('
            {
             before(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalVideoGen.g:856:1: rule__Optional__Group_0__1 : rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 ;
    public final void rule__Optional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:860:1: ( rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 )
            // InternalVideoGen.g:861:2: rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Optional__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:868:1: rule__Optional__Group_0__1__Impl : ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) ;
    public final void rule__Optional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:872:1: ( ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) )
            // InternalVideoGen.g:873:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            {
            // InternalVideoGen.g:873:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            // InternalVideoGen.g:874:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            {
             before(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 
            // InternalVideoGen.g:875:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            // InternalVideoGen.g:875:2: rule__Optional__ProbabilityAssignment_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:885:1: rule__Optional__Group_0__2 : rule__Optional__Group_0__2__Impl ;
    public final void rule__Optional__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:889:1: ( rule__Optional__Group_0__2__Impl )
            // InternalVideoGen.g:890:2: rule__Optional__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:896:1: rule__Optional__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Optional__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:900:1: ( ( ')' ) )
            // InternalVideoGen.g:901:1: ( ')' )
            {
            // InternalVideoGen.g:901:1: ( ')' )
            // InternalVideoGen.g:902:1: ')'
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVideoGen.g:921:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:925:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // InternalVideoGen.g:926:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:933:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:937:1: ( ( 'Sequence' ) )
            // InternalVideoGen.g:938:1: ( 'Sequence' )
            {
            // InternalVideoGen.g:938:1: ( 'Sequence' )
            // InternalVideoGen.g:939:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVideoGen.g:952:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:956:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // InternalVideoGen.g:957:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:964:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:968:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // InternalVideoGen.g:969:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // InternalVideoGen.g:969:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // InternalVideoGen.g:970:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // InternalVideoGen.g:971:1: ( rule__Sequence__NameAssignment_1 )
            // InternalVideoGen.g:971:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:981:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:985:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // InternalVideoGen.g:986:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:993:1: rule__Sequence__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:997:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:998:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:998:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:999:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:1010:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1014:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // InternalVideoGen.g:1015:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1022:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__UnorderedGroup_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1026:1: ( ( ( rule__Sequence__UnorderedGroup_3 ) ) )
            // InternalVideoGen.g:1027:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            {
            // InternalVideoGen.g:1027:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            // InternalVideoGen.g:1028:1: ( rule__Sequence__UnorderedGroup_3 )
            {
             before(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 
            // InternalVideoGen.g:1029:1: ( rule__Sequence__UnorderedGroup_3 )
            // InternalVideoGen.g:1029:2: rule__Sequence__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1039:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1043:1: ( rule__Sequence__Group__4__Impl )
            // InternalVideoGen.g:1044:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1050:1: rule__Sequence__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1054:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1055:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1055:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1056:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
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
    // InternalVideoGen.g:1077:1: rule__Sequence__Group_3_0__0 : rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 ;
    public final void rule__Sequence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1081:1: ( rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 )
            // InternalVideoGen.g:1082:2: rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Sequence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1089:1: rule__Sequence__Group_3_0__0__Impl : ( ( rule__Sequence__Group_3_0_0__0 ) ) ;
    public final void rule__Sequence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1093:1: ( ( ( rule__Sequence__Group_3_0_0__0 ) ) )
            // InternalVideoGen.g:1094:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            {
            // InternalVideoGen.g:1094:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            // InternalVideoGen.g:1095:1: ( rule__Sequence__Group_3_0_0__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 
            // InternalVideoGen.g:1096:1: ( rule__Sequence__Group_3_0_0__0 )
            // InternalVideoGen.g:1096:2: rule__Sequence__Group_3_0_0__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1106:1: rule__Sequence__Group_3_0__1 : rule__Sequence__Group_3_0__1__Impl ;
    public final void rule__Sequence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1110:1: ( rule__Sequence__Group_3_0__1__Impl )
            // InternalVideoGen.g:1111:2: rule__Sequence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1117:1: rule__Sequence__Group_3_0__1__Impl : ( ( rule__Sequence__Group_3_0_1__0 )? ) ;
    public final void rule__Sequence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1121:1: ( ( ( rule__Sequence__Group_3_0_1__0 )? ) )
            // InternalVideoGen.g:1122:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            {
            // InternalVideoGen.g:1122:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            // InternalVideoGen.g:1123:1: ( rule__Sequence__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 
            // InternalVideoGen.g:1124:1: ( rule__Sequence__Group_3_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoGen.g:1124:2: rule__Sequence__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1138:1: rule__Sequence__Group_3_0_0__0 : rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 ;
    public final void rule__Sequence__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1142:1: ( rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 )
            // InternalVideoGen.g:1143:2: rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Sequence__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1150:1: rule__Sequence__Group_3_0_0__0__Impl : ( ( 'url=' )? ) ;
    public final void rule__Sequence__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1154:1: ( ( ( 'url=' )? ) )
            // InternalVideoGen.g:1155:1: ( ( 'url=' )? )
            {
            // InternalVideoGen.g:1155:1: ( ( 'url=' )? )
            // InternalVideoGen.g:1156:1: ( 'url=' )?
            {
             before(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 
            // InternalVideoGen.g:1157:1: ( 'url=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:1158:2: 'url='
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalVideoGen.g:1169:1: rule__Sequence__Group_3_0_0__1 : rule__Sequence__Group_3_0_0__1__Impl ;
    public final void rule__Sequence__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1173:1: ( rule__Sequence__Group_3_0_0__1__Impl )
            // InternalVideoGen.g:1174:2: rule__Sequence__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1180:1: rule__Sequence__Group_3_0_0__1__Impl : ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) ;
    public final void rule__Sequence__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1184:1: ( ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) )
            // InternalVideoGen.g:1185:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            {
            // InternalVideoGen.g:1185:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            // InternalVideoGen.g:1186:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            {
             before(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 
            // InternalVideoGen.g:1187:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            // InternalVideoGen.g:1187:2: rule__Sequence__UrlAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1201:1: rule__Sequence__Group_3_0_1__0 : rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 ;
    public final void rule__Sequence__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1205:1: ( rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 )
            // InternalVideoGen.g:1206:2: rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Sequence__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1213:1: rule__Sequence__Group_3_0_1__0__Impl : ( 'description=' ) ;
    public final void rule__Sequence__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1217:1: ( ( 'description=' ) )
            // InternalVideoGen.g:1218:1: ( 'description=' )
            {
            // InternalVideoGen.g:1218:1: ( 'description=' )
            // InternalVideoGen.g:1219:1: 'description='
            {
             before(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalVideoGen.g:1232:1: rule__Sequence__Group_3_0_1__1 : rule__Sequence__Group_3_0_1__1__Impl ;
    public final void rule__Sequence__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1236:1: ( rule__Sequence__Group_3_0_1__1__Impl )
            // InternalVideoGen.g:1237:2: rule__Sequence__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1243:1: rule__Sequence__Group_3_0_1__1__Impl : ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) ;
    public final void rule__Sequence__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1247:1: ( ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) )
            // InternalVideoGen.g:1248:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            {
            // InternalVideoGen.g:1248:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            // InternalVideoGen.g:1249:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 
            // InternalVideoGen.g:1250:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            // InternalVideoGen.g:1250:2: rule__Sequence__DescriptionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1264:1: rule__Sequence__Group_3_1__0 : rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 ;
    public final void rule__Sequence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1268:1: ( rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 )
            // InternalVideoGen.g:1269:2: rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Sequence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1276:1: rule__Sequence__Group_3_1__0__Impl : ( 'length=' ) ;
    public final void rule__Sequence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1280:1: ( ( 'length=' ) )
            // InternalVideoGen.g:1281:1: ( 'length=' )
            {
            // InternalVideoGen.g:1281:1: ( 'length=' )
            // InternalVideoGen.g:1282:1: 'length='
            {
             before(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalVideoGen.g:1295:1: rule__Sequence__Group_3_1__1 : rule__Sequence__Group_3_1__1__Impl ;
    public final void rule__Sequence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1299:1: ( rule__Sequence__Group_3_1__1__Impl )
            // InternalVideoGen.g:1300:2: rule__Sequence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1306:1: rule__Sequence__Group_3_1__1__Impl : ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) ;
    public final void rule__Sequence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1310:1: ( ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) )
            // InternalVideoGen.g:1311:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            {
            // InternalVideoGen.g:1311:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            // InternalVideoGen.g:1312:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 
            // InternalVideoGen.g:1313:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            // InternalVideoGen.g:1313:2: rule__Sequence__LengthAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1327:1: rule__Sequence__Group_3_2__0 : rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 ;
    public final void rule__Sequence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1331:1: ( rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 )
            // InternalVideoGen.g:1332:2: rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Sequence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1339:1: rule__Sequence__Group_3_2__0__Impl : ( 'mimetype=' ) ;
    public final void rule__Sequence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1343:1: ( ( 'mimetype=' ) )
            // InternalVideoGen.g:1344:1: ( 'mimetype=' )
            {
            // InternalVideoGen.g:1344:1: ( 'mimetype=' )
            // InternalVideoGen.g:1345:1: 'mimetype='
            {
             before(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalVideoGen.g:1358:1: rule__Sequence__Group_3_2__1 : rule__Sequence__Group_3_2__1__Impl ;
    public final void rule__Sequence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1362:1: ( rule__Sequence__Group_3_2__1__Impl )
            // InternalVideoGen.g:1363:2: rule__Sequence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1369:1: rule__Sequence__Group_3_2__1__Impl : ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) ;
    public final void rule__Sequence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1373:1: ( ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) )
            // InternalVideoGen.g:1374:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            {
            // InternalVideoGen.g:1374:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            // InternalVideoGen.g:1375:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 
            // InternalVideoGen.g:1376:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            // InternalVideoGen.g:1376:2: rule__Sequence__MimetypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1391:1: rule__Sequence__UnorderedGroup_3 : rule__Sequence__UnorderedGroup_3__0 {...}?;
    public final void rule__Sequence__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            
        try {
            // InternalVideoGen.g:1396:1: ( rule__Sequence__UnorderedGroup_3__0 {...}?)
            // InternalVideoGen.g:1397:2: rule__Sequence__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1408:1: rule__Sequence__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Sequence__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // InternalVideoGen.g:1413:1: ( ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) )
            // InternalVideoGen.g:1414:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            {
            // InternalVideoGen.g:1414:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( ( LA9_0 == RULE_STRING || LA9_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt9=2;
            }
            else if ( LA9_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:1416:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    {
                    // InternalVideoGen.g:1416:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    // InternalVideoGen.g:1417:5: {...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalVideoGen.g:1417:105: ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    // InternalVideoGen.g:1418:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalVideoGen.g:1424:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    // InternalVideoGen.g:1426:7: ( rule__Sequence__Group_3_0__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_0()); 
                    // InternalVideoGen.g:1427:7: ( rule__Sequence__Group_3_0__0 )
                    // InternalVideoGen.g:1427:8: rule__Sequence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalVideoGen.g:1433:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    {
                    // InternalVideoGen.g:1433:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    // InternalVideoGen.g:1434:5: {...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalVideoGen.g:1434:105: ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    // InternalVideoGen.g:1435:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalVideoGen.g:1441:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    // InternalVideoGen.g:1443:7: ( rule__Sequence__Group_3_1__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_1()); 
                    // InternalVideoGen.g:1444:7: ( rule__Sequence__Group_3_1__0 )
                    // InternalVideoGen.g:1444:8: rule__Sequence__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalVideoGen.g:1450:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    {
                    // InternalVideoGen.g:1450:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    // InternalVideoGen.g:1451:5: {...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalVideoGen.g:1451:105: ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    // InternalVideoGen.g:1452:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // InternalVideoGen.g:1458:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    // InternalVideoGen.g:1460:7: ( rule__Sequence__Group_3_2__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_2()); 
                    // InternalVideoGen.g:1461:7: ( rule__Sequence__Group_3_2__0 )
                    // InternalVideoGen.g:1461:8: rule__Sequence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1476:1: rule__Sequence__UnorderedGroup_3__0 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? ;
    public final void rule__Sequence__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1480:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? )
            // InternalVideoGen.g:1481:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalVideoGen.g:1482:2: ( rule__Sequence__UnorderedGroup_3__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ( LA10_0 == RULE_STRING || LA10_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:1482:2: rule__Sequence__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1489:1: rule__Sequence__UnorderedGroup_3__1 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? ;
    public final void rule__Sequence__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1493:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? )
            // InternalVideoGen.g:1494:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_18);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalVideoGen.g:1495:2: ( rule__Sequence__UnorderedGroup_3__2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ( LA11_0 == RULE_STRING || LA11_0 == 28 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoGen.g:1495:2: rule__Sequence__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1502:1: rule__Sequence__UnorderedGroup_3__2 : rule__Sequence__UnorderedGroup_3__Impl ;
    public final void rule__Sequence__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1506:1: ( rule__Sequence__UnorderedGroup_3__Impl )
            // InternalVideoGen.g:1507:2: rule__Sequence__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1520:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1524:1: ( ( ruleStatement ) )
            // InternalVideoGen.g:1525:1: ( ruleStatement )
            {
            // InternalVideoGen.g:1525:1: ( ruleStatement )
            // InternalVideoGen.g:1526:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1535:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1539:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:1540:1: ( RULE_ID )
            {
            // InternalVideoGen.g:1540:1: ( RULE_ID )
            // InternalVideoGen.g:1541:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalVideoGen.g:1550:1: rule__Alternatives__OptionsAssignment_3 : ( ruleOptional ) ;
    public final void rule__Alternatives__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1554:1: ( ( ruleOptional ) )
            // InternalVideoGen.g:1555:1: ( ruleOptional )
            {
            // InternalVideoGen.g:1555:1: ( ruleOptional )
            // InternalVideoGen.g:1556:1: ruleOptional
            {
             before(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1565:1: rule__Mandatory__SequenceAssignment : ( ruleSequence ) ;
    public final void rule__Mandatory__SequenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1569:1: ( ( ruleSequence ) )
            // InternalVideoGen.g:1570:1: ( ruleSequence )
            {
            // InternalVideoGen.g:1570:1: ( ruleSequence )
            // InternalVideoGen.g:1571:1: ruleSequence
            {
             before(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1580:1: rule__Optional__ProbabilityAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Optional__ProbabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1584:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:1585:1: ( RULE_INT )
            {
            // InternalVideoGen.g:1585:1: ( RULE_INT )
            // InternalVideoGen.g:1586:1: RULE_INT
            {
             before(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalVideoGen.g:1595:1: rule__Optional__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Optional__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1599:1: ( ( ruleSequence ) )
            // InternalVideoGen.g:1600:1: ( ruleSequence )
            {
            // InternalVideoGen.g:1600:1: ( ruleSequence )
            // InternalVideoGen.g:1601:1: ruleSequence
            {
             before(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
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
    // InternalVideoGen.g:1610:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1614:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:1615:1: ( RULE_ID )
            {
            // InternalVideoGen.g:1615:1: ( RULE_ID )
            // InternalVideoGen.g:1616:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // InternalVideoGen.g:1625:1: rule__Sequence__UrlAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__UrlAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1629:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:1630:1: ( RULE_STRING )
            {
            // InternalVideoGen.g:1630:1: ( RULE_STRING )
            // InternalVideoGen.g:1631:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalVideoGen.g:1640:1: rule__Sequence__DescriptionAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__DescriptionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1644:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:1645:1: ( RULE_STRING )
            {
            // InternalVideoGen.g:1645:1: ( RULE_STRING )
            // InternalVideoGen.g:1646:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // InternalVideoGen.g:1655:1: rule__Sequence__LengthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Sequence__LengthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1659:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:1660:1: ( RULE_INT )
            {
            // InternalVideoGen.g:1660:1: ( RULE_INT )
            // InternalVideoGen.g:1661:1: RULE_INT
            {
             before(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // InternalVideoGen.g:1670:1: rule__Sequence__MimetypeAssignment_3_2_1 : ( ruleMimetypes_Enum ) ;
    public final void rule__Sequence__MimetypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalVideoGen.g:1674:1: ( ( ruleMimetypes_Enum ) )
            // InternalVideoGen.g:1675:1: ( ruleMimetypes_Enum )
            {
            // InternalVideoGen.g:1675:1: ( ruleMimetypes_Enum )
            // InternalVideoGen.g:1676:1: ruleMimetypes_Enum
            {
             before(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000009C00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000009C00002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000A800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000A800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000D0000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000D0000102L});

}
