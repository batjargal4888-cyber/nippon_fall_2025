-- 1. Бүх киноны нэр ба үргэлжлэх хугацааг харах
select title, length
from film;

-- 2. Хамгийн урт 10 киног олох
select title, length
from film f 
order by length desc
limit 10;

-- 3. Идэвхгүй хэрэглэгчдийг олох
select *
from customer c 
where active = 0;

-- 4. Төлбөрийн нэгдсэн статистик
select 	sum(amount) as total_revenue,
		avg(amount) as average_payment,
		count(*) 	as total_payments
from payment p ;

-- 5. Дундаж үргэлжлэх хугацаанаас урт кинонууд
select title, length
from film f 
where length > (
	select avg(length) from film f2 
);

-- 6. "PG-13" үнэлгээтэй, 2-3 цагийн хооронд үргэлжилдэг кинонууд
select title, length, rating
from film f 
where 	rating = 'PG-13'
and 	length between 120 and 180;

-- 7. 10 доллараас дээш үнэтэй төлбөрүүд
select *
from payment p 
where amount > 10
order by amount desc;

-- 8. "G" үнэлгээтэй, 60 минутаас богино кинонууд
select title, length, rating 
from film f 
where rating = 'G'
and length < 60;

-- 9. Тодорхой нэг өдрийн нийт орлого (ШИНЭ)
select 	sum(amount) as total_revenue_for_day,
		count(*) as payments_on_day
from payment p 
where date(payment_date) = '2007-02-15';

-- 10. Нэрэндээ "LOVE" гэдэг үг орсон кинонууд
select title
from film f 
where title like '%love%';