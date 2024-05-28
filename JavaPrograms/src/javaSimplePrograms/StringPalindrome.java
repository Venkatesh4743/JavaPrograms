package javaSimplePrograms;

public class StringPalindrome {

	public static void main(String[] args) {

		String str="level";
		String rstr="";
		
		 char ch;
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println(rstr);
			
			
			if(str.equals(rstr)) {
				
				System.out.println("String is palindrome");
			}else {
				
				System.out.println("String iss not a palindrome");
			}
		}
		
	}


