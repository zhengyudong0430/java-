create table sudent (
id int,
name varchar(20),
score decimal(3,1));
insert into student values (1,"曹操",90.5);
insert into student values(2,"孙权",88.9);
insert into student values (3,"诸葛亮",98);
delete from student where id = 1;
delete from student where name = "孙权";
delete from student where score = "98";
create table student (
id  int not null,
name varchar(20),
score decimal (3,1));
insert into student values (null,"曹操",90.7);
create table student (
id  int unique,
name varchar(20),
score decimal (3,1));
 create table student (
     id int unique not null,
 name varchar(20),
 score decimal (3,1));
drop table student;
create table student (
id  int not null unique,
name varchar(20) default "unknow",
score decimal (3,1));
insert into student (id,score)values (1,89);
create table student (
id  int primary key,
name varchar(20) default "unknow",
score decimal (3,1));
create table student (
id int primary  key auto_increment,
name varchar(20));
create table class(
   id int,
 name varchar(20));
create table student (
    id int primary key auto_increment,
      name varchar(20),classid int,foreign key (classid) references class(id)
);
create table user (
id int,
name varchar(20),
score decimal(3,1));
select sum(score) from user;
select avg(score) from user;
select  name,max(score) from user;
select name,min(score) from user;
select avg(score) from user where score<90;
