/* 
     #시퀀스
     - 시퀀스는 자동 증가 번호 생성기이다.
     - 주로 고유 식별자(ID)를 만들어야 할 때 사용되며 자동으로 숫자 넣어준다.
     - 조회시 : 시퀀스 이름은 대문자로 저장됨 (인지)
     
     create sequence 시퀀스명 [옵션명];
     [옵션명]
     [START WITH n]                  - 시퀀스의 시작번호 설정
     [INCREMENT BY n]                - 시퀀스의 증가값 설정
     [MAXVALUE n | NOMAXVALUE]       - 최댓값 설정
     [MINVALUE n | NOMINVALUE]       - 최솟값 설정
     
    
     INSERT INTO employees(employee_id, first_name)
     VALUES (kd_seq.NEXTVAL, '민수');
     -- NEXTVAL 호출 시마다 시퀀스 번호가 자동으로 1씩 증가
     
     ※ 한줄요약
     employees 테이블에 새 행을 넣는데, 
     직원 번호는 kd_seq 시퀀스가 자동으로 다음 번호를 주고, 이름은 ‘민수’로 넣어라
     
*/

-- 1. 전체 시퀀스 확인
SELECT * FROM all_sequences;

-- 2. 시퀀스 kd_seq 생성 - 시작은1 호출할때마다 1씩 증가
CREATE SEQUENCE kd_seq INCREMENT BY 1 START WITH 1;

-- 3. 전체 시퀀스 확인 = 'KD_SEQ' / 대문자 조회
SELECT * FROM all_sequences WHERE sequence_name = 'KD_SEQ';

-- 4. 테이블 생성 exeseq
CREATE TABLE exeseq(
    seq     NUMBER(4)    -- 자동번호
            CONSTRAINT exeseq_seq_pk    PRIMARY KEY,
    kind    VARCHAR2(30) -- 소속
            CONSTRAINT exeseq_kind_nn   NOT NULL,   
    grade   CHAR(2)      -- 등급
            CONSTRAINT exeseq_grade_chk CHECK(grade IN('A','B','C','D')),
    gty     NUMBER(4)    -- 수량
            CONSTRAINT exeseq_gty_nn    NOT NULL, 
    price   NUMBER(4)    -- 가격
            CONSTRAINT exeseq_price_nn  NOT NULL 
);



-- 5. KD_EXESEQ 시퀀스 생성 1001 부터 
CREATE SEQUENCE kd_exeseq  START WITH 1001 INCREMENT BY 1;

-- 5-1. KD_EXESEQ2 시퀀스 생성  1002 부터 
CREATE SEQUENCE kd_exeseq2 START WITH 2001 INCREMENT BY 1;

-- 6. 시퀀스 추가한거 전체 확인 (KD_SEQ,KD_EXESEQ,KD_EXESEQ2)
SELECT * FROM all_sequences WHERE sequence_name IN ('KD_SEQ','KD_EXESEQ', 'KD_EXESEQ2');

-- 7. 데이터 삽입 values에( kd_exeseq 시퀀스 사용 자동부여.NEXTVAL, '이름','등급','수량','가격'  );
INSERT INTO exeseq VALUES(kd_exeseq.NEXTVAL,'KD','A',20,100); 
INSERT INTO exeseq VALUES(kd_exeseq.NEXTVAL,'ACADEMY','B',10,300);

SELECT * FROM exeseq; --  exeseq 테이블에 삽입한 내용 잘 들어갔는지 한번 확인

-- 7-1. 시퀀스 kd_exeseq2를 사용하여 한번더 삽입  
INSERT INTO exeseq VALUES(kd_exeseq2.NEXTVAL,'ARE','C',10,400);

COMMIT;

-- 8. 데이터 확인 (kd_exeseq2 -  ARE이름으로 2001 부터시작)
SELECT * FROM exeseq ORDER BY seq;

-- 9. 테스트용 단일 컬럼 조회
SELECT * FROM dual;

-- EX) dual 쓰임새 
SELECT 1+1 FROM dual;
-- 숫자 계산 결과 확인 : 2

-- SYSDATE(현재 날짜) 확인
SELECT SYSDATE FROM dual;

-- 시퀀스 kd_seq 값 확인  단일 컬럼만 보여줌
SELECT kd_seq.NEXTVAL FROM dual;

-- 시퀀스 현재 값 확인  CURRVAL - 마지막으로 생성된 값
SELECT kd_exeseq.CURRVAL FROM dual;  -- kd_exeseq 마지막 단일 행 조회
SELECT kd_exeseq2.CURRVAL FROM dual;  -- kd_exeseq2 마지막 단일 행 조회

-- 10. 필요 시 테이블 및 시퀀스 삭제
-- 주석 처리하거나 필요 시 실행
DROP TABLE exeseq;
DROP SEQUENCE kd_seq;
DROP SEQUENCE kd_exeseq;
DROP SEQUENCE kd_exeseq2;


-- 시퀀스 들어간 테이블 조회
SELECT * FROM exeseq;
COMMIT;
