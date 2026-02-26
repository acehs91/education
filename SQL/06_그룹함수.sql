/*
    # 그룹함수
      - 테이블의 행들을 특정 컬럼 기준으로 그룹화하여 계산하는 함수들
      - 특정 그룹의 총합, 갯수, 평균 등을 구하는 함수들
      - 그룹의 기준이 되는 컬럼은 GROUP BY절을 통해 선택 (개념인지)
      - 그룹 함수의 결과는 일반 컬럼과 함께 출력될 수 있음
      ex ) group by department_id; --  그룹핑 (부서별) 
*/

/*
 SUM(column)  : 합계
 AVG(column)  : 평균
 MAX(column)  : 최댓값   
 MIN(column)  : 최솟값   
 COUNT(column): 개수   
*/

select * from employees; 

-- 직원테이블에서 급여의 총합을 조회
select SUM(salary) from employees;

-- GROUP BY ~ 컬럼기준으로 조회
SELECT
    job_id, SUM(salary)
FROM
    employees
GROUP BY
    job_id;
-- 각 직무별 평균임금을 직무 기준으로 조회 = 별칭 평균임균
select
    job_id,
    AVG(salary) AS "평균임금"
from
    employees
group by
    job_id;
-- 커미션 갯수 조회 | 조회기준 = 부서번호
select
    department_id,
    COUNT(commission_pct) AS "총갯수"
from
    employees
group by
    department_id;
-- 부서번호 80번이 어떤 직무를 하는지 조회
select job_id from employees where department_id = 80;
-- 부서번호 80번이 어떤 직무를 하는지 조회(결과 중복제거)
select DISTINCT job_id from employees where department_id = 80;
-- 실습. 각 부서별로 가장 최근에 입사한 사원의 날짜와 가장 오래전 입사한 사원의 날짜를 조회 = 부서번호로 그룹 조회
select
    department_id,
    MAX(hire_date) as "최근 입사",
    MIN(hire_date) as "초기 입사"
from
    employees
group by
    department_id;
-- NULL 처리 = 위의 결과 그대로 나오면서 NULL인 부서명을 9999 나아도록 작성
select
    NVL(department_id,'99999'),
    max(hire_date) as "최근입사",
    min(hire_date) as "초기입사"
from
    employees
group by
    department_id;
-- 실습. 각 직무별 평균 연봉 구하기 | 직무별로 조회
select
    job_id,
    AVG(salary * (1+NVL(commission_pct,0))) AS "평균연봉"
from
    employees
group by
    job_id;
    
/* # HAVING절 = 그룹함수 결과에 대한 조건을 주고 싶을때 사용 */
SELECT
    job_id, 
    AVG(salary) as "평균급여"
FROM
    employees
GROUP BY
    job_id
HAVING
    AVG(salary) >= 10000;
-- 실습. 5명 이하로 구성된 부서번호를 조회 | 그 부서의 최고 급여액 , 부서번호 기준으로 조회 
select
    department_id,
    max(salary) as "최고급여액"
from
    employees
group by
    department_id
having
    COUNT(department_id) >= 5;

/* WHERE절과 GROPU BY 함꼐 사용 = WHERE절의 조건을 모든 행에 적용한 결과를 그룹화 */   
select
    department_id,
    MIN(salary) AS "최저급여"
from
    employees
where
    salary >= 5000
group by
    department_id;