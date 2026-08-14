# Write your MySQL query statement below
SELECT st.student_id, st.student_name, s.subject_name, 
count(e.student_id) AS attended_exams
FROM students st
CROSS JOIN subjects s
LEFT JOIN examinations e
ON e.student_id = st.student_id
AND e.subject_name = s.subject_name
group by student_id ,student_name, subject_name
ORDER BY student_id , subject_name