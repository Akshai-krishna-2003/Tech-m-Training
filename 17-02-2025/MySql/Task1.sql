-- create database practice1;
use practice1;

CREATE TABLE Friends(
	friendNo int primary key,
    fName varchar(25) not null,
    lName varchar(25) not null,
    city varchar(25) not null
);

insert into Friends 
values (1, "Akshai","Krishna","Arakkonam");

select * from Friends;