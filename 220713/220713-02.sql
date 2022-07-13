-- 학생 
-- 이름:가변길이문자열(10)
-- 학점: 실수

create table students(
	name varchar(10)
    ,age int -- long , bigint등이 있다. (정수표현)
    ,score double
);

select * from students;

insert into students(name,age,score) values ('길동',20,3.3);
insert into students(name,age,score) values ('둘리',20.5,3); -- 실수 넣으면 반올림 일어나서 정수로 표시됨. 
insert into students(name,age,score) values ('길동',21,2.6);

delete from students where name='둘리';
