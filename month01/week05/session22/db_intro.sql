-- SQL Query
create table students (
    first_name text,
    last_name text
);

insert into students (first_name, last_name)
values
("Saruul", "Gantulga");

create table animals (
	id integer,
	name text
);

insert into animals (id, name)
values
(1, "Mouse"),
(2, "Horse"),
(3, "Cow");

insert into animals (id, name)
values
(3, "Yak");