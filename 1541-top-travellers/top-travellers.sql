# Write your MySQL query statement below
SELECT u.name, COALESCE(SUM(r.distance),0) AS travelled_distance
FROM users u
left join rides r
on u.id = r.user_id
GROUP BY u.name, u.id
ORDER BY SUM(r.distance) DESC, u.name;