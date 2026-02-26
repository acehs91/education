/* 
  # 트랜잭션 (Transaction)
  - 데이터 처리의 한 단위
  - 하나의 트랜잭션은 여러 명령어들로 이루어져 있음
  - 트랜잭션의 모든 과정이 정상적으로 완료되는 경우에만 
    변경사항이 확정됨 (ALL or Nothing)
  - 트랜잭션을 관리하기 위한 명령어 COMMIT , ROLLBACK, SAVEPOINT 등이 있음
  - 하나의 트랜잭션은 마지막 실행 된 COMMIT, ROLLBACK 으로 부터 
    새로운 커밋을 실행하기 전까지 수행하는 SQL문을 말함
  
  (예) 
  오라클 DB = 개발자가 전달한 쿼리문(INSERT문, UPDATE문, DELETE문)은 
  메모리상에서만 수행 
  실제 영속성을 위한 작업을 하지 않음 = 하드디스크(물리적)에    전달 안함
  => 실수로 인해 데이터의 유실을 막기 위한 장치임
  => CREATE TABLE,
                
*/


drop table cafe_menu; 

create table cafe_menu(
  mid number(4) 
      CONSTRAINT cm_mid_pk  PRIMARY KEY
);

select * from cafe_menu;

-- 삽입 
alter table cafe_menu ADD( 
    name varchar2(30)
         constraint cm_name_uk UNIQUE
         constraint cm_name_nn NOT NULL,
    
    price number(5)
          constraint cm_price_chk CHECK( price >= 10)
          constraint cm_price_nn NOT NULL,
    
    min_size varchar2(1)
             constraint cm_min_size_chk CHECK(min_size in('S','M','L'))
             constraint cm_min_size_nn NOT NULL,
    
    max_size varchar2(1)
             constraint cm_max_size_chk CHECK(max_size in('S','M','L'))
             constraint cm_max_size_nn NOT NULL
);
-- mid, name, price, min_size, max_size

-- 더미데이터 5개 삽입 
insert into cafe_menu values(1, '아메리카노', 4000, 'S', 'L');
insert into cafe_menu values(2, '카페라떼', 4500, 'S', 'L');
insert into  cafe_menu values(3, '카푸치노', 4800, 'S', 'L');
insert into  cafe_menu values(4, '카페모카', 5000, 'S', 'L');
insert into  cafe_menu values(5, '에스프레소', 3500, 'S', 'M');

select * from cafe_menu; --테이블 확인
  
-- 하나의 트랜잭션이 실행하다 commit으로 커밋 = 물리적 하드웨어에 저장
commit; 


-- ※ savepoint는 저장은 마지막 한 포인트만 저장됨
-- 실행문 : rollback to savepoint명 

insert into cafe_menu values (6,'자몽에이드',6700,'M','L');

savepoint svp1;
 
insert into cafe_menu values (7,'녹차라떼' ,5800,'S','L'); 

savepoint svp2;

insert into cafe_menu values(8, '아이스크림', 5300 ,'S','L');

insert into cafe_menu values(100, '롤케이크', 19900 ,'S','M');

savepoint svp3;

rollback to svp2;