// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numTerms= Integer.parseInt(args[0]) ;
		double sum = 0.0; 
		double donominator = 1.0 ;
		double negorpos = 1.0; 
		
		for(int i = 1; i < numTerms; i++){
			sum = sum + negorpos * (1.0/donominator);
			donominator =donominator +2;
			negorpos = negorpos * -1.0;
			}
			double pi = 4.0 * sum;
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated: " + pi);
}
}