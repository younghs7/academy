DROP TABLE authortbl;
DROP TABLE booktbl; 

CREATE TABLE authortbl 
(
	author_id INT NOT NULL PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    city VARCHAR(10),
    job_title VARCHAR(20),
    job_desc  VARCHAR(100)
    
);

CREATE TABLE booktbl 
(
	book_id INT NOT NULL PRIMARY KEY,
	title VARCHAR(40) NOT NULL,
	book_desc VARCHAR(100),
	author_id INT NOT NULL,
    FOREIGN KEY (author_id) references authortbl(author_id)
);

INSERT INTO authortbl VALUES (1, '홍길동', '서울', '서자', '아버지를 부르지못함');
INSERT INTO authortbl VALUES (2, '이순신', '전남', '군인', '일본킬러');
INSERT INTO authortbl VALUES (3, '임꺽정', '충북', '도사', '산적출신');

SELECT * FROM authortbl;

INSERT INTO booktbl VALUES (1, '손쉬운 양반털기', '양반의 돈을 털어 양민들에게', 1);
INSERT INTO booktbl VALUES (2, '알기쉬운 가족관계', '아버지를 부르는 법', 1);
INSERT INTO booktbl VALUES (3, '난중일지', '임진왜란 이야기', 2);
INSERT INTO booktbl VALUES (4, '옥중일지', '원균에게 당했다.', 2);
INSERT INTO booktbl VALUES (5, '쉬운 자바', NULL, 3);
INSERT INTO booktbl VALUES (6, '엄청쉬운 자바', NULL, 4);
SELECT * FROM booktbl;

SELECT * FROM booktbl;
