SELECT SUM(L_EXTENDEDPRICE) / 7
FROM PART JOIN LINEITEM ON P_PARTKEY = L_PARTKEY 
JOIN 
(SELECT P_PARTKEY, AVG(0.2 * L_QUANTITY) AS AVERAGE
FROM LINEITEM JOIN PART ON L_PARTKEY = P_PARTKEY
WHERE P_BRAND = 'Brand#15' AND P_CONTAINER = 'MED BAG'
GROUP BY P_PARTKEY 
) AS TMP_VIEW
ON P_PARTKEY = TMP_VIEW.P_PARTKEY AND L_QUANTITY < AVERAGE
WHERE P_BRAND = 'Brand#15' AND P_CONTAINER = 'MED BAG'
