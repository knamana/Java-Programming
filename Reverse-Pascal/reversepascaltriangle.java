package reversepascaltriangle;
import java.util.Scanner;
/**
 * @author kavyanamana
 */
public class Reversepascaltriangle {
    static int factorial(int n) {
             int fact;
              for(fact = 1; n > 1; n--){
                         fact *= n;
              }
              return fact;
    }
    static int calcPascal(int n,int r) {
             return factorial(n) / ( factorial(n-r) * factorial(r) );
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfRows, p, q;
        // take input - number of rows from user
        System.out.print("Enter number of rows to display inverted pascal triangle: ");
        noOfRows = scan.nextInt();


        for(p = noOfRows-1; p >= 0; p--) {
                    for(q = 0; q <= noOfRows-p; q++) { // loop for spacing
                                System.out.printf("%2s", " "); // used printf for formatting spaces
                    }
                    for(q = 0; q <= p; q++) { // calculate and print numbers
                              System.out.printf("%4s", calcPascal(p, q));
                    }
                    System.out.println();
        } // end of for loop
    } // end of main
} // end of class Reversepascaltriangle