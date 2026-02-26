/*
 #데이터(Data) 제약조건 (Constraints)
 
 #데이터 무결성
 - 데이터가 결함이 없는 성질 
 - 정확성, 일관성, 유효성이 유지되는 데이터를 말한다.
 
  # 개체 무결성(PK)
  - 테이블의 데이터 = 반드시 각 행을 구분할 수 있어야함
  - 테이터의 개체 무결성을 지키기 위한 제약조건 = PK 사용
  
  #참조 무결성 (FK)
  - 참조 관계에 있는 데이터는 항상 일관된 값을 가져야 함
  - 참조 무결성을 지키기 위한 제약 조건 = FK 사용
  
  #데이터 무결성 제약 조건 
  - NOT NULL (NN) : 해당 도메인(domain)에 NULL을 허용하지 않음
  
  - UNIQUE : 해당 도메인에 중복되는 값을 허용하지않음
  - PRIMARY KEY : 해당 도메인 테이블의 기본키로 사용 = UNIQUE + NOT NULL
  - FOREIGN KEY: 해당 컬럼을 외래키로 설정
  - CHECK : 원하는 조건을 지정, 도메인 무결성을 유지함
  
  쉽게 비유
    PK → 학생증 번호: 중복 안 되고, 반드시 있어야 함 → 행 구분 가능
    UNIQUE → 별명: 다른 친구와 같은 별명 금지, 비어 있어도 됨
    NOT NULL → 이름표: 빈칸 금지, 반드시 값 필요
  
  # 도메인 무결성
  - 하나의 도메인을 구성하는 개체들은 항상 타입이 일정해야 함
  - 테이블 컬럼 타입 설정 및 CHECK 제약조건을 통해 유지 가능함
  
*/

select * from employees;
select * from departments;
select * from countries;
select * from locations;

/*
 데이터 사전 (Date Dictionary) - Dictionary(사전)
 - 시스템 카탈로그라고도 하며, 사용 가능한 데이터 베이스 및 테이블의 정보를 가지고 있는 시스템 테이블
   DBA만 추가 , 수정, 삭제가 가능 => 사용자는 조회만 가능 
*/

-- 제약조건을 볼 수있는 데이터 딕셔너리 뷰(접속사용자 권한) - 시스템 카탈로그 = ex) hr 계정
select * from user_constraints; -- 사용자_제약조건(constraints)

-- 제약조건을 볼 수있는 데이터 딕셔너리 뷰(모든 사용자 권한)
select * from all_constraints; -- 모든_제약조건

/*
 #constraint_type (제약조건 타입)
 - P : Primary key 
 - F : Foreign key
 - C : Check or NOT NULL
 - U : Uinque
*/

/* 
 #1. 테이블 생성과 동시에 제약 조건 추가
  - 컬럼명 컬럼타입 제약조건 (이름이 자동으로 정해짐)
  - 컬럼명 컬럼타입 CONSTRAINT 제약조건명 : 제약조건
*/

drop table fruits3;
create table fruits3(
    name varchar2(20) NOT NULL,
    price number(5)  NOT NULL
);

select * from fruits3;
desc fruits3;

insert into fruits3 (name,price) values('grape',100);

-- 제약사항 테이블 조회시 조건절 테이블명을 '반드시 대문자로' 해줘야함
select * from user_constraints where table_name = 'FRUITS3' ; -- 유저 테이블검색시 반드시 대문자

create table fruits4 (
  name  varchar2(20)
        constraint fruits4_name_uk UNIQUE
        constraint fruits4_name_nn NOT NULL,
  price number(5)
        constraint fruits4_price_nn NOT NULL
);

select * from fruits4;
insert into fruits4 (name,price) values ('grape',100);
select * from user_constraints where table_name = 'FRUITS4';

commit;



-- 테이블 생성
/*   
   PK: 줄마다 주민등록번호 같은 것(겹치면 X, 빈값 X)
   NOT NULL: 빈칸 금지
   UNIQUE: 서로 달라야 함
   순서: 만들고 → 넣고 → 확인 끝!
*/
create table fruits5 (
  fid   number(4)
        constraint ff5_fid_pk primary key,  -- 각 과일마다 번호를 유일하게 만들어주는 규칙
  fname varchar2(20)
        constraint ff5_fname_nn not null  -- 과일 이름은 반드시 입력해야 하는 규칙
        constraint ff5_fname_uk unique,   -- 과일 이름은 중복되면 안 되는 규칙
  grade varchar2(20)
        constraint ff_grade_chk check(grade in ('a+','a','b+','b')),  -- 등급은 a+, a, b+, b 중 하나만 가능
  fsize number
        constraint ff_fsize_chk check(fsize between 0 and 20)   -- 크기는 0~20 사이만 가능
);

