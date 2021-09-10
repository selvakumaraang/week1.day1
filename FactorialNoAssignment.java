package week1.day1;

public class FactorialNoAssignment {

	public static void main(String[] args) {
		int num = 5, fact = 1;
		System.out.println("Factorial of a given number " + num+ " of ");

		for (int i = 5; i >=1; i--)
		{
			fact = fact * i;
			System.out.println(i + "*");
		}
		System.out.println("="+fact);
		// TODO Auto-generated method stub
 
	
}
	
	
}
