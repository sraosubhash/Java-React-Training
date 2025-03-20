-- String Functions
-- intsr() Used to display first occurrence of given char

select instr('hello','l');

-- length() : Display length of string

select length('Subhash');

-- 
Select ename, length(ename) as Name_Length from emp;

-- reverse() display string in reverse order
select reverse('hello');

--
select ename, reverse(ename) as Reverse_Name from emp;

select lower('HElLO'), upper('HElLO');

select left('Hello',4);
Select right('Hello',3);

select concat('Hello', ' ','world','!') as concatinate;

select replace("Java Training!","Java","SQL") as Training;

