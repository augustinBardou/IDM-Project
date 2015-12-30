package org.istic.idm.xtext.utils;

/**
 * Enum to bind different mime types format to HTML and fffmpeg parameters
 * 
 * FIXME : should be better in xtend to normalize BUT enum in xtend does not appear to take parameters ???
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
public enum VideoCodec {
	MP4("mp4", "mp4", "video/mp4"),
	FLV("flv", "flv", "video/flash"),
	MPEGTS("mpegts", "ts", "video/mpeg"),
	MPEG("mpeg", "mpg", "video/mpeg"),
	WEBM("webm", "webm", "video/webm"),
	WMV("wmv", "wmv", "video/x-ms-wmv"),
	AVI("avi", "avi", "video/x-msvideo");

	private final String extention;
	private final String mimeType;
	private final String format;
    
    VideoCodec(String format, String extention, String mimeType) {
        this.extention = extention;
        this.mimeType = mimeType;
        this.format = format;
    }
    String extention() { return extention; }
    String mimeType() { return mimeType; }
    String format() { return format; }
}
