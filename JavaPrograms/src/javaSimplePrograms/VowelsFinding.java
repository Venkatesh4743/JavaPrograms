package javaSimplePrograms;

public class VowelsFinding {

	public static void main(String[] args) {

		String str= "automation";
		
		boolean isVowel = false;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				//System.out.println("present");
				System.out.println(str.charAt(i));
				
			}
		}
	}

}
