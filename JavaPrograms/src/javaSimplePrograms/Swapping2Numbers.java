package javaSimplePrograms;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("Before swapping "+a+","+b);
		//Logic 1 using third variable
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping "+a+","+b);

		//Logic use + and -
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;		
//		System.out.println("After swapping "+a+","+b);
//		
		//using * and / (values must not be zero)
//		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		
//		System.out.println("After swapping "+a+","+b);
//		
//		a=a^b;
//		b=a^b;
//		a=a^b;
//		
//		System.out.println("After swapping "+a+","+b);
		
		b=a+b-(a=b);
		System.out.println("After swapping "+a+","+b);

		}

}
