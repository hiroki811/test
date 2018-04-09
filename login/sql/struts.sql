set names utf8;
set foreign_key_checks = 0;
dorop database if exists logindb;
create database logindb;
use logindb;

ceate table user(
id int,
user_name varchar(255),
passqord varchar(255));

insert into user values
(1,"taro","123"),
(2."jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");