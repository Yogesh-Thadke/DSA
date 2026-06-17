# Write your MySQL query statement below
SELECT employee_id
FROM employees e
where salary < 30000 and
manager_id IS NOT NULL
AND NOT EXISTS (
    SELECT 1
    FROM employees m
    where m.employee_id = e.manager_id 
)
ORDER BY employee_id;