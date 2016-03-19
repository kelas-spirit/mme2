package shmmy.ntua.gr.mme2.controller.Helpers;

import java.io.UnsupportedEncodingException;
import java.sql.Blob;
import java.sql.SQLException;

import org.apache.commons.codec.binary.Base64;

public class DocumentHelper {

	
	public String fromBlobToString(Blob blob){
		
		byte[] blobAsBytes=null;
		String base64Encoded=null;
		try {
			blobAsBytes = blob.getBytes(1, (int) blob.length());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] encodeBase64=Base64.encodeBase64(blobAsBytes);
		try {
			 base64Encoded = new String(encodeBase64, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return base64Encoded;
	}
	
}
