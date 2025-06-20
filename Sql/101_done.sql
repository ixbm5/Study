use school;
select * from stud;
select * from tech;
select * from subj;
-- for printing all the rows and columns

select * from stud order by name ASC; -- for asc order 

update stud -- edit rendom studnt and i have change his email
set emil = "hi@gamil.com"
where id = 20;

update tech -- edit number of the oface in the tucher table
set ofacce = 600
where id = 1;

alter table stud rename to sttd -- change stud name to sttd