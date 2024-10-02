# Decorator Pattern - Coffee Shop Order System

## Design Pattern Type: Structural

### Problem Statement
Create a coffee shop order system where different coffee types can be enhanced with additional ingredients (milk, sugar, caramel) using the Decorator pattern. This pattern enables the dynamic addition of functionalities without modifying the core class.

### Solution
The Decorator pattern allows you to dynamically add responsibilities to objects. For this problem:
- Create an abstract `Coffee` class.
- Implement a `BasicCoffee` class for base coffee.
- Create decorators (`MilkDecorator`, `SugarDecorator`, `CaramelDecorator`) that extend the functionalities of `Coffee`.

### Code Example
The Java implementation includes:
- `Coffee`: Abstract base class.
- `BasicCoffee`: Concrete class for base coffee.
- `MilkDecorator`, `SugarDecorator`, `CaramelDecorator`: Decorator classes to add additional ingredients.

### UML Diagram
Refer to the Decorator pattern UML diagram for visual understanding.

### Usage
Compile and run the code to simulate a coffee shop order system.
