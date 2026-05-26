# Write your MySQL query statement
select Email
from person
group by email
having count(email) > 1