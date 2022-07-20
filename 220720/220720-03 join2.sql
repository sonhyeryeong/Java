select * from my_db.books;

select title,price,bookId from books where price between 1000 and 10000
union all
select * from books where title like '책%';

select * from persons, test; -- 이러면 두 테이블의 컬럼이 나열된다. cross라고 한다? 
