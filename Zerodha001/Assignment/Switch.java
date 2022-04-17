package Assignment;

public class Switch 
{
  public static void RTPCR(int score) 
  {  
	  System.out.println("----------------------");
	 switch(score)
	 {
	 case 0: System.out.println("Negative");
	 break;
	 case 1: System.out.println("Home Quarantine");
	 break;
	 case 5: System.out.println("Admit");
	 break;
	 case 7: System.out.println("ICU");
	 break;
	 case 12: System.out.println("Ventilator");
	 break;
	 case 17: System.out.println("Critical");
	 break;
	 case 24: System.out.println("Liver Damage");
	 break;
	 default : System.out.println("Tata bye Bye Khatam gaya !!");
	 }
	  
  }
  public static void main(String[] args) 
  {
	  RTPCR(0);
	  RTPCR(1);
	  RTPCR(5);
	  RTPCR(7);
	  RTPCR(12);
	  RTPCR(17);
	  RTPCR(24);
	  RTPCR(100);
	  
  }
  
}