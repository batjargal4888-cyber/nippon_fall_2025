-- ===============================
-- 1-р Хэсэг: Хүснэгт үүсгэх
-- ===============================

-- 1. authors хүснэгт
CREATE table authors (
	id integer primary key autoincrement,
	name text not null,
	birth_year integer
);

-- 2. books хүснэгт
CREATE TABLE books (
    id INTEGER PRIMARY KEY autoincrement,
    title TEXT,
    publish_year INTEGER,
    price INTEGER
);

-- 3. customers хүснэгт
CREATE TABLE customers (
    id INTEGER PRIMARY KEY autoincrement,
    name TEXT,
    email TEXT,
    city TEXT
);

-- ===============================
-- 2-р Хэсэг: Өгөгдөл оруулах
-- ===============================

-- 4. Зохиогч нэмэх
INSERT INTO authors (name, birth_year) VALUES ('Agatha Christie', 1890);
INSERT INTO authors (name, birth_year) VALUES ('J.K. Rowling', 1965);

-- 5. Ном нэмэх
INSERT INTO books (title, publish_year, price) VALUES ('And Then There Were None', 1939, 35000);
INSERT INTO books (title, publish_year, price) VALUES ('Murder on the Orient Express', 1934, 32000);
INSERT INTO books (title, publish_year, price) VALUES ('Harry Potter and the Sorcerer''s Stone', 1997, 45000);

-- 6. Худалдан авагч нэмэх
INSERT INTO customers (name, email, city) VALUES ('Дорж', 'dorj@email.com', 'Улаанбаатар');
INSERT INTO customers (name, email, city) VALUES ('Сараа', 'saraa@email.com', 'Эрдэнэт');

-- ===============================
-- 3-р Хэсэг: SELECT ба WHERE
-- ===============================

-- 7. Бүх номыг харах
SELECT * FROM books;

-- 8. Зөвхөн нэр ба үнийг харах
SELECT title, price from books;

-- 9. id = 2 зохиогчийг олох
SELECT name from authors WHERE id = 2; 

-- 10. 1950 оноос өмнө төрсөн зохиогчид
SELECT * FROM authors WHERE birth_year < 1950;

-- 11. Улаанбаатарын худалдан авагчид
SELECT * FROM books WHERE price > 4000;


-- ===============================
-- 4-р Хэсэг: ORDER BY ба LIMIT
-- ===============================

-- 13. Номыг нэрээр нь цагаан толгойн дарааллаар
SELECT * FROM books ORDER BY title ASC;

-- 14. Зохиогчдыг төрсөн оноор нь буурахаар
SELECT * FROM authors ORDER BY birth_year DESC;

-- 15. Хамгийн үнэтэй ном
SELECT * FROM books order by price DESC LIMIT 1;

-- 16. Эхний хоёр худалдан авагч
SELECT * FROM customers limit 2;

-- ===============================
-- 5-р Хэсэг: Нэгтгэсэн даалгавар
-- ===============================

-- 17. "Express" гэдэг үг орсон ном
SELECT * FROM books WHERE title LIKE '%Express%';

-- 18. 1990-ээд оны номууд
SELECT * FROM books WHERE publish_year BETWEEN 1990 AND 2000;

-- 19. Хамгийн хямд хоёр ном
SELECT * FROM books ORDER BY price ASC LIMIT 2;

-- 20. "Э" үсгээр эхэлсэн хотынхон
SELECT * FROM customers WHERE city LIKE 'Э%';