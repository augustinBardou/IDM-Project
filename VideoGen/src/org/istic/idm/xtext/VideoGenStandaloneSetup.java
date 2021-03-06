/*
 * generated by Xtext
 */
package org.istic.idm.xtext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.istic.idm.xtext.videoGen.VideoGen;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VideoGenStandaloneSetup extends VideoGenStandaloneSetupGenerated{

	public static void doSetup() {
		new VideoGenStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public static VideoGen loadVideoGen(String filename) {
		doSetup();
		URI uri = URI.createURI(filename);
		Resource res = new ResourceSetImpl().getResource(uri, true);
		return (VideoGen) res.getContents().get(0);
	}
	
}

