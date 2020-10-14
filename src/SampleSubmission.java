/**
 * In this program you will write your first name in bytes in 2 different encodings.
 * Then convert the byte array to a String and print it out.
 * 
 * TODO in lecture: show students how I google to find the bytes for my name in both encodings.
 * 
 * @author melvyn
 *
 */

import java.io.UnsupportedEncodingException;

public class SampleSubmission {
	private static String createMyNameFromUTF8Bytes() throws UnsupportedEncodingException {
		byte[] utf8Bytes = {
				(byte) 0x30 // "0"
		};
		return new String(utf8Bytes, "UTF-8");
	}
	
	private static String createMyNameFromUTF16Bytes() throws UnsupportedEncodingException {
		// Note: heres a website that shows utf16 binary for different bytes.
		// https://asecuritysite.com/coding/asc2?val=0%2C255
		byte[] utf16Bytes = {
				(byte) 0x00, (byte) 0x30 // "0"
		};
		return new String(utf16Bytes, "UTF-16");
	}
	
	public static void main(String[] args) {
		String s8 = null;
		String s16 = null;
		
		try {
			s8  = createMyNameFromUTF8Bytes();
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			s16  = createMyNameFromUTF16Bytes();
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("String created with utf8 bytes: "  + s8);
		System.out.println("String created with utf16 bytes: " + s16);
		System.out.println("Are the strings equal? " + s8.equals(s16));
	}
	
}
