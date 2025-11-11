select * from city;
select * from country;

-- countr_id 1 id тай хотуудыг хэвлэнэ үү
select city from city c where country_id = 4; 

-- dvd_rental database дээр 1 улсад оногдох хотуудын тоог харуулна уу
select count(*) from city;

-- group by гэдэг clause оруулж ирдэг.
select city, count(*) from city group by city;

-- payment дээр хэрэглэгчид дунджаар хэдэн долларын гүйлгээ хийсэн бэ?
select customer_id, avg(amount), payment_date as average from payment
group by customer_id, payment_date 
order by average desc;

-- 200-аас их доллар төлсөн хэрэглэгчдийг ялгах
select customer_id, sum(amount) as total_payment
from payment p 
-- where sum(amount) > 200
group by customer_id 
having sum(amount) > 200
order by total_payment desc;

-- film table - аас киноны rating бүр дээрх тоог нь харуулна уу
-- 5.99 | 10
-- ..
select rating, count(*)
from film
group by rating
having count(*)
between 150 and 200;

-- aggregation function
-- count, sum, max, min, avg