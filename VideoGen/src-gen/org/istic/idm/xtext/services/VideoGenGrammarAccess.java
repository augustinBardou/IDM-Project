/*
 * generated by Xtext
 */
package org.istic.idm.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class VideoGenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class VideoGenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.VideoGen");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVideoGenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cStatementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementsStatementParserRuleCall_2_0 = (RuleCall)cStatementsAssignment_2.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//VideoGen:
		//	"VideoGen" LEFT_BRACKET
		//	statements+=Statement+
		//	RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//"VideoGen" LEFT_BRACKET statements+=Statement+ RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//"VideoGen"
		public Keyword getVideoGenKeyword_0() { return cVideoGenKeyword_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_1() { return cLEFT_BRACKETTerminalRuleCall_1; }

		//statements+=Statement+
		public Assignment getStatementsAssignment_2() { return cStatementsAssignment_2; }

		//Statement
		public RuleCall getStatementsStatementParserRuleCall_2_0() { return cStatementsStatementParserRuleCall_2_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_3() { return cRIGHT_BRACKETTerminalRuleCall_3; }
	}

	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cOptionalKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cOptionalParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMandatoryKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cMandatoryParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final RuleCall cAlternativesParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Statement:
		//	"@Optional" Optional | "@Mandatory"? Mandatory | Alternatives;
		@Override public ParserRule getRule() { return rule; }

		//"@Optional" Optional | "@Mandatory"? Mandatory | Alternatives
		public Alternatives getAlternatives() { return cAlternatives; }

		//"@Optional" Optional
		public Group getGroup_0() { return cGroup_0; }

		//"@Optional"
		public Keyword getOptionalKeyword_0_0() { return cOptionalKeyword_0_0; }

		//Optional
		public RuleCall getOptionalParserRuleCall_0_1() { return cOptionalParserRuleCall_0_1; }

		//"@Mandatory"? Mandatory
		public Group getGroup_1() { return cGroup_1; }

		//"@Mandatory"?
		public Keyword getMandatoryKeyword_1_0() { return cMandatoryKeyword_1_0; }

		//Mandatory
		public RuleCall getMandatoryParserRuleCall_1_1() { return cMandatoryParserRuleCall_1_1; }

		//Alternatives
		public RuleCall getAlternativesParserRuleCall_2() { return cAlternativesParserRuleCall_2; }
	}

	public class AlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Alternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlternativesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cOptionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cOptionsOptionalParserRuleCall_3_0 = (RuleCall)cOptionsAssignment_3.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Alternatives:
		//	"Alternatives" name=ID LEFT_BRACKET
		//	options+=Optional+
		//	RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//"Alternatives" name=ID LEFT_BRACKET options+=Optional+ RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//"Alternatives"
		public Keyword getAlternativesKeyword_0() { return cAlternativesKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_2() { return cLEFT_BRACKETTerminalRuleCall_2; }

		//options+=Optional+
		public Assignment getOptionsAssignment_3() { return cOptionsAssignment_3; }

		//Optional
		public RuleCall getOptionsOptionalParserRuleCall_3_0() { return cOptionsOptionalParserRuleCall_3_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_4() { return cRIGHT_BRACKETTerminalRuleCall_4; }
	}

	public class MandatoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Mandatory");
		private final Assignment cSequenceAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSequenceSequenceParserRuleCall_0 = (RuleCall)cSequenceAssignment.eContents().get(0);
		
		//Mandatory:
		//	sequence=Sequence;
		@Override public ParserRule getRule() { return rule; }

		//sequence=Sequence
		public Assignment getSequenceAssignment() { return cSequenceAssignment; }

		//Sequence
		public RuleCall getSequenceSequenceParserRuleCall_0() { return cSequenceSequenceParserRuleCall_0; }
	}

	public class OptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Optional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cProbabilityKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cProbabilityAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cProbabilityINTTerminalRuleCall_0_1_0 = (RuleCall)cProbabilityAssignment_0_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cSequenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSequenceSequenceParserRuleCall_1_0 = (RuleCall)cSequenceAssignment_1.eContents().get(0);
		
		//Optional:
		//	("@Probability(" probability=INT ")")?
		//	sequence=Sequence;
		@Override public ParserRule getRule() { return rule; }

		//("@Probability(" probability=INT ")")? sequence=Sequence
		public Group getGroup() { return cGroup; }

		//("@Probability(" probability=INT ")")?
		public Group getGroup_0() { return cGroup_0; }

		//"@Probability("
		public Keyword getProbabilityKeyword_0_0() { return cProbabilityKeyword_0_0; }

		//probability=INT
		public Assignment getProbabilityAssignment_0_1() { return cProbabilityAssignment_0_1; }

		//INT
		public RuleCall getProbabilityINTTerminalRuleCall_0_1_0() { return cProbabilityINTTerminalRuleCall_0_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }

		//sequence=Sequence
		public Assignment getSequenceAssignment_1() { return cSequenceAssignment_1; }

		//Sequence
		public RuleCall getSequenceSequenceParserRuleCall_1_0() { return cSequenceSequenceParserRuleCall_1_0; }
	}

	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSequenceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cLEFT_BRACKETTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final UnorderedGroup cUnorderedGroup_3 = (UnorderedGroup)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cUnorderedGroup_3.eContents().get(0);
		private final Group cGroup_3_0_0 = (Group)cGroup_3_0.eContents().get(0);
		private final Keyword cUrlKeyword_3_0_0_0 = (Keyword)cGroup_3_0_0.eContents().get(0);
		private final Assignment cUrlAssignment_3_0_0_1 = (Assignment)cGroup_3_0_0.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_3_0_0_1_0 = (RuleCall)cUrlAssignment_3_0_0_1.eContents().get(0);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Keyword cDescriptionKeyword_3_0_1_0 = (Keyword)cGroup_3_0_1.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_0_1_1 = (Assignment)cGroup_3_0_1.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0_1_1_0 = (RuleCall)cDescriptionAssignment_3_0_1_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cUnorderedGroup_3.eContents().get(1);
		private final Keyword cLengthKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cLengthAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_3_1_1_0 = (RuleCall)cLengthAssignment_3_1_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cUnorderedGroup_3.eContents().get(2);
		private final Keyword cMimetypeKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cMimetypeAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0 = (RuleCall)cMimetypeAssignment_3_2_1.eContents().get(0);
		private final RuleCall cRIGHT_BRACKETTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Sequence:
		//	"Sequence" name=ID
		//	LEFT_BRACKET (("url="? url=STRING) ("description=" description=STRING)? & ("length=" length=INT)? & ("mimetype="
		//	mimetype=Mimetypes_Enum)?) RIGHT_BRACKET;
		@Override public ParserRule getRule() { return rule; }

		//"Sequence" name=ID LEFT_BRACKET (("url="? url=STRING) ("description=" description=STRING)? & ("length=" length=INT)? &
		//("mimetype=" mimetype=Mimetypes_Enum)?) RIGHT_BRACKET
		public Group getGroup() { return cGroup; }

		//"Sequence"
		public Keyword getSequenceKeyword_0() { return cSequenceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//LEFT_BRACKET
		public RuleCall getLEFT_BRACKETTerminalRuleCall_2() { return cLEFT_BRACKETTerminalRuleCall_2; }

		//(("url="? url=STRING) ("description=" description=STRING)? & ("length=" length=INT)? & ("mimetype="
		//mimetype=Mimetypes_Enum)?)
		public UnorderedGroup getUnorderedGroup_3() { return cUnorderedGroup_3; }

		//("url="? url=STRING) ("description=" description=STRING)?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//("url="? url=STRING)
		public Group getGroup_3_0_0() { return cGroup_3_0_0; }

		//"url="?
		public Keyword getUrlKeyword_3_0_0_0() { return cUrlKeyword_3_0_0_0; }

		//url=STRING
		public Assignment getUrlAssignment_3_0_0_1() { return cUrlAssignment_3_0_0_1; }

		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_3_0_0_1_0() { return cUrlSTRINGTerminalRuleCall_3_0_0_1_0; }

		//("description=" description=STRING)?
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }

		//"description="
		public Keyword getDescriptionKeyword_3_0_1_0() { return cDescriptionKeyword_3_0_1_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_0_1_1() { return cDescriptionAssignment_3_0_1_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_0_1_1_0; }

		//("length=" length=INT)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"length="
		public Keyword getLengthKeyword_3_1_0() { return cLengthKeyword_3_1_0; }

		//length=INT
		public Assignment getLengthAssignment_3_1_1() { return cLengthAssignment_3_1_1; }

		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_1_1_0() { return cLengthINTTerminalRuleCall_3_1_1_0; }

		//("mimetype=" mimetype=Mimetypes_Enum)?
		public Group getGroup_3_2() { return cGroup_3_2; }

		//"mimetype="
		public Keyword getMimetypeKeyword_3_2_0() { return cMimetypeKeyword_3_2_0; }

		//mimetype=Mimetypes_Enum
		public Assignment getMimetypeAssignment_3_2_1() { return cMimetypeAssignment_3_2_1; }

		//Mimetypes_Enum
		public RuleCall getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0() { return cMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0; }

		//RIGHT_BRACKET
		public RuleCall getRIGHT_BRACKETTerminalRuleCall_4() { return cRIGHT_BRACKETTerminalRuleCall_4; }
	}
	
	
	public class Mimetypes_EnumElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.Mimetypes_Enum");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNoneEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNoneNONEKeyword_0_0 = (Keyword)cNoneEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMp4EnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMp4MP4Keyword_1_0 = (Keyword)cMp4EnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFlvEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFlvFLVKeyword_2_0 = (Keyword)cFlvEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cMpegtsEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cMpegtsMPEGTSKeyword_3_0 = (Keyword)cMpegtsEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cMpegEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cMpegMPEGKeyword_4_0 = (Keyword)cMpegEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cWebmEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cWebmWEBMKeyword_5_0 = (Keyword)cWebmEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cWmvEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cWmvWMVKeyword_6_0 = (Keyword)cWmvEnumLiteralDeclaration_6.eContents().get(0);
		private final EnumLiteralDeclaration cAviEnumLiteralDeclaration_7 = (EnumLiteralDeclaration)cAlternatives.eContents().get(7);
		private final Keyword cAviAVIKeyword_7_0 = (Keyword)cAviEnumLiteralDeclaration_7.eContents().get(0);
		
		//enum Mimetypes_Enum:
		//	none='NONE' |
		//	mp4='MP4' |
		//	flv='FLV' |
		//	mpegts='MPEGTS' |
		//	mpeg='MPEG' |
		//	webm='WEBM' |
		//	wmv='WMV' |
		//	avi='AVI';
		public EnumRule getRule() { return rule; }

		//none='NONE' | mp4='MP4' | flv='FLV' | mpegts='MPEGTS' | mpeg='MPEG' | webm='WEBM' | wmv='WMV' | avi='AVI'
		public Alternatives getAlternatives() { return cAlternatives; }

		//none='NONE'
		public EnumLiteralDeclaration getNoneEnumLiteralDeclaration_0() { return cNoneEnumLiteralDeclaration_0; }

		//'NONE'
		public Keyword getNoneNONEKeyword_0_0() { return cNoneNONEKeyword_0_0; }

		//mp4='MP4'
		public EnumLiteralDeclaration getMp4EnumLiteralDeclaration_1() { return cMp4EnumLiteralDeclaration_1; }

		//'MP4'
		public Keyword getMp4MP4Keyword_1_0() { return cMp4MP4Keyword_1_0; }

		//flv='FLV'
		public EnumLiteralDeclaration getFlvEnumLiteralDeclaration_2() { return cFlvEnumLiteralDeclaration_2; }

		//'FLV'
		public Keyword getFlvFLVKeyword_2_0() { return cFlvFLVKeyword_2_0; }

		//mpegts='MPEGTS'
		public EnumLiteralDeclaration getMpegtsEnumLiteralDeclaration_3() { return cMpegtsEnumLiteralDeclaration_3; }

		//'MPEGTS'
		public Keyword getMpegtsMPEGTSKeyword_3_0() { return cMpegtsMPEGTSKeyword_3_0; }

		//mpeg='MPEG'
		public EnumLiteralDeclaration getMpegEnumLiteralDeclaration_4() { return cMpegEnumLiteralDeclaration_4; }

		//'MPEG'
		public Keyword getMpegMPEGKeyword_4_0() { return cMpegMPEGKeyword_4_0; }

		//webm='WEBM'
		public EnumLiteralDeclaration getWebmEnumLiteralDeclaration_5() { return cWebmEnumLiteralDeclaration_5; }

		//'WEBM'
		public Keyword getWebmWEBMKeyword_5_0() { return cWebmWEBMKeyword_5_0; }

		//wmv='WMV'
		public EnumLiteralDeclaration getWmvEnumLiteralDeclaration_6() { return cWmvEnumLiteralDeclaration_6; }

		//'WMV'
		public Keyword getWmvWMVKeyword_6_0() { return cWmvWMVKeyword_6_0; }

		//avi='AVI'
		public EnumLiteralDeclaration getAviEnumLiteralDeclaration_7() { return cAviEnumLiteralDeclaration_7; }

		//'AVI'
		public Keyword getAviAVIKeyword_7_0() { return cAviAVIKeyword_7_0; }
	}
	
	private final VideoGenElements pVideoGen;
	private final StatementElements pStatement;
	private final AlternativesElements pAlternatives;
	private final MandatoryElements pMandatory;
	private final OptionalElements pOptional;
	private final SequenceElements pSequence;
	private final Mimetypes_EnumElements eMimetypes_Enum;
	private final TerminalRule tLEFT_BRACKET;
	private final TerminalRule tRIGHT_BRACKET;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public VideoGenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pVideoGen = new VideoGenElements();
		this.pStatement = new StatementElements();
		this.pAlternatives = new AlternativesElements();
		this.pMandatory = new MandatoryElements();
		this.pOptional = new OptionalElements();
		this.pSequence = new SequenceElements();
		this.eMimetypes_Enum = new Mimetypes_EnumElements();
		this.tLEFT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.LEFT_BRACKET");
		this.tRIGHT_BRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.istic.idm.xtext.VideoGen.RIGHT_BRACKET");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.istic.idm.xtext.VideoGen".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//VideoGen:
	//	"VideoGen" LEFT_BRACKET
	//	statements+=Statement+
	//	RIGHT_BRACKET;
	public VideoGenElements getVideoGenAccess() {
		return pVideoGen;
	}
	
	public ParserRule getVideoGenRule() {
		return getVideoGenAccess().getRule();
	}

	//Statement:
	//	"@Optional" Optional | "@Mandatory"? Mandatory | Alternatives;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}

	//Alternatives:
	//	"Alternatives" name=ID LEFT_BRACKET
	//	options+=Optional+
	//	RIGHT_BRACKET;
	public AlternativesElements getAlternativesAccess() {
		return pAlternatives;
	}
	
	public ParserRule getAlternativesRule() {
		return getAlternativesAccess().getRule();
	}

	//Mandatory:
	//	sequence=Sequence;
	public MandatoryElements getMandatoryAccess() {
		return pMandatory;
	}
	
	public ParserRule getMandatoryRule() {
		return getMandatoryAccess().getRule();
	}

	//Optional:
	//	("@Probability(" probability=INT ")")?
	//	sequence=Sequence;
	public OptionalElements getOptionalAccess() {
		return pOptional;
	}
	
	public ParserRule getOptionalRule() {
		return getOptionalAccess().getRule();
	}

	//Sequence:
	//	"Sequence" name=ID
	//	LEFT_BRACKET (("url="? url=STRING) ("description=" description=STRING)? & ("length=" length=INT)? & ("mimetype="
	//	mimetype=Mimetypes_Enum)?) RIGHT_BRACKET;
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}

	//enum Mimetypes_Enum:
	//	none='NONE' |
	//	mp4='MP4' |
	//	flv='FLV' |
	//	mpegts='MPEGTS' |
	//	mpeg='MPEG' |
	//	webm='WEBM' |
	//	wmv='WMV' |
	//	avi='AVI';
	public Mimetypes_EnumElements getMimetypes_EnumAccess() {
		return eMimetypes_Enum;
	}
	
	public EnumRule getMimetypes_EnumRule() {
		return getMimetypes_EnumAccess().getRule();
	}

	//terminal LEFT_BRACKET:
	//	'{';
	public TerminalRule getLEFT_BRACKETRule() {
		return tLEFT_BRACKET;
	} 

	//terminal RIGHT_BRACKET:
	//	'}';
	public TerminalRule getRIGHT_BRACKETRule() {
		return tRIGHT_BRACKET;
	} 

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
