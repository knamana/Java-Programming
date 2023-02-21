package javaapplication17;
import java.util.Scanner;

/** *
* @author kavyanamana
*/

public class JavaApplication17 {

    /**
    * @param args the command line arguments 
    */

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int start1 = sc.nextInt();
        int end1 = sc.nextInt(); 

        int start2 = sc.nextInt(); 
        int end2 = sc.nextInt();
        int s, e;
        if (start1 > start2) {
            s = start1; 
        } else {
            s = start2; 
        }

        if (end1 < end2) { 
            e = end1;
        } else {
            e = end2;
        }

        if (s < e) {
            System.out.println("The appointments overlap."); 
        } else {
            System.out.println("The appointments don't overlap."); 
        }
    } // end of main
} // end of class
