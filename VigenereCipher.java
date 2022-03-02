package Ashifrimi;

/* 
@author:Valmiri
@verzion: v.1  
*/

public class VigenereCipher {
	
	  public static void main(String arg[])
	    { 
		  
		 String plaintext = "JAVEGJUHEATRAKTIVE";
		 String keyword = "LEMON";
		 encryptDecrypt(plaintext,keyword); 
	    
	    }
	
	  public static void encryptDecrypt(String plaintext, String keyword)
		 {
			 
			 char msg[] = plaintext.toCharArray();
			 int msgLen = msg.length, i=0;
			   
			 char key[] = new char[msgLen], 
			      encryptedMsg[] = new char[msgLen], 
			      decryptedMsg[] = new char[msgLen];
			  
			 //gjenerimi i key-ordave sipas gjatesis se mesazhit
			 for(i = 0; i < msgLen; ++i)
			 {  
				  key[i] = keyword.charAt(i% keyword.length());
			 }
			  
			   //Enkriptimi i mesazhit
			 for(i = 0; i < msgLen; ++i)
			  encryptedMsg[i] = (char) (((msg[i] + key[i]) % 26) + 'A');
			 
		       /*Dekriptimi i mesazhit*/
			 for(i = 0; i < msgLen; ++i)
			  decryptedMsg[i] = (char)((((encryptedMsg[i] - key[i]) + 26) % 26) + 'A');
			  
			 System.out.println("Original Message: " + plaintext);
			 System.out.println("Encrypted Message: " + String.valueOf(encryptedMsg));     
			 System.out.println("Decrypted Message: " + String.valueOf(decryptedMsg));
		   }
}
