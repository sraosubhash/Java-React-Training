select ename from emp
where sal in (select max(sal)
              from emp);
              
select ename from emp where sal in (select max(sal)from emp where sal < (select max(sal)from emp));
						
                        
-- inner query
select ed.empno,ed.name,ed.dept,ed.basic
from(select empno,name,dept,basic,length(name)-length(replace(name,' ','')) 'space'
from employ) ed
where ed.space=2;

select empno,name,dept,basic,length(name)-length(replace(name,' ','')) 'space'
from employ


select Ad.agentid, Ad.firstname, Ad.lastname,
Pd.policyid, Pd.appnumber, Pd.modalPremium, Pd.annualpremium
from
(select agentid, firstname, lastname, city, state,
case maritalstatus
when 0 then 'Married'
when 1 then 'UnMarried'
end 'MS'
from Agent)Ad,
(select policyid, appnumber, modalpremium, annualpremium
from policy)Pd
where Ad.ms='Married';

select empno, ename, job, sal,
row_number() over(order by sal desc) rno from emp;

select empno, ename, job, sal,
rank() over(order by sal desc) rno from emp;

select empno, ename, job, sal,
dense_rank() over(order by sal desc) rno from emp;



