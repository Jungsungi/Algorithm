-- 코드를 입력하세요
SELECT
    ANIMAL_ID, NAME
FROM ANIMAL_OUTS
MINUS
SELECT
    ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID