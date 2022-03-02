package Ashifrimi;
import java.util.*;

public class OTP {
	
	   public static void main(String[] args){
		      String text = "ONE TIME PLAINTEXT";
		      String key = RandomAlpha(text.length());
		      System.out.println(key);
		      
		      String enc = Encryption(text,key);
		      System.out.println("Plaintext : "+text);
		      System.out.println("Encrypted : "+enc);
		      System.out.println("Decrypted : "+Decryption(enc,key));
	   }
	
	  public static String RandomAlpha(int len){
	      Random r = new Random();
	      String key = "";
	      for(int x=0;x<len;x++)
	         key = key + (char) (r.nextInt(26) + 'A');
	      
	      return key;
	   }
	  
	  public static String Encryption(String text,String key){
	      String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	      
	      int len = text.length();
	      
	      String en = "";
	      for(int x=0;x<len;x++){
	         char me = text.charAt(x);
	         char keyind = key.charAt(x);
	         System.out.print(x);
	         
	         if(Character.isUpperCase(me) || Character.isLowerCase(me)){
	            int index = alphaU.indexOf(me);
	            int keydex = alphaU.indexOf(Character.toUpperCase(keyind));
	            
	            int total = (index + keydex) % 26;
	            
	            en = en+ alphaU.charAt(total);
	         } 
	         else{
	        	 en = en + me;
	         }
	      }
	      System.out.println();
	      return en;
	   }

	  public static String Decryption(String text,String key){
		      String alphaU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		       
		      int len = text.length();
		      
		      String sb = "";
		      for(int x=0;x<len;x++){
		         char get = text.charAt(x);
		         char keyget = key.charAt(x);
		         if(Character.isUpperCase(get) || Character.isLowerCase(get)){
		            int index = alphaU.indexOf(get);
		            int keydex = alphaU.indexOf(Character.toUpperCase(keyget));

		            int total = (index - keydex) % 26;
		            total = (total<0)? total + 26 : total;
		            
		            sb = sb+ alphaU.charAt(total);
		         } 
		         else{
		            sb = sb + get;
		         }
		      }
		      
		      return sb;
		   }
}
