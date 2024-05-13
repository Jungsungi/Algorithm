-- 코드를 입력하세요
SELECT
    A.PRODUCT_ID, PRODUCT_NAME, (PRICE * AMOUNT) AS TOTAL_SALES
FROM
    FOOD_PRODUCT A,
    (SELECT
        PRODUCT_ID, SUM(AMOUNT) AS AMOUNT
    FROM
        FOOD_ORDER
    WHERE 
         TO_CHAR(PRODUCE_DATE, 'YYYY-MM-DD') LIKE '2022-05%'
    GROUP BY PRODUCT_ID) B
WHERE
    A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID;


    