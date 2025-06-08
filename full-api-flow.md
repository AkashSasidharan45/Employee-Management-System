content = """# Employee and Department API JSON Schemas Documentation

## Employee APIs

### 1. Create Employee
- Method: POST  
- URL: /employee/create  

**Request JSON:**  
```json
{
  "empName": "string",
  "empDOB": "YYYY-MM-DD",
  "empSalary": number,
  "empAddress": "string",
  "empRole": "string",
  "empJoiningDate": "YYYY-MM-DD",
  "empYearlyBonus": number,
  "department": {
    "id": integer
  }
}


Response JSON
{
  "empId": integer,
  "empName": "string",
  "department": {
    "id": integer,
    "deptName": "string"
  }
}



// 2. ### Get All Employees
Method: GET

URL: /employees/getAllEmployee

Response JSON:
Array of Employee objects (full details)

[
  {
    "empId": integer,
    "empName": "string",
    "empDOB": "YYYY-MM-DD",
    "empSalary": number,
    "empAddress": "string",
    "empRole": "string",
    "empJoiningDate": "YYYY-MM-DD",
    "empYearlyBonus": number,
    "department": {
      "id": integer,
      "deptName": "string"
    }
  }
]

// 3. Get Employee By ID
Method: GET

URL: /api/employees/{id}

Response JSON:
Employee object (full details as above)

4. Update Employee
Method: PUT

URL: /employees/updateEmployee

Request JSON: Same as Create Employee

Response JSON: Updated Employee object

// 5. Delete Employee
Method: DELETE

URL: /api/employees/{id}

Response JSON:

{
  "message": "Employee deleted successfully"
}

6. Get Employees (Only ID and Name)
Method: GET

URL: /api/employees/lookup?lookup=true

Response JSON:



[
  {
    "empId": integer,
    "empName": "string"
  }
]



// Department APIs
// 1. Create Department
Method: POST

URL: /api/departments

Request JSON:

{
  "deptName": "string",
  "creationDate": "YYYY-MM-DD",
  "deptHead": {
    "empId": integer
  }
}


Response JSON:
{
  "id": integer,
  "deptName": "string",
  "creationDate": "YYYY-MM-DD",
  "deptHead": {
    "empId": integer,
    "empName": "string"
  }
}


// 2. Get All Departments
// Method: GET

URL: /api/departments


Response JSON:
Array of Department objects (full details)
[
  {
    "id": integer,
    "deptName": "string",
    "creationDate": "YYYY-MM-DD",
    "deptHead": {
      "empId": integer,
      "empName": "string"
    }
  }
]


// 3. Get Department By ID
Method: GET

URL: /api/departments/{id}

Response JSON: Department object (full details as above)

// 4. Get Department With Employees
Method: GET

URL: /api/departments/{id}?expand=employee

Response JSON:
{
  "id": integer,
  "deptName": "string",
  "creationDate": "YYYY-MM-DD",
  "deptHead": {
    "empId": integer,
    "empName": "string"
  },
  "employee": [
    {
      "empId": integer,
      "empName": "string"
    }
  ]
}


// 5. Update Department
Method: PUT

URL: /api/departments/{id}

Request JSON: Same as Create Department

Response JSON: Updated Department object



// 6. Delete Department
Method: DELETE

URL: /api/departments/{id}

Response JSON:
{
  "message": "Department deleted successfully"
}
