select * from actor;

-- Нийт хэдэн жүжигчний мөр байна вэ?
select count(*) from actor;

select * from payment;
-- Мана компани түрээсээрээ хэдэн долларын орлого олсон бэ?
-- SUM aggregation function
select sum(amount) from payment;

select sum(amount) as total_revenue from payment;

-- Film statistics
-- Хамгийн урт, хамгийн богино, дундаж киноны цагийн урттай кинонуудыг харуул
-- Max, min, avg

select * from film limit 10;

select max(length) from film;

select min(length) from film;

select avg(length) from film;