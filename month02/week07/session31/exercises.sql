--
-- dvd_rental SQL-ийн Иж Бүрэн Дасгалууд
--

-- 1. Бүх хэрэглэгчийг нэрээр нь эрэмбэлэх
SELECT 
    first_name, 
    last_name, 
    email
FROM 
    customer
ORDER BY 
    first_name ASC;

-- 2. Хамгийн урт 10 кино
select
	title,
	length
from
	film
order by
	length
desc
limit
	10;

-- 3. "R" үнэлгээтэй кинонууд
select
	title,
	rating
from
	film
where 
	rating = 'R';

-- 4. 2006 оны 2-р сарын 14-нд ажилд орсон ажилчид
select
	first_name,
	last_name,
	create_date
from
	customer
where
	create_date = '2006-02-14';
 
-- 5. Нэрэндээ "JOHN" гэдэг үг орсон жүжигчид
select
	first_name,
	last_name
from
	actor
where
	first_name 
like
	'%JOHN%';

-- 
-- Дунд шатны дасгалууд (Aggregate, GROUP BY, HAVING)
-- 

-- 6. Киноны нийт тоо
select
	count(film_id) 
as
	total_films
from 
	film;

-- 7. Үнэлгээ тус бүрд хэдэн кино байгаа вэ?
select
	rating,
	count(*) as number_of_films
from
	film
group by
	rating
order by
	number_of_films desc;

-- 8. Хамгийн их мөнгө төлсөн 10 хэрэглэгч
select 
	customer_id,
	sum(amount) as total_paid
from
	payment
group by
	customer_id 
order by 
	total_paid desc 
limit 10;

-- 9. 30-аас дээш удаа кино түрээсэлсэн хэрэглэгчид
select 
	customer_id,
	count(*) as rental_count
from
	rental
group by
	customer_id 
having 
	count(*) > 30
order by
	rental_count desc;

-- 10. Дэлгүүр тус бүрийн нийт орлого
select 
	s.store_id,
	sum(p.amount) as total_revenue
from
	store s 
join
	payment p on s.manager_staff_id = p.staff_id
group by
	s.store_id;

--
-- Ахисан түвшний дасгалууд (JOIN-ы төрлүүд)
--

-- 11. Киноны ангилал ба нэр (INNER JOIN)
select
	title,
	c.name as category_name
from
	film f 
inner join
	film_category fc on f.film_id = fc.film_id 
inner join
	category c on fc.category_id = c.category_id 
where 
	f.title = 'Academy Dinosaur';

-- 12. Хамгийн олон кинонд тоглосон жүжигчин
select 
	a.first_name,
	a.last_name,
	count(*) as film_count
from
	actor a 
join
	film_actor fa on a.actor_id = fa.actor_id 
group by
	a.first_name, a.last_name 
order by
	film_count desc limit 1;

select * from film_actor fa where actor_id = 101 or actor_id = 110;