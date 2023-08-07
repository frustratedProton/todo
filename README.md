# Todo List API using Java Spring Boot

This is a simple Todo List API built using Java Spring Boot. The API allows you to manage tasks by providing endpoints for creating, updating, and deleting tasks.

## Features

- Create a new task.
- Update a task (mark as completed or incomplete).
- Delete a task.
- Get a list of all tasks.

## Getting Started

1. Clone the repository to your local machine:

```
git clone https://github.com/your-username/todo-list.git
```

2. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).

3. Run the Spring Boot application.

4. The application will start a server on a specified port (e.g., localhost:8080).

## How It Works

- The API provides endpoints for handling CRUD operations on tasks.
- You can use API clients like Postman to interact with the API and perform CRUD operations.

## API Endpoints

- `POST /todos`: Create a new task. Request body should contain task details in JSON format.
- `PUT /todos/{id}`: Update a task by ID. Request body should contain updated task details in JSON format.
- `DELETE /todos/{id}`: Delete a task by ID.
- `GET /todos`: Get a list of all tasks.

## Dependencies

- Java JDK 8 or higher.
- Spring Boot framework.

## Contributions

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a pull request or open an issue on the GitHub repository.

Enjoy using the Todo List API! If you have any questions or need further assistance, feel free to reach out. Happy organizing! 📝