/*
    # DML(Data Manipulation Language) = 데이터 조작어
      - SELECT : 데이터 조회
      - INSERT : 데이터 추가
      - UPDATE : 데이터 수정
      - DELETE : 데이터 삭제
    
    # DDL(Data Definition Language) = 데이터 정의어
      - 테이블, 시퀀스, 뷰 ...등 DB에서 사용하는 DB 오브젝트 구조를 생성할 때 사용하는 명령어
      - CREATE : 오브젝트 생성
      - DROP : 오브젝트 삭제
      - ALTER : 오브젝트 수정
      - TRUNCATE : 오브젝트 완전 삭제
    # DCL(Data Control Language) = 데이터 제어 명령어
      - GRANT : 권한 부여
      - REVOKE : 권한 회수
*/
/*
    # 테이블 생성
      - CREATE TABLE 테이블명(컬럼명1 컬럼타입1 제약사항1,컬럼명2 컬럼타입2 제약사항2,...);
    # 테이블 삭제
      - DROP TABLE 테이블명;
*/
-- 테이블 생성
CREATE TABLE fruits(
    name    VARCHAR2(20),
    qty     NUMBER(5),
    price   NUMBER(5)
);

select * from fruits;

-- 테이블 구조보기
desc fruits;

-- 데이터 삽입
INSERT INTO fruits VALUES('귤',40,1000);
insert into fruits values('사과',10,3500);
insert into fruits values('바나나',30,1800);

select * from fruits;
-- 데이터 수정
UPDATE fruits SET name='오렌지' where name='귤';
-- 사과의 수량을 33개로 수정
update fruits set qty=33 where name='사과';
-- 데이터 삭제
DELETE FROM fruits where name='바나나';
-- 데이터 추가 망고 , 8, 2000
insert into fruits values('망고',8,2000);
-- 데이터 수정 갯수 12
update fruits set qty=12 where name='망고';
-- 데이터 삭제 망고
delete from fruits where name='망고';
commit;