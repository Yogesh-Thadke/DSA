# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016),2) tiv_2016
FROM Insurance i1
WHERE NOT EXISTS (
    SELECT 1
    FROM Insurance i2
    WHERE i2.lat = i1.lat
    AND i2.lon = i1.lon
    AND i2.pid != i1.pid
)
AND EXISTS (
    SELECT 1
    FROM Insurance i2
    WHERE i2.tiv_2015 = i1.tiv_2015
    AND i2.pid != i1.pid
)