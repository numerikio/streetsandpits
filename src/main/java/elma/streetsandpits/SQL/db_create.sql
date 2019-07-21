CREATE DATABASE streetsandpits;

USE streetsandpits;

CREATE TABLE streets (
id INT AUTO_INCREMENT NOT NULL,
name VARCHAR(250) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE pits (
id INT AUTO_INCREMENT NOT NULL,
street_id INT NOT NULL,
primary KEY (id),
FOREIGN KEY (street_id) REFERENCES streets(id) 
);