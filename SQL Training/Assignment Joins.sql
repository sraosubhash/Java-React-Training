-- Joins
 
-- Display rollno, student name, pay date and amount paid.

SELECT s.rollno, s.name, p.dp AS pay_date, p.amount
FROM students s
JOIN payments p ON s.rollno = p.rollno;

-- Display rollno, student name, batch code, stdate of batch and faculty code.

SELECT s.rollno, s.name, b.bcode, b.stdate, b.faccode
FROM students s
JOIN batches b ON s.bcode = b.bcode;

-- Display rollno, student name, course name, stdate of batch and faculty code.

SELECT s.rollno, s.name, c.name AS course_name, b.stdate, b.faccode
FROM students s
JOIN batches b ON s.bcode = b.bcode
JOIN courses c ON b.ccode = c.ccode;

-- Display rollno, student name, course name, faculty code and enddate of all batches that were completed.

SELECT s.rollno, s.name, c.name AS course_name, b.faccode, b.enddate
FROM students s
JOIN batches b ON s.bcode = b.bcode
JOIN courses c ON b.ccode = c.ccode
WHERE b.enddate IS NOT NULL;

-- Display students who have more number of characters in name than the student with roll number 10.

SELECT rollno, name
FROM students
WHERE LENGTH(name) > (SELECT LENGTH(name) FROM students WHERE rollno = 9);

--  Display rollno, student name, email, pay date and amount paid.

SELECT s.rollno, s.name, s.email, p.dp AS pay_date, p.amount
FROM students s
JOIN payments p ON s.rollno = p.rollno;

-- In previous query include the details of student who haven’t paid anything so far.

SELECT s.rollno, s.name, s.email, p.dp AS pay_date, p.amount
FROM students s
LEFT JOIN payments p ON s.rollno = p.rollno;

-- Display the details of students who have paid nothing so far.

SELECT s.rollno, s.name, s.email
FROM students s
LEFT JOIN payments p ON s.rollno = p.rollno
WHERE p.amount IS NULL;