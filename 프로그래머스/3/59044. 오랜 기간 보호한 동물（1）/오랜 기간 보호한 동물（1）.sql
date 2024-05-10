-- 코드를 입력하세요
-- SELECT NAME, DATETIME

SELECT NAME, DATETIME
FROM (
SELECT ANIMAL_INS.name AS NAME, ANIMAL_INS.DATETIME AS DATETIME
FROM ANIMAL_INS FULL OUTER JOIN ANIMAL_OUTS ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE ANIMAL_OUTS.ANIMAL_ID IS NULL
ORDER BY ANIMAL_INS.DATETIME
    )
    WHERE ROWNUM <4