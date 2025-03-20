select * from courses;
select * from faculty;
select * from course_faculty;
select * from batches;
select * from students;
select * from payments;
SET SQL_SAFE_UPDATES = 0;


-- Basic CRUD on data
 
-- Display details of courses taken by students who joined in the month of june, 2001.
 
select * from students
where  MONTH(dj) = 06 and year(dj) = 2001;

-- Delete the details of students who haven’t paid anything so far.

DELETE FROM students
WHERE rollno NOT IN (SELECT rollno FROM payments);

select * from students;

-- Display the details of course for which there are more than 3 batches
SELECT c.ccode, c.name, COUNT(b.bcode) AS numberOfBatches
FROM courses c
JOIN batches b ON c.ccode = b.ccode
GROUP BY c.ccode
HAVING COUNT(b.bcode) > 3;

-- Display the details of course that has highest number of batches.

SELECT c.ccode, c.name, COUNT(b.bcode) AS highest_batches
FROM courses c
JOIN batches b ON c.ccode = b.ccode
GROUP BY c.ccode, c.name
ORDER BY highest_batches DESC
LIMIT 1;

-- Change the ENDDATE of batch B8 to the ENDDATE of most recent batch.

UPDATE batches b1
JOIN (SELECT MAX(enddate) AS max_enddate FROM batches WHERE enddate IS NOT NULL) AS subquery
SET b1.enddate = subquery.max_enddate
WHERE b1.bcode = 'B008';

-- Display the details of students who haven’t paid total amount so far.

SELECT s.rollno, s.name, b.bcode, c.fee, SUM(p.amount) AS paid_amount
FROM students s
JOIN batches b ON s.bcode = b.bcode
JOIN courses c ON b.ccode = c.ccode
LEFT JOIN payments p ON s.rollno = p.rollno
GROUP BY s.rollno, s.name, b.bcode, c.fee
HAVING SUM(p.amount) < c.fee OR SUM(p.amount) IS NULL;

-- Display the details of payment made by students of Oracle batch started on 5-dec-2000.

SELECT s.rollno, s.name, p.amount, p.dp
FROM students s
JOIN batches b ON s.bcode = b.bcode
JOIN payments p ON s.rollno = p.rollno
WHERE b.stdate = '2000-12-05' AND b.ccode = (SELECT ccode FROM courses WHERE name = 'Oracle');

 
select count(*) from students;
-- Display ROLLNO of students who have paid for more than twice.
 
SELECT rollno,count(rollno)
FROM payments
GROUP BY rollno
HAVING COUNT(*) > 2;
-- Display average time taken for subject ORA.
 
SELECT AVG(TIMESTAMPDIFF(MONTH, b.stdate, b.enddate)) AS avg_time
FROM batches b
JOIN courses c ON b.ccode = c.ccode
WHERE c.name = 'java';
-- Display faculty who can take more than 2 courses.
 
SELECT f.faccode, f.name
FROM faculty f
JOIN course_faculty cf ON f.faccode = cf.faccode
GROUP BY f.faccode
HAVING COUNT(cf.ccode) > 2;

-- Display least course fee.

SELECT name, MIN(fee) AS least_fee
FROM courses
GROUP BY name
ORDER BY least_fee asc limit 1;

-- Display the number of months between first and last batches of course Java.

SELECT TIMESTAMPDIFF(MONTH, 
    (SELECT MIN(stdate) FROM batches WHERE ccode = (SELECT ccode FROM courses WHERE name = 'Java')),
    (SELECT MAX(enddate) FROM batches WHERE ccode = (SELECT ccode FROM courses WHERE name = 'Java'))
) AS months_between;

-- Display Year, course and number of batches of that course.

SELECT YEAR(b.stdate) AS year, c.name AS course_name, COUNT(b.bcode) AS batch_count
FROM batches b
JOIN courses c ON b.ccode = c.ccode
GROUP BY YEAR(b.stdate), c.name
order by year asc;

-- Display faculty who has got A grade for more than 1 subject.

SELECT f.faccode, name
FROM faculty f
JOIN course_faculty cf ON f.faccode = cf.faccode
WHERE cf.Grade = 'A'
GROUP BY f.faccode
HAVING COUNT(cf.ccode) > 1;

-- Display the number of students joined in each month.

SELECT MONTH(dj), count(*)
FROM students
GROUP BY MONTH(dj);

-- Display the number of students joined in each month of the current year.

SELECT * FROM students WHERE YEAR(dj) = YEAR(CURDATE());

SELECT MONTH(dj) AS join_month, COUNT(*) AS student_count
FROM students
WHERE YEAR(dj) = YEAR(CURDATE())
GROUP BY MONTH(dj);
 