-- 더미 데이터 삽입
insert into fruits5 values (200, 'orange', 'a+', 20);

-- 제약사항 조회시 (대문자로 검색)
select * from user_constraints where table_name = 'FRUITS5';

-- 확인
select * from fruits5;

commit;


/* 
  #이미 생성된 테이블에 제약조건 추가  
  - ALTER TABLE 테이블명 add constraint 제약조건명(컬럼) = > 추가
  - ALTER TABLE 테이블명 MODIFY CONSTRAINT 제약조건명(컬럼) = > 이미 존재하는 컬럼을 수정
 */
 
-- 1) 테이블 삭제 (혹시 이미 있으면 지우기)
drop table fruits6;

-- 2) 새로운 테이블 만들기
create table fruits6 (
  fid   number(4) ,  
  fname varchar2(20), 
  grade varchar2(20),
  fsize number(2) 
);

-- 제약조건 추가 = pk
alter table fruits6 add constraint ffff6_fid_pk PRIMARY KEY(fid);
-- 제약조건 추가 = unique
alter table fruits6 add constraint ffff6_fname_nk unique(fname);

-- 제약조건 수정 =  check, not null => modify 사용
alter table fruits6 modify (fname varchar(2) constraint ffff6_fname_nn not null);

alter table fruits6 modify (grade varchar(2) constraint ffff6_grede_chk check (grade in ('A+','A','B','B+')));

-- fsize = 제약조건 0에서 20사이의 값만 올수 있도록 제약조건 수정
alter table fruits6 modify (fsize number(2) constraint ffff6_size_chk check (fsize between 0 and 20));

-- 제약조건 조회
select * from user_constraints where table_name = 'FRUITS6';
 

insert into fruits6 values (200, '망고', 'a+', 1); -- 추가 

delete from fruits6 where fid = 200; -- fid 200 삭제 

-- fruits6 에 데이터 유효성에 따라 더미 데이터 3개를 추가하세요 = 캡쳐, 넘버링 
insert into fruits6 values (1, '사과', 'a+', 1);
insert into fruits6 values (2, '오렌지', 'A', 15);
insert into fruits6 values (3, '바나나', 'B+', 10);

select * from fruits6;

commit;

/* #alter table 테이블명 modify (컬럼명 데이터 유형수정) */

alter table fruits6 modify (fsize number(4)); -- fsize를 4개로 늘리겠다.

desc fruits6;


-- 테이블 생성 origin
create table origin(
 code  number(4),
 kor_name varchar2(20),
 eng_name varchar2(20),
 weather number(2)
)

alter table origin modify (code number(4) not null);

insert into origin values (1, '홍길동', 'hongkildong', 1);
insert into origin values (2, '김철수', 'kimchulsoo', 2);

desc origin

select * from user_constraints where table_name = 'ORIGIN';
select * from origin;


-- 1. 테이블 생성  주소
create table address(
 aid number(4),
 aname varchar2(20),
 agrade varchar2(2),
 asize number(2),
 code number(4)
);

-- 2. 제약조건 추가
alter table address add constraint ads_aid_pk PRIMARY KEY(aid);
alter table address add constraint ads_aname_uk UNIQUE(aname);
alter table address add constraint ads_agrade_chk CHECK (agreade IN ('C','K','D','F'));
alter table address add constraint ads_asize_chk CHECK (asize BETWEEN 1 AND 100);

-- 3. 제약조건 확인
select * from user_constraints where table_name = 'ADDRESS';

-- 4. 데이터 삽입
insert into address (aid, aname, agrade, asize)
values (1, '홍길동', 'C', 25);

insert into address (aid, aname, agrade, asize)
values (2, '김철수', 'K', 50);

-- 5. 데이터 확인
select * from address;

-- 6. 지역명으로 변경
update address set aname = '서울' where aid = 1;
update address set aname = '부산' where aid = 2;

-- 7. 변경 내용 확인
select * from address;

-- 8. 테이블 삭제
drop table address;



-- 1. PK 테이블 생성
create table pktest(
 code number(4) primary key,
 kor_name varchar2(100),
 eng_name varchar2(100),
 weather number(2)
);

-- 2. FK 테이블 생성
create table fktest(
 aid number(4) primary key,
 aname varchar2(100),
 agrade varchar2(100),
 asize varchar2(100),
 code number(4),
 constraint fktest_code_fk foreign key (code) references pktest(code)
);

-- 3. 제약조건 확인
select * from user_constraints where table_name = 'FKTEST';
