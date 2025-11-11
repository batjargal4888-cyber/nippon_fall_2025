-- session 23
-- mongolian_national_holiday гэдэг өгөгдлийн сан үүсгээд түүндээ id integer давтагддаггүй бас автоматаар нэмэгддэг
-- name буюу text төрөлтэй бөх морь сур харваа гэж хадгалагдах ёстой талбар үүсгэдэг sql query бичнэ үү.
CREATE table mongolian_national_holiday(
	id integer primary key autoincrement,
	name text not null
);
-- дараа нь түүндээ эрийн 3 наадмуудаа оруулж өгнө үү.
INSERT INTO mongolian_national_holiday (name)
values
("Wrestling"),
("Archer"),
("Horse Racing");
-- Problem data-г яаж харсан бэ?
SELECT * FROM mongolian_national_holiday;
SELECT id from mongolian_national_holiday;
SELECT name from mongolian_national_holiday;
SELECT id, name from mongolian_national_holiday;
-- Мөринй хувьд хийж үзэх
SELECT * FROM mongolian_national_holiday WHERE id = 1;
-- Wrestling гэдэг нэртэй мөрийг сонгоё
SELECT * FROM mongolian_national_holiday WHERE name = 'Wrestling';
-- Wrestking нэртэй мөрийн зөвхөн name баганыг сонгох
SELECT name from mongolian_national_holiday WHERE name = 'Wrestling';
-- Тэгвэл одоо wrestling болон archery гэдэг нэртэй мөрүүдийг зэрэг харуулна уу
SELECT * FROM mongolian_national_holiday WHERE name = 'Wrestling' or name = 'Archer';
-- Монголын хотуудын хүн амын өгөгдлийн санг бүртгэе
-- mgl_city_population гэдэг хүснэгт үүсгэнэ үү
-- id байна
-- хотын нэр байна
-- тухайн хотын нийт хүн ам буюу population гэдэг багана байна.
CREATE table mgl_city_population (
	id integer primary key autoincrement,
	city_name text not null,
	population integer
);
-- улаанбаатар, эрдэнэт болон дарханы хүн амыг оруулна уу.
INSERT INTO mgl_city_population (city_name, population)
values
("Улаанбаатар", 1500000),
("Эрдэнэт", 80000),
("Дархан", 100000);
SELECT * FROM mgl_city_population;
-- 100000-аас дээш хүн амтай хотуудыг харуулна уу
SELECT * FROM mgl_city_population WHERE population >= 100000;
-- 80000-с бага хүн амтай хотыг харуулах
SELECT * FROM mgl_city_population WHERE population <= 80000;
-- id нь 1 болон 3 гэсэн хотуудын мэдээллийг харуулах
SELECT * FROM mgl_city_population WHERE id in (1, 3);
-- хүн ам нь 80000-аас дээш 100000-аас доош хотуудыг харуулна уу
SELECT * FROM mgl_city_population WHERE population BETWEEN 80000 AND 100000;
-- зөвхөн 1 утгыг харуулах
SELECT * FROM mgl_city_population limit 1;

CREATE table if not exists employees (
	employee_id integer primary key autoincrement,
	first_name text,
	last_name text,
	department text,
	salary integer
);

INSERT INTO employees (first_name, last_name, department, salary) values ('Болд', 'Дорж', 'IT', 2500000);
INSERT INTO employees (first_name, last_name, department, salary) values ('Сарнай', 'Баяр', 'HR', 2200000);
INSERT INTO employees (first_name, last_name, department, salary) values ('Төмөр', 'Ганбат', 'IT', 2600000);
INSERT INTO employees (first_name, last_name, department, salary) values ('Оюун', 'Энх', 'Sales', 2300000);
INSERT INTO employees (first_name, last_name, department, salary) values ('Цэцэг', 'Наран', 'HR', 2100000);

-- 1. Бүх ажилчдыг харах
SELECT * FROM employees e;
-- 2. Зөвхөн нэрсийг харах
SELECT first_name, last_name FROM employees e;
-- 3. HR хэлтсийн ажилчид
SELECT * FROM employees e WHERE department = 'HR';
-- 4. Өндөр цалинтай ажилчид
SELECT first_name, salary from employees e WHERE salary > 2400000;
-- 5. Тодорхой нэг ажилтан
SELECT * FROM employees e WHERE employee_id = 3;
-- 6. IT хэлтсийн бус ажилчид
SELECT first_name, department FROM employees e WHERE department != 'IT';
-- 7. Эхний 3 ажилтан
SELECT * FROM employees e limit 3;
-- 8. Бага цалинтай 2 ажилтан
SELECT first_name, salary from employees e WHERE salary <= 2300000 limit 2;
-- 9. Шинэ хэлтэс үүсгэх (CREATE TABLE)
create table departments (
	dept_id INTEGER PRIMARY KEY,
    dept_name TEXT UNIQUE
);
-- 10. Хэлтсүүд нэмэх (INSERT INTO)
INSERT INTO departments (dept_id, dept_name) VALUES (1, 'IT');
INSERT INTO departments (dept_id, dept_name) VALUES (2, 'HR');
INSERT INTO departments (dept_id, dept_name) VALUES (3, 'Sales');
INSERT INTO departments (dept_id, dept_name) VALUES (4, 'Marketing');
-- 11. Бүх хэлтсийг харах (SELECT)
SELECT * FROM departments d ;
-- 12. Тодорхой хэлтсийг хайх (WHERE)
SELECT * FROM departments d WHERE dept_id = 2;
-- 13. Нэмэлт ажилтан нэмэх (INSERT INTO)
INSERT INTO employees (first_name, last_name, salary, department) VALUES ('Бат', 'Сүхээ', 2000000, 'Marketing');
-- 14. Marketing хэлтсийн ажилчид
SELECT * FROM employees e WHERE department = 'Marketing';
-- 15. Хамгийн өндөр цалинтай 1 ажилтан (Эрэмбэлэлтгүйгээр)
SELECT * FROM employees e WHERE salary = 2500000;