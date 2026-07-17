# Write your MySQL query statement below
SELECT ROUND(count(DISTINCT a.player_id)/(
    select COUNT(distinct player_id)
    from activity
),2) fraction
FROM activity a
INNER JOIN (
    SELECT player_id,MIN(event_date) first_login
    FROM activity
    GROUP BY player_id
) t
ON a.player_id = t.player_id 
AND t.first_login = DATE_SUB(a.event_date, INTERVAL 1 DAY) 

