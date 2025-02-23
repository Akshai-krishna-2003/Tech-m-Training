CREATE DATABASE bmdb;
USE bmdb;

CREATE TABLE product (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);

INSERT INTO product (id, name, price, quantity) VALUES
(1, 'Laptop', 75000.00, 10),
(2, 'Mouse', 500.00, 50),
(3, 'Keyboard', 1500.00, 30),
(4, 'Monitor', 12000.00, 20),
(5, 'Headphones', 2000.00, 40);

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    salary INT,
    department VARCHAR(50)
);

INSERT INTO employee (emp_id, emp_name, salary, department) VALUES
(10, 'John Doe', 700000, 'HR'),
(11, 'Alice Smith', 750000, 'Finance'),
(12, 'Bob Johnson', 720000, 'IT'),
(13, 'Charlie Brown', 800000, 'Admin'),
(14, 'David Miller', 850000, 'Sales');

INSERT INTO employee (emp_id, emp_name, salary, department) VALUES (34, 'MCCA', 720000, 'AAA');
INSERT INTO employee (emp_id, emp_name, salary) VALUES (18, 'SP', 780000);

