-- Insert Departments
INSERT INTO department (dept_id, dept_name, creation_date, dept_head_id) VALUES
(1, 'Engineering', '2023-01-01', 1),
(2, 'Marketing', '2023-01-02', 6),
(3, 'HR', '2023-01-03', 11);

-- Insert Employees
INSERT INTO employee (emp_id, emp_name, emp_dob, emp_salary, emp_address, emp_role, emp_joining_date, emp_yearly_bonus, dept_id) VALUES
(1, 'Akash Sasidharan', '2000-12-12', 50000, 'Kerala', 'Developer', '2020-05-05', 15, 1),
(2, 'John Doe', '1995-08-20', 48000, 'Mumbai', 'Developer', '2021-06-10', 10, 1),
(3, 'Jane Smith', '1992-11-15', 47000, 'Delhi', 'Developer', '2021-07-20', 12, 1),
(4, 'Robert Brown', '1988-03-05', 45000, 'Bangalore', 'Tester', '2019-04-10', 8, 1),
(5, 'Emily Davis', '1994-09-22', 46000, 'Chennai', 'Developer', '2020-08-12', 11, 1),

(6, 'Michael Wilson', '1985-02-17', 55000, 'Pune', 'Marketing Manager', '2018-03-18', 20, 2),
(7, 'Laura Taylor', '1990-12-11', 43000, 'Hyderabad', 'Marketing Executive', '2020-09-22', 9, 2),
(8, 'Daniel Lee', '1993-05-30', 42000, 'Kolkata', 'Marketing Executive', '2021-10-01', 10, 2),
(9, 'Sophia Martinez', '1989-07-14', 44000, 'Ahmedabad', 'Marketing Executive', '2019-11-15', 12, 2),
(10, 'David Anderson', '1991-01-25', 43000, 'Surat', 'Marketing Executive', '2020-01-30', 10, 2),

(11, 'Jessica Thomas', '1987-06-13', 47000, 'Jaipur', 'HR Manager', '2017-05-05', 18, 3),
(12, 'Matthew Jackson', '1992-10-08', 40000, 'Lucknow', 'HR Executive', '2019-02-20', 9, 3),
(13, 'Olivia White', '1994-04-19', 42000, 'Kanpur', 'HR Executive', '2020-07-10', 10, 3),
(14, 'James Harris', '1986-08-23', 46000, 'Nagpur', 'HR Executive', '2018-03-25', 13, 3),
(15, 'Isabella Martin', '1993-12-04', 44000, 'Indore', 'HR Executive', '2019-11-11', 12, 3),

-- Additional employees for departments (repeat or vary as needed)
(16, 'Chris Moore', '1990-03-15', 41000, 'Patna', 'Developer', '2021-01-01', 9, 1),
(17, 'Natalie Clark', '1991-07-19', 42000, 'Vadodara', 'Developer', '2021-06-15', 10, 1),
(18, 'Joshua Rodriguez', '1992-05-21', 43000, 'Bhopal', 'Developer', '2020-12-20', 11, 1),
(19, 'Megan Lewis', '1988-11-02', 40000, 'Coimbatore', 'Marketing Executive', '2019-05-05', 9, 2),
(20, 'Andrew Walker', '1990-01-30', 45000, 'Mysore', 'Marketing Executive', '2020-07-23', 10, 2),

(21, 'Sarah Hall', '1993-02-25', 43000, 'Rajkot', 'HR Executive', '2018-12-10', 11, 3),
(22, 'Ryan Young', '1987-04-14', 44000, 'Kochi', 'HR Executive', '2017-08-12', 12, 3),
(23, 'Emma King', '1995-06-19', 42000, 'Madurai', 'Developer', '2021-05-30', 10, 1),
(24, 'Jacob Scott', '1994-09-08', 41000, 'Guwahati', 'Developer', '2020-09-15', 9, 1),
(25, 'Ava Green', '1990-10-10', 43000, 'Dehradun', 'Marketing Executive', '2019-03-22', 11, 2);
