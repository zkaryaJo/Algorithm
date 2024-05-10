-- 코드를 입력하세요
-- select count(*)
SELECT COUNT(NAME)
FROM (SELECT DISTINCT NAME
from ANIMAL_INS 
      )

-- where name = NULL

-- where NAME != null