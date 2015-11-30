/**
 */
package org.istic.idm.xtext.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videoGen.Alternative#getName <em>Name</em>}</li>
 *   <li>{@link org.istic.idm.xtext.videoGen.Alternative#getVideoseqs <em>Videoseqs</em>}</li>
 * </ul>
 *
 * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Statement
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
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getAlternative_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.istic.idm.xtext.videoGen.Alternative#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Videoseqs</b></em>' containment reference list.
   * The list contents are of type {@link org.istic.idm.xtext.videoGen.VideoSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoseqs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoseqs</em>' containment reference list.
   * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getAlternative_Videoseqs()
   * @model containment="true"
   * @generated
   */
  EList<VideoSeq> getVideoseqs();

} // Alternative
