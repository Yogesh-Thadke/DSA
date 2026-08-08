# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
FROM Views v1
WHERE author_id IN (
    SELECT author_id
    FROM Views v2
    WHERE v1.author_id = v2.viewer_id
)
ORDER BY author_id ASC;