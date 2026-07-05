# Write your MySQL query statement below
SELECT product_id,
       year first_year,
       quantity,
       price
FROM Sales
where (product_id, year) IN (
    SELECT product_id, Min(year)
    FROM Sales
    GROUP BY product_id
) 