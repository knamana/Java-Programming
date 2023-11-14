# Problem Statement

In this question, you will create a program that computes the distance an object will fall in Earth's gravity.
## Part 1
1. Create a new class called GravityCalculator.
2. Copy and paste the following initial version:


```Java
class GravityCalculator {
    public static void main(String[] arguments) {
      double gravity = -9.81; // Earth's gravity in m/s^2
      double initialVelocity = 0.0;
      double fallingTime = 10.0;
      double initialPosition = 0.0;
      double finalPosition = 0.0;
      System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
} }
```
4. Run it in your ID
 
What is the output of the unmodified program?

## Part 2
Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in meters. The formula in Math notation is:
  `x(t) = 0.5 × at2 + vit + xi`
  
Variable | Meaning | Value
---|---|---
a |Acceleration (m/s2) | -9.81
t | Time (s) | 10
vi | Initial velocity (m/s) | 0
xi | Initial position | 0

Note: The correct value is -490.5 m. Java will output more digits after the decimal place, but that is unimportant.

### Part: 1 Output 
The object's position after 10.0 seconds is 0.0 m.

### Part: 2 Output
The object's position after 10.0 seconds is -490.5 m.
