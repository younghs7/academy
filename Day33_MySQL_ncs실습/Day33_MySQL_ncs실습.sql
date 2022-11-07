DROP TABLE order_tbl;
DROP TABLE customer_tbl;



CREATE TABLE customer_tbl
(	
	고객번호 INT PRIMARY KEY NOT NULL,
	이름 VARCHAR(30),
    비밀번호 VARCHAR(45)
);

CREATE TABLE order_tbl
(	주문번호 INT PRIMARY KEY NOT NULL,
	고객번호 INT NOT NULL,
    주문일 DATE,
    주문가격 INT,
    배송도시 VARCHAR(100),
    배송완료일 DATE,
    결제금액 INT,
    할인금액 INT,
    적립포인트 INT,
    
    FOREIGN KEY (고객번호) REFERENCES customer_tbl(고객번호)
);


SELECT * FROM testdb.customer_tbl;
SELECT * FROM testdb.order_tbl;

INSERT INTO testdb.customer_tbl VALUES
(1, '홍길동', '1111'),
(2, '이순신', '2222'),
(3, '을지문덕', '3333'),
(4, '세종', '4444'),
(5, '장영실', '5555');


INSERT INTO testdb.order_tbl(주문번호, 고객번호, 주문일, 주문가격, 할인금액) VALUES 
	 (1, 1, 20221000, 10000, 1000),
     (2, 2, 20221001, 10300, 2000),
     (3, 3, 20221002, 10200, 3000),
     (4, 4, 20221003, 10030, 4000),
     (5, 5, 20221004, 10200, 5000),
     (6, 2, 20221020, 11000, 6000),
     (7, 2, 20221021, 10500, 7000),
     (8, 2, 20221022, 20000, 8000);
     
SELECT *, 주문가격-할인금액 AS '결제금액' FROM testdb.order_tbl;

SELECT * FROM testdb.order_tbl  INNER JOIN testdb.customer_tbl  
ON customer_tbl.고객번호 = order_tbl.고객번호 WHERE 이름 ='이순신';
