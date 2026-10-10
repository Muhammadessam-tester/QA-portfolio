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

-- 1.return 7 rows
SELECT * FROM employees; 

-- 2.return Khaled, Sara, Omar 
select name , salary 
from employees 
where salary > 10000
order by salary desc ;

-- 3.return Sara, Omar, Khaled
select e.name  
from employees as e join departments as d
on e.dept_id  = d.id
where d.name ='IT';

-- 4.return 6 rows, so Youssef doesn't appear
select e.name , d.name 
from employees as e 
join departments as d
on d.id = e.dept_id;

-- 5.return 7 rows, and the Youssef section is empty
select e.name , d.name 
from employees as e 
left join departments as d
on d.id = e.dept_id;

-- 6.return Marketing only
select  d.name 
from employees as e 
right join departments as d
on d.id = e.dept_id
where e.name is null;

-- 7.return HR 2, IT 3, Finance 1, Marketing 0
select count(e.name) as count_of_emp , d.name as dept_name
from employees as e
right join departments as d 
on d.id = e.dept_id
group by d.name ;

-- 8.return HR 8500, IT 15666.67, Finance 10000
select avg(e.salary) as avg, d.name as dept_name
from employees as e
join departments as d
on d.id = e.dept_id
group by d.name ;

-- 9.return HR, IT
select count(e.name) as count_of_emp , d.name as dept_name
from employees as e
right join departments as d 
on d.id = e.dept_id
group by d.name 
having count_of_emp > 1 ;

-- 10.Sara, Omar, Khaled
 select name from employees
 where salary > 
  (select avg(salary) 
  from employees ) ;