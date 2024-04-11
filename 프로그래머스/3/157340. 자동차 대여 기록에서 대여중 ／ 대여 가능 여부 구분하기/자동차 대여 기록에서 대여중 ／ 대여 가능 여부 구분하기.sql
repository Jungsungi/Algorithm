-- 코드를 입력하세요
SELECT
    B.CAR_ID,
    CASE WHEN
        A.END_DATE >= TO_DATE('2022-10-16', 'YYYY-MM-DD')
    THEN
        '대여중'
    ELSE
        '대여 가능'
    END
    AS AVAILABLITY
FROM
    (
        SELECT
            CAR_ID,
            MAX(START_DATE) AS START_DATE,
            MIN(END_DATE) AS END_DATE
        FROM 
            CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE 
            START_DATE <= TO_DATE('2022-10-16', 'YYYY-MM-DD')
            AND END_DATE >= TO_DATE('2022-10-16', 'YYYY-MM-DD')
        GROUP BY CAR_ID)A,
    (
        SELECT
            DISTINCT CAR_ID
        FROM
            CAR_RENTAL_COMPANY_RENTAL_HISTORY) B
WHERE B.CAR_ID = A.CAR_ID(+)
ORDER BY CAR_ID DESC ;
