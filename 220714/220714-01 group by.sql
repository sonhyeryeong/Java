-- 부서 ID가 90인 직원들 인원 수 
SELECT COUNT(*) FROM employees WHERE DEPARTMENT_ID= 90;

-- 부서별로 직원들의 인원 수 
SELECT DEPARTMENT_ID, COUNT(*) FROM employees group by DEPARTMENT_ID;

-- 부서별 최고 연봉, 최저 연봉, 평균 연봉, 연봉 합. 
SELECT DEPARTMENT_ID,MAX(SALARY),MIN(SALARY),AVG(SALARY),SUM(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID;

-- distinct: 중복을 제거하나 모든 것이 완벽하게 똑같아야함
SELECT JOB_ID,LAST_NAME FROM EMPLOYEES group by JOB_ID;
SELECT distinct JOB_ID, LAST_NAME FROM employees;

-- 직원 테이블 last_name 을 중복 제거하고 조회
select distinct LAST_NAME from employees; 

-- 직원 테이블 last_name 그룹 별로 인원 수 조회
SELECT LAST_NAME,COUNT(*) FROM employees group by LAST_NAME;
-- 같은 LAST_NAME 그룹의 카운트가 2이상인 행들만 조회
-- WHERE 절은 프롬에서 가져올 때 실행된다 그룹에 대해 조건을 걸고 싶으면 HAVING절을 쓴다. 
SELECT LAST_NAME,COUNT(*) FROM employees group by LAST_NAME having COUNT(*)>1;

-- 위의 성을 가지는 직원 목록 조회
SELECT * FROM employees WHERE LAST_NAME IN(
	SELECT LAST_NAME
	FROM employees 
	group by LAST_NAME having COUNT(*)>1
); 

-- 5번째로 적게 받는 직원들 목록
SELECT *FROM employees
WHERE SALARY =
(SELECT distinct SALARY FROM employees ORDER BY SALARY LIMIT 1 OFFSET 4);


-- 상위 연봉 50명에 대해서 부서별로 몇 명씩 있는지 
SELECT DEPARTMENT_ID,COUNT(*) FROM
(SELECT * FROM employees ORDER BY SALARY DESC,FIRST_NAME ASC LIMIT 50) AS A 
group by DEPARTMENT_ID;
