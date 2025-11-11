CREATE table social_media_platforms (
	id integer primary key autoincrement,
	platform_name text not null,
	users integer,
	founded_by text,
	founded_year date
);

INSERT INTO social_media_platforms (platform_name, users, founded_by, founded_year)
values
("Facebook", 3200000000, "Mark Zuckerberg", "2004-02-04"),
("Instagram", 3200000000, "Kevin Systrom", "2010-10-12"),
("TikTok", 1500000000, "Zhang Yiming", "2016-09-20"),
("Twitter", 611000000, "Jack Dorsey", "2006-07-15");

--бүх мэдээлэл
SELECT * FROM social_media_platforms smp;

-- x-йин үүсгэн байгуулагчийг харуулна уу
SELECT founded_by from social_media_platforms smp WHERE platform_name = 'Twitter';

-- 2010 оноос хойш үүссэн social media platform харуулна уу
SELECT * FROM social_media_platforms smp WHERE founded_by >= '2010-01-01';

-- хэрэглэгч нь 1 - 2 тэрбумын хооронд байгаа platform-ийг харуулна уу
SELECT * FROM social_media_platforms smp WHERE users BETWEEN 1000000000 and 2000000000;

-- Хамгийн их хэрэглэгчээс нь дарааллуулан platform-ийг эрэмбэлж харуулна уу
SELECT * FROM social_media_platforms smp WHERE users order by users DESC;

-- хамгийэ их хэрэглэгчтэй platform харуулна уу хэрвээ ижил тоотой бол түүний
-- сүүлд нээгдсэн оноог нь дээд талд нь харуулна уу
SELECT * FROM social_media_platforms smp order by users desc, founded_year DESC LIMIT 1;