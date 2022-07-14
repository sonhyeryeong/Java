select * from my_db.pktest;
-- pk가 2개이다. 
insert into pktest (myCol1, myCol2) value('1','1');
insert into pktest (myCol1, myCol2) value('1','2');
insert into pktest (myCol1, myCol2) value('2','1');
insert into pktest (myCol1, myCol2) value('1','1'); -- 이건 안된다. why? pk가 둘 모두 동일하기 때문에!