-- city-нүүдийн нэрний ард талд нь улсуудын нэрийг нь харуулаад
-- хэвлэдэг query бичнэ үү

select * from  city c ;

-- primary key - unique

-- 1 table-ийн primary key нь өөр table-ийн 
-- баганад орж ирж байгаа холбоосыг бид нар
-- foreign key гэдэг.

-- JOIN гэдэг зүйлийг ашигладаг.
-- JOIN буюу INNER JOIN

select * from city
inner join
country c 
on
country.country_id = city.country_id;

-- city, country гэсэн багануудыг нь харуулна уу
select city, country from city c 
inner join
country c2 
on
country.country_id = city.country_id ;

-- Ex01
-- customer-уудын нэр болон хаягийг нь харуулна уу
select first_name, a.address, a.district 
from customer c 
inner join
address a 
on
c.address_id = a.address_id ;

-- Ex02
-- Film-ийн title-ийг нь ямар 1 хэл дээр бичигдсэнийг нь харуулна уу
select f.title, l."name" 
from film f 
inner join
language l 
on
f.language_id = l.language_id;

-- Ex03
-- payment хүснэгтээс payment id, payment amount, customer 1st name,
-- customer last name зэргийг хамтад нь харуулна уу
select p.payment_id , p.amount , c.first_name , c.last_name 
from payment p 
inner join
customer c 
on
p.customer_id = c.customer_id;