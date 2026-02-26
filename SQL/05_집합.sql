/*
    # UNION, INSERSEC, MINUS
*/
-- 직원 테이블 조회
select * from employees;
-- 직원 테이블 이름순으로 정렬 = A부터 ~~
select * from employees order by first_name;
-- 직원테이블에서 직원의 이름이 J로 시작하고, s 또는 n으로 끝나는 직원들의 모든 정보를 조회 = AND , OR , LIKE
select
    *
from
    employees
where
    first_name LIKE 'J%'
    AND (first_name LIKE '%s' OR first_name LIKE '%n');
-- 직원테이블에서 직원이름, 부서번호, "부서번호" 별칭으로 department_name으로 나오도록 조회 | 조건 = 부서번호에 10,20,30포함
select
    first_name,
    department_id,
    department_id AS 부서번호
from
    employees
where
    department_id IN(10,20,30);

/* UNION : 합집합 */
select * from employees where first_name LIKE 'J%n'
UNION
select * from employees where first_name LIKE 'J%s';
/* UNION ALL : 합집합 (중복제거안함) */
select * from employees where department_id = 30
UNION ALL
select * from employees where department_id between 10 and 30;

/* INTERSEC : 교집합 */
select * from employees where department_id = 30
INTERSECT
select * from employees where department_id BETWEEN 10 AND 30;

/* MINUS : 차집합 */
select * from employees where department_id between 10 and 30
MINUS
select * from employees where department_id = 30;