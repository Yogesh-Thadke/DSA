SELECT query_name, ROUND(AVG(quality_check),2) AS quality,
ROUND((SUM(rating<3)*100 / COUNT(rating)),2) AS poor_query_percentage
FROM(
    SELECT *, (rating/position) AS quality_check
    FROM Queries
) t
GROUP BY query_name;
