/*
    # ORDER BY
      - 원하는 컬럼 기준으로 정렬하여 조회할 수 있음
      - ORDER BY 컬럼명 [ASC|DESC]
      - ASC : 오름 차순, Ascending(기본값) = (예)1,2,3,4,5
      - DESC : 내림 차순, Decending(기본값) = (예)5,4,3,2,1
      - NULL : 오름차순으로 정렬하면 가장 나중에 출력되고, 내림차순으로 정렬하면 가장 먼저 출력됨
*/

select * from employees;


-- 부서번호로 오름차순 정렬 | 모든 직원 조회
select * from employees order by department_id;
-- 부서번호로 내림차순 정렬 | 모든 직원 조회
select * from employees order by department_id desc;

-- NULL 정렬
select * from employees order by commission_pct;
select * from employees order by commission_pct desc; -- 가장 위로 정렬

-- 각각 컬럼을 정렬 하는데 
select * from employees order by job_id asc, hire_date desc;
--먼저 job_id 오름차순으로 정렬하고, 같은 job_id 안에서는 hire_date 내림차순(최근 입사일이 위)으로 정렬

