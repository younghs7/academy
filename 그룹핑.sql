SELECT * FROM buytbl;

-- 실험
SELECT userID,amount FROM buytbl ORDER BY userID ASC;
SELECT userID,amount FROM buytbl ORDER BY userID ASC;
SELECT userID,amount FROM buytbl ORDER BY userID ASC;

-- ORDER BY 같은 userID 끼리 모아둔다
-- 그룹핑 같은 값끼리 ASC한것
SELECT userID,amount FROM buytbl ORDER BY userID ASC;

--  이렇게하면 amount 다 더하고 ID 아무거나 때려 박는다.
SELECT userID,SUM(amount) FROM buytbl;

-- 그룹핑하고 amount 더하고 범위는 GROUP BY userID 
SELECT userID,SUM(amount) FROM buytbl GROUP BY userID DESC;
SELECT userID,SUM(amount) FROM buytbl GROUP BY userID;
-- SUM() : 내장함수,집계함수

-- AS 별칭(purchasse)을 넣어준다. AS생략도 가능;     AS에즈
SELECT userID,SUM(amount) AS purchasse FROM buytbl GROUP BY userID ASC;
-- AS 를 넣을 때 뛰는 경우는  ''으로 묶어준다.
SELECT userID,SUM(amount) AS '판매 금액' FROM buytbl GROUP BY userID ASC;

-- ORM 용어 알아두기 자동으로 SQL을 만들어주는것 

-- MIN 최소값을 출력해준다(GROUP BY : 구릅묶음으로)
SELECT userID,MIN(amount) AS '판매 최소값' FROM buytbl GROUP BY userID ;

-- MAX 최고값을 출력해준다
SELECT userID,MAX(amount) AS '판매 최대값' FROM buytbl GROUP BY userID ;

-- count 최고값을 출력해준다
SELECT count(userID) AS 'userID의 개수' FROM buytbl;

-- 총구매액 price * amount
-- 사용자 별 총 구매액 GROUP BY userID
SELECT userID,SUM(price*amount) AS '구매총합' FROM buytbl GROUP BY userID;


-- HAVING 사용법 이 사황에서는  WHERE 사용할수가 없다 이유는 buytbl에 SUM(price*amount)이 없어서 찾지 못해서!!!
-- HAVING 는 GRANT 뒤에 온다! 
SELECT userID,SUM(price*amount) AS '구매총합' FROM buytbl GROUP BY userID  HAVING SUM(price*amount) > 1000;





























