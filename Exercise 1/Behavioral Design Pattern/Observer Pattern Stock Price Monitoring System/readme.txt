# Observer Pattern - Stock Price Monitoring System

## Design Pattern Type: Behavioral

### Problem Statement
Create a system where multiple observers (users) receive real-time updates whenever a stock price changes. Each observer can represent different platforms (e.g., a mobile app or desktop widget). The `Observer` pattern is ideal when an object (the Subject) needs to notify other objects (the Observers) without knowing the details of these objects.

### Solution
Implement an `Observer` pattern with:
- `Stock` (Subject) that maintains a list of observers.
- `Observer` interface for different observer implementations.
- `MobileApp` and `DesktopWidget` that subscribe to stock price changes.

### Implementation
This system uses the Observer pattern to update registered observers whenever the stock price changes.

### UML Diagram
![Observer Pattern UML Diagram](./observer_pattern_uml.png)

### Code Example
The Java implementation includes:
- `Observer`: Interface for observer classes.
- `Stock`: Subject that notifies observers of changes.
- `MobileApp` and `DesktopWidget`: Concrete observers.

### Usage
Compile and run the code to simulate a real-time stock price monitoring system.
