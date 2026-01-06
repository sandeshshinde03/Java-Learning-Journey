CREATE TABLE Department (
  dept_id INT PRIMARY KEY,
  dept_name VARCHAR(50) NOT NULL
);
CREATE TABLE Employee (
  emp_id INT PRIMARY KEY,
  emp_name VARCHAR(50) NOT NULL,
  salary DECIMAL(10, 2),
  dept_id INT,
  FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);