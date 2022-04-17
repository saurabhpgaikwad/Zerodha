package Assignment;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MaxArrey 
{
	public static void m1() {}
	
	public static void main(String [] args)
	{
		
		int [] num = {22, 34, 54, 7, 12, 27, 31, 98};
		
		Arrays.sort(num);
		
		System.out.println(num[num.length-1]);     // TO print Maximum / Minimum value     
		

		for(int i=0; i<=num.length-1; i++)
		{
			System.out.println(num[i]);            // To print all values
		}
		
		
	}

}
