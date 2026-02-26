/*
 #_ANSI조인
  - 미국 국가 표준협회에서 정한 표현을 따르는 조인 문법
  - 조인 조건에 사용되는 컬럼명이 같으면 => using문을사용
  - 조인 조건에 on을 사용하므로 -> where 조건절과 구분하여 사용할 수 있는 좀더 편리한 가독성 표현법
*/

select * from employees;  -- employees 테이블 전체 조회
select * from departments;  -- departments 테이블 전체 조회
select * from locations;  -- locations 테이블 전체 조회
select * from jobs;  -- jobs 테이블 전체 조회

/* ANSI CROSS JOIN = 모든 조합 생성 (교차 조인) */
select * from employees cross join departments;  -- 직원과 부서 모든 조합 출력

/* EQUI 조인 = 기본키와 외래키로 조건 걸어 조인 */
select *
from employees emp, departments dept
where emp.department_id = dept.department_id;  -- employees와 departments를 department_id 기준으로 조인

/* ANSI INNER JOIN = EQUI 조인과 동일하게 동작 */
select  *
from employees emp
inner join departments dept
on emp.department_id = dept.department_id;  -- ON으로 조인 조건 명시

/* ANSI INNER JOIN + USING = 공통 컬럼명이 같을 때 사용 */
select department_id, first_name
from employees
inner join departments
using (department_id);  -- department_id 기준으로 조인, 결과 컬럼 중복 제거


-- 실습. 모든 직원들의 직원번호/이름/부서이름 조회 (inner join 사용)
select 
 employee_id as 직원번호,  -- 직원 ID 컬럼
 first_name as 이름,       -- 직원 이름
 department_name as 부서이름  -- 부서 이름
from employees
inner join departments
using (department_id);  -- department_id 기준으로 조인



-- 3개 테이블 조인 = IT_PROG 직무 직원들의 이름/부서/도시 조회
select 
 last_name as 성,         -- 직원 성
 first_name as 이름,       -- 직원 이름
 department_name as 부서이름, -- 부서 이름
 city as 도시             -- 근무 도시
from employees
inner join departments using (department_id)  -- employees ↔ departments 조인
inner join locations using (location_id)      -- departments ↔ locations 조인
where job_id = 'IT_PROG';  -- 직무가 IT_PROG인 직원 필터링


-- 실습. Seattle 근무 직원들의 이름/직책/급여 조회 (같은결과)
select
    e.first_name as 이름,  -- 직원 이름
    j.job_title as 직책,   -- 직무 제목
    e.salary as 급여,      -- 급여
    l.city as 시티         -- 근무 도시
from
    employees e,           -- 직원 테이블
    departments d,         -- 부서 테이블
    locations l,           -- 위치 테이블
    jobs j                 -- 직무 테이블
where
    e.department_id = d.department_id  -- 직원 ↔ 부서 조인
    and d.location_id = l.location_id  -- 부서 ↔ 위치 조인
    and e.job_id = j.job_id            -- 직원 ↔ 직무 조인
    and l.city = 'Seattle';            -- Seattle 근무 필터링
    
-- ANSI JOIN + USING 방식 (같은 결과)
select
    e.first_name as 이름,   -- 직원 이름
    j.job_title as 직책,    -- 직무 제목
    e.salary as 급여,       -- 급여
    l.city as 시티          -- 근무 도시
from employees e
inner join departments d using (department_id)  -- employees ↔ departments 조인
inner join locations l using (location_id)      -- departments ↔ locations 조인
inner join jobs j using (job_id)                -- employees ↔ jobs 조인
where l.city = 'Seattle';                        -- Seattle 근무 필터링


select * from employees;
select * from departments; 
select * from jobs; 

-- 실습. job_title(직책)이 Stock Manager인 직원들의 전화번호/직책을 조회 = ANSI 조인 사용
select   
    e.phone_number,
    j.job_title   
from  employees e
inner join jobs j using(job_id)
where j.job_title = 'Stock Manager';


-- 해당 테이블  제약조건 확인 
select * from user_constraints where table_name = 'EMPLOYEES';
select * from user_constraints where table_name = 'JOBS';
select * from user_constraints where table_name = 'DEPARTMENTS;

-- 실습. 월급을 최대 월급 이상으로 받는 직원들이 속한 부서를 조회. 단, 부서명의 중복 제거 = ANSI 조인
-- max  inner join distinct jobs_title

select * from employees;
select * from departments;
select * from jobs;


select
    DISTINCT department_name as 부서명
from
    employees
    inner join jobs using (job_id)
    inner join departments using (department_id)
where
    max_salary <= salary * (1 + nvl(commission_pct,0));


