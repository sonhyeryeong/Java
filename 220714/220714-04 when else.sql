-- null이면 임의의 값으로 하고 싶음!
select name
		,case when lifeExpectancy is null then 0.0 
        else lifeExpectancy
        end as Life 
from world.country;

select ifnull(null,'대체값');

-- 값이 3개, 1번째 값이 null 이면 2번째 값, 2번쨰 값도 널이면 3번째 값
select ifnull(ifnull('첫번째 값','두번째 값'),'세번째 값');
select coalesce('첫','둘','셋');

select nullif('a','b'); -- 




-- 직원 이름 (이름+ 성) 결합시킨 full name , 전화번호가 011로 시작하는 경우 '개인전화', 그 외의 경우'내선번호' 라고 조회
select concat(First_name,' ',Last_name)as 'full_name'
	,(case when substring(PHONE_NUMBER,1,3) ='011' then '개인전화'
    else '내선번호'end) as '분류'
 from employees;
 
 

-- 판별식이 참이면 then 절, 거짓이면 else절 
select case when 10>5 then '왼쪽이 오른쪽보다 큽니다.' 
	else '왼쪽이 오른쪽보다 작거나 같습니다'
    end;

select case when 10>5 then '왼쪽'
			when 10=5 then '같음'
            when 10<5 then '오른쪽'
            end as '비교';
            
