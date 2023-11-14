// Part1
// 		Source Code:
// 			class GravityCalculator {
// 				public static void main(String[] arguments) {
// 					double gravity = -9.81; // Earth's gravity in m/s^2
// 					double initialVelocity = 0.0; double fallingTime = 10.0; double initialPosition = 0.0;
// 					double finalPosition = 0.0;
// 					System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
// 				}
// 			}
			// The object's position after 10.0 seconds is 0.0 m.

// Part2
//     Source Code:
        /*
            * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
            * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
            */
        package gravitycalculator;

        /**
         *
         * @author kavyanamana
         */
        public class Gravitycalculator {
            /**
             * @param args the command line arguments
             */
            public static void main(String[] args) {
                double gravity = -9.81; // Earth's gravity in m/s^2
                double initialVelocity = 0.0;
                double fallingTime = 10.0;
                double initialPosition = 0.0;
                double finalPosition = 0.5 * (gravity * (fallingTime * fallingTime)) + (initialVelocity * fallingTime) + initialPosition;
                System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
            }
        }
    // Output:
    //     The object's position after 10.0 seconds is -490.5 m.