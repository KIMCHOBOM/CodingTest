--PATIENT 
--환자이름, 환자번호, 성별코드, 나이, 전화번호
--PT_NAME, PT_NO, GEND_CD, AGE, TLNO
--전화번호 = NULL -> NONE
--12세 이하인 여자환자 AGE <= 12 GEND_CD = 'W'
--정렬 : 나이 DESC, 환자이름
SELECT
    PT_NAME
    , PT_NO
    , GEND_CD
    , AGE
    , NVL(TLNO, 'NONE')
FROM PATIENT
WHERE AGE <= 12
AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC;