/**
 */
package org.istic.idm.xtext.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videoGen.OptionalVideoSeq#getVideoseq <em>Videoseq</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getOptionalVideoSeq()
 * @model
 * @generated
 */
public interface OptionalVideoSeq extends Statement
{
  /**
   * Returns the value of the '<em><b>Videoseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoseq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoseq</em>' containment reference.
   * @see #setVideoseq(VideoSeq)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getOptionalVideoSeq_Videoseq()
   * @model containment="true"
   * @generated
   */
  VideoSeq getVideoseq();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.OptionalVideoSeq#getVideoseq <em>Videoseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Videoseq</em>' containment reference.
   * @see #getVideoseq()
   * @generated
   */
  void setVideoseq(VideoSeq value);

} // OptionalVideoSeq
