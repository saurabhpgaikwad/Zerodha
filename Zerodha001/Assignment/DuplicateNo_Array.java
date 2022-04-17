package Assignment;

public class DuplicateNo_Array 
{
	public static void main(String[] args) 
	{
		int num [] = {22, 34, 54, 7, 12, 27, 31, 12, 7, 98};
		
		for(int i=0; i<= num.length-1; i++)
		{
			for(int j=i+1; j<=num.length-1; j++)
			{
				if(num[i] == num[j])
				{
					System.out.println(num[j]);
				}
			}
		}
	}
}
