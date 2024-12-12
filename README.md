# Calculator Application

This Java program is a simple calculator built using the **Swing** framework for its graphical user interface (GUI). It supports basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features

- **Graphical User Interface (GUI)** with buttons for digits, operators, and controls.
- Perform basic arithmetic operations:
    - Addition (+)
    - Subtraction (-)
    - Multiplication (*)
    - Division (/)
- Input through on-screen buttons.
- Clear (C) and Delete (Delete) functionalities.
- Display results and manage operations through a text field.

## Components

### GUI Elements
- **JFrame**: The main application window.
- **JTextField**: Displays the input and results.
- **JButton**: Buttons for digits (0-9), operators (+, -, *, /), decimal point (.), equals (=), clear (C), and delete (Delete).

### Event Handling
The program uses the `ActionListener` interface to handle button clicks. Each button is associated with an action that updates the text field or performs a specific operation.

## How to Use
1. **Run the Application**: Compile and run the `Calculator` class.
2. **Input Numbers and Operations**:
    - Use the numeric buttons (0-9) to input numbers.
    - Use the operator buttons (+, -, *, /) to select the operation.
    - Use the `.` button to input decimal points.
    - Press `=` to calculate the result.
3. **Clear or Delete**:
    - Press `C` to clear all inputs.
    - Press `Delete` to remove the last entered digit.

## Implementation
The application consists of the following main methods:

### `createframe()`
Initializes the main application frame with a fixed size and layout.

### `createbtn()`
Creates and positions all buttons, adds them to the frame, and registers action listeners for handling button clicks.

### `actionPerformed(ActionEvent e)`
Handles button click events. Depending on the button pressed, it performs one of the following actions:
- Appends the number or decimal to the text field.
- Stores the first number and operator when an operator button is clicked.
- Calculates the result when the `=` button is clicked.
- Deletes the last character from the text field.
- Clears the text field.

## Code Structure
The program is structured as a single class `Calculator` with the following key attributes:
- `JFrame frame`: The main application window.
- `JTextField textField`: The input/output display field.
- Buttons for digits, operators, and controls.
- Variables to store the current operator, the first number, and the second number.

## Prerequisites
- **Java Development Kit (JDK)** installed.
- Basic understanding of Java and Swing.

## How to Compile and Run
1. Save the program in a file named `Calculator.java`.
2. Open a terminal or command prompt and navigate to the file's directory.
3. Compile the program:
   ```
   javac Calculator.java
   ```
4. Run the program:
   ```
   java Calculator
   ```

## Screenshot

*(Include a screenshot of the calculator's GUI here if available.)*

## Future Enhancements
- Support for more advanced operations (e.g., square root, power, etc.).
- Improved error handling for invalid inputs (e.g., division by zero).
- Enhanced styling and responsiveness of the GUI.

## License
This project is open-source and available for use and modification under the MIT License.

