-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, IF(FREEZER_YN = 'Y', 'Y', 'N') FREEZER_YN FROM FOOD_WAREHOUSE WHERE ADDRESS LIKE '경기도%' ORDER BY 1 ASC;