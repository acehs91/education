/*

  # 함수
    - 오라클의 함수를 이용하면 테이블의 데이터를 가공하여 조회가 가능함

*/

-- DUAL 테이블 조회
SELECT * FROM dual;

-- ABS(n) : 절대값
SELECT abs(-123) FROM dual;

-- FLOOR(n) : 내림 - 마룻바닥
SELECT floor(123.1234) FROM dual;

-- CEIL(n) : 올림 - 천장
SELECT ceil(123.1234) FROM dual;

-- ROUND(n) : 반올림
SELECT round(123.1234) FROM dual;

-- MOD(n, m) : 나머지 계산
SELECT mod(17, 10) FROM dual;

-- TO_CHAR(값 [, 형식]) : 숫자나 날짜 데이터를 문자(String)로 변환
SELECT to_char(123) FROM dual;
SELECT TO_CHAR(12345) FROM dual;
-- 결과: '12345' (문자형으로 변환)

SELECT TO_CHAR(12345, '000000') FROM dual;
-- 결과: '012345' (형식 지정, 6자리로 맞춤)

-- SYSDATE 사용 예시: 현재 날짜를 문자열로 변환
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') FROM dual;
-- 결과 예시: '2025-10-17 11:45:00'

-- TO_DATE() : 데이터를 날짜 타입으로 변환
SELECT TO_DATE('2025-10-17','YYYY-MM-DD') FROM dual;
-- 결과: DATE 타입으로 '2025-10-17'

-- TRIM() : 양쪽의 공백 제거
SELECT TRIM('   Hello World   ') AS trimmed_string FROM dual;
-- 결과: 'Hello World'
