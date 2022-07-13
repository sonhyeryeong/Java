-- 각 직원들의 이름과 연봉, 평균연봉과의 차 (평균연봉-연봉)를 조회해보세요
select last_name , salary, (avg(salary)-salary) as '평균 연봉과의 차' from employees;

-- 최고 연봉직원과 최저 연봉직원의 이름을 조회해보세요
select * from employees where salary = (select max(salary) from employees);
select * from employees where salary = (select min(salary)  from employees);

-- 평균 연봉보다 높게 받는 직원 조회
select * from employees where salary>(select avg(salary) from employees);

-- 부서명이 it로 시작하는 직원들의 수 (카운트) 를 조회해보세요a
select count(*) from employees where JOB_ID like 'it%';

-- douglas grant의 이메일을 'dog@naver.com'으로 변경해보세요
update employees set email='dog@naver.com' where first_name='douglas' and last_name='grant';
select * from employees;

-- ellen abel 과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
select * from employees where job_id = 
	(select job_id from employees where first_name ='ellen' and last_name ='abel')
order by salary desc;

-- 부서명이 it로 시작하는 부서에서 근무하는 최고 연봉자보다 ///높은 연봉을 받는 직원 목록을 연봉 오름차순으로 조회
select * from employees where salary>
	(select max(salary) from employees where job_id like 'it%')
order by salary asc;

-- 자기가 속한 부서의 평균보다 많이 받는 직원
select * from departments;