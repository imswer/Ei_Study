# Adapter Pattern - Media Player Adapter

## Design Pattern Type: Structural

### Problem Statement
Create a media player adapter to support different media formats (MP3, MP4, and AVI) using a common interface. Each media type should be played using the same interface without changing the client code.

### Solution
Use the `Adapter` pattern to wrap incompatible classes and expose a standard interface.

### UML Diagram
![Adapter Pattern UML Diagram](./adapter_pattern_uml.png)

### Code Example
The Java implementation includes:
- `MediaPlayer`: Interface for media players.
- `MP3Player`, `MP4Player`, `AVIPlayer`: Concrete classes for different media formats.
- `MediaAdapter`: Adapter class to adapt different players.

### Usage
Compile and run the code to play different media formats.
