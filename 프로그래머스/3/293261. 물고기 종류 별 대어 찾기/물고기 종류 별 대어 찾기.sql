-- 코드를 작성해주세요

SELECT 
    ID, 
    FISH_NAME, 
    LENGTH
FROM(
    SELECT 
        ID, 
        A.FISH_TYPE, 
        A.LENGTH
    FROM
        (SELECT
                FISH_TYPE,
                MAX(LENGTH) AS LENGTH
            FROM FISH_INFO
            GROUP BY FISH_TYPE) A,
        FISH_INFO B
    WHERE A.FISH_TYPE = B.FISH_TYPE
        AND A.LENGTH = B.LENGTH) A,
    FISH_NAME_INFO B
WHERE A.FISH_TYPE = B.FISH_TYPE
ORDER BY ID