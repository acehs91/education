/* 
 #select 컬럼명 from 테이블명 where 조건절;
  - select문에 where절을 추가하여 해당 조건을 만족하는 행만 조회 가능
  - 오라클의 비교 연산자들을 활용
  
  # 비교 연산자
  - = : 같으면 TURE
  - < , > , <= , >= : 비교
  - != , <> , ^= : 다르면 TURE
*/

-- 모든 employees 테이블 조회
select * from employees
-- 실습. 직원 테이블에서 월급이 10000이상인 직원의 이름 모두 직무 급여를 조회

select first_name, last_name, job_id, salary
from employees
where salary >= 10000;


-- 실습. 모든 직원중에 첫번째 이름이 John인 사람의 모든 정보 출력 
select * 
from employees
where first_name like 'John%';

-- 실습. 모든 직원중에 첫번째 이름이 Vance인 사람의 부서정보, 급여, 마지막이름 출력
select department_id, salary, last_name
from employees
where first_name = 'Vance';

 /* # 문자타입 비교 */
 -- 첫번째 이름이 Steven 이라는 직원의 모든 정보 조회 
 select * from employees where first_name = 'Steven';
 
SELECT first_name FROM employees where first_name > 'P' ; -- p 부터~

order by first_name;

select * from employees where first_name > 'V' order by first_name;


/* # 날짜 타입 비교 */

SELECT * FROM employees
where hire_date < '06/01/01'
order by hire_date desc;

--모든 직원들의 월급중 2000에서 3000사이 직원 조회
select * from employees where salary between 2000 and 3000;

-- 실습 30번, 60번, 90번 부서에 소속된 직원들의 이름/ 직무 / 전화번호 / 부서번호 정보 조회

select first_name, job_id ,  phone_number , department_id
from employees
where department_id = 30 or  department_id = 60 or department_id = 90;

select first_name, job_id , phone_number, department_id
from employees
where department_id 30 or department_id 60 or department_id 90


-- 모든 직원중  급여가 2000에서 3000 사이인 직원  
select * from employees where salary between 2000 and 3000;





