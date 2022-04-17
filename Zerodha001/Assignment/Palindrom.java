package Assignment;

public class Palindrom 
{
	
		public static void main(String[] args) 
{
		int num=123;
		int givenNum=num;
		int rev=0;
		int rem;
		
		while(num != 0) 
		{
			rem=num%10;               // take mod by 10 to separate digit one by one
			
			rev= rev * 10 + rem;      //=> rev = 0x10 + 3	 rev=3
							          //   rev = 3x10 + 2  rev=32
						           	  //   rev = 32 x10 + 1	rev =321
			System.out.println(rev);			
			num=num/10;
			
		}
		
		if (givenNum==rev) {
			System.out.println(givenNum + " Number is palindrome");
		}else {
			System.out.println(givenNum + " Number is not palindrome");
		}

	}

}

