package javaSimplePrograms;

public class ReverseStrinng {

	public static void main(String[] args) {
		
		String str ="vennkatesh yr";
		String str1="";
		
		char ch;
		for (int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			str1=ch+str1;//note ch comes first after +str1
			System.out.println(str1);
			
		}
	}

}
