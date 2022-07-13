select * from country limit 1 offset 2; -- 한 칸 건너서
select * from country limit 2,1; -- 쉼표로 생략 가능 


-- page 나누기 (pagging 처리) 
select * from country limit 10 offset 0;
select * from country limit 10 offset 10;
select * from country limit 10 offset 20;
