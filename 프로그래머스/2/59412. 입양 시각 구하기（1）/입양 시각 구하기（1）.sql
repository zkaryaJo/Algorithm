-- 코드를 입력하세요
SELECT TO_NUMBER(HOUR) AS "HOUR", count(hour) AS "COUNT"
FROM (
        SELECT to_char(DATETIME, 'HH24') as hour
         FROM ANIMAL_OUTS 
     )
group by hour
HAVING hour >= 9 AND HOUR <20
ORDER BY hour