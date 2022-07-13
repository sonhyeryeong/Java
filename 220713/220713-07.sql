-- hr 부서 테이블 모든 행과 열 조회
select * from departments;
-- 부서 명이 'it%'로 시작하는 부서들 조회
select* from departments where DEPARTMENT_NAME like 'it%';

-- 직원테이블에서  department_id값이 60,210,230 
select* from employees where DEPARTMENT_ID in
		(select DEPARTMENT_ID from departments where DEPARTMENT_NAME like 'it%');	-- 서브쿼리
-- 서브쿼리는 where 절에,from절에도 

-- 연봉 내림차순 정렬
-- 연봉 상위10명 연봉을 오름차순으로 조회하고 싶음. 
-- 서브쿼리를 사용해서 
select * from (
	select* from employees order by salary desc limit 10
) as a -- 별칭을 붙이지 않으면 오류생김
order by salary asc;

-- david austin 의 연봉과 같은 연봉을 받는 직원 조회



select * from employees where salary =(
	select SALARY from employees where FIRST_NAME = 'david' and last_name = 'austin'
);