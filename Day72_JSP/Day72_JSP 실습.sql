DROP TABLE member_tbl_02;

CREATE TABLE member_tbl_02 
(
  custno NUMBER(6) NOT NULL -- constraint 안 쓰고 PRIMARY KEY 써도 됨. 
, custname VARCHAR2(20) 
, phone VARCHAR2(13) 
, address VARCHAR2(60) 
, joindate DATE 
, grade CHAR(1) 
, city CHAR(2) 
, CONSTRAINT mtb102_ke PRIMARY KEY (custno)

-- mtb102_ke 위치에 이름을 넣는 이유는 테이블이 이것저것 있어서 복잡해질 때, 
-- 해당 명칭으로 검색하고 그럴 수 있어서 넣는다. 테이블이 간단할 때는 넣을 필요가 없다. 
-- CONSTRAINT 영어사전: 제약

);


INSERT INTO member_tbl_02 VALUES(100001, '김행복', '010-1111-2222', '서울 동대문구 휘경1동','2015-12-02','A','01');
INSERT INTO member_tbl_02 VALUES(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동','2015-12-06','B','01');
INSERT INTO member_tbl_02 VALUES(100003, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리','2015-10-01','B','30');
INSERT INTO member_tbl_02 VALUES(100004, '최사랑', '010-1111-5555', '을룽군 을롱읍 독도2리','2015-11-13','A','30');
INSERT INTO member_tbl_02 VALUES(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골','2015-12-25','B','60');
INSERT INTO member_tbl_02 VALUES(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골','2015-12-11','C','60');

-- SELECT * FROM member_tbl_03;                  


DROP TABLE money_tbl_02;    

CREATE TABLE money_tbl_02   -- create table 이름
(
    custno  NUMBER(6)   NOT NULL
,   salenol NUMBER(8)   NOT NULL
,   pcost   NUMBER(8) 
,   amount  NUMBER(4)
,   price   NUMBER(8)
,   pcode   VARCHAR2(4)
,   sdate   DATE
,   CONSTRAINT  asd PRIMARY KEY (custno, salenol)
--,   CONSTRAINT  qweq PRIMARY KEY (salenol) 
-- constraint 여러개로 쓰면 이미 primary key가 존재한다고 오류나오더라.
-- 하나에 몰아서 써야 함.
);


INSERT INTO money_tbl_02 VALUES (100001, 20160001, 500, 5, 2500, 'A001', '20160101');
INSERT INTO money_tbl_02 VALUES (100001, 20160002, 1000, 4, 4000, 'A002', '20160101');
INSERT INTO money_tbl_02 VALUES (100001, 20160003, 500, 3, 1500, 'A008', '20160101');
INSERT INTO money_tbl_02 VALUES (100002, 20160004, 2000, 1, 2000, 'A004', '20160102');
INSERT INTO money_tbl_02 VALUES (100002, 20160005, 500, 1, 500, 'A001', '20160103');
INSERT INTO money_tbl_02 VALUES (100003, 20160006, 1500, 2, 3000, 'A003', '20160103');
INSERT INTO money_tbl_02 VALUES (100004, 20160007, 500, 2, 1000, 'A001', '20160104');
INSERT INTO money_tbl_02 VALUES (100004, 20160008, 300, 1, 300, 'A005', '20160104');
INSERT INTO money_tbl_02 VALUES (100004, 20160009, 600, 1, 600, 'A006', '20160104');
INSERT INTO money_tbl_02 VALUES (100004, 20160010, 3000, 1, 3000, 'A007', '20160106');

-- insert into 테이블 values();
-- 삽입해라. 으로(INTO) TABLE 값(VALUES)을

SELECT * FROM money_tbl_02 ;


-- 날짜를 표현하는 방식이 다양하기 때문에 DB에서 아예 DATE 데이터타입을 제공한다
-- EX)  년도/월/일
--      년도.월.일
--      년도-월-일
--      03-12-3
--      12/3-03(년)
-- 20160106라고만 넣으면 DATE에 디폴트 형식으로 넣어지고 YY/MM/DD 형식을 바꿔줄 수도 있다. 

-- create table 명칭
-- drop table 명칭
-- insert into 테이블명 values();
-- select 궁금한 것 from 테이블명
-- ex) 
SELECT pcost*amount FROM money_tbl_02 ;
