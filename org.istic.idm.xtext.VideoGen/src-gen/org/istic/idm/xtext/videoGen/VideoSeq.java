/**
 */
package org.istic.idm.xtext.videoGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videoGen.VideoSeq#getName <em>Name</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videoGen.VideoSeq#getUrl <em>Url</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videoGen.VideoSeq#getLength <em>Length</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videoGen.VideoSeq#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videoGen.VideoSeq#getProb <em>Prob</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq()
 * @model
 * @generated
 */
public interface VideoSeq extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.VideoSeq#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.VideoSeq#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.VideoSeq#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.VideoSeq#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Prob</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prob</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prob</em>' attribute.
   * @see #setProb(int)
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getVideoSeq_Prob()
   * @model
   * @generated
   */
  int getProb();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.VideoSeq#getProb <em>Prob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prob</em>' attribute.
   * @see #getProb()
   * @generated
   */
  void setProb(int value);

} // VideoSeq
