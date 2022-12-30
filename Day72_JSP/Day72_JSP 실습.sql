DROP TABLE member_tbl_02;

CREATE TABLE member_tbl_02 
(
  custno NUMBER(6) NOT NULL -- constraint �� ���� PRIMARY KEY �ᵵ ��. 
, custname VARCHAR2(20) 
, phone VARCHAR2(13) 
, address VARCHAR2(60) 
, joindate DATE 
, grade CHAR(1) 
, city CHAR(2) 
, CONSTRAINT mtb102_ke PRIMARY KEY (custno)

-- mtb102_ke ��ġ�� �̸��� �ִ� ������ ���̺��� �̰����� �־ �������� ��, 
-- �ش� ��Ī���� �˻��ϰ� �׷� �� �־ �ִ´�. ���̺��� ������ ���� ���� �ʿ䰡 ����. 
-- CONSTRAINT �������: ����

);


INSERT INTO member_tbl_02 VALUES(100001, '���ູ', '010-1111-2222', '���� ���빮�� �ְ�1��','2015-12-02','A','01');
INSERT INTO member_tbl_02 VALUES(100002, '���ູ', '010-1111-3333', '���� ���빮�� �ְ�2��','2015-12-06','B','01');
INSERT INTO member_tbl_02 VALUES(100003, '�����', '010-1111-4444', '�︪�� �︪�� ����1��','2015-10-01','B','30');
INSERT INTO member_tbl_02 VALUES(100004, '�ֻ��', '010-1111-5555', '��� ������ ����2��','2015-11-13','A','30');
INSERT INTO member_tbl_02 VALUES(100005, '����ȭ', '010-1111-6666', '���ֵ� ���ֽ� �ܳ�����','2015-12-25','B','60');
INSERT INTO member_tbl_02 VALUES(100006, '������', '010-1111-7777', '���ֵ� ���ֽ� ��������','2015-12-11','C','60');

-- SELECT * FROM member_tbl_03;                  


DROP TABLE money_tbl_02;    

CREATE TABLE money_tbl_02   -- create table �̸�
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
-- constraint �������� ���� �̹� primary key�� �����Ѵٰ� ������������.
-- �ϳ��� ���Ƽ� ��� ��.
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

-- insert into ���̺� values();
-- �����ض�. ����(INTO) TABLE ��(VALUES)��

SELECT * FROM money_tbl_02 ;


-- ��¥�� ǥ���ϴ� ����� �پ��ϱ� ������ DB���� �ƿ� DATE ������Ÿ���� �����Ѵ�
-- EX)  �⵵/��/��
--      �⵵.��.��
--      �⵵-��-��
--      03-12-3
--      12/3-03(��)
-- 20160106��� ������ DATE�� ����Ʈ �������� �־����� YY/MM/DD ������ �ٲ��� ���� �ִ�. 

-- create table ��Ī
-- drop table ��Ī
-- insert into ���̺�� values();
-- select �ñ��� �� from ���̺��
-- ex) 
SELECT pcost*amount FROM money_tbl_02 ;
