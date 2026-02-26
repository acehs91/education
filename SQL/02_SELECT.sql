/*
  # select 컬럼명 from 테이블명;
    - 원하는 테이블을 조회하는 쿼리문
    - 컬럼명 자리에 *을 쓰는 것은 모든 컬럼을 의미
    - 컬럼명과 테이블명은 대소문자를 구분하지 않음
    - 쿼리문은 대소문자를 구분하지 않음
    - 단, 데이터는 대소문자를 구분함
*/

-- employees 테이블의 모든 정보 조회
select * from employees;

-- 조회하고 싶은 컬럼의 값만 가져오는 쿼리문
select first_name, last_name, hire_date, salary, job_id from employees;


/*
    # 자주 사용할 연습용 테이블명
      -  EMPLOYEES : 모든 사원 정보를 저장한 테이블
      -  DEPARTMENTS : 모든 부서 정보를 저장한 테이블
      -  JOBS : 모든 직급 정보를 저장한 테이블
      -  REGIONS : 각 대륙의 정보를 저장한 테이블
      -  LOCATIONS : 회사가 위치한 정보를 저장한 테이블
*/

-- 위 5개 테이블의 모든 정보 출력 => 쿼리문 
select * from employees;
select * from departments;
select * from jobs;
select * from regions;
select * from locations;

-- 해당 테이블의 컬럼 정보 보기
DESC employees;
DESC departments;
DESC jobs;
DESC regions;
DESC locations;

/*
    # SQL 기본 데이터 타입
    
    # NUMBER(n), NUMBER(n,m)
      - 숫자 데이터만 저장할 수 있는 컬럼 타입
      - 숫자가 하나만 적혀 있으면 정수를 저장하는 컬럼임
      - 숫자가 2개 적혀 있으면 실수를 저장하는 컬럼임
        (예) NUMBER(8)   -> 정수 8자리
             NUMBER(8,2) -> 정수 6자리, 소수 2자리
             
    # CHAR(n)
      - 고정 길이 문자 데이터를 저장하는 컬럼 타입
      - 설정된 컬럼 크기보다 적은 양의 데이터가 들어오더라도 설정된 길이를 모두 차지함
      - 데이터가 낭비될 수 있지만, 크기 계산이 없기 때문에 속도는 좀 더 빠름
      
    # VARCHAR2(n)
      - 가변 길이 문자 데이터를 저장하는 컬럼 타입
      - 저장하는 데이터의 크기에 때라 알맞은 공간을 사용함
      - 데이터를 저장할 때 저장공간이 절약되지만 크기 계산이 필요함
      
    # DATE
      - 날짜 및 시간을 저장하는 컬럼 타입  
*/

-- 실습1. 모든 사원의 사번/이름(2개모두)/입사일/월급/부서번호 조회
select * from employees;
select employee_id, first_name, last_name, hire_date, salary, department_id
from employees;

-- AS를 이용해 해당 컬럼을 원하는 이름으로 생성후 조회가능 함
select
    employee_id AS 사번,
    first_name AS 이름,
    salary AS 급여,
    department_id AS 부서번호
from
    employees;
    
-- 산술 연산자 이용
-- 모든 사원의 마지막 이름, 월급만 나오도록 조회
select last_name, salary from employees;
-- 모든 사원의 마지막 이름, 월급 컬럼 별칭 "이사람의 연봉" 계산하여 조회
select last_name, salary*12 AS "이 사람의 연봉" from employees;
-- 모든 사원의 마지막 이름, 월급 컬럼 별칭 "20퍼센트 삭감" 계산하여 조회 => 캡쳐, 넘버링
select last_name, salary*0.8 AS "20퍼센트 삭감" from employees;

/*
    # NVL(column,value) = null VALUE
      - 계산에 사용되는 컬럼의 값에 null이 있는 경우,
        null을 대체할 값(=치환)을 지정하는 함수
*/

select
    last_name,
    salary,
    commission_pct,
    job_id,
    salary * (1+NVL(commission_pct,0)) AS "커미션 적용 월급"
from
    employees;
    
