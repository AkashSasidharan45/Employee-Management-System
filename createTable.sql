-- Department Table
CREATE TABLE department (
    id INT AUTO_INCREMENT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL,
    creation_date DATE NOT NULL,
    dept_head INT,
    CONSTRAINT fk_dept_head FOREIGN KEY (dept_head) REFERENCES employee(emp_id) ON DELETE SET NULL
);

-- Employee Table
CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    emp_name VARCHAR(100) NOT NULL,
    emp_dob DATE NOT NULL,
    emp_salary DECIMAL(10,2) NOT NULL,
    emp_address VARCHAR(255),
    emp_role VARCHAR(100),
    emp_joining_date DATE NOT NULL,
    emp_yearly_bonus DECIMAL(5,2),
    department_id INT,
    CONSTRAINT fk_department FOREIGN KEY (department_id) REFERENCES department(id) ON DELETE SET NULL
);
