--의사이름, 의사ID, 진료과, 고용일자
--DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
--진료과 = 흉부외과 OR 일반외과 MCDP_CD = 'CS' OR 'GS'
--정렬 : 고용일자 DESC, 이름 ASC
SELECT
    DR_NAME
    , DR_ID
    , MCDP_CD
    , TO_CHAR(HIRE_YMD, 'YYYY-MM-DD')
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME;