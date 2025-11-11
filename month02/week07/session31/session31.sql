-- session 31
-- SQL JOIN (INNER, LEFT, RIGHT, FULL OUTER)

create table authors (
	author_id int primary key,
	author_name varchar(100) not null,
	country varchar(50)
);

create table books (
	book_id int primary key,
	book_title varchar(200) not null,
	author_id int,
	publication_year int,
	foreign key(author_id) references authors(author_id)
);

INSERT INTO authors (author_id, author_name, country) VALUES
(1, 'Д.Нацагдорж', 'Монгол'),
(2, 'Б.Ринчен', 'Монгол'),
(3, 'Ч.Лодойдамба', 'Монгол'),
(4, 'Ц.Дамдинсүрэн', 'Монгол'),
(5, 'С.Эрдэнэ', 'Монгол');

select * from books b ;

INSERT INTO books (book_id, book_title, author_id, publication_year) VALUES
(1, 'Миний нутаг', 1, 1933),
(2, 'Монголын нууц товчоо', 2, 1959),
(3, 'Цагаан сар', 1, 1934),
(4, 'Алтан гадас', 3, 1968),
(5, 'Орхигдсон ном', NULL, 2020),  -- author_id байхгүй!
(6, 'Өвлийн өглөө', 4, 1975);

-- INNER JOIN(JOIN)
select
	authors.author_name,
	authors.country,
	books.book_title,
	books. publication_year
from authors
inner join books
on authors.author_id = books.author_id;

-- LEFT JOIN (Зүүн талын хүснэгтийн бүх харгалзах утгуудын баруун
-- талын хүснэгтээс харуулаад байхгүй байгаа утгуудыг NULL гэж харуулна)
select
	authors.author_name,
	authors.country,
	books.book_title,
	books.publication_year 
from authors
left join books
on authors.author_id = books.author_id;

-- RIGHT JOIN (Баруун талын хүснэгтийн бүх харгалзах утгуудыг зүүн
-- талын хүснэгтээс харуулаад байхгүй байгаа утгуудыг NULL гэж харуулна)
select
	authors.author_name,
	authors.country,
	books.book_title,
	books.publication_year
from authors
right join books on authors.author_id = books.author_id;

-- FULL OUTER JOIN (Баруун болон зүүн хүснэгтийн бүх утгуудыг харуулах)
select
	authors.author_name,
	authors.country,
	books.book_title,
	books.publication_year
from authors
full outer join books on authors.author_id = books.author_id;

-- ямар нэгэн ном нь номын санд байхгүй зохиогчийг олъё
select 
	authors.author_name,
	authors.country
from authors
left join books
on authors.author_id = books.author_id 
where books.book_id is null;

-- зохиогч нь байхгүй номыг зөвхөн харуулна уу
select 
	books.book_title,
	books.publication_year
from authors
right join books
on books.author_id = authors.author_id 
where authors.author_id is null;

-- Examples
-- Ex01
-- Жишээ 1: Хэдэн зохиогч хэдэн ном бичсэн бэ?
select
	authors.author_name,
	count(books.book_id) as book_count
from
	authors
left join
	books
on
	authors.author_id = books.author_id
group by
	authors.author_name ;

-- Жишээ 2: Хамгийн өндөр настай номнуудыг зохиогчийн мэдээлэлтэй харуулах
select 
	books.book_title,
	books.publication_year,
	authors.author_name
from 
	books
left join 
	authors
on
	books.author_id = authors.author_id 
order by
	books.publication_year asc
limit 3;

-- Жишээ 3: 1970 оноос хойш хэвлэгдсэн номнууд
select 
	books.publication_year,
	books.book_title, 
	authors.author_name,
	authors.country 
from
	books
right join
	authors
on
	books.author_id = authors.author_id 
where
	publication_year >= 1970
order by
	books.publication_year;