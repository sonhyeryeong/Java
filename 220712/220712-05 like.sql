select * from country
where name  like '%korea%';

select*from country
where name like '%k%';

select* from country
where name like 'k%';

-- 국가 이름이 'a'로 시작하고 'a'로 끝나는 국가 조회
select* from country where name like 'a%a';
-- 국가이름이 a로 시작하고 끝나는 6글자 : _로 글자 길이 정해주기
select* from country where name like 'a____a';
-- 국가명이 ~ria 로 끝나는 국가 조회
select* from country where name like '%ria';
-- region 컬럼이 north~ 로 시작하는 국가 조회
select * from country where Region like 'north%';
-- region 컬럼에 a로 시작하고 끝나는 명칭을 포함하지 않는 국가
select * from country where region not like 'a%a' and region not like '%a%a';

