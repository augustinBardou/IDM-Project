/*
 * generated by Xtext
 */
grammar InternalVideoGen;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.istic.idm.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.istic.idm.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.istic.idm.xtext.services.VideoGenGrammarAccess;

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleVideoGen
entryRuleVideoGen returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVideoGenRule()); }
	 iv_ruleVideoGen=ruleVideoGen 
	 { $current=$iv_ruleVideoGen.current; } 
	 EOF 
;

// Rule VideoGen
ruleVideoGen returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='VideoGen' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
    }
this_LEFT_BRACKET_1=RULE_LEFT_BRACKET
    { 
    newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
	    }
		lv_statements_2_0=ruleStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVideoGenRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_2_0, 
        		"Statement");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_RIGHT_BRACKET_3=RULE_RIGHT_BRACKET
    { 
    newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
    }
)
;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='@Optional' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOptionalKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
    }
    this_Optional_1=ruleOptional
    { 
        $current = $this_Optional_1.current; 
        afterParserOrEnumRuleCall();
    }
)
    |((	otherlv_2='@Mandatory' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getMandatoryKeyword_1_0());
    }
)?
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
    }
    this_Mandatory_3=ruleMandatory
    { 
        $current = $this_Mandatory_3.current; 
        afterParserOrEnumRuleCall();
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
    }
    this_Alternatives_4=ruleAlternatives
    { 
        $current = $this_Alternatives_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAlternatives
entryRuleAlternatives returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlternativesRule()); }
	 iv_ruleAlternatives=ruleAlternatives 
	 { $current=$iv_ruleAlternatives.current; } 
	 EOF 
;

// Rule Alternatives
ruleAlternatives returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Alternatives' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlternativesRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)this_LEFT_BRACKET_2=RULE_LEFT_BRACKET
    { 
    newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
	    }
		lv_options_3_0=ruleOptional		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlternativesRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_3_0, 
        		"Optional");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_RIGHT_BRACKET_4=RULE_RIGHT_BRACKET
    { 
    newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
    }
)
;





// Entry rule entryRuleMandatory
entryRuleMandatory returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMandatoryRule()); }
	 iv_ruleMandatory=ruleMandatory 
	 { $current=$iv_ruleMandatory.current; } 
	 EOF 
;

// Rule Mandatory
ruleMandatory returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
	    }
		lv_sequence_0_0=ruleSequence		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryRule());
	        }
       		set(
       			$current, 
       			"sequence",
        		lv_sequence_0_0, 
        		"Sequence");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleOptional
entryRuleOptional returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionalRule()); }
	 iv_ruleOptional=ruleOptional 
	 { $current=$iv_ruleOptional.current; } 
	 EOF 
;

// Rule Optional
ruleOptional returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='@Probability(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0());
    }
(
(
		lv_probability_1_0=RULE_INT
		{
			newLeafNode(lv_probability_1_0, grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"probability",
        		lv_probability_1_0, 
        		"INT");
	    }

)
)	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2());
    }
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
	    }
		lv_sequence_3_0=ruleSequence		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalRule());
	        }
       		set(
       			$current, 
       			"sequence",
        		lv_sequence_3_0, 
        		"Sequence");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	 iv_ruleSequence=ruleSequence 
	 { $current=$iv_ruleSequence.current; } 
	 EOF 
;

// Rule Sequence
ruleSequence returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Sequence' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)this_LEFT_BRACKET_2=RULE_LEFT_BRACKET
    { 
    newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
    }
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
	 				}
					({true}?=>(((	otherlv_4='url=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0());
    }
)?(
(
		lv_url_5_0=RULE_STRING
		{
			newLeafNode(lv_url_5_0, grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"url",
        		lv_url_5_0, 
        		"STRING");
	    }

)
))(	otherlv_6='description=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0());
    }
(
(
		lv_description_7_0=RULE_STRING
		{
			newLeafNode(lv_description_7_0, grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_7_0, 
        		"STRING");
	    }

)
))?))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
	 				}
					({true}?=>(	otherlv_8='length=' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0());
    }
(
(
		lv_length_9_0=RULE_INT
		{
			newLeafNode(lv_length_9_0, grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"length",
        		lv_length_9_0, 
        		"INT");
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
	 				}
					({true}?=>(	otherlv_10='mimetype=' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
	    }
		lv_mimetype_11_0=ruleMimetypes_Enum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		set(
       			$current, 
       			"mimetype",
        		lv_mimetype_11_0, 
        		"Mimetypes_Enum");
	        afterParserOrEnumRuleCall();
	    }

)
)))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
	}

)this_RIGHT_BRACKET_12=RULE_RIGHT_BRACKET
    { 
    newLeafNode(this_RIGHT_BRACKET_12, grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
    }
)
;





// Rule Mimetypes_Enum
ruleMimetypes_Enum returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='NONE' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='MP4' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='FLV' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='MPEGTS' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='MPEG' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='WEBM' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='WMV' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='AVI' 
	{
        $current = grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 
    }
));



RULE_LEFT_BRACKET : '{';

RULE_RIGHT_BRACKET : '}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


