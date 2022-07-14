SELECT * FROM employees;
-- 문자 사이에 있는 공백은 제거하지 못한다. 
SELECT rtrim('    A     ');
SELECT LTRIM('          A            ');
SELECT TRIM('         A      ');

SELECT lower('ABCDE'); -- 소문자로 만들기
SELECT UPPER('abcde'); --  대문자로 만들기 

select reverse('qwer'); -- 글자 거꾸로

select concat('문자열','결합','함수');
select concat('결합',null,'값이 있으면?'); -- 안됨 null 반환

select char_length('문자열길이');

select replace('원본 문자열에서 변환합니다.','변환','replace'); -- (원본문자열, 찾고자 하는 문자, 바꾸고자 하는 문자)


select substring('employees',5); -- 문자열,자를 시작 위치 (자바와 다르게 1부터 시작함)
select substring('employees',5,2); -- 문자열,자를 시작 위치, 갯수
select substring('employees',-3); -- 음수일 떄 우측에서부터 위치를 세어나감
select substring('employees',-3,2); --  

select lpad('123',5,'0'); -- 오른쪽부터 지정 문자열을 지정한 갯수만큼
select rpad('456',5,'*'); -- 왼쪽부터 지정 문자열을 지정한 갯수만큼
select repeat('반복결합',3);

select locate('d','abcdefg'); -- 문자열의 위치를 찾아줌
select locate('위치','문자열의 위치를 찾는데 SQL의 문자 순서는 1부터임');

-- '515.123.4567' .을 기준으로 각각 잘라보셈
select substring('515.123.4567',1,3);
select substring('515.123.4567',5,3);
select substring('515.123.4567',9,4);


-- 직원 테이블 전화번호 앞자리 3자리를 그룹지어서 개수

select substring(phone_number,1,3)
,count(*) from employees 
group by substring( phone_number,1,3);

-- 

select rand(); -- 랜덤수 
select round(123.123,2);
select floor(1.555);
select ceil(1.222);

select abs(-55); -- 양수로 
select pow(2,8); -- 제곱

-- 주사위 1-6까지 난수 생성

select floor(rand()*6);

