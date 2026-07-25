/*
 * File: Car.java
 * Student: <put your name>   Seat No: <put your seat no>
 * Purpose: Enhanced Car class for Week 1 assignment (Part A).
 */
public class Car {
    // Attributes: each Car object stores its own copy of these (its "state").
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;   // new attribute: 0-100 (%)
    private int gear;           // new attribute: 0 = neutral/parked

    // 1) No-argument ("null"/default) constructor: gives every field a
    //    safe starting value when the caller doesn't supply any.
    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100.0;
        this.gear = 0;
    }

    // 2) Parameterized constructor: lets the caller set every field
    //    directly at creation time, one parameter per attribute.
    public Car(String brand, String color, int speed, boolean engineOn,
               double fuelLevel, int gear) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
        this.fuelLevel = fuelLevel;
        this.gear = gear;
    }

    // 3) Copy constructor: builds a brand-new, independent Car object
    //    with the same field values as "other". Note "other" is still
    //    a separate object on the heap - changing this Car afterward
    //    does NOT affect other.
    public Car(Car other) {
        this.brand = other.brand;
        this.color = other.color;
        this.speed = other.speed;
        this.engineOn = other.engineOn;
        this.fuelLevel = other.fuelLevel;
        this.gear = other.gear;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        this.engineOn = true;
        this.gear = 1;
        System.out.println(this.brand + " engine started.");
    }

    // Rule: cannot drive without the engine on. Also consumes fuel.
    public void drive() {
        if (!this.engineOn) {
            System.out.println(this.brand + " won't move - engine is off.");
            return;
        }
        if (this.fuelLevel <= 0) {
            System.out.println(this.brand + " is out of fuel.");
            return;
        }
        this.speed += 10;
        this.fuelLevel = Math.max(0, this.fuelLevel - 2);
        System.out.println(this.brand + " is driving at " + this.speed + " km/h.");
    }

    public void moveFast() {
        if (!this.engineOn) {
            System.out.println(this.brand + " can't speed up - engine is off.");
            return;
        }
        this.speed += 20;
        this.fuelLevel = Math.max(0, this.fuelLevel - 4);
        System.out.println(this.brand + " speeds up to " + this.speed + " km/h.");
    }

    // Rule: speed never goes below zero.
    public void moveSlow() {
        this.speed = Math.max(0, this.speed - 10);
        System.out.println(this.brand + " slows down to " + this.speed + " km/h.");
    }

    public void moveLeft() {
        System.out.println(this.brand + " is turning left.");
    }

    public void moveRight() {
        System.out.println(this.brand + " is turning right.");
    }

    // Creative feature: short burst of extra speed, costs more fuel, needs engine on.
    public void turboMode() {
        if (!this.engineOn) {
            System.out.println(this.brand + " can't engage turbo - engine is off.");
            return;
        }
        if (this.fuelLevel < 10) {
            System.out.println(this.brand + " doesn't have enough fuel for turbo.");
            return;
        }
        this.speed += 40;
        this.fuelLevel -= 10;
        System.out.println(this.brand + " TURBO engaged! Speed: " + this.speed + " km/h.");
    }

    // Rule: stopping the engine always resets speed to zero.
    public void stopEngine() {
        this.speed = 0;
        this.gear = 0;
        this.engineOn = false;
        System.out.println(this.brand + " engine stopped.");
    }

    public void displayState() {
        System.out.println("Brand      : " + this.brand);
        System.out.println("Color      : " + this.color);
        System.out.println("Speed      : " + this.speed + " km/h");
        System.out.println("Gear       : " + this.gear);
        System.out.println("Fuel level : " + this.fuelLevel + "%");
        System.out.println("Engine on  : " + this.engineOn);
        System.out.println();
    }
}
