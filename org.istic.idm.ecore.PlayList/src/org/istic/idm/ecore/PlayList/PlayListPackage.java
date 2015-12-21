/**
 */
package org.istic.idm.ecore.PlayList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.istic.idm.ecore.PlayList.impl.PlayListPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.istic.idm.ecore.PlayList.PlayListFactory
 * @model kind="package"
 * @generated
 */
public interface PlayListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org.istic.idm.ecore.PlayList";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/org.istic.idm.ecore.PlayList";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.istic.idm.ecore.PlayList";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlayListPackage eINSTANCE = PlayListPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.istic.idm.ecore.PlayList.impl.PlayListImpl <em>Play List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.ecore.PlayList.impl.PlayListImpl
	 * @see org.istic.idm.ecore.PlayList.impl.PlayListPackageImpl#getPlayList()
	 * @generated
	 */
	int PLAY_LIST = 0;

	/**
	 * The feature id for the '<em><b>Video</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST__VIDEO = 0;

	/**
	 * The number of structural features of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.istic.idm.ecore.PlayList.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.istic.idm.ecore.PlayList.impl.VideoImpl
	 * @see org.istic.idm.ecore.PlayList.impl.PlayListPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PATH = 2;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__MIMETYPE = 3;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.istic.idm.ecore.PlayList.PlayList <em>Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play List</em>'.
	 * @see org.istic.idm.ecore.PlayList.PlayList
	 * @generated
	 */
	EClass getPlayList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.istic.idm.ecore.PlayList.PlayList#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video</em>'.
	 * @see org.istic.idm.ecore.PlayList.PlayList#getVideo()
	 * @see #getPlayList()
	 * @generated
	 */
	EReference getPlayList_Video();

	/**
	 * Returns the meta object for class '{@link org.istic.idm.ecore.PlayList.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see org.istic.idm.ecore.PlayList.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.ecore.PlayList.Video#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.istic.idm.ecore.PlayList.Video#getDuration()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.ecore.PlayList.Video#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.istic.idm.ecore.PlayList.Video#getDescription()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.ecore.PlayList.Video#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.istic.idm.ecore.PlayList.Video#getPath()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.istic.idm.ecore.PlayList.Video#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see org.istic.idm.ecore.PlayList.Video#getMimetype()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Mimetype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlayListFactory getPlayListFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.istic.idm.ecore.PlayList.impl.PlayListImpl <em>Play List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.ecore.PlayList.impl.PlayListImpl
		 * @see org.istic.idm.ecore.PlayList.impl.PlayListPackageImpl#getPlayList()
		 * @generated
		 */
		EClass PLAY_LIST = eINSTANCE.getPlayList();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY_LIST__VIDEO = eINSTANCE.getPlayList_Video();

		/**
		 * The meta object literal for the '{@link org.istic.idm.ecore.PlayList.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.istic.idm.ecore.PlayList.impl.VideoImpl
		 * @see org.istic.idm.ecore.PlayList.impl.PlayListPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DURATION = eINSTANCE.getVideo_Duration();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DESCRIPTION = eINSTANCE.getVideo_Description();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__PATH = eINSTANCE.getVideo_Path();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__MIMETYPE = eINSTANCE.getVideo_Mimetype();

	}

} //PlayListPackage
