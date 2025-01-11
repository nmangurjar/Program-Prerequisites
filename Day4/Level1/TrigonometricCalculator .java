// import java.util.*;
// public class TrigonometricCalculator {

//     // Method to calculate various trigonometric functions
//     public double[] calculateTrigonometricFunctions(double angle) {
        
//            // Convert the angle from degrees to radians
//         double radians = Math.toRadians(angle);

//         // Create an array to store the results

//         double[] results = new double[3];

//         // Calculate sine, cosine, and tangent
        
//         results[0] = Math.sin(radians);  // Sine
//         results[1] = Math.cos(radians);  // Cosine
//         results[2] = Math.tan(radians);  // Tangent

//         return results;
//     }

//     public static void main(String[] args) {


//         // Create an instance of TrigonometricCalculator
//         TrigonometricCalculator calculator = new TrigonometricCalculator();

      
//         double angleInDegrees = 45.0;

//         // trigonometric functions

//         double[] trigResults = calculator.calculateTrigonometricFunctions(angleInDegrees);

//         // Print the results

//         System.out.println("For angle: " + angleInDegrees + " degrees:");
//         System.out.println("Sine: " + trigResults[0]);
//         System.out.println("Cosine: " + trigResults[1]);
//         System.out.println("Tangent: " + trigResults[2]);
//     }
// }

