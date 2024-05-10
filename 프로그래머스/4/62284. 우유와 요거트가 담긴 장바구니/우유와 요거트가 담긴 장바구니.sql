-- 코드를 입력하세요
SELECT A.CART_ID as CART_ID
from CART_PRODUCTS A inner join CART_PRODUCTS B on A.CART_ID = B.CART_ID
where a.NAME = '우유' and b.NAME = '요거트'
order by A.CART_ID