SELECT T.INGREDIENT_TYPE
	, SUM(O.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF O LEFT OUTER JOIN ICECREAM_INFO T
ON O.FLAVOR = T.FLAVOR
GROUP BY T.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC;