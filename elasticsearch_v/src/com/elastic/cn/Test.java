package com.elastic.cn;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.List;

import org.korecky.sharepoint.SPList;
import org.korecky.sharepoint.SPListCollection;
import org.korecky.sharepoint.SPSite;
import org.korecky.sharepoint.SPVersion;
import org.korecky.sharepoint.SPWeb;
import org.korecky.sharepoint.authentication.NtlmAuthenticator;
import org.korecky.sharepoint.net.HttpProxy;

/**
 * Created by shushuwang on 2016-1-12
 */
public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws MalformedURLException 
	 * @throws NoSuchAlgorithmException 
	 * @throws KeyManagementException 
	 */
	public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, MalformedURLException, ParseException {
		// Create NTLM v2 credentials (authenticator)
		NtlmAuthenticator credentials = new NtlmAuthenticator("DOMAIN", "username", "password");
		// Initialize proxy settings
		HttpProxy httpProxy = new HttpProxy("myProxyServer.com", 8888);
		// Connect to Sharepoint
		SPSite instance = new SPSite(new URL("https://www.server.com/"), credentials, httpProxy, true, SPVersion.SP2013);
		// Get root web instance
		SPWeb rootWeb = instance.getRootWeb();
		// Get list of all lists and document libraries from root web
		SPListCollection lists = rootWeb.getLists();

		

		// Save file stored in sharepoint document library to the local disk
		File file = new File("/myLocalPath/filename.ext");
//		item.getFile().saveBinary(file);

	}

}
