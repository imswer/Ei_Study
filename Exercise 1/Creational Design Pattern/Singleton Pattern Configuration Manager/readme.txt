# Singleton Pattern - Configuration Manager

## Design Pattern Type: Creational

### Problem Statement
Create a configuration manager that ensures only one instance of configuration settings exists across the application. The configuration manager should allow setting and getting configuration values globally.

### Solution
The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. For this problem:
- Create a `ConfigurationManager` class with private constructors and static methods.
- Ensure thread safety to prevent multiple instances in multi-threaded applications.

### Code Example
The Java implementation includes:
- `ConfigurationManager`: Singleton class that maintains global settings.

### UML Diagram
Refer to the Singleton pattern UML diagram for visual understanding.

### Usage
Compile and run the code to simulate a configuration manager with global settings.
