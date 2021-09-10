package week1.day1;

public class FibonacciSeriesAssignment {

	public static void main(String[] args) {
		int n = 8, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i)
	    {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
		// TODO Auto-generated method stub

	}

}
