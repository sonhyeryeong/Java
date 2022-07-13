SELECT CODE AS "코드" ,NAME AS "이름",POPULATION AS "인구" FROM COUNTRY;
/*라운드 함수는 반올림
select,from,where의 순서에 유의하기. 
*/
SELECT CODE AS "코드" ,NAME AS "이름",POPULATION AS "인구",round(pOPULATION/ SURFACEAREA,1) as "인구밀도" FROM COUNTRY
where SURFACEAREA<=50000 and pOPULATION >= 100000000;

SELECT CODE AS "코드" ,NAME AS "이름",POPULATION AS "인구",round(pOPULATION/ SURFACEAREA,1) as "인구밀도" FROM COUNTRY
order by 인구 asc;

/* 아시아 대륙 국가들의 인구 순으로 (내림차순) 조회 */
select * from country where continent='asia' order by population desc;

/*lifeexpectancy 오름차순으로 조회
 ->null 값을 가지는 것 부터 나옴
 null값을 제외한 것만 보고 싶으면?
*/
select*from country where LifeExpectancy is not null order by LifeExpectancy asc;

-- 국가의 이름과 인구와 gnp,gnpold, (gnpold -gnp)를 구해 "변화량" 조회

select name, Population, gnp, GNPOld, (GNPOld- gnp) as "GNP 변화량" from country
where gnp is not null and gnpold is not null 
order by `GNP 변화량`;  

-- 대륙 순으로 정렬해서 조회

select* from country order by continent, population;

-- governmentForm 오름차순, gnp 내림차순 정렬 조회

select * from country order by governmentForm asc, gnp desc;








