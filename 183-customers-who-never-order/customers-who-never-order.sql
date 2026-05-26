# Write your MySQL query statement below
select name as Customers
from Customers c
left join orders o
ON c.id = o.customerid
where o.customerId is null