-- 왼쪽을 기준으로 했기 때문에 주인이 없는 책도 나옴 
select * from my_db.books as a 
left join persons as b on a.owner = b.personid; 

-- inner join은 있는 값만 나옴!
-- *로 이런 식으로도 쓸 수 있음
select a.*,b.firstName,b.lastName from my_db.books as a 
inner join persons as b on a.owner = b.personid
where a.price >=5000;

