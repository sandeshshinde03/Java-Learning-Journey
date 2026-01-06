-- COUNT: Total number of employees
SELECT COUNT(*) AS total_employees
FROM Employee;

-- SUM: Total salary paid to all employees
SELECT SUM(salary) AS total_salary
FROM Employee;

-- AVG: Average salary of employees
SELECT AVG(salary) AS average_salary
FROM Employee;

-- MIN: Lowest salary in the organization
SELECT MIN(salary) AS minimum_salary
FROM Employee;

-- MAX: Highest salary in the organization
SELECT MAX(salary) AS maximum_salary
FROM Employee;

-- Department-wise aggregate analysis
SELECT 
    dept_id,
    COUNT(emp_id) AS employee_count,
    SUM(salary) AS department_total_salary,
    AVG(salary) AS department_average_salary,
    MIN(salary) AS department_min_salary,
    MAX(salary) AS department_max_salary
FROM Employee
GROUP BY dept_id;
