-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, decode(   instr(SEX_UPON_INTAKE, 'Neutered'), 0, decode(instr(SEX_UPON_INTAKE, 'Spayed'), 0, 'X', 'O'), 'O') as "중성화"
from ANIMAL_INS 
order by ANIMAL_ID