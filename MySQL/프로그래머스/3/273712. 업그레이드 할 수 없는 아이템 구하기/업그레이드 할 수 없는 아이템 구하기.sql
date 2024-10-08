-- 코드를 작성해주세요
SELECT ITEM_ID, ITEM_NAME, RARITY
FROM ITEM_INFO
WHERE ITEM_ID IN (SELECT LT.ITEM_ID FROM ITEM_TREE LT LEFT JOIN ITEM_TREE RT ON LT.ITEM_ID = RT.PARENT_ITEM_ID WHERE RT.ITEM_ID IS NULL)
ORDER BY ITEM_ID DESC;