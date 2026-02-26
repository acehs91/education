/*
    # 뷰(view) 
      - 데이터베이스에서 제공하는 가상의 테이블
      - 뷰 사용시 복잡한 쿼리문을 대신할 수 있으므로 개발의 용의성을 가짐
      - 뷰를 만들때 사용한 쿼리문을 저장하는 것
      - 주로 복잡한 서브쿼리 사용시 다음에 다시 사용할 목적으로 사용
      
    (예) 여러 테이블을 조인한 복잡한 쿼리문의 결과를
         => 가상의 테이블 뷰에 저장하면, 그 이후부터 복잡한 쿼리를 쉽게 사용할 수 있음
         
    # 뷰 생성하기   - view 생성 구문에서의 AS는 *“이 뷰는 다음 쿼리 결과를 기반으로 한다”*라는 의미 
      CREATE VIEW 뷰이름
      AS
      서브쿼리

    ※ 결론 테이블을 직접 생성안하고 가상테이블에 넣어보는것 ※

*/


/* # 뷰 만들기 */
-- 직원의 사원번호, 이름, 급여, 근무부서, 근무지역 = EQUI 조인 이용하여 작성
select * from employees;
select * from departments;

create view emp_dept_view -- 가상테이블 생성
AS
select
    e.employee_id,
    e.first_name,
    e.salary,
    d.department_id,
    d.location_id
from
    employees e, departments d
where
    e.department_id = d.department_id;

select * from emp_dept_view;

-- 뷰삭제
DROP VIEW emp_dept_view;

-- 시스템 카탈로그 조회 = 데이터 딕셔너리
select * from user_catalog;

-- 실습. 뷰 만들기
-- 사는 도시가 'Seattle'인 직원의 이름/직급/급여/사는도시 조회 = EQUI = 테이블 4개 조인
select * from employees;
select * from departments;
select * from jobs;
select * from locations;
CREATE VIEW emp_dept_jobs_loc_view
AS
select
    e.first_name,
    j.job_title,
    e.salary*(1+nvl(commission_pct,0)) as 급여,
    l.city
from
    employees e,
    departments d,
    jobs j,
    locations l
where
    d.department_id = e.department_id
    and
    l.location_id = d.location_id
    and
    e.job_id = j.job_id
    and
    l.city = 'Seattle';
-- 뷰 조회
select * from emp_dept_jobs_loc_view;





-- 사는 도시가 'Seattle'인 직원의 이름/직급/급여/사는도시 조회 = EQUI = 테이블 4개 조인

select * from employees;
select * from departments;
select * from jobs;
select * from locations;
 
  -- e.first_name , e.salary
  -- j.job_id
  -- l.locatin_id
SELECT 
  e.first_name,
  j.job_title,
  e.salary,
  l.city
FROM employees e
INNER JOIN departments d
    ON e.department_id = d.department_id
INNER JOIN jobs j
    ON e.job_id = j.job_id
INNER JOIN locations l
    ON d.location_id = l.location_id
WHERE l.city = 'Seattle';
