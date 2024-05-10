-- 코드를 입력하세요
select DATETIME "시간"
from (SELECT * 
from ANIMAL_INS 
order by DATETIME asc 
 ) where rownum =1