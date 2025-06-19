# 💼 Employee Management System

A full-featured backend application built with **Spring Boot** to manage employees and departments efficiently. It supports complete CRUD operations, RESTful APIs, and entity relationships, showcasing best practices in modern Java development.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- REST APIs
- Maven

## 📂 Features

- Create, read, update, and delete **Employees**
- Create, read, update, and delete **Departments**
- Assign employees to departments
- Use query parameters for flexible data fetching:
  - `expand=employee` – include related employee data
  - `lookup=true` – simplified department view
- Follows layered architecture: Controller → Service → Repository

## 🗃️ Database Design

- **Employee Table**: Stores employee details
- **Department Table**: Stores department details
- One-to-Many relationship between Department and Employees

## 🔌 API Endpoints (Sample)

| Method | Endpoint                        | Description                             |
|--------|---------------------------------|-----------------------------------------|
| GET    | `/department/create`            | Get all departments                     |
| POST   | `/department/getAllDepartments` | Create a new department                 |
| GET    | `/employee/getAllEmployee`      | Get all employees                       |
| POST   | `/employee/create`              | Create a new employee                   |
| GET    | `/departments?expand=employee`  | Get departments with employee details   |

## 🛠️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
