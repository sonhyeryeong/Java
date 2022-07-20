/*
	부서 -- (employees.department_id => departments.department_id)
	직책 -- (employees.job_id -참-조-> job.job_id)
	매니저 -- (departments.MANAGER_ID -참-조-> employees.employee_id)
    위치 -- (department_id.location_id --참-조 -> locations.location_id)

	1. 모든 부서의 부서명과 관리자(외래키 MAGAER_ID -> employees (employee_id 참조)) 의 이름
    2. 부서명이 IT로 시작하는 부서에서 근무하는 직원들의 이름과 부서명 조회
    3. 모든 직원들의 이름과 직책(JOB_TILE) - (employees.job_id -참-조-> job.job_id) 조회
    4. 직원의 해당 직책의 jobs테이블에 책정된 최대 연봉(MAX_SALARY)을 초과한 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
    5. 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명.
*/

-- 1. 
select a.DEPARTMENT_NAME, b.FIRST_NAME, b.LAST_NAME from departments as a
left join employees as b on a.MANAGER_ID = b.EMPLOYEE_ID;
-- 2
select a.department_name, b.FIRST_NAME, b.LAST_NAME from (
   select * from departments as a where department_name like 'it%'
) as a
left join employees as b on a.department_id = b.department_id;
-- 3
select a.FIRST_NAME, a.LAST_NAME, b.JOB_TITLE from employees as a
left join jobs as b on a.JOB_id = b.JOB_id;
-- 4
select FIRST_NAME, LAST_NAME, SALARY, MAX_SALARY from (
   select a.FIRST_NAME, a.LAST_NAME, a.SALARY, b.JOB_TITLE, b.MAX_SALARY from employees as a
   left join jobs as b on a.JOB_id = b.JOB_id
) as c 
where c.SALARY >= c.MAX_SALARY;

-- 5
select a.FIRST_NAME, a.LAST_NAME, b.department_name, c.location_id, c.COUNTRY_ID from employees as a
left join departments as b on a.DEPARTMENT_ID = b.DEPARTMENT_ID
left join locations as c on b.location_id = c.location_id
where c.country_id = 'us';
