/**
 */
package org.istic.idm.xtext.videoGen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mimetypes Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.istic.idm.xtext.videoGen.VideoGenPackage#getMimetypes_Enum()
 * @model
 * @generated
 */
public enum Mimetypes_Enum implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "NONE"),

	/**
	 * The '<em><b>Mp4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MP4_VALUE
	 * @generated
	 * @ordered
	 */
	MP4(1, "mp4", "MP4"),

	/**
	 * The '<em><b>Flv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLV_VALUE
	 * @generated
	 * @ordered
	 */
	FLV(2, "flv", "FLV"),

	/**
	 * The '<em><b>Mpegts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPEGTS_VALUE
	 * @generated
	 * @ordered
	 */
	MPEGTS(3, "mpegts", "MPEGTS"),

	/**
	 * The '<em><b>Mpeg</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MPEG_VALUE
	 * @generated
	 * @ordered
	 */
	MPEG(4, "mpeg", "MPEG"),

	/**
	 * The '<em><b>Webm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBM_VALUE
	 * @generated
	 * @ordered
	 */
	WEBM(5, "webm", "WEBM"),

	/**
	 * The '<em><b>Wmv</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WMV_VALUE
	 * @generated
	 * @ordered
	 */
	WMV(6, "wmv", "WMV"),

	/**
	 * The '<em><b>Avi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVI_VALUE
	 * @generated
	 * @ordered
	 */
	AVI(7, "avi", "AVI");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none" literal="NONE"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Mp4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mp4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MP4
	 * @model name="mp4" literal="MP4"
	 * @generated
	 * @ordered
	 */
	public static final int MP4_VALUE = 1;

	/**
	 * The '<em><b>Flv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLV
	 * @model name="flv" literal="FLV"
	 * @generated
	 * @ordered
	 */
	public static final int FLV_VALUE = 2;

	/**
	 * The '<em><b>Mpegts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mpegts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPEGTS
	 * @model name="mpegts" literal="MPEGTS"
	 * @generated
	 * @ordered
	 */
	public static final int MPEGTS_VALUE = 3;

	/**
	 * The '<em><b>Mpeg</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mpeg</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MPEG
	 * @model name="mpeg" literal="MPEG"
	 * @generated
	 * @ordered
	 */
	public static final int MPEG_VALUE = 4;

	/**
	 * The '<em><b>Webm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Webm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEBM
	 * @model name="webm" literal="WEBM"
	 * @generated
	 * @ordered
	 */
	public static final int WEBM_VALUE = 5;

	/**
	 * The '<em><b>Wmv</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wmv</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WMV
	 * @model name="wmv" literal="WMV"
	 * @generated
	 * @ordered
	 */
	public static final int WMV_VALUE = 6;

	/**
	 * The '<em><b>Avi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Avi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVI
	 * @model name="avi" literal="AVI"
	 * @generated
	 * @ordered
	 */
	public static final int AVI_VALUE = 7;

	/**
	 * An array of all the '<em><b>Mimetypes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Mimetypes_Enum[] VALUES_ARRAY =
		new Mimetypes_Enum[] {
			NONE,
			MP4,
			FLV,
			MPEGTS,
			MPEG,
			WEBM,
			WMV,
			AVI,
		};

	/**
	 * A public read-only list of all the '<em><b>Mimetypes Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Mimetypes_Enum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mimetypes Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mimetypes_Enum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mimetypes_Enum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mimetypes Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mimetypes_Enum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mimetypes_Enum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mimetypes Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Mimetypes_Enum get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case MP4_VALUE: return MP4;
			case FLV_VALUE: return FLV;
			case MPEGTS_VALUE: return MPEGTS;
			case MPEG_VALUE: return MPEG;
			case WEBM_VALUE: return WEBM;
			case WMV_VALUE: return WMV;
			case AVI_VALUE: return AVI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Mimetypes_Enum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Mimetypes_Enum
