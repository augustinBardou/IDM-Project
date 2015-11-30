/**
 */
package org.istic.idm.xtext.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.istic.idm.xtext.videoGen.MandatoryVideoSeq;
import org.istic.idm.xtext.videoGen.VideoGenPackage;
import org.istic.idm.xtext.videoGen.VideoSeq;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Video Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.istic.idm.xtext.videoGen.impl.MandatoryVideoSeqImpl#getVideoseq <em>Videoseq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandatoryVideoSeqImpl extends StatementImpl implements MandatoryVideoSeq
{
  /**
   * The cached value of the '{@link #getVideoseq() <em>Videoseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideoseq()
   * @generated
   * @ordered
   */
  protected VideoSeq videoseq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MandatoryVideoSeqImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VideoGenPackage.Literals.MANDATORY_VIDEO_SEQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoSeq getVideoseq()
  {
    return videoseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVideoseq(VideoSeq newVideoseq, NotificationChain msgs)
  {
    VideoSeq oldVideoseq = videoseq;
    videoseq = newVideoseq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ, oldVideoseq, newVideoseq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideoseq(VideoSeq newVideoseq)
  {
    if (newVideoseq != videoseq)
    {
      NotificationChain msgs = null;
      if (videoseq != null)
        msgs = ((InternalEObject)videoseq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ, null, msgs);
      if (newVideoseq != null)
        msgs = ((InternalEObject)newVideoseq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ, null, msgs);
      msgs = basicSetVideoseq(newVideoseq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ, newVideoseq, newVideoseq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ:
        return basicSetVideoseq(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ:
        return getVideoseq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ:
        setVideoseq((VideoSeq)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ:
        setVideoseq((VideoSeq)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY_VIDEO_SEQ__VIDEOSEQ:
        return videoseq != null;
    }
    return super.eIsSet(featureID);
  }

} //MandatoryVideoSeqImpl
