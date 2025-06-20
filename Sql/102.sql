-- project 102 sql
use school;
create table superStd -- table for the bast studnt
select  * from sttd
where gpa >= 90;

create table badStd -- talbe for faluers
select * from sttd 
where gpa <= 60;

select name from sttd where name like 'a%'; -- name start with a

select name from sttd where name like '____'; -- name with 4 latter

select avg(gpa) as avgGpa
from suprStd;

select name from suprStd  where leveel in(1,6) and gpa >=100; -- only the guns in level 1,6

select name from sttd where leveel = 1 and (year(curdate()) - year(barth)) in (15,16); -- showing the stud in lel 1 and age 15-16

select sum(id)
from sttd
where leveel = 2;

select distinct major from sttd;-- show the major without repting it

select upper(name)
from subj; -- show the names in upper case

select floor(avg(gpa))from sttd ; -- get the gpa and round it down

select replace(sex,'M','F') as newSex from sttd;
select replace(sex,'F','M') as newSex from sttd; -- change the gander

update sttd
set gpa = gpa +5 -- adding 5 marks for all the studnt that have less than 60
where gpa<=60;



