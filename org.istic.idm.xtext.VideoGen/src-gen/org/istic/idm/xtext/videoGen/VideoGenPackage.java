/**
 */
package org.istic.idm.xtext.videoGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.istic.idm.xtext.videoGen.VideoGenFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videoGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.org/idm/xtext/VideoGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videoGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenPackage eINSTANCE = org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl.init();

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getVideoGen()
   * @generated
   */
  int VIDEO_GEN = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Video Gen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.StatementImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.AlternativeImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Videoseqs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__VIDEOSEQS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.VideoSeqImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
   * @generated
   */
  int VIDEO_SEQ = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__NAME = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__URL = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__DESC = 3;

  /**
   * The feature id for the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__PROB = 4;

  /**
   * The number of structural features of the '<em>Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.MandatoryVideoSeqImpl <em>Mandatory Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.MandatoryVideoSeqImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getMandatoryVideoSeq()
   * @generated
   */
  int MANDATORY_VIDEO_SEQ = 4;

  /**
   * The feature id for the '<em><b>Videoseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VIDEO_SEQ__VIDEOSEQ = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VIDEO_SEQ_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.istic.idm.xtext.videoGen.impl.OptionalVideoSeqImpl <em>Optional Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.istic.idm.xtext.videoGen.impl.OptionalVideoSeqImpl
   * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getOptionalVideoSeq()
   * @generated
   */
  int OPTIONAL_VIDEO_SEQ = 5;

  /**
   * The feature id for the '<em><b>Videoseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VIDEO_SEQ__VIDEOSEQ = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VIDEO_SEQ_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoGen
   * @generated
   */
  EClass getVideoGen();

  /**
   * Returns the meta object for the containment reference list '{@link org.istic.idm.xtext.videoGen.VideoGen#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoGen#getStatements()
   * @see #getVideoGen()
   * @generated
   */
  EReference getVideoGen_Statements();

  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.istic.idm.xtext.videoGen.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see org.istic.idm.xtext.videoGen.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.Alternative#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.istic.idm.xtext.videoGen.Alternative#getName()
   * @see #getAlternative()
   * @generated
   */
  EAttribute getAlternative_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.istic.idm.xtext.videoGen.Alternative#getVideoseqs <em>Videoseqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videoseqs</em>'.
   * @see org.istic.idm.xtext.videoGen.Alternative#getVideoseqs()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_Videoseqs();

  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.VideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Seq</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq
   * @generated
   */
  EClass getVideoSeq();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.VideoSeq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq#getName()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Name();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.VideoSeq#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq#getUrl()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Url();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.VideoSeq#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq#getLength()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Length();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.VideoSeq#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq#getDesc()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Desc();

  /**
   * Returns the meta object for the attribute '{@link org.istic.idm.xtext.videoGen.VideoSeq#getProb <em>Prob</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prob</em>'.
   * @see org.istic.idm.xtext.videoGen.VideoSeq#getProb()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Prob();

  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.MandatoryVideoSeq <em>Mandatory Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Video Seq</em>'.
   * @see org.istic.idm.xtext.videoGen.MandatoryVideoSeq
   * @generated
   */
  EClass getMandatoryVideoSeq();

  /**
   * Returns the meta object for the containment reference '{@link org.istic.idm.xtext.videoGen.MandatoryVideoSeq#getVideoseq <em>Videoseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Videoseq</em>'.
   * @see org.istic.idm.xtext.videoGen.MandatoryVideoSeq#getVideoseq()
   * @see #getMandatoryVideoSeq()
   * @generated
   */
  EReference getMandatoryVideoSeq_Videoseq();

  /**
   * Returns the meta object for class '{@link org.istic.idm.xtext.videoGen.OptionalVideoSeq <em>Optional Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Video Seq</em>'.
   * @see org.istic.idm.xtext.videoGen.OptionalVideoSeq
   * @generated
   */
  EClass getOptionalVideoSeq();

  /**
   * Returns the meta object for the containment reference '{@link org.istic.idm.xtext.videoGen.OptionalVideoSeq#getVideoseq <em>Videoseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Videoseq</em>'.
   * @see org.istic.idm.xtext.videoGen.OptionalVideoSeq#getVideoseq()
   * @see #getOptionalVideoSeq()
   * @generated
   */
  EReference getOptionalVideoSeq_Videoseq();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideoGenFactory getVideoGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getVideoGen()
     * @generated
     */
    EClass VIDEO_GEN = eINSTANCE.getVideoGen();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN__STATEMENTS = eINSTANCE.getVideoGen_Statements();

    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.StatementImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.AlternativeImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVE__NAME = eINSTANCE.getAlternative_Name();

    /**
     * The meta object literal for the '<em><b>Videoseqs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__VIDEOSEQS = eINSTANCE.getAlternative_Videoseqs();

    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.VideoSeqImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
     * @generated
     */
    EClass VIDEO_SEQ = eINSTANCE.getVideoSeq();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__NAME = eINSTANCE.getVideoSeq_Name();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__URL = eINSTANCE.getVideoSeq_Url();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__LENGTH = eINSTANCE.getVideoSeq_Length();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__DESC = eINSTANCE.getVideoSeq_Desc();

    /**
     * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__PROB = eINSTANCE.getVideoSeq_Prob();

    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.MandatoryVideoSeqImpl <em>Mandatory Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.MandatoryVideoSeqImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getMandatoryVideoSeq()
     * @generated
     */
    EClass MANDATORY_VIDEO_SEQ = eINSTANCE.getMandatoryVideoSeq();

    /**
     * The meta object literal for the '<em><b>Videoseq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY_VIDEO_SEQ__VIDEOSEQ = eINSTANCE.getMandatoryVideoSeq_Videoseq();

    /**
     * The meta object literal for the '{@link org.istic.idm.xtext.videoGen.impl.OptionalVideoSeqImpl <em>Optional Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.istic.idm.xtext.videoGen.impl.OptionalVideoSeqImpl
     * @see org.istic.idm.xtext.videoGen.impl.VideoGenPackageImpl#getOptionalVideoSeq()
     * @generated
     */
    EClass OPTIONAL_VIDEO_SEQ = eINSTANCE.getOptionalVideoSeq();

    /**
     * The meta object literal for the '<em><b>Videoseq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_VIDEO_SEQ__VIDEOSEQ = eINSTANCE.getOptionalVideoSeq_Videoseq();

  }

} //VideoGenPackage
