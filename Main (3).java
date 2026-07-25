/*
 * File: Main.java
 * Student: Anas Arshad   Seat No: B25110006025
 * Purpose: Demonstrates Calculator (num1/num2 attribute version) with
 *          normal and edge cases for every operation.
 */
public class Main {
    public static void main(String[] args) {

        Calculator calc1 = new Calculator();
        calc1.setNumbers(20, 4);

        Calculator calc2 = new Calculator(6, 7);

        Calculator calc3 = new Calculator(calc2);
        calc3.setNumbers(2, 10);
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

        Calculator calc4 = new Calculator(5, 0);
        try {
            calc4.divide();
        } catch (IllegalArgumentException e) {
            System.out.println("\ndivide with num2=0 -> handled error: " + e.getMessage());
        }

        try {
            calc4.modulus();
        } catch (IllegalArgumentException e) {
            System.out.println("modulus with num2=0 -> handled error: " + e.getMessage());
        }

        Calculator calc5 = new Calculator(9, 0.5);
        System.out.println("\npower(9, 0.5) = " + calc5.power());
    }
}
