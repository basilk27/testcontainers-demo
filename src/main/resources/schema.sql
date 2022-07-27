DROP TABLE IF EXISTS customers;
CREATE TABLE customers(id serial not null primary key, first_name VARCHAR(60), last_name VARCHAR(60));
insert into customers (first_name, last_name) values ('trisha', 'gee');
insert into customers (first_name, last_name) values ('marco', 'behler');