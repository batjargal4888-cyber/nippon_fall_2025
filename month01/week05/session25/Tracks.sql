-- ===============================
-- Төсөл 1: SQL Query-ний Сорилт 
-- ===============================

create table tracks (
	track_id integer primary key autoincrement,
	title text not null,
	artist text not null,
	genre text not null,
	length_sec integer
);

INSERT INTO tracks (title, artist, genre, length_sec) values
('Bohemian Rhapsody', 'Queen', 'Rock', 354),
('Shape of you', 'Ed Sheeran', 'Pop', 240),
('Take five', 'Dave Brubeck', 'Jazz', 330),
('Imagine', 'John Lennon', 'Pop', 183),
('Smells Like Teen Spirit', 'Nirvana', 'Rock', 301),
('Blue in Green', 'Miles Davis', 'Jazz', 327);

SELECT title, artist from tracks
WHERE genre = 'Pop';

SELECT title, length_sec from tracks
WHERE length_sec < 250;

SELECT title, artist from tracks
WHERE genre = 'Jazz'
ORDER BY length_sec DESC 
LIMIT 1;

SELECT title, artist FROM tracks
WHERE artist LIKE 'Q%';

SELECT title, length_sec from tracks
order by length_sec ASC 
limit 3;