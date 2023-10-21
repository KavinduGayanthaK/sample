DROP DATABASE IF EXISTS sample;

CREATE DATABASE IF NOT EXISTS sample;

USE sample;

CREATE TABLE customer (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(150) NOT NULL ,
    address varchar(150) NOT NULL ,
    number varchar(150) NOT NULL,
    PRIMARY KEY (id)
);