-- DDL database create, update, delete

-- it course course--ийн мэдээлэл хадгалдаг
-- it course гэдэг нэртэй table үүсгээд 2, 3 төрлийн
-- багана өөрөө бодож үүсгээд 2 мөр дата оруулна уу

-- DDL database create, update, delete

-- it course course--ийн мэдээлэл хадгалдаг
-- it course гэдэг нэртэй table үүсгээд 2, 3 төрлийн
-- багана өөрөө бодож үүсгээд 2 мөр дата оруулна уу

create table it_course (
	class_id serial primary key,
	class_name varchar(255) not null,
	class_teacher varchar(255) not null
);

insert into it_course (class_name, class_teacher)
values
('Fullstack Course', 'Khangaikhuu, Munkhtulga'),
('Mobile App Course', 'Khongorzul');

select * from it_course ic;

-- delete all data from the table
-- delete from it_course;

-- truncate table
truncate table it_course;

-- rename table students
alter table it_course 
rename to students;

select * from students;

-- students_id, first_name, last_name, age, grade

-- class_id column-ийг studen_id болгоё
alter table students 
rename column class_id to students_id;

-- class_name -> first_name
-- class_teacher -> last_name болгоно уу

alter table students 
rename column class_name to student_id;

alter table students 
rename column class_teacher to last_name;

-- add age column - tinyint
alter table students 
add column age smallint;
-- grade - CHAR(2)
alter table students 
add grade char(2);

-- add useless column varchar(20) to students table
alter table students 
add column useless varchar(20);
-- useless column-ийг устгая
alter table students 
drop column useless;

-- Бүх table-ийг устгамаар байвал drop
drop table students;

-- Exercise
-- courses table үүсгээд түүний column : course_id, course_name, credits, instructor
create table course (
	course_id serial primary key,
	course_name varchar (255),
	credits int,
	instructor varchar (255)
);

-- шинээр department гэдэг багана нэмнэ үү
alter table course 
add column department varchar (255);

-- instructor-ийг teacher_name гэж нэрлэнэ үү
alter table course 
rename column instructor to teacher_name;

-- credits-ийн дата төрлийг SMALLINT болгож өөрчилнө үү
alter table course 
alter column credits type smallint;

-- Truncate хийж бүх утгыг устгана уу
truncate table course;

-- course table-ийг бүгдийг устгана уу
drop table course;