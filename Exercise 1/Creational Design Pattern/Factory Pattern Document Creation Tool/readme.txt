# Factory Pattern - Document Creation Tool

## Design Pattern Type: Creational

### Problem Statement
Create a document creation tool that supports different types of documents (PDF, Word, and Excel). Depending on the document type, a different document object should be created using a Factory Pattern.

### Solution
Use the `Factory` pattern to encapsulate the document creation process and provide flexibility in adding new document types.

### UML Diagram
![Factory Pattern UML Diagram](./factory_pattern_uml.png)

### Code Example
The Java implementation includes:
- `Document`: Abstract base class.
- `PDFDocument`, `WordDocument`, and `ExcelDocument`: Concrete document classes.
- `DocumentFactory`: Factory class to create document objects.

### Usage
Compile and run the code to create and display document types.
