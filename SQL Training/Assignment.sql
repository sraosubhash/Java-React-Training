create database sample_tables;
use sample_tables;
-- drop database if exists courses;
create table courses(
ccode varchar(5) primary key,
name varchar(30) ,
duration numeric(3) not null,
fee numeric(5) not null,
prerequisite varchar(100));
create table faculty(
faccode varchar(5) primary key,
name varchar(30) ,
qual varchar(30),
exp varchar(100) );
create table course_faculty (
faccode varchar(5) ,
ccode varchar(5) ,
Grade varchar(1) not null,
foreign key(faccode) references faculty(faccode),
foreign key(ccode) references courses(ccode),
primary key(faccode,ccode));
create table batches(
bcode varchar(5) primary key,
ccode varchar(5) ,
faccode varchar(5) ,
stdate date not null,
enddate date,
timing numeric(1) not null,
foreign key(ccode) references courses(ccode),
foreign key(faccode) references faculty(faccode));

drop table if exists students;
create table students(
rollno numeric(5)  primary key,
bcode varchar(5) ,
name varchar(30),
gender varchar(1) not null,
dj date,
phone varchar(10) ,
email varchar(40),
foreign key(bcode) references batches(bcode));
create table payments(
rollno numeric(5) ,
dp date,
amount numeric(5) check (amount>=25));

INSERT INTO courses (ccode, name, duration, fee, prerequisite) VALUES
('ORA', 'Oracle', 60, 1500, 'Basic SQL'),
('JAV', 'Java', 90, 2000, 'OOP Concepts'),
('PYT', 'Python', 45, 1800, 'Basic Programming'),
('DBA', 'Database Admin', 60, 2500, 'SQL'),
('WEB', 'Web Development', 120, 3000, 'HTML & CSS');

INSERT INTO faculty (faccode, name, qual, exp) VALUES
('FAC1', 'Alice', 'MCA', '5 years in DBMS'),
('FAC2', 'Bob', 'BTech', '8 years in Java'),
('FAC3', 'Carol', 'MSc', '3 years in Python'),
('FAC4', 'Dave', 'BSc', '4 years in Web Development');

INSERT INTO course_faculty (faccode, ccode, grade) VALUES
('FAC1', 'ORA', 'A'),
('FAC2', 'JAV', 'B'),
('FAC3', 'PYT', 'A'),
('FAC1', 'DBA', 'A'),
('FAC4', 'WEB', 'B'),
('FAC2', 'ORA', 'A');
INSERT INTO course_faculty (faccode, ccode, grade) VALUES
('FAC1', 'JAV', 'A'),  
('FAC1', 'PYT', 'B');  

INSERT INTO batches (bcode, ccode, faccode, stdate, enddate, timing) VALUES
('B1', 'ORA', 'FAC1', '2000-12-05', '2001-03-05', 1),
('B2', 'JAV', 'FAC2', '2000-01-10', '2000-04-10', 2),
('B3', 'JAV', 'FAC2', '2001-06-01', '2001-09-01', 2),
('B4', 'DBA', 'FAC1', '2001-06-10', '2001-09-10', 1),
('B5', 'PYT', 'FAC3', '2001-06-20', '2001-09-20', 1),
('B6', 'WEB', 'FAC4', '2001-06-25', '2001-09-25', 1),
('B7', 'ORA', 'FAC2', '2001-07-01', '2001-10-01', 1),
('B8', 'ORA', 'FAC1', '2001-08-01', '2001-11-01', 2);
INSERT INTO batches (bcode, ccode, faccode, stdate, enddate, timing) VALUES
('B9', 'ORA', 'FAC1', '2001-09-01', '2001-12-01', 1),
('B10', 'ORA', 'FAC1', '2001-10-01', '2002-01-01', 1),
('B11', 'ORA', 'FAC1', '2001-11-01', '2002-02-01', 1);

INSERT INTO students (rollno, bcode, name, gender, dj, phone, email) VALUES
(1, 'B1', 'John', 'M', '2001-06-10', '9876543210', 'john@example.com'),
(2, 'B1', 'Jane', 'F', '2001-06-15', '9123456789', 'jane@example.com'),
(3, 'B2', 'Mike', 'M', '2001-06-20', '9123456788', 'mike@example.com'),
(4, 'B3', 'Sara', 'F', '2001-06-05', '9123456787', 'sara@example.com'),
(5, 'B3', 'Tom', 'M', '2001-06-15', '9123456786', 'tom@example.com'),
(6, 'B4', 'Emma', 'F', '2001-07-01', '9123456785', 'emma@example.com'),
(7, 'B5', 'Alex', 'M', '2001-06-18', '9123456784', 'alex@example.com'),
(8, 'B6', 'Sophia', 'F', '2001-06-25', '9123456783', 'sophia@example.com'),
(9, 'B7', 'Chris', 'M', '2001-07-10', '9123456782', 'chris@example.com');
INSERT INTO students (rollno, bcode, name, gender, dj, phone, email) 
VALUES 
(10, 'B1', 'Alice', 'F', '2025-01-15', '1234567890', 'alice@email.com'),
(11, 'B2', 'Bob', 'M', '2025-02-10', '2345678901', 'bob@email.com');

INSERT INTO payments (rollno, dp, amount) VALUES
(1, '2001-07-01', 1000),
(2, '2001-08-01', 1500),
(3, '2001-09-01', 500),
(4, '2001-09-01', 2000),
(5, '2001-09-15', 1800),
(7, '2001-10-01', 1800),
(8, '2001-11-01', 3000),
(9, '2001-12-01', 3000);
INSERT INTO payments (rollno, dp, amount) VALUES
(1, '2001-09-01', 500),
(1, '2001-10-01', 500);


 
 
