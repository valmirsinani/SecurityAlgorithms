package Ashifrimi;

/* 
@author:Valmiri
@verzion: v.1  
*/
public class Rot13 {
	
	 public static void main(String[] args) { 
	        String input = "A po ju perlqen siguriaZ?";
	        String rot13 = rot11(input);
	        String roundTrip = rot11(rot13); 
	        System.out.println(input);
	        System.out.println(rot13);
	        System.out.println(roundTrip);
	    } 
	 //D.SH le te behet algoritmi me rot11 (pra nga 'a' deri 'v')
	 public static String rot13(String value) { 
	        char[] values = value.toCharArray();
	        for (int i = 0; i < values.length; i++) {
	            char letter = values[i];
	            if (letter >= 'a' && letter <= 'z') { 
	                
	                if (letter > 'm') {
	                    letter -= 13;
	                } else {
	                    letter += 13;
	                }
	            } else if (letter >= 'A' && letter <= 'Z') {
	                 
	                if (letter > 'M') {
	                    letter -= 13;
	                } else {
	                    letter += 13;
	                }
	            }
	            values[i] = letter;
	        } 
	        return new String(values);
	    }

	 public static String rot11(String value) { 
	        char[] values = value.toCharArray();
	        for (int i = 0; i < values.length; i++) {
	            char letter = values[i];
	            if (letter >= 'a' && letter <= 'v') { 
	                
	                if (letter > 'k') {
	                    letter -= 11;
	                } else {
	                    letter += 11;
	                }
	            } else if (letter >= 'A' && letter <= 'V') {
	                 
	                if (letter > 'K') {
	                    letter -= 11;
	                } else {
	                    letter += 11;
	                }
	            }
	            values[i] = letter;
	        } 
	        return new String(values);
	    }
}
