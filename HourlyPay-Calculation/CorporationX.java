/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
    */
package corporationx;

/**
 *
 * @author kavyanamana
 */
public class Corporationx {
    
    /**
     * 
     * @param basePay - Hourly pay of an employee
     * @param workedHrs - Number of hours the employee has worked
     */
    public static void calculatePay(double basePay, int workedHrs) {
        double totalPay;
        
        // error condition
        if (basePay < 15.00 || workedHrs > 60) {
            System.out.println("ERROR..!");
        } else {
            // calculates total pay and prints the total salary on the console
                if (workedHrs > 40) {
                int overTime = workedHrs - 40;
                double overTimePay = basePay * 1.5;
                totalPay = (40 * basePay) + (overTime * overTimePay);
            } else {
                totalPay = basePay * workedHrs;
            }
            System.out.println(totalPay);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculatePay(13.50, 30);
        calculatePay(14.20, 54);
        calculatePay(15.00, 3);   
    }
}
// Output:
//     ERROR..!
//     ERROR..!
//     45.0
