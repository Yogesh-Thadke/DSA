# Write your MySQL query statement below
DELETE 
FROM person 
WHERE (id,email) NOT IN (
    SELECT * 
    FROM(
        SELECT MIN(id),email
        FROM person 
        GROUP BY email
    )t
)