/*
 * File: Calculator.java
 * Student: <put your name>   Seat No: <put your seat no>
 * Purpose: Calculator class for Week 1 assignment (Part B).
 *          Stores two numbers (num1, num2) as attributes; each operation
 *          works on those stored numbers instead of taking parameters.
 */
public class Calculator {

    // Attributes: each Calculator object stores its own pair of numbers.
    private double num1;
    private double num2;

    // 1) No-argument constructor: defaults both numbers to 0.
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // 2) Parameterized constructor: set both numbers at creation time.
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 3) Copy constructor: builds a new, independent Calculator holding
    //    the same numbers as "other".
    public Calculator(Calculator other) {
        this.num1 = other.num1;
        this.num2 = other.num2;
    }

    // Lets the user change the stored numbers after the object exists.
    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    // Invalid division (dividing by zero) must not silently return a wrong
    // number - we throw an exception so the caller is forced to handle it.
    public double divide() {
        if (this.num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return this.num1 / this.num2;
    }

    public double power() {
        return Math.pow(this.num1, this.num2);
    }

    // Same reasoning as divide(): modulus by zero is undefined.
    public double modulus() {
        if (this.num2 == 0) {
            throw new IllegalArgumentException("Cannot compute modulus with a divisor of zero.");
        }
        return this.num1 % this.num2;
    }

    public void displayState() {
        System.out.println("num1 : " + this.num1);
        System.out.println("num2 : " + this.num2);
        System.out.println();
    }
}