-- 실습. 모든 사원들의 사번,이름,직책ID, 별칭사용 "보너스가 적용된 연봉"을 출력
select
    employee_id,
    first_name,
    job_id,
    salary * (1+NVL(commission_pct,0))*12 AS "보너스 적용된 연봉"
from
    employees;

-- select distinct = 중복되는 내용 한번씩만 출력
-- 모든 사원들의 직무 조회
select job_id from employees;
-- 직무별로 한개씩만 출력 = 중복값 제거
select distinct job_id from employees;
-- 사원들의 모든 부서ID 조회
select department_id from employees;
-- 부서ID 한번씩 조회(중복값 제거)
select distinct department_id from employees;


-- 계정의 모든 테이블명 출력

select * from TAB;
select * from employees;

/* # AND, OR, NOT */
select * from employees 
 where hire_date >= DATE '2006-05-01'
 and hire_date <  DATE '2008-09-01';  
 -- 2006-05-01 이상, 2008-08-31까지 포함

 
select * from employees 
 where job_id ='IT_PROG' 
 OR job_id = 'SH_CLERK';  -- 

select * from employees 
 where job_id ='IT_PROG'  -- IT_PROG 만 
 
select * from employees 
 where NOT job_id ='IT_PROG'  -- IT_PROG 가 아닌 NOT
 
 
-- 실습 2000에서 3000 사이의 월급을 받는 직원들 정보 조회 
select * from employees
where salary > 2000 AND salary < 3000;


-- 실습 30번, 60번, 90번 부서에 소속된 직원들의 이름/ 직무 / 전화번호 / 부서번호 정보 조회
select  first_name, job_id,  phone_number
from employees
where department_id = 30 or  department_id = 60 or department_id = 90;
  
  
 /* MOD(value11, value12) = valuel1을 value2로 나눈 나머지를 구하는 함수 */
select * from employees where MOD (employee_id,2)=0;


/* #컬럼명 BETTWEEN A AND B = 해당 컬럼의 값이 A이상 B이하인 경우 True */
select * from employees where salary BETWEEN 2000 AND 3000;

/* #null = (무한대) 크기 비교가 불가능하여 비교연산자 사용 불가 */
-- commission_pct가 0.2 미만인 모든 직원 정보 출력

select * from employees where commission_pct < 0.2;
select * from employees where commission_pct = null; -- 조회안됨
select * from employees where commission_pct is null; -- is null 사용

-- 사원번호가 100인 직원의 모든 정보 조회
select * from employees where employee_id = 100;

/* NOT 연산자의 위치는 비교적 자유롭다 = 모두 같은 결과*/
select * from employees where commission_pct is not null;
select * from employees where not commission_pct is null;
select * from employees where not salary  BETWEEN 2000 AND 3000 ;
select * from employees where salary  not BETWEEN 2000 AND 3000 ;

/* 
  #LIKE 
  - 데이터의 일부분으로 원하는 애용을 검색할 수 있음
  - 문자 타입과 날짜 타입에 사용할 수 있음
  - 와일드 카드
   %(퍼센트) = 길이 제한 없이 아무 문자가 와도 상관없는 와일드 카드 = 포함된 모든 문자 조회
   _(언더바) = 하나의 문자가 반드시 와야하는 와일드카드 = 하나의 문자만 대응
*/

-- 첫번째 이름중 대문자 D를 보여줘
select * from employees where first_name like 'D%' 

-- 첫번째 이름중 두번째 이름의 소문자 "e"가 들어간 사람을 찾아줘
select * from employees where first_name like '_e%'

-- 이름안에 t들어간 모든 직원 검색
select * from employees where first_name like '%t%';

-- 실습. 이름에서 처음 나오는 a의 직원의 이름중 뒤에 3글자가 더 나오도록
select * from employees where first_name like '%a___'; 
-- a___ 포함 뒤 3글자

-- 실습. 이름에 e가 두개 이상 포함된 직원
select * from employees where first_name like '%e%e'; 

-- 실습. 고용일이 5월인 직원
select * from employees where hire_date like '%/05/%'; 

-- 실습. 고용일의 마지막 날짜가 5일인 직원
select * from employees where hire_date like '%/_5';