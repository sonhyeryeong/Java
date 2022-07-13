create table persons(
	personId Int primary key auto_increment
    ,firstName varchar(10) not null
    ,lastName varchar(10) not null
    ,age int not null
    ,email varchar(50) not null unique
);
select* from persons;
insert into persons(firstName, lastName,age,email) values ("길동","홍",20,"길동@길동.넷");
insert into persons(firstName, lastName,age,email) values("길동","고",42,"길동@길동.넷");