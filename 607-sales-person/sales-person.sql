# Write your MySQL query statement below
SELECT name
FROM salesperson sp
WHERE sales_id NOT IN(
    SELECT o.sales_id
    FROM orders o
    join company c
    ON o.com_id = c.com_id
    WHERE c.name = 'red'
)