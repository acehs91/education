/*
 #테이블 복사하기
 - create table 테이블 명 as (서브쿼리는 select 밖에 없다.)
 - 테이블 복사시 제약조건 not null은 자동 복사
 */
 

select * from employees;

drop table emp2;  -- 혹시 모를 삭제
create table emp2 as (select * from employees); -- employees table을 emp2에 전체 복사
select * from emp2;

desc emp2;

-- 제약조건 확인
select * from user_constraints where table_name = 'EMPLOYEES';
select * from user_constraints where table_name = 'EMP2'; 

/*
emp2에는 데이터와 컬럼만 존재하고, 
user_constraints에서 확인하면 PK/FK/UNIQUE 제약조건이 없다.
*/

select * from tab where tname = 'FRUITS6'; -- 기존 만들었던 

-- 테이블 복사  FRUITS6 생성
create table frutis66 as (select * from fruits6);
select * from frutis66;

commit;

-- candy  테이블 생성
create table candy (
    color varchar2(20)
    constraint candy_color_nn not null
);

select * from candy;

-- 컬럼 추가
alter table candy 
add (
    brand varchar2(30)
    constraint candy_brand_nn not null,
    country_code varchar2(8)
    constraint candy_cc_nn not null
);

-- unique 제약조건 추가 (brand 중복 금지)
alter table candy add constraint candy_brand_nk unique (brand);

-- 컬럼 이름을 바꾸는 문장
alter table candy rename column country_code to code; 

/* 
 #테이블 컬럼 타입 변경 
  - alter table 테이블 명 modify (컬렴명 컬럼타입,...);
  alter table candy modify (code varchar2(4));
*/

alter table candy modify (code varchar2(4));
desc candy; -- 타입 확인

/*  
 #테이블 제약조건 삭제 
 - alter table 테이블명 drop constraint 조건명;
*/

create table kd_acadmy(
 id varchar2(20) 
    constraint kd_id_nn NOT NULL -- nn 조건 생성
);

select * from kd_acadmy;
select * from user_constraints where table_name = 'KD_ACADMY';

commit;

alter table kd_acadmy drop constraint kd_id_nn; -- 해당 테이블 제약 조건 삭제(drop)
