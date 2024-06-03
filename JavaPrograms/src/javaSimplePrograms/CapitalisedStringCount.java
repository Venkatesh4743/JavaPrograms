package javaSimplePrograms;
//NaveenAutomationLbs channel
public class CapitalisedStringCount {

	public static void main(String[] args) {
		
		String str="IamTheBestKid";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isUpperCase(str.charAt(i))){//****imp here isUpperCase NOT toUpperCase
			
			count++;//we need to write inside the braces{}
		}	
	}
		System.out.println(count);//after 2 closing bracket we need to give print statements
	
}
}