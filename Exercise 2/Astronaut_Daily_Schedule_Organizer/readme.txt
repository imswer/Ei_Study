# Astronaut Daily Schedule Organizer

## Project Description
The Astronaut Daily Schedule Organizer is a console-based Java application designed to help astronauts manage their daily tasks effectively. It supports creating, removing, and viewing tasks while ensuring that no tasks overlap in the schedule.

## How to Run the Project
1. **Clone the Repository**:
   ```
   git clone <repository_link>
   ```
2. **Navigate to the Project Directory**:
   ```
   cd AstronautScheduler
   ```
3. **Compile the Java Files**:
   ```
   javac src/*.java
   ```
4. **Run the Application**:
   ```
   java src/AstronautScheduler
   ```

## Features
- **Add Task**: Allows users to add a new task with a description, start time, end time, and priority.
- **Remove Task**: Users can remove a task based on its description.
- **View Tasks**: Displays all tasks sorted by start time.
- **Conflict Detection**: Prevents adding tasks that conflict with existing ones.

## Class Descriptions
1. **`Task`**: Represents an individual task with attributes like description, start and end times, and priority.
2. **`TaskFactory`**: Creates instances of the `Task` class.
3. **`ScheduleManager`**: Manages the list of tasks using the Singleton pattern.
4. **`ConflictAlert`**: Notifies users about task conflicts using the Observer pattern.

## Example Usage
- **Add Task**:
  ```
  Enter task description: Morning Exercise
  Enter start time (HH:MM): 07:00
  Enter end time (HH:MM): 08:00
  Enter priority (High/Medium/Low): High
  Output: Task added successfully. No conflicts.
  ```
  
- **Remove Task**:
  ```
  Enter task description to remove: Morning Exercise
  Output: Task removed successfully.
  ```
  
- **View Tasks**:
  ```
  Scheduled Tasks:
  07:00 - 08:00: Morning Exercise [High]