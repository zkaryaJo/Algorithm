-- 코드를 입력하세요


SELECT ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME
FROM ANIMAL_INS inner JOIN ANIMAL_OUTS ON ANIMAL_INS.ANIMAL_ID= ANIMAL_OUTS.ANIMAL_ID
WHERE (ANIMAL_INS.sex_upon_intake ='Intact Male' or ANIMAL_INS.sex_upon_intake = 'Intact Female') 
and (ANIMAL_OUTS.sex_upon_outcome != 'Intact Male' and ANIMAL_OUTS.sex_upon_outcome != 'Intact Female')
order by ANIMAL_INS.ANIMAL_ID