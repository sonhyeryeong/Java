select * from country limit 5;-- 행 숫자 제한 가능 limit으로

-- 인구가 가장 많은 1개의 국가 조회하기
select* from country order by population desc limit 1;
-- 면적 순으로 탑 5
select* from country order by surfacearea desc limit 5;
-- continent가 'asia'인 국가들 중 면적이 좁은 10개 국가
select* from country where continent = 'asia' order by surfacearea asc limit 10;
-- region '~africa' 로 끝나는 국가들 중 독립년도가 가장 최근인 10개 국가
select * from country where region like '%africa' order by IndepYear desc limit 10;

-- 면적당 인구비율(surfacearea / population) 을 구해 탑 10 국가
select * ,(population/surfacearea)  from country  order by (population/surfacearea) desc limit 10;
-- gnpold - gnp 최상위 10
select * , (gnp - gnpold) as "변화량" from country order by (gnp - gnpold) desc limit 10;