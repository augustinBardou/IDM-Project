/**
 */
package org.istic.idm.ecore.PlayList.tests;

import org.istic.idm.ecore.PlayList.PlayList;
import org.istic.idm.ecore.PlayList.PlayListFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Play List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayListTest extends TestCase {

	/**
	 * The fixture for this Play List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayListTest.class);
	}

	/**
	 * Constructs a new Play List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Play List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PlayList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Play List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayList getFixture() {
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
		setFixture(PlayListFactory.eINSTANCE.createPlayList());
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

} //PlayListTest
