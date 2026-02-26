/*
 
 #테이블 join (결과를 불러오는)
 - 기본키와 외래키로 관계가 형성되어 있는 테이블들의 정보를 종합하여 조회하는 것
 - 2개 이상의 테이블의 데이터를 한번에 가져올 수 잇음
 
 # 기본키 = Primary Key = PK
 - 한 테이블에서 하나의 행을 유일하게 구분할 수 있는 컬럼
 - 하나의 테이블의 하나의 기본키가 존재 = UNIQUE (유니크)
 - 기본키 설정 컬럼에는 NULL을 허용하지 않음 = NOT NULL
 
 #외래키 = Foreign Key = FK
 - 다른 테이블에는 기본키지만, 해당 테이블에서는 값이 중복인 컬럼
 - 어떤 테이블의 기본키가 다른 테이블의 외래키로 설정되면 두 테이블간에는 관계가 형성
 - (참고) 외래키로 설정된 컬럼에는 참조하는 테이블의 해당 컬럼에 존재하는 값만 추가 기능
 
 #references
 references는 다른 테이블의 기본키(pk)나 유니크 컬럼을 참조해서 연동(참조 무결성)을 
 걸어주는 제약조건이다.
 쉽게 말해서 한 테이블의 값이 다른 테이블에 반드시 존재하도록 강제하는것.
 
*/

select * from employees;
desc employees; 

select * from user_constraints where table_name = 'EMPLOYEES'; -- 제약조건 확인
select * from departments;

desc departments; 
select * from user_constraints where table_name = 'DEPARTMENTS'; -- 제약조건 확인

/* 
 CROSS JOIN
 - 아무 의미 없는 조인 = 조인에 사용하는 테이블들의 데이터를 조합하여
   나올 수 있는 모든 경우의 수를 출력하는 조인
*/

-- employees, departments의 row수 = 총 컬럼수 = 레코드셋 갯수를 알아내기
select count(*) from employees; -- row 107개
select count(*) from departments; -- row 27개
select * from employees, departments; -- 107 * 27

/* 
 EQUI JOIN
 - 두 테이블에서 서로 동일한 값을 지닌 컬럼(기본키,외래키)을 이용, CROSS JOIN에서 의미있는 데이터만 걸러내는 JOIN
 - 두 테이블에서 함께 사용할 때 같은 이름의 컬럼이 있다면, 앞에 테이블 이름을 (반드시)명기해야 함 
*/

select * from employees;
select * from departments;
select * from locations;

-- 직원테이블과 부서테이블을 조인하여 department_id가 같은 행만 가져옴.
select * from employees a1, departments a2
where a1.department_id = a2.department_id;


-- 직원테이블과 부서테이블을 조인하여 사원의 이름과 부서명 조회
select a1.first_name, a2.department_name
from employees a1, departments a2
where a1.department_id = a2.department_id;


-- 실습. 직원테이블과 부서테이블 조인하여 직원번호 , 이름 , 부서명 조회 => 별칭사용 
select 
      emp.employee_id as 사원번호, 
      emp.first_name as 이름,
      dept.department_name as 부서이름
from employees emp, departments dept
where emp.department_id = dept.department_id;

-- 실습. 직원테이블과 부서테이블 조인하여 직원번호 , 이름 , 근무지역번호 조회 => 별칭사용 
select 
     a1.employee_id as 직원번호, 
     a1.first_name as 이름, 
     a2.location_id as 근무지역번호
from employees a1, departments a2
where a1.department_id = a2.department_id;

-- 근무지역번호가 1700인 곳에서 근무하는 직원들의 직원번호, 이름, 직무를 조회
select 
    a1.employee_id as 직원번호,
    a1.first_name as 이름,
    a1.job_id as 직무,
    a2.location_id as 근무지역번호
from employees a1, departments a2
where a1.department_id = a2.department_id and a2.location_id  = 1700;


-- 실습. Sales부서에 근무하는 직원들의 직원아이디, 이름, 근무지역번호, 부서명 조회
select emp.employee_id as 직원번호,
       emp.first_name as 이름,
       dept.location_id as 근무지역번호,
       dept.department_name as 부서명
from employees emp, departments dept
where emp.department_id = dept.department_id
and dept.department_name = 'Sales';


-- 실습. 2002년에 입사한 직원들의 직원번호, 이름, 입사일, 근무부서 조회 | (정렬) 입사일순으로 정렬

select emp.employee_id as 직원번호,
       emp.first_name as 이름,
       emp.hire_date as 입사일,
       dept.department_name as 부서명
from employees emp, departments dept
where emp.department_id = dept.department_id 
and emp.hire_date between '02/01/01' and '02/12/31'
order by emp.hire_date;


/* # 3개 테이블 조인 */
select * from employees;
select * from departments; -- location_id(fk) 
select * from jobs; -- job_id, job_title, 연봉범위
select * from locations; -- country_id(fk), city(도시이름)

-- 직무가 IT_PROG인 직원들의 이름/부서명/도시이름/직무 조회
select
    employees.first_name,
    departments.department_id,
    locations.city,
    employees.job_id
from employees, departments, locations
where employees.department_id = departments.department_id
AND departments.location_id = locations.location_id
AND job_id = 'IT_PROG';

-- 실습. 사는 도시가 'Seattle'인 직원의 이름/직급/급여/사는도시 조회 | 테이블 4개 조인
select 
 e.first_name,
 j.job_title,
 e.salary*(1+nvl(e.commission_pct,0)) as 급여,
 l.city
from employees e, jobs j, departments d, locations l
where d.department_Id = e.department_id
and l.location_id = d.location_id
and e.job_Id = j.job_id
and l.city = 'Seattle';