-- SQL date function

-- curDate() -> Returns current date

select curdate();

select curtime();

select dayofweek(curDate());
select dayofmonth(curdate());
select day(curdate());

select quarter(curdate());

-- last_day() Displays the last day of date of the month spec

select last_day(curDate());

-- adddate() : Used to add number of days

select adddate(curdate(), interval 5 day);