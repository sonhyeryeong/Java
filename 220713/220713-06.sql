-- 식당정보 테이블
-- 상호명,전화번호,주소 등
create table place2 (
	ID INT PRIMARY KEY auto_increment
	,name varchar(15) NOT NULL
    , num varchar(15) NOT NULL UNIQUE
    , adress varchar(50) NOT NULL UNIQUE
);

insert into place2(name,num,adress) values ('가솔린앤로지스','전화번호 없음','부산 부산진구 서전로9번길 14 1층 103호')
			,('그집곱도리탕','0507-1308-4186','부산 부산진구 동천로107번길 17');
insert into place2(name,num,adress) value('김완쭈꾸미','051-818-7778','부산 부산진구 중앙대로755번길 10');
insert into place2(name,num,adress) value('모루식당','010-3676-6949','부산 부산진구 서전로38번길 37');
select* from place2;


-- 메뉴 정보 테이블
--  음식명,가격 등 
create table menu(
	menuid INT PRIMARY KEY auto_increment
	,foodname varchar(15)
    ,price int
);
insert into menu(foodname,price) values ('키라이탄멘',11000),('곱도리탕',45000);
insert into menu(foodname,price) value ('쭈꾸미정식',7500);
insert into menu(foodname,price) value ('새우크림카레',8500);
select* from menu;
-- 일단 열을 삽입한다
alter table menu add column restid int ;
-- restid 는 foreign key라고 부른다. 

update menu set restid = 2 where menuid<>1;

alter table menu add constraint foreign key (restid) references place2 (ID);

