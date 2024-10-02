# Strategy Pattern - Payment Processing System

## Design Pattern Type: Behavioral

### Problem Statement
Create a payment processing system that can handle different payment methods (Credit Card, PayPal, and Cryptocurrency). Use the Strategy pattern to dynamically change the payment method at runtime based on user choice.

### Solution
The Strategy pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable. For this problem:
- Define an interface `PaymentStrategy` to outline the pay method.
- Implement different strategies for Credit Card, PayPal, and Cryptocurrency payments.
- Use a `ShoppingCart` context class to switch between payment strategies at runtime.

### Code Example
The Java implementation includes:
- `PaymentStrategy`: Interface defining the `pay` method.
- `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment`: Concrete strategy classes implementing different payment methods.
- `ShoppingCart`: Context class for handling dynamic strategy selection.

### UML Diagram
Refer to the strategy pattern UML diagram for visual understanding.

### Usage
Compile and run the code to simulate a payment processing system. You can switch between different payment strategies based on user input.

