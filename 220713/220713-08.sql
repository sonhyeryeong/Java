-- 집계 함수
SELECT * from employees;

select count(*) from employees;

-- 전화번호가 515~~ 로 시작하는 직원을 조회하는 퀴리문
select * from employees where PHONE_NUMBER like '515%';
-- 전화번호가 515~~ 로 시작하는 직원의 수를 조회하는 쿼리문
select count(*) from employees where PHONE_NUMBER like '515%';

-- 합
select sum(SALARY) from employees; 
-- 평균
select avg(salary) from employees;
-- 최대 ,최소
select max(salary) from employees;
select min(salary) from employees;

-- 최대 연봉과 최소 연봉의 차를 구해봅시다. 
select max(salary) - min(salary) from employees;
