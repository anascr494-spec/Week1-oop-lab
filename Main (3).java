/*
 * File: Main.java
 * Student: <put your name>   Seat No: <put your seat no>
 * Purpose: Demonstrates Calculator (num1/num2 attribute version) with
 *          normal and edge cases for every operation.
 */
public class Main {
    public static void main(String[] args) {

        // 1) No-argument constructor, then filled in with setNumbers()
        Calculator calc1 = new Calculator();
        calc1.setNumbers(20, 4);

        // 2) Parameterized constructor - both numbers set at creation
        Calculator calc2 = new Calculator(6, 7);

        // 3) Copy constructor - calc3 starts as a copy of calc2, but is
        //    a SEPARATE object on the heap from this point on.
        Calculator calc3 = new Calculator(calc2);
        calc3.setNumbers(2, 10); // change calc3 only
        System.out.println("--- proving the copy is independent ---");
        calc2.displayState();
        calc3.displayState();

        System.out.println("calc1 (20, 4):");
        System.out.println("add        = " + calc1.add());
        System.out.println("subtract   = " + calc1.subtract());
        System.out.println("multiply   = " + calc1.multiply());
        System.out.println("divide     = " + calc1.divide());
        System.out.println("power      = " + calc1.power());
        System.out.println("modulus    = " + calc1.modulus());

        System.out.println("\ncalc3 (2, 10):");
        System.out.println("subtract (edge: negative result) = " + calc3.subtract());
        System.out.println("multiply (edge: with zero would be 0)");

        // Edge case: divide by zero
        Calculator calc4 = new Calculator(5, 0);
        try {
            calc4.divide();
        } catch (IllegalArgumentException e) {
            System.out.println("\ndivide with num2=0 -> handled error: " + e.getMessage());
        }

        // Edge case: modulus by zero
        try {
            calc4.modulus();
        } catch (IllegalArgumentException e) {
            System.out.println("modulus with num2=0 -> handled error: " + e.getMessage());
        }

        // Edge case: fractional exponent (square root via power)
        Calculator calc5 = new Calculator(9, 0.5);
        System.out.println("\npower(9, 0.5) = " + calc5.power());
    }
}
