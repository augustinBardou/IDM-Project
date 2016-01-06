/**
 */
package org.istic.idm.ecore.PlayList.tests;

import org.istic.idm.ecore.PlayList.PlayListFactory;
import org.istic.idm.ecore.PlayList.Video;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoTest extends TestCase {

	/**
	 * The fixture for this Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Video fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VideoTest.class);
	}

	/**
	 * Constructs a new Video test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Video fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Video test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Video getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlayListFactory.eINSTANCE.createVideo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VideoTest
