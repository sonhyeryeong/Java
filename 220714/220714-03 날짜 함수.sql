select * from employees;

desc employees;

-- SQL 날짜: date , 시간:time , 날짜시간:datetime,timestamp 

select current_date();
select current_time();
select current_timestamp();

select date '2022-07-14';


select * from employees
where HIRE_DATE between '1987-06-01' and '1987-06-30';

select adddate('1987-06-01' ,40);
select subdate('1987-06-01',1);
select date_add('1987-06-01',interval 40 day);
select date_sub('1987-06-01',interval 1 month);
select '1987-06-01' + interval 1 year;
select '1987-06-30' + interval 1 day;

select dayofweek('2022-07-14'); -- 1이 일요일 요일 알려줌

select extract(year from '2022-07-14');
select extract(month from '2022-07-14');
select extract(day from '2022-07-14');

select datediff('2022-06-01','2022-06-13');

select str_to_date('2021/06/13','%Y/%m/%d');
select date_format(date '2021-06-13','%y/%M/%D');

-- 17일에 고용된 직원 목록
select *  from employees where hire_date like '%-17'; -- 날짜를 문자열처럼 취급하기 때문에 가능
select *  from employees where extract(day from hire_date)=17;
 
 -- r각 행별로 일한 기간 (일) 을 추가 칼럼으로 조회하기 
select *,datediff(end_date,start_date) as '일한 기간(일)' from job_history;

-- 자료형 숫자,문자열,날짜
select cast(10 as time);
select cast('10' as double)+5.5;

select convert(10,time);
select convert('10',double)+5.5;