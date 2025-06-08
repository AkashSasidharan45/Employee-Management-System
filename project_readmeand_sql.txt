### ✅ README.md

# Employee & Department Management API (Spring Boot)

This project is a RESTful web service for managing **Employees** and **Departments** using Spring Boot and JPA.

---

## 🚀 How to Run

### 📦 Requirements:
- Java 8 or above
- Maven
- MySQL / H2 Database

### 🔧 Steps:
1. Clone the repository
2. Import the project into your IDE
3. Set up your `application.properties` or use H2 (for quick demo)
4. Run the application (`SpringBootApplication` class)
5. The APIs will be available at: `http://localhost:8080`

---

## 📘 API Endpoints

Refer to [API Documentation](#) (you can rename the link if you put it in a separate file)

---

## ⚙️ Sample Configuration (H2)

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=userName
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

---

## 📂 Folder Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.demo
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── DemoApplication.java
│   │   └── resources
│   │       ├── application.properties
```

---

## 🗃️ data.sql (Initial Sample Data)

```sql
-- Departments
INSERT INTO department (dept_id, dept_name, creation_date) VALUES (1, 'Engineering', '2024-01-01');
INSERT INTO department (dept_id, dept_name, creation_date) VALUES (2, 'Marketing', '2024-01-01');
INSERT INTO department (dept_id, dept_name, creation_date) VALUES (3, 'Finance', '2024-01-01');

-- Employees
INSERT INTO employee (emp_id, emp_name, emp_dob, emp_salary, emp_address, emp_role, emp_joining_date, emp_yearly_bonus, department_dept_id) VALUES 
(1, 'Akash Sasidharan', '2000-12-12', 35000, 'Kerala', 'Developer', '2025-05-05', 18.5, 1),
(2, 'John Doe', '1999-10-10', 32000, 'Chennai', 'Tester', '2025-03-01', 12.0, 1),
(3, 'Jane Smith', '1998-03-04', 40000, 'Delhi', 'Manager', '2025-01-15', 20.0, 2),
(4, 'Rahul Nair', '1997-06-20', 31000, 'Kerala', 'Intern', '2025-02-01', 5.0, 1),
(5, 'Priya R', '2001-01-01', 29000, 'Bangalore', 'HR', '2025-04-10', 10.0, 3);

-- Add 20 more employees similarly
```

---

## 📘 Notes
- Set `spring.jpa.hibernate.ddl-auto=update` for automatic schema creation
- Use Postman to test the endpoints
- JSON request/response examples included in the documentation file

---

## 🔗 GitHub Repository
Add your repo link here once created, e.g.:
```
https://github.com/yourusername/employee-department-api
```

---

## 📧 Contact
Akash Sasidharan  
📩 akashsasidharan1@gmail.com
