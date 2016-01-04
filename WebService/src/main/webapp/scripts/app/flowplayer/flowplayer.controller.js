'use strict';

angular.module('videogenApp')
    .controller('FlowPlayerController', function ($scope) {
    	
    	flowplayer("FLOWPLAYER", "../../libs/flowplayer/flowplayer.swf", {
    		   wmode: 'direct',
    		   plugins: {
    		       httpstreaming: {
    		           url: '../../libs/flowplayer/flowplayerhls.swf',
    		           hls_debug : false,
    		           hls_debug2 : false,
    		           hls_lowbufferlength : 3,
    		           hls_minbufferlength : 5,
    		           hls_maxbufferlength : 0,
    		           hls_startfromlevel : -1,
    		           hls_seekfromlevel : -1,
    		           hls_live_flushurlcache : false,
    		           hls_seekmode : "ACCURATE",
    		           hls_fragmentloadmaxretry : -1,
    		           hls_manifestloadmaxretry : -1,
    		           hls_capleveltostage : false,
    		           hls_maxlevelcappingmode : "downscale"
    		       }
    		   },
    		   clip: {
    		       accelerated: true,
    		       url: "/api/playlist.m3u8",
    		       urlResolvers: "httpstreaming",
    		       lang: "fr",
    		       provider: "httpstreaming",
    		       autoPlay: false,
    		       autoBuffering: true
    		   },
    		   log: {
    		       level: 'none',
    		       filter: 'org.flowplayer.controller.*'
    		   }
    		});
    });
