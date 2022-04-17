package Assignment;
public class Result_Else_if {

	public void m1() {
		float marks = 89;
		
		
		if(marks > 75){
			System.out.println("Congrats!!  Pass with First class Distinction");
		}
		else if (marks < 75 && marks >= 65) {
			System.out.println("Congrats!! Pass with First class");
		}
		else if(marks < 65 && marks >= 60) {
			System.out.println("Congrats!!  Pass with Second class");
		}
		else if(marks < 60 && marks >= 50) {
			System.out.println("Congrats!! Pass");
		}
		else if(marks < 50 && marks >=40) {
			System.out.println("Congrats!!  Pass with condo($)");
		}
		else {
			System.out.println("Sorry!!!!   you Failed");
		}

	}
	
	public static void main(String[] args) 
	{
		
		Result_Else_if ref = new Result_Else_if();  //Method call from another class
		ref.m1();
	}
}
