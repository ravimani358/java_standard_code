package Java;

public class MathExample {
    public static void main(String[] args) {
        double num1 = -10.5;
        double num2 = 7.2;
        
        // Absolute value
        System.out.println("Absolute value of " + num1 + " = " + Math.abs(num1));
        
        // Maximum value
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + Math.max(num1, num2));
        
        // Minimum value
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + Math.min(num1, num2));
        
        // Square root
        System.out.println("Square root of " + num2 + " = " + Math.sqrt(num2));
        
        // Power
        System.out.println(num1 + " raised to the power of " + num2 + " = " + Math.pow(num1, num2));
        
        // Ceil
        System.out.println("Ceil of " + num1 + " = " + Math.ceil(num1));
        
        // Floor
        System.out.println("Floor of " + num2 + " = " + Math.floor(num2));
        
        // Round
        System.out.println("Rounded value of " + num1 + " = " + Math.round(num1));
        
        // Random
        System.out.println("Random number between 0 and 1: " + Math.random());
    }
}
