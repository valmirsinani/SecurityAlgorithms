package Ashifrimi;

/*
   Author Valmir Sinani, 21.02.2022
   Enkriptomi me zhvendosje
 */

public class AShifrimi {
	
	public static void main(String []args) {
		String m= "TunG";
		String e= Encript(m); 
		String d= Decript(e);
		System.out.println(e); 
		System.out.println(m+"="+d); 
	} 
	public static String Encript(String messazhi) {
		int k= 3;
		String rez= "";
	 
		for(int i = 0; i<messazhi.length();i++) { 
			char ch = messazhi.charAt(i);   
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = Character.toUpperCase(ch);
				char c =  (char)((ch+k)% 26 +65); 
				rez +=c;
			}
			
			} 
		return rez;
	} 
	public static String Decript(String messazhi) {
		int k= 3;
		String rez= "";
		
		for(int i =0; i<messazhi.length();i++) { 
			char m = messazhi.charAt(i);  
			char c =  (char)((m-k )% 26 +65);  
			 
			rez +=c;
			} 
		return rez;
	}

}
