-- Display last occurence of given char in string

-- Take fullname and split into firstname and last name

-- Print all namesof Emp table in sentence case, means first char upper case and remaining lower case

-- In Word 'misissipi' count no.of i's 

-- Display all fridays of current month 


select length('aakash') - instr(reverse('aakash'),'a') + 1 as Last_Occurence;

select
	substring_index("Subhash Rao" , " ", 1) as First_Name,
    substring_index("Subhash Rao", " ", -1) as Last_Name;
    
use brillio;

select concat(upper(substring(ename,1,1)),lower(substring(ename,2)))from emp;

select length('misissipi') - length(replace('misissipi','i','')) as no_of_i;

-- -----------------------------------------------------------------
select last_day(curdate()); -- Provides last day of current month
select adddate(last_day(curdate()), interval -1 month); -- provides last date of previous month
select adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day); -- provides 1st day of current month

select dayofweek(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day)); -- provides what day the 1st day of month is

-- 1 is sunday, 2 is Mon... 6 is friday and 7 is saturday
-- First friday code
select adddate(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day),interval 6 - dayofweek(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day)) day )'First Friday';

-- select adddate(,interval 7 day); -- add first friday code here

select adddate(adddate(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day),interval 6 - dayofweek(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day)) day ),interval 7 day) 'Second Friday';

select adddate(adddate(adddate(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day),interval 6 - dayofweek(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day)) day ),interval 7 day), interval 7 day)'Third Friday';

select adddate(adddate(adddate(adddate(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day),interval 6 - dayofweek(adddate(adddate(last_day(curdate()), interval -1 month),interval 1 day)) day ),interval 7 day), interval 7 day), interval 7 day)'Forth Friday';