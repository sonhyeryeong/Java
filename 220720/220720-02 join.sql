-- 테이블을 붙이는거? 합성? 
select 1,2,3
union -- 세로로 붙이기
select 4,5,6
union
select 7,8,9
-- 행의 중복은 사라진다. 
union all  -- all을 붙이면 중복 무시하고 붙여줌
select 1,2,3;
