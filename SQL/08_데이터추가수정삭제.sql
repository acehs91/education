/*
    # 테이블 데이터 생성
    - INSERT INTO 테이블명 (컬럼명,...) VALUES (컬럼값,...);
    - 테이블명에 컬럼명을 생략하면 모든 컬럼을 순서대로 넣어줘야함
*/

select * from employees;
select * from departments;
select * from fruits;

-- 컬럼값 이름, 수량 , 가격순으로 삽
insert into fruits (name, qty, price) values ('포도', 10, 3500);
DELETE FROM fruits where name = '포도'; 

-- 변경할 일부 컬럼만 삽입
insert into fruits (name, price) values ('바나나', 4000);
insert into fruits (price) values (8000);
--컬럼명 생략시 테이블 컬럼 순서대로 넣어야함 

insert into fruits  values ('사과',20,2500); -- 일반적 삽입 

COMMIT;


select * from fruits;
-- 서브 쿼리를 이용해  insert 할수 있음  (복붙)

insert into fruits(select * from fruits); -- fruits 쿼리문 한번더 복 붙 

create table fruits2 as (select * from fruits); -- fruits2로 fruits을복사

insert into fruits2 (select * from fruits);  -- fruits2에  fruits있는것들을 삽입

select * from fruits2; 


/* 
  #테이블 데이터 수정 
  - UPDATE 테이블명 SET 컬럼=값 WHERE 조건;
  - 조건을 만족하는 모든행을 수정함;
  - 조건을 안쓰면 모든 행을 수정;
  - 하나의 행을 구분할 수 있는 컬럼이 조건으로 사용되는 경우가 많음 (예, 기본키= PK : Primary Key);
*/

-- 모든 과일명을 사과로 변경
update  fruits set name = '사과';
ROLLBACK;
COMMIT;

--  수량이 10개이하인 과일의 가격을 10으로 변경
update  fruits set price = 10 where qty <= 10;
 

/* 
  #테이블 데이터 삭제 
  - delete from 테이블명 where 조건 
  - 조건을 만족하는 모든 행을 삭제
  - 조건을 안쓰는 모든 행을 삭제  
*/

select * from fruits;
-- 과일명 포도 데이터 삭제

delete from fruits where name = '포도';

commit;