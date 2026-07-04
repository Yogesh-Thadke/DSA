# Write your MySQL query statement below
SELECT user_id, COUNT(prompt) prompt_count, ROUND(AVG(tokens),2) avg_tokens
FROM prompts p
GROUP BY user_id
HAVING  COUNT(prompt) >= 3
AND AVG(tokens) < ANY (
    SELECT tokens
    FROM prompts s
    WHERE p.user_id = s.user_id
    )
ORDER BY AVG(tokens) DESC, user_id ASC