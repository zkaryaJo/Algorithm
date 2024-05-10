-- 코드를 입력하세요
SELECT NAME, COUNT(name)
from ANIMAL_INS 
group by NAME
having COUNT(name) > 1
order by name