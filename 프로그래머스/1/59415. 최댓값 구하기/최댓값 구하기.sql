-- 코드를 입력하세요

-- SELECT DATETIME "시간"
select datetime "시간"
from (
select *
from ANIMAL_INS
order by DATETIME desc
    )
    where rownum = 1;