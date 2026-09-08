public class Calculator {

    private double num1;
    private double num2;
    
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator(Calculator other) {
        this.num1 = other.num1;
        this.num2 = other.num2;
    }

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

    public double divide() {
        if (this.num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return this.num1 / this.num2;
    }

    public double power() {
        return Math.pow(this.num1, this.num2);
    }

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
