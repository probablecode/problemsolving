SELECT CONCAT(FLOOR((MONTH(DIFFERENTIATION_DATE) + 2) / 3),'Q') QUARTER, COUNT(*) ECOLI_COUNT
FROM ECOLI_DATA
GROUP BY QUARTER
ORDER BY QUARTER;