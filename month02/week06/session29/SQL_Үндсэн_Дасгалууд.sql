CREATE TABLE books (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(150),
    publish_year INTEGER,
    pages INTEGER,
    price INTEGER
);

INSERT INTO books (title, author, publish_year, pages, price) VALUES
('The Secret History', 'Donna Tartt', 1992, 550, 48000),
('Dune', 'Frank Herbert', 1965, 412, 55000),
('1984', 'George Orwell', 1949, 328, 42000),
('Gone Girl', 'Gillian Flynn', 2012, 419, 39000),
('The Little Prince', 'Antoine de Saint-Exupéry', 1943, 96, 25000);

-- 1. Номын Сангийн Нийт Үнэ
select sum(price) as total_library_value
from books b ;

-- 2. 400-аас Дээш Хуудастай Номууд
select title, pages
from books b 
where pages > 400;

-- 3. Хамгийн Хуучин Ном
select title, publish_year
from books b 
order by publish_year asc 
limit 1;

-- 4. Хамгийн Зузаан Ном
select max(pages) as thickest_book_pages
from books b ;

-- 5. Номнууд 40000-аас хямд
select title, price
from books b 
where price < 40000
order by price asc;

-- 6. Номын дундаж үнэ
select avg(price) as average_book_price
from books b ;

-- 7. "19" гэсэн тоог агуулсан номууд
select title, publish_year
from books b 
where title like '%19%';

-- 8. 1960-аад оны номууд
select title, publish_year
from books b 
where publish_year
between 1960 and 1990;

-- 9. Хамгийн үнэтэй гурван ном
select title
from books b 
order by price desc 
limit 3;

-- 10. Нийт номын тоо
select count(*) as total_book_in_library
from books b ;