# Write your MySQL query statement below
SELECT c.name Customers
FROM customers c
LEFT JOIN Orders o
ON c.id = o.customerId
WHERE O.id IS NULL;