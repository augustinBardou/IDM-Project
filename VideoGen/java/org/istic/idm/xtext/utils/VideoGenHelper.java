package org.istic.idm.xtext.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.istic.idm.xtext.videoGen.Alternatives;
import org.istic.idm.xtext.videoGen.Mandatory;
import org.istic.idm.xtext.videoGen.Optional;
import org.istic.idm.xtext.videoGen.Sequence;
import org.istic.idm.xtext.videoGen.Statement;
import org.istic.idm.xtext.videoGen.VideoGen;

/**
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
@SuppressWarnings("all")
public class VideoGenHelper {
  /**
   * Return all sequences contained in a VideoGen instance
   * 
   * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
   */
  public static Collection<Sequence> allSequences(final VideoGen videoGen) {
    Collection<Sequence> _xblockexpression = null;
    {
      final Collection<Sequence> sequences = new ArrayList<Sequence>();
      EList<Statement> _statements = videoGen.getStatements();
      final Consumer<Statement> _function = (Statement statement) -> {
        if ((statement instanceof Alternatives)) {
          EList<Optional> _options = ((Alternatives)statement).getOptions();
          final Consumer<Optional> _function_1 = (Optional option) -> {
            Sequence _sequence = option.getSequence();
            sequences.add(_sequence);
          };
          _options.forEach(_function_1);
        } else {
          if ((statement instanceof Mandatory)) {
            Sequence _sequence = ((Mandatory)statement).getSequence();
            sequences.add(_sequence);
          } else {
            if ((statement instanceof Optional)) {
              Sequence _sequence_1 = ((Optional)statement).getSequence();
              sequences.add(_sequence_1);
            }
          }
        }
      };
      _statements.forEach(_function);
      _xblockexpression = sequences;
    }
    return _xblockexpression;
  }
}
