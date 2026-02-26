/*
    # 서브쿼리 
    -하나의 select 문 내부에 포함된 또하나의 select문
    -서브 쿼리를 포함하고 있는 쿼리를 '메인쿼리' 라고함
    -서브 쿼리가 먼저 실행
    -실행 결과에 따라 단일행 서브쿼리 , 다중행 서브쿼리로 분류됨
    
    # 단일행 서브쿼리
    -서브쿼리의 실행결과 단 하나의 행인 서브쿼리
    -단일 값끼리 비교하는 연산들을 사용할수있음
    -예) = , > ,<  
    
    # 다중행 서브쿼리
    -서브쿼리의 실행 결과가 2행이상인 서브쿼리
    -다중행 연산자와 함께 사용해야 함
    -IN,SOME,ANY,ALL,EXISTS
*/
/* IN : IN 뒤에 나오는 여러값들 중 해당 값이 포함되어 있으면 TRUE  */
select * from jobs;

select * from jobs where job_id
IN(select job_id from employees where first_name ='Peter');


/* ANY ,SOME :뒤에 나오는 여러값들 중 하나 이상의 해당 조건을 만족시키면 트루  */
select * from employees 
where salary > SOME(select salary from employees where job_id ='IT_PROG');

/* ALL : 뒤에 나오는 여러값들의 모든 조건을 만족시키면 True */
select * from employees where salary < ALL(select salary from employees where job_id = 'IT_PROG');
