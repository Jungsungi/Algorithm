-- 코드를 작성해주세요

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPER_INFOS
WHERE
SKiLL_1 = 'Python' or skill_2 = 'Python' or skill_3 = 'Python'
order by id;