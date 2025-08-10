-- ONLINE_SALE 
-- 동일한 회원이 동일한 상품 재구매한 데이터
-- USER_ID PRODUCT_ID
-- 재구매한 회원 ID // USER_ID
--, 재구매한 상품 ID // PRODUCT_ID
-- 회원 ID 오름차순, 상품 ID 내림차순
SELECT
    USER_ID
    , PRODUCT_ID
FROM ( 
    SELECT
        USER_ID
        , PRODUCT_ID
        , COUNT(*) CNT
    FROM ONLINE_SALE
    GROUP BY USER_ID, PRODUCT_ID
)
WHERE CNT > 1
ORDER BY USER_ID ASC, PRODUCT_ID DESC;