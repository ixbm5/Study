
use School2;
create table teacher (
id int primary key,
name varchar(60)
);

create table studnt(
id int primary key ,
name varchar(60)
);

create table coruse (
id int primary key ,
name varchar(30),
teachd int,
foreign key (teachd) references teacher(id)
);


create table std_teachBy(
idstd int ,
idteach int,
primary key(idstd,idteach),
foreign key (idstd) references studnt(id),
foreign key (idteach) references teacher(id)
); 

create table enrol(
idstd int ,
idcor int,
primary key(idstd,idcor),
foreign key (idstd) references studnt(id),
foreign key (idcor) references coruse(id)
);

