create database my_db;

show databases;

use my_db;

show tables;

-- 사람 테이블
--  '열' : 이름(문자열) ,나이(정수)
create table persons (
	name varchar(10), -- 문자열은 길이를 같이 정해줘야함
    age int
);

desc persons;
select* from persons;

insert into persons (name,age) values('홍길동',22);
-- '브루스 리',30살 행 추가
-- '스티븐 킹',40살 행 추가
insert into persons (name,age) values('브루스 리',30);
insert into persons (name,age) values('스티븐 킹',40);

-- '철수',20살 '철수',30살 '철수', 40살
insert into persons (name,age) values ('철수',20),('철수',30),('철수',40); -- 여러 데이터를 한 번에 

delete from persons; --  테이블의 행 삭제 

drop table book; -- 테이블 삭제

-- 책 테이블 생성 제목:문자열,가격:정수 

create table book( title varchar(20) , price int);
select * from book;
insert into book (title,price) values('파워자바',25000),('하늘과 바람과 별과 시',15000),('꽃을 보듯 너를 본다',12000); 
-- 문자열 타입
-- char(5) : 고정된 길이 값을 가진다.a 하나만 입력해도 'a    ' 처럼 무조건 길이 값을 채우게 됨 
-- varchar(5) :가변 길이를 가진다. a 하나만 입력하면 그에 맞게 길이 값이 조정됨. 

create table testChar(
	fixLength char(5)
    , varLength varChar(5)
);

insert into testChar(fixLength,varLength) values('A','A');
select concat(fixLength,'B'),concat(varLength,'B') from testChar;
select char_length(fixLength),char_length(varLength) from testChar;

select rtrim('a         '); -- 우측 공백 제거
select ltrim('         a'); -- 좌측 공백 제거