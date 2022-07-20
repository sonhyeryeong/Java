select * from menu as a
right join restaurants as b on a.restid = b.id;

select * from restaurants as a 
inner join menu as b on a.id = b.restid;
-- inner 는 결합이 가능한 행들만 결합함. 