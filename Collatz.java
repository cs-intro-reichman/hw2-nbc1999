// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int numruns= Integer.parseInt(args[0]) ;
		String VorC = args[1];
        

		for(int i=1 ; i<= numruns; i++){
			int counter = 0 ;
			int currnum = i ;

			if (VorC.equals("v")) {
				do {
                System.out.print(currnum + " ");
				counter ++ ;
			if (currnum % 2 == 0){
				currnum = currnum/2;
			}
		else {
			currnum = currnum * 3 + 1;
		}
	    } while(currnum != 1);
		System.out.print(currnum + " ");
		counter ++;
		System.out.println("(" + counter + ")");
		}
		else{
			do {
				counter ++ ;
			if (currnum % 2 == 0){
				currnum = currnum/2;
			}
		else {
			currnum = currnum * 3 + 1;
		}
	    } while(currnum != 1);
		counter ++;
			}
		}
         System.out.println("Every one of the first " + numruns + " hailstone sequences reached 1.");
		}
	}

