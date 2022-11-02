-- 집계함수 SUM(), AS -------------------------------------------------
SELECT userID, SUM(amount) As purchase FROM buytbl GROUP BY userID;
-- 집계함수(내장함수)를 썼을 때, GROUP BY 로 범위를 지정하지 않으면 엉망으로 나온다. 
-- AS (엘리어스: 별칭) AS 생략가능: 집계함수 컬럼 명칭을 바꿈. 

SELECT userID, SUM(amount) purchase FROM buytbl GROUP BY userID; 
-- 주의) AS 안 쓰면 컬럼으로 헷갈릴 수 있기 때문에 꼭 AS를 붙여주는 것이 좋다.

SELECT userID, SUM(price*amount) AS '합계구매액' FROM buytbl GROUP BY userID;

SELECT userID, SUM(price*amount) AS '합계구매액' FROM buytbl GROUP BY userID  DESC; -- ASC
-- GROUP BY에 ASC, DESC 가능하다.

-- ORM 용어 알아두기 자동으로 SQL을 만들어주는것 

-- 집계함수 MIN() -----------------------------------------
SELECT userID, MIN(amount) AS '최소값' FROM buytbl GROUP BY userID;



-- HAVING ---------------------------------------------------------------------------------------------

SELECT userID, SUM(price*amount) AS '합계구매액' FROM buytbl WHERE SUM(price*amount) >1000 GROUP BY userID; 
-- [오류남] WHERE price * amount 넣으면 오류남.
-- WHERE의 대상은 TABLE 내용만 받을 수 있기 때문이다.

SELECT userID, SUM(price*amount) AS '합계구매액' FROM buytbl GROUP BY userID
HAVING SUM(price*amount) >1000;
-- 정상 작동함

SELECT userID, SUM(price*amount) AS '합계구매액' FROM  buytbl WHERE userID = 'BBK' GROUP BY userID; 
-- GROUP BY가 있어도 WHERE 대상들 TABLE로 넣은 경우는 잘 된다.


