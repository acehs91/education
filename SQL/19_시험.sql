-- 생성
create table member (
  id        varchar2(10)    PRIMARY KEY,
  name      varchar2(30)  NOT NULL,
  age       number(3)     NOT NULL, 
  address   varchar2(60)
);

-- PK, FK 확인
desc member;

--삽입
insert into member(id, name, age, address) values('dragon', '박문수', 40 , '서울시');
insert into member(id, name, age, address) values('sky', '김윤신', 30 , '부산시');
insert into member(id, name, age, address) values('blue', '이순신', 40 , '인천시');

select * from member;


-- 제약조건 조회
select * from user_constraints where table_name = 'MEMBER';

-- 이름이 신이 들어간사람 찾기
select* from member where name like '%신%';

-- 영속성
commit;  


-- 행 삭제
delete from member;

-- commit 시점으로 돌아가기
rollback;

