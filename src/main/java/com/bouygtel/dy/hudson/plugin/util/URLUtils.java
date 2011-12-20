/**
 * 
 */
package com.bouygtel.dy.hudson.plugin.util;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author rchaumie
 *
 */
public class URLUtils {
	
	public static final String HTTP_PROTOCOL_PREFIX = "http";
	
	/**
	 * 
	 * @param URLName
	 * @return
	 */
	public static boolean exists(String URLName){
	    try {
	      HttpURLConnection.setFollowRedirects(false);
	      // note : you may also need
	      //        HttpURLConnection.setInstanceFollowRedirects(false)
	      HttpURLConnection con = (HttpURLConnection) new URL(URLName).openConnection();
	      con.setRequestMethod("HEAD");
	      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
	    }
	    catch (Exception e) {
//	       e.printStackTrace();
	       return false;
	    }
	  }

}
