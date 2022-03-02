/* 
 @author:Valmiri
 @verzion: v.1  
 */


package Ashifrimi;
import java.util.*;

public class MonoAlphabetic {
	public static void main(String args[]) {
		 new MonoAlphabetic();
		String m = "TUNG", e="", d="";
		System.out.println(m);
		 e= encrypt(m, mapp_eng);
		System.out.println(e);
		 d = decrypt(e, mapp_eng);
		System.out.println("dec:");
		System.out.println(d);		
	}
	public static Map<Character, Character> mapp_eng;
	
	public MonoAlphabetic() {
		mapp_eng = new HashMap<Character, Character>(26);
		
		Character[] freqEng
			= { 'Q','W','E','R','T','Y','U','I','O','P',
		        'A','S','D','F','G','H','J','K','L','Z',
			    'X','C','V','B','N','M'};

		for (int i = 0; i < 26; i++) {
			char ch =(char)(i + 'A');
			char freq = freqEng[i];
			mapp_eng.put( freq,ch);
		}
		
		/*
		String keys ="",String values="";
		for (Map.Entry<Character, Character> entry : mapp_eng.entrySet()) {
			Character c = entry.getKey();
			Character d = entry.getValue();
			keys += c;
			values+= c+"="+d+", "; 
		}
		System.out.println("Key:");
		System.out.println(keys);
		System.out.println("Values:");
		System.out.println(values);
		*/
	}
	
	public static String encrypt(String message, Map<Character, Character> key) {
		String  code = "";
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = Character.toUpperCase(ch);
				char c = key.get(ch); 
				code +=c+"";
			}
		}
		return  code;
	}
	
	public static String decrypt(String code, Map<Character, Character> key) {
		
		Map<Character, Character> inv = new HashMap<Character, Character>(26);
		
		for (char kch = 'A'; kch <= 'Z'; kch++) { 
			char valueChar = key.get(kch); 
			inv.put(valueChar, kch );
		} 
		return encrypt(code, inv);
	}
}
