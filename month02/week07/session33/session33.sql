-- UNION and CROSS JOIN
create table class_a (
	student_name text
);

create table class_b (
	student_name text
);

insert into class_a (student_name)
values
('Micheal'),
('Jordan'),
('Michelle');

insert into class_b (student_name)
values
('Dustin'),
('Hoffman'),
('Dulguun');

select * from class_a;
select * from class_b;

-- Бүх утгуудыг нь харуулна уу.
-- Хажууд нь биш.
select * from class_a
union
select * from class_b;

-- 1. Багануудын нэр болон өгөгдлийн төрөл нь адилхан байх ёстой.
insert into class_a 
values
('Dulguun');
-- Утгуудын нэр нь жишээлбэл давтагдаж байвал давхардуулж харуулахаар болвол UNION ALL
select * from class_a ca 
union all
select * from class_b cb;

-- CROSS JOIN
-- 2 хүснэгтийн боломжит бүх утгуудыг нэгтгэж харуулдаг.
create table t_shirts (
	size_name text
);

create table colors (
	size_name text
);

alter table colors
rename column size_name to colors_name;

insert into t_shirts (size_name)
values ('S'), ('M'), ('L');

insert into colors (colors_name)
values 
('Red'),
('Blue');

-- Тэгвэл боломжит бүх цамц болон өнгөний олонлогийгхаруулна уу. 
-- CROSS JOIN
select
	T1.size_name,
	T2.colors_name
from
	t_shirts as T1
cross join
	colors as T2;