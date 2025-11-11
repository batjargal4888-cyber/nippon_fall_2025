create table students (
	id serial primary key, -- serial <-> sqlite integer autoincrement
	student_name varchar(255) not null,
	email_address varchar(100) not null
);

insert into students
(student_name, email_address)
values
('Khangaikhuu', 'khangaikhuu@hey.com'),
('Puujee', 'puujee@gmail.com');

select * from students;

update students
set student_name = 'Khangaikhuu'
where id = 1;

insert into students 
(student_name, email_address)
values
('Saudi Arabian Student', 'burjkhalifa@gmail.com');

delete from 
students 
where
id = 4;