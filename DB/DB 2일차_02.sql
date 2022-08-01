drop database if exists green;
create database if not exists green;
use green;

create table student(
	num int default 0, -- dafault는 생략 가능
    name char(6) default '',
    primary key(num) -- primary key(속성명)을 통해 기본키를 지정
);
