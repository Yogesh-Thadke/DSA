# Write your MySQL query statement below
SELECT product_id, new_price AS price
FROM(    
    SELECT product_id, new_price, 
    DENSE_RANK() OVER(PARTITION BY product_id ORDER BY change_date DESC) AS rnk
    FROM Products
    WHERE change_date <= "2019-08-16"
)t
WHERE rnk = 1

UNION

SELECT product_id, 10 AS price
FROM products
WHERE product_id NOT IN(
    SELECT product_id
    FROM products
    WHERE change_date <= "2019-08-16"
);