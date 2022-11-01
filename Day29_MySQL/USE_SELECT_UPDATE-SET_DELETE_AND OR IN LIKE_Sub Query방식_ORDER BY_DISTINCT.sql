USE testdb;
-- [SELECT], [ UPDATE - SET ] - WHERE
-- [USE], [DELETE] 
-- [AND], [OR], [IN], [LIKE]
-- [ Sub Query 방식 ]
-- [ORDER BY]
-- [DISTINCT]

-- [SELECT] - WHERE -------------------------------------

SELECT * FROM usertbl;
SELECT userID, name FROM usertbl;

-- WHERE 추가
SELECT userID, mobile1, mobile2 FROM usertbl WHERE userID = 'JYP';
SELECT name, mobile1, mobile2 FROM usertbl WHERE name = '조관우';


-- 예제)
-- 키가 175이상인 회원을 조회한다.
SELECT * FROM usertbl WHERE  height >= 175;

-- 1980년 이후 출생인 회원을 조회한다.
SELECT * FROM usertbl WHERE birthYear >= 1980;


-- [ UPDATE - SET ] - WHERE -------------------------------------

UPDATE usertbl SET mobile1 = '012' WHERE name='바비킴';

-- 아이디가 jyp인 사람의 주소를 서울로 바꿔보자
UPDATE usertbl SET addr = '서울' WHERE userID = 'JYP';


-- [USE], [DELETE] ---------------------------------------------

USE testdb;

-- userID가 syh인 데이터를 삭제 
DELETE FROM usertbl WHERE userID = 'syh';


-- [AND], [OR], [IN], [LIKE] ------------------------------------------------

-- 키가 175이상이고 1980년 이후 출생인 회원을 전화번호를 조회한다.
SELECT mobile1, mobile2 FROM usertbl WHERE height >= 175 AND birthYear >= 1980;

-- 키가 180~183인 회원을 조회
SELECT * FROM usertbl WHERE 180 <= height AND height <=183;

-- 경남, 전남 경북이 주소인 회원조회
SELECT * FROM usertbl WHERE addr = '서울' OR addr ='경기';
SELECT * FROM usertbl WHERE addr IN('서울', '경기');

-- [ 문자열 검색 (LIKE검색) ]
-- • 김씨 성을 가진 회원 조회 
SELECT * FROM usertbl WHERE userID LIKE 'Y%';
-- 느리다. 연산이 들어가기 때문에 (도저히 못 쓸 정도는 아님)

-- 실습 --------------------------------------------------------

-- • 011전화번호를 가진 회원의 아이디와 이름 조회
SELECT userID, name FROM usertbl WHERE mobile1 = '011';

-- • 1970년 이후에 출생했거나 신장이 182 인 회원의 아이디와 이름 조회
SELECT userID, name FROM usertbl WHERE birthYear >= 1970 OR height = 182;

SELECT * FROM usertbl;
SELECT * FROM usertbl WHERE '01235213213';
-- • 서울출신 이고 010 또는 011전화번호를 사용하는 회원 조회
SELECT * FROM usertbl WHERE mobile1 = '010' OR mobile1 = '011';
SELECT * FROM usertbl WHERE mobile1 IN('010', '011');

-- • price가 100보다 작은 제품의 제품명 조회
SELECT prodName FROM testdb.buytbl WHERE price < 100;

-- • userID의 가운데 글자가 B인 회원을 조회
SELECT * FROM testdb.usertbl  WHERE userID  LIKE '_B_';

-- --------------------------------------------------------------------------------------------------- 
-- [ Sub Query 방식 ]

-- 김경호보다 키가 큰 회원정보를 조회.
SELECT height FROM testdb.usertbl WHERE name = '김경호';
SELECT * FROM testdb.usertbl WHERE height > ( SELECT height FROM testdb.usertbl WHERE name = '김경호') ; 
SELECT * FROM testdb.usertbl WHERE height > ( 177) ; 

-- 지역이 ‘경남’인 사람의 키보다 키가 크거나 같은 회원 조회
SELECT height FROM testdb.usertbl WHERE addr = '경남';
SELECT * FROM testdb.usertbl WHERE height >= ANY ( SELECT height FROM testdb.usertbl WHERE addr = '경남' );
SELECT * FROM testdb.usertbl WHERE height >= ALL ( SELECT height FROM testdb.usertbl WHERE addr = '경남' );


-- [ORDER BY]---------------------------------------------------------------------
SELECT * FROM usertbl;
SELECT * FROM usertbl ORDER BY mDate; -- 기본 ASC
SELECT * FROM usertbl ORDER BY mDate ASC; 
SELECT * FROM usertbl ORDER BY mDate DESC;

-- ORDER BY 중첩
SELECT * FROM usertbl ORDER BY height, name ASC;

-- [DISTINCT] 중복 제거 -> 종류가 몇개냐? -------------------------------------------------

SELECT addr FROM usertbl;
SELECT DISTINCT addr FROM usertbl; 
SELECT DISTINCT addr, mobile1 FROM usertbl; -- >  여러개 넣을 시 DISTINCT 무효화됨.(실행은 됨)



