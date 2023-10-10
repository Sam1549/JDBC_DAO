

create table customers(
id serial primary key ,
name varchar(30),
surname varchar(30),
age int,
phone_number varchar(11)
);

create table orders(
id serial primary key,
date date,
customer_id int,
constraint fk_customer
foreign key (customer_id)
references customers (id),
product_name varchar,
amount int
);