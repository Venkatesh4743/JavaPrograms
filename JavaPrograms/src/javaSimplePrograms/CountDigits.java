package javaSimplePrograms;

public class CountDigits {

	public static void main(String[] args) {
		
		int num=65464;
		int count= 0;
		
		while(num>0) {
			
			num= num/10;//Here not % here only /
			count++;
			System.out.println(count);
			
		}
	}

}
