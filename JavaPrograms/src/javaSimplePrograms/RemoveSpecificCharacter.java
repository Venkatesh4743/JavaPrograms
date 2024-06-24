package javaSimplePrograms;

 public class RemoveSpecificCharacter {
	
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        char target = 'l'; // Character to be removed
	       
	        
	     // Use the replace() method to remove the specified character from the string
	        String modifiedStr = str.replace(String.valueOf(target), "");
	      
	        
	        
	        System.out.println("Original String: " + str);
	        
	        System.out.println("Modified String: " + modifiedStr);
	    }
	}


