-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS 
where NAME='Lucy' or name = 'Ella' or name = 'Pickle' or name = 'Rogan' or name = 'Sabrina' or name = 'Mitty'
order by 1