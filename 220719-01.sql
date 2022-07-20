start transaction;
update books
set price =50000;

select * from books;

rollback;
commit;