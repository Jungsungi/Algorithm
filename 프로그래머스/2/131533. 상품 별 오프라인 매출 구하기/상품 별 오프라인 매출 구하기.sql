-- 코드를 입력하세요

SELECT
    PRODUCT_CODE, (SALES_AMOUNT * PRICE) AS SALES
FROM
    (SELECT
        PRODUCT_ID, SUM(SALES_AMOUNT) AS SALES_AMOUNT
    FROM OFFLINE_SALE
    GROUP BY PRODUCT_ID) A,
    PRODUCT B
WHERE A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY SALES DESC, PRODUCT_CODE
