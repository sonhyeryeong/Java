desc books;

alter table books change column title title varchar(30) not null;

insert into books (title) values ('디폴트값확인');

select * from books;

