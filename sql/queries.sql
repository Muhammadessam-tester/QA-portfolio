USE company_db;

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