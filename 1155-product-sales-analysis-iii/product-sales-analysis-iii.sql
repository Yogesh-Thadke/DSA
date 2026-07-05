# Write your MySQL query statement below
SELECT s.product_id, 
       s.year first_year, 
       s.quantity, 
       s.price
FROM Sales s
JOIN (
    SELECT product_id, MIN(year) min_year
    FROM Sales 
    GROUP BY product_id
) p
ON s.product_id = p.product_id
AND s.year = p.min_year