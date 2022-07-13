drop database my_db;

create database my_db;

use my_db;

create table students(
	number INT primary key -- 기본키 지정 
	,name varchar(10)
    ,age int 
    ,score double
);

desc students;

insert into students(number,name,age,score) values (1234, '길동',20,3.3);
insert into students(number,name,age,score) values (1235, '둘리',30,4.4);
insert into students(number,name,age,score) values (1236, '길동',20,3.3);

select * from students;