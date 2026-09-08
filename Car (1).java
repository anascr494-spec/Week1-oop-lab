public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private double fuelLevel;   
    private int gear;           
    
    public Car() {
        this.brand = "Unknown";
        this.color = "Unpainted";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100.0;
        this.gear = 0;
    }

    public Car(String brand, String color, int speed, boolean engineOn,
               double fuelLevel, int gear) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
        this.fuelLevel = fuelLevel;
        this.gear = gear;
    }

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
