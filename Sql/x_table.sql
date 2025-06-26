use x ;
create table users (
userid  varchar(50) primary key ,
name varchar(50),
email varchar (100) unique,
password varchar (100) check(CHAR_LENGTH(password )>= 8),
create_at date default (current_date)
);

create table profil(
profid int primary key ,
users varchar(50),
location varchar(100),
bio varchar(255),
foreign key(users) references users(userid)
);

create table tweets (
tweetid int primary key,
tweet varchar(255),
userid varchar(50) ,
post_at date default (current_date),
foreign key (userid) references users(userid)
);

create table likes (
idlike int primary key,
tweet int,
userid varchar(50),
foreign key (tweet) references tweets(tweetid),
foreign key (userid) references users(userid)
);

create table follow(
followid varchar(50) ,
followingid varchar(50),
primary key(followid,followingid),
foreign key (followid) references users(userid),
foreign key (followingid) references users(userid)
);


