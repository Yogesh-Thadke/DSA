# Write your MySQL query statement below
SELECT DISTINCT(a.num) ConsecutiveNums
FROM logs a
join logs b
ON a.id = b.id-1
join logs c
ON b.id = c.id-1
WHERE a.num = b.num
AND b.num = c.num
