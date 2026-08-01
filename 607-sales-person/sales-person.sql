# Write your MySQL query statement below
SELECT name
FROM salesperson sp
WHERE NOT EXISTS(
    SELECT o.sales_id
    FROM orders o
    join company c
    ON o.com_id = c.com_id
    WHERE c.name = 'red'
    AND sp.sales_id = o.sales_id
)