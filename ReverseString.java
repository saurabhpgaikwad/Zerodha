
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String a= "Anna";
		
	//	StringBuffer buf = new StringBuffer(a);           // Way 1st
		
		StringBuilder bul = new StringBuilder(a);         // Way 2nd
		
		System.out.println(bul.reverse());
		
		String nam = a.toUpperCase();                   // to Upper case
		
		for(int i=a.length()-1; i>=0; i--)               //Way 3rd
		{
			System.out.print(nam.charAt(i));
		}
		
		if(a.equals(bul.reverse()))
		{
			System.out.println(" is palendrom");
		}else
		{
			System.out.println(" is not palendrom");
		}
		
	}
	
	

}
