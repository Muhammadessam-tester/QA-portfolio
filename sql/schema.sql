DROP DATABASE IF EXISTS company_db;
CREATE DATABASE company_db;
USE company_db;

CREATE TABLE departments (
    id INT PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DECIMAL(10,2),
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES departments(id)
);

INSERT INTO departments VALUES
(1, 'HR'), (2, 'IT'), (3, 'Finance'), (4, 'Marketing');

INSERT INTO employees VALUES
(1, 'Ahmed', 9000, 1),
(2, 'Sara', 15000, 2),
(3, 'Omar', 12000, 2),
(4, 'Mona', 10000, 3),
(5, 'Khaled', 20000, 2),
(6, 'Hana', 8000, 1),
(7, 'Youssef', 7000, NULL);

SELECT * FROM departments;