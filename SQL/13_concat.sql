/*
  concat 연산자 (||)
  - 문자열과 컬럼값을 합쳐서 하나의 문장처럼 출력
  - 형식: 컬럼 || '문자열' || 컬럼 || '문자열'
*/

select first_name || ' 사원의 담당업무는 ' || job_id || ' 입니다.'
from employees
where rownum <= 5; -- 상위 5명만 예시

/*
  distinct 연산자
  - select문 결과 중 중복된 값을 제거
  - 주로 중복된 데이터 확인, 유일한 값 조회 시 사용
*/

-- 중복 포함: 모든 부서번호 조회
select department_id from employees order by department_id;

-- 중복 제거: 유일한 부서번호만 조회
select distinct department_id from employees order by department_id;
 
