-- 코드를 입력하세요
SELECT
    BOOK_ID, AUTHOR_NAME, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') AS PUBLISH_DATE
FROM
    BOOK A,
    AUTHOR B
WHERE A.AUTHOR_ID = B.AUTHOR_ID
    AND A.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE