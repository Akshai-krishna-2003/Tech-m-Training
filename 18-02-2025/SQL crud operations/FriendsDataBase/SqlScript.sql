create database practice1;

use practice1;

create table friends(
	sno int primary key,
    fname varchar(25) not null,
    lname varchar(25) not null,
    city varchar(25),
    phno varchar(12)
);

INSERT INTO friends (sno, fname, lname, city, phno) 
VALUES (1, 'Amit', 'Sharma', 'Delhi', '9876543210');

INSERT INTO friends (sno, fname, lname, city, phno) 
VALUES (2, 'Priya', 'Verma', 'Mumbai', '9823456789');

INSERT INTO friends (sno, fname, lname, city, phno) 
VALUES (3, 'Rahul', 'Gupta', 'Bangalore', '9765432101');

INSERT INTO friends (sno, fname, lname, city, phno) 
VALUES (4, 'Sneha', 'Patil', 'Pune', '9856743210');

INSERT INTO friends (sno, fname, lname, city, phno) 
VALUES (5, 'Vikram', 'Singh', 'Chennai', '9845671234');
