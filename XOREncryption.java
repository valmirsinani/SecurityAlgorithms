package Ashifrimi;
/* 
@author:Valmiri
@verzion: v.1  
*/

public class XOREncryption {

	public static void main(String[] args)
    {
        String sampleString = "QYSHJENI";
        System.out.println("Encrypted String");
        String encryptedString = encryptDecrypt(sampleString);
         System.out.println("Decrypted String");
        encryptDecrypt(encryptedString);
    }
	
	static String encryptDecrypt(String inputString)
    {
        
        //char xorKey = 'P'; // xorKey = 'KEY'
        String xorKey = "QELESI";
        int kl =xorKey.length();
        
        String outputString = ""; 
        int len = inputString.length(); 
        
        for (int i = 0; i < len; i++)
        {
        	char ckey = xorKey.charAt(i%kl);
            outputString = outputString +
            Character.toString((char) 
            		(inputString.charAt(i) ^ ckey));
        }
 
        System.out.println(outputString);
        return outputString;
    }
}
