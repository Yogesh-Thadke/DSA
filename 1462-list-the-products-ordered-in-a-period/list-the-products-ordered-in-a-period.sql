# Write your MySQL query statement below
SELECT products.product_name, SUM(orders.unit) AS unit
FROM orders
JOIN products
ON orders.product_id = products.product_id
WHERE order_date >= '2020-02-01' AND order_date < '2020-03-01'
GROUP BY products.product_name
HAVING SUM(orders.unit) >= 100