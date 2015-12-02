package org.istic.idm.xtext;

public enum VideoCodec {
	MP4("mp4"),
	FLV("flv"),
	MPEGTS("ts"),
	MPEG("mpg"),
	AVI("avi");

	private final String extention;
    
    VideoCodec(String extention) {
        this.extention = extention;
    }
    String extention() { return extention; }
}
