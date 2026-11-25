# Write your MySQL query statement below
with temp AS(
    select *, rank() over(partition by customer_id order by order_date) as rnk,
        case 
        when datediff(order_date, customer_pref_delivery_date) = 0 then 1
        else 0
        end AS immediate
    from delivery
)

select (SUM(immediate) / count(immediate)) * 100 AS immediate_percentage 
from temp
where rnk = 1;