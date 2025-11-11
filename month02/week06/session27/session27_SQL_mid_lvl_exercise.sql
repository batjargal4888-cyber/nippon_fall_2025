create table employees (
	id serial primary key,
	first_name varchar(100),
	last_name varchar(100),
	department varchar(50),
	salary integer,
	hire_date date
);

INSERT INTO employees (first_name, last_name, department, salary, hire_date) VALUES
('Дорж', 'Баяр', 'Хөгжүүлэлт', 3500000, '2022-01-15'),
('Сараа', 'Болд', 'Маркетинг', 2800000, '2021-06-20'),
('Тулга', 'Ганбат', 'Хөгжүүлэлт', 4200000, '2023-03-10'),
('Номин', 'Энх', 'Нягтлан', 3100000, '2020-11-01'),
('Очир', 'Сүх', 'Хөгжүүлэлт', 3800000, '2022-08-25');

select * from employees;

select first_name, last_name, salary from employees e ;

select * from employees e where department = 'Хөгжүүлэлт';

select * from employees e order by salary desc limit 2;

select * from employees e order by first_name;

select * from employees e order by salary desc;

select * from employees e 
order by salary desc
limit 2;

select * from employees e 
order by hire_date desc 
limit 3;

select count(*) as total_employees from employees e ;

select sum(salary) as total_salary from employees e ;

select avg(salary) as total_salary from employees e ;

select 	min(salary) as min_salary,
		max(salary) as max_salary from employees e ;

select count(*) as marketing_count 
from employees e 
where department = 'Маркетинг';

select * from employees e 
where hire_date >= '2022-01-01';

select * from employees e 
where department = 'Хөгжүүлэлт'
order by salary desc 
limit 1;

select * from employees e 
where first_name like 'Д%';

select * from employees e 
where 	salary < 3000000 
and 	hire_date < '2022-01-01'; 

select * from employees e 
order by hire_date asc 
limit 1;

select avg(salary) as avg_dev_salary
from employees e 
where department = 'Хөгжүүлэлт';

select max(salary) - min(salary) as salary_difference from employees e ;