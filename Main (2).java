/*
 * File: Main.java
 * Student: <put your name>   Seat No: <put your seat no>
 * Purpose: Creates and controls two independent Car objects.
 */
public class Main {
    public static void main(String[] args) {

        // "Car bmw" is a REFERENCE VARIABLE, stored on the STACK.
        // "new Car()" builds an actual Car OBJECT on the HEAP and runs the
        // no-argument constructor. bmw does not hold the object itself -
        // it holds the object's address (like an arrow pointing to it).
        //
        //   STACK              HEAP
        //   bmw   ----> [ Car object #1: brand, color, speed... ]
        //   tesla ----> [ Car object #2: brand, color, speed... ]
        //
        // Because each "new" call creates a separate object on the heap,
        // bmw and tesla can hold completely different state even though
        // both are of type Car.
        // 1) No-argument constructor, then filled in with setDetails()
        Car bmw = new Car();
        bmw.setDetails("BMW", "Black");

        // 2) Parameterized constructor - all fields set at creation
        Car tesla = new Car("Tesla", "Red", 0, false, 100.0, 0);

        // 3) Copy constructor - teslaTwin starts as an exact copy of tesla,
        //    but is a SEPARATE object on the heap from this point on.
        Car teslaTwin = new Car(tesla);
        teslaTwin.setDetails("Tesla", "White"); // change teslaTwin only
        System.out.println("--- proving the copy is independent ---");
        tesla.displayState();
        teslaTwin.displayState();

        bmw.startEngine();
        tesla.startEngine();

        // Normal driving
        bmw.drive();
        bmw.moveFast();
        tesla.drive();

        // Creative feature
        bmw.turboMode();

        // Edge case: try to drive after stopping the engine
        tesla.stopEngine();
        tesla.drive(); // should print "won't move - engine is off"

        // Edge case: moveSlow should never push speed below 0
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();
        bmw.moveSlow();

        // Proof the two objects are independent: different states
        bmw.displayState();
        tesla.displayState();

        bmw.stopEngine();
        bmw.displayState();
    }
}
