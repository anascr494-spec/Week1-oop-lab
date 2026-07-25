# Week 1 Lab — Object-Oriented Programming
**Student:** Anas Arshad
**Seat No:** B25110006025
**Course:** OOP, Summer 2026 — Dr. Humera Tariq

## What's in this repo
Two small Java demos built from the Week 1 lab manual, following the
design-first workflow: observe → select → model (UML) → code → instantiate → test.

### 1. CarDemo/
- `Car.java` — models a car with attributes (`brand`, `color`, `speed`, `engineOn`,
  `fuelLevel`, `gear`) and behaviours (`startEngine()`, `drive()`, `moveFast()`,
  `moveSlow()`, `moveLeft()`, `moveRight()`, `turboMode()`, `stopEngine()`,
  `displayState()`).
- Rules enforced: can't drive with the engine off, speed never goes negative,
  `stopEngine()` always resets speed to 0.
- `Main.java` — creates two independent Car objects (`bmw`, `tesla`) and
  demonstrates normal use and edge cases.
- `Car_UML.png` — class diagram.
- `SampleOutput.txt` — actual program output.

**Run it:**
```
cd CarDemo
javac Car.java Main.java
java Main
```

### 2. CalculatorDemo/
- `Calculator.java` — stateless class with `add()` (including a varargs
  overload), `subtract()`, `multiply()`, `divide()`, `power()`, `modulus()`.
  `divide()` and `modulus()` throw an exception on a zero divisor instead of
  returning a wrong number.
- `Main.java` — demonstrates a normal case and an edge case for every operation.
- `Calculator_UML.png` — class diagram.
- `SampleOutput.txt` — actual program output.

**Run it:**
```
cd CalculatorDemo
javac Calculator.java Main.java
java Main
```

## Key concepts demonstrated
- Reference variables (stack) vs. objects (heap) — see comments in `Main.java`.
- `this` keyword distinguishing fields from constructor/method parameters.
- Encapsulation — all fields are `private`, accessed only through public methods.
- Each object holds its own independent state.
