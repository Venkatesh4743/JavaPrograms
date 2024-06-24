package javaSimplePrograms;

public class ReverseStrinng {

	public static void main(String[] args) {
		
		String str ="vennkatesh yr";
		String rstr="";
		
		char ch;
		for (int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			rstr=ch+rstr;//note ch comes first after +str1
			System.out.println(rstr);
			
		}
	}

}
