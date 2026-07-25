/*
 * File: Main.java
 * Student: Anas Arshad   Seat No: B25110006025
 * Purpose: Creates and controls two independent Car objects.
 */
public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.setDetails("BMW", "Black");

        Car tesla = new Car("Tesla", "Red", 0, false, 100.0, 0);
        
        Car teslaTwin = new Car(tesla);
        teslaTwin.setDetails("Tesla", "White"); 
        System.out.println("--- proving the copy is independent ---");
        tesla.displayState();
        teslaTwin.displayState();

        bmw.startEngine();
        tesla.startEngine();

        bmw.drive();
        bmw.moveFast();
        tesla.drive();

        bmw.turboMode();

        tesla.stopEngine();
        tesla.drive(); 
        
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();

        bmw.displayState();
        tesla.displayState();

        bmw.stopEngine();
        bmw.displayState();
    }
}
