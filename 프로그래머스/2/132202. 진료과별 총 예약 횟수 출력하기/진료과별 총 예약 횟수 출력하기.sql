-- 코드를 입력하세요
SELECT
        MCDP_CD AS "진료과코드" ,
        count(mcdp_cd) AS "5월예약건수"
FROM
    APPOINTMENT
WHERE
    TO_CHAR(APNT_YMD, 'YYYY-MM-DD') LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD), MCDP_CD;