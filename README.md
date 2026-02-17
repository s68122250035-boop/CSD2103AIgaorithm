# Rescue Robot Project

## 1. Why does Java not support multiple class inheritance?
Java does not support multiple class inheritance because it can cause ambiguity and complexity, especially the diamond problem. This makes the program difficult to maintain and understand.

## 2. Why do we use interface and composition instead?
We use interfaces to allow a class to implement multiple behaviors. Composition helps combine different components such as Battery, GPS, and ThermalCamera, making the system more flexible and modular.

## 3. How do we solve default method conflicts?
If multiple interfaces have the same default method, we override the method in the class and specify which implementation to use.

## Scenario Test
The program simulates a rescue robot performing:
- Update GPS position
- Flying and driving
- Detecting temperature and human
- Sending messages with location

## Output
<img width="370" height="281" alt="image" src="https://github.com/user-attachments/assets/30065e34-0117-495c-a5dd-214abdde2830" />
<img width="675" height="303" alt="image" src="https://github.com/user-attachments/assets/8b425a58-421a-4eaf-b3db-acae14c64e6c" />

