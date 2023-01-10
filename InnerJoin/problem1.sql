SELECT student.student_name, student.id 
FROM class INNER JOIN student 
ON class.id = student.class_title
WHERE class.teacher_name = student.student_name;

