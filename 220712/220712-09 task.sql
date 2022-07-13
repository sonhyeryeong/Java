-- hr 데이터베이스 사용하기 명령어 작성
use hr;
show tables;
-- 직원 테이블의 구조(어떠한 컬럼이 있는지) 를 조회해보세요
desc employees;

-- employees(직원) 테이블의 구조를 조회해보세요
select * from  employees;

-- 직원 테이블의 first_name 열의 값이 john인 직원 조회
select * from employees where FIRST_NAME ='john';

-- 직원 테이블의 Last_name 열의 값이 john를 포함하는 직원 직원 조회
select * from employees where LAST_NAME  like '%john%';

-- 직원 테이블의 이름의 값이 6글자인 직원 조회
select* from employees where FIRST_NAME like '______';
select* from employees where char_length(FIRST_NAME)=6; -- 함수를 사용할 수도 있다. 

-- 직원 테이블 salary 열의 값이 10000 -15000인 직원 조회
select* from employees where salary between 10000 and 15000;

-- 직원 테이블의 이름, 성, 연봉 칼럼과 연봉의 6%를 연산해 'tax'라는 별명의 컬럼으로 조회하셈;
select FIRST_NAME,LAST_NAME,SALARY, (salary*0.06) as 'tax' from employees; 