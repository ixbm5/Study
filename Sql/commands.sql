use school;
create table test 
select name,sex from sttd where gpa between 90 and 100;  -- copy info from another table
select * from sttd where name like '%l';  -- this will give all the name that end up with l a% and this will give the name that start a
select distinct  sex from sttd;  -- give without تكرار
select id as National_id from sttd; -- change the column name in the query
select name from sttd where id in(1,7,9); -- give whit in the in 
select name from sttd where gpa between 90 and 99 ;-- give what in ringe
-- ag Aggregate functions.
/*
select  Aggregate functions(column)
form table
where (cond)
*/

select min(gpa) -- or max or sum or avg any 
from sttd ;

select count(id)
from sttd
where gpa >90;

select upper(name)
from sttd;
