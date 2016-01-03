package org.istic.idm.xtext.utils

import java.util.ArrayList
import java.util.Collection
import org.istic.idm.xtext.videoGen.Alternatives
import org.istic.idm.xtext.videoGen.Mandatory
import org.istic.idm.xtext.videoGen.Optional
import org.istic.idm.xtext.videoGen.Sequence
import org.istic.idm.xtext.videoGen.VideoGen

/** 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 * 
 */
public class VideoGenHelper {
	
 	/**
 	 * Return all sequences contained in a VideoGen instance
 	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 	 */ 
    def static Collection<Sequence> allSequences(VideoGen videoGen) {
		val Collection<Sequence> sequences = new ArrayList<Sequence>
			
        videoGen.statements.forEach[statement |
			if (statement instanceof Alternatives) {
				statement.options.forEach[option |
					sequences += option.sequence
				]
			} else if(statement instanceof Mandatory) {
				sequences += statement.sequence
			} else if(statement instanceof Optional) {
				sequences += statement.sequence
			}
		]
		sequences
    }

}
