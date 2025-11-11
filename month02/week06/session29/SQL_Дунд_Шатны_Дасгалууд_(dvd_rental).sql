--
-- SQL-ийн Дунд Шатны Дасгалууд (dvd_rental)
--

-- 1. 9-аас дээш үнэлгээтэй кинонууд
select title, rental_rate 
from film f 
where rental_rate >= 4.99;

-- 2. Ялгаатай үргэлжлэх хугацаа
select distinct length
from film f 
order by length;

-- 3. Хамгийн залуу 5 хэрэглэгч
select first_name, last_name, create_date
from customer c 
order by create_date 
limit 5;

-- 4. "G" үнэлгээтэй киноны тоо
select count(*) as g_rated_films
from film f 
where rating = 'G';

-- 5. "Comedy" төрлийн кинонууд
select 
	f.title, 
	c.name as category_name
from 
	film as f 
inner join 
	film_category as fc 
on 
	f.film_id = fc.film_id 
inner join 
	category as c 
on 
	fc.category_id = c.category_id 
where
	c."name" = 'Comedy';

-- 6. Бүх киноны дундаж үнэ
select 
	avg(rental_rate) as average_rental_rate
from
	film as f;

-- 7. 100 минутаас богино эсвэл 150 минутаас урт кинонууд
select 
	title ,
	length
from 
	film as f
where 
	length < 100
or 
	length > 150;

-- 8. 2006 онд төлбөр төлсөн нийт хэрэглэгчийн тоо
select 
	count(distinct customer_id) as customer_paid_in_2007
from 
	payment p 
where 
	payment_date 
between 
	'2007-01-01'
and
	'2007-12-31';

-- 9. 5 ба 10 долларын төлбөрүүд
select 
	payment_id,
	amount
from
	payment
where
	amount
in 
	(5.99, 9.99);

-- 10. "A" үсгээр эхэлсэн нэртэй жүжигчид
select 
	first_name, last_name
from
	actor
where 
	first_name 
like 
    'A%';