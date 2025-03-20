use brillio;

show tables;

-- Info on EMP table

desc emp;

select * from emp;


select empno, ename, job, sal
from emp;


-- where clause

select * from emp where empno = 7839;
select * from emp where job = 'Manager';

-- between.. and :

select * from emp where sal between 1000 and 3000;
select * from emp where sal not between 1000 and 3000;

-- In clause

select * from emp where job in ('clerk', 'analyst');

select * from emp where ename like '%s';
select * from emp where ename like '______%';

-- order by

select * from emp order by ename;

select ename, job, sal from emp
order by job, sal;

select * from emp order by ename desc;

select distinct job from emp;

select empno, ename,job,sal,
case job
	when 'clerk' then 'Anoop'
    when 'salesman' then 'Swetha'
    when 'manager' then 'Naveen'
    when 'analyst' then 'Manoj'
    when 'president' then 'No Manager'
end 'Reporting Auth'
from emp;

-- Handalin null at runtime

select empno, ename, job, sal, comm,
case 
when comm is null then 0
else comm
end 'Comision' ,
case
	when comm is null then sal
    else sal+comm
end'TakeHome'
from emp;
