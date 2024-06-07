package javaSimplePrograms;

public class ArraySumAvg {

	public static void main(String[] args) {
		
		int sum=0;
		int[]numbers= {10,20,30,40};
		
		for(int num:numbers) {
			
			sum+=num;
			
			
		}
		double average = sum/(double)numbers.length;
		
		System.out.println("Sum  ="+sum);
		System.out.println("Avg  ="+average);
		
	}

}
