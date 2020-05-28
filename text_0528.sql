create table emp(
id int primary key auto_increment,
name varchar(20),
role varchar(20),
salary decimal(7,1));
insert into emp values 
(null,"曹操","教师",870);
create table classes (id int primary key auto_increment, name varchar(20), `desc` varchar(100));

create table student (id int primary key auto_increment, sn varchar(20),  name varchar(20), qq_mail varchar(20) ,
        classes_id int);

create table course(id int primary key auto_increment, name varchar(20));

create table score(score decimal(3, 1), student_id int, course_id int);

insert into classes(name, `desc`) values 
('计算机系2019级1班', '学习了计算机原理、C和Java语言、数据结构和算法'),
('中文系2019级3班','学习了中国传统文学'),
('自动化2019级5班','学习了机械自动化');

insert into student(sn, name, qq_mail, classes_id) values
('09982','黑旋风李逵','xuanfeng@qq.com',1),
('00835','菩提老祖',null,1),
('00391','白素贞',null,1),
('00031','许仙','xuxian@qq.com',1),
('00054','不想毕业',null,1),
('51234','好好说话','say@qq.com',2),
('83223','tellme',null,2),
('09527','老外学中文','foreigner@qq.com',2);

insert into course(name) values
('Java'),('中国传统文化'),('计算机原理'),('语文'),('高阶数学'),('英文');

insert into score(score, student_id, course_id) values

(70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6),

(60, 2, 1),(59.5, 2, 5),

(33, 3, 1),(68, 3, 3),(99, 3, 5),

(67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6),

(81, 5, 1),(37, 5, 5),

(56, 6, 2),(43, 6, 4),(79, 6, 6),

(80, 7, 2),(92, 7, 6);

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| java16_0527        |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| world              |
+--------------------+
7 rows in set (0.03 sec)

mysql> drop database java16_0527;
Query OK, 1 row affected (0.23 sec)

mysql> create database java16_0528;
Query OK, 1 row affected (0.01 sec)

mysql> create  java16_0528;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'java16_0528' at line 1
mysql> use  java16_0528;
Database changed
mysql> create table emp(
    -> id int primary key auto_increment,
    -> name varchar(20),
    -> role varchar(20),
    -> salary decimal(7,1));
Query OK, 0 rows affected (0.11 sec)

mysql> insert into emp values
    -> (null,"曹操","教师",870);
Query OK, 1 row affected (0.02 sec)

mysql> (null,"曹操1","教师",830);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'null,"曹操1","教师",830)' at line 1
mysql> insert into emp values (null,"曹操1","教师",830);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values
    -> (null,"曹操2","教师",370);
Query OK, 1 row affected (0.00 sec)

mysql> insert into emp values
    -> (null,"孙权","班主任",370);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values
    -> (null,"孙权1","班主任",470);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values
    -> (null,"孙权2","班主任",270);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values
    -> (null,"诸葛亮","市场",570);
Query OK, 1 row affected (0.00 sec)

mysql> insert into emp values
    -> (null,"诸葛亮1","市场",470);
Query OK, 1 row affected (0.01 sec)

mysql> insert into emp values
    -> (null,"诸葛亮2","市场",670);
Query OK, 1 row affected (0.01 sec)

mysql> select role from emp group by role;
+--------+
| role   |
+--------+
| 市场   |
| 教师   |
| 班主任 |
+--------+
3 rows in set (0.01 sec)

mysql> select role ,avg(salary)from emp group by role;
+--------+-------------+
| role   | avg(salary) |
+--------+-------------+
| 市场   |   570.00000 |
| 教师   |   690.00000 |
| 班主任 |   370.00000 |
+--------+-------------+
3 rows in set (0.01 sec)

mysql> select role ,max(salary)from emp group by role;
+--------+-------------+
| role   | max(salary) |
+--------+-------------+
| 市场   |       670.0 |
| 教师   |       870.0 |
| 班主任 |       470.0 |
+--------+-------------+
3 rows in set (0.00 sec)

mysql> select role ,min(salary)from emp group by role;
+--------+-------------+
| role   | min(salary) |
+--------+-------------+
| 市场   |       470.0 |
| 教师   |       370.0 |
| 班主任 |       270.0 |
+--------+-------------+
3 rows in set (0.02 sec)

mysql> select role ,avg(salary)from emp group by role having avg(salary)>500;
+------+-------------+
| role | avg(salary) |
+------+-------------+
| 市场 |   570.00000 |
| 教师 |   690.00000 |
+------+-------------+
2 rows in set (0.01 sec)

mysql> create table classes (id int primary key auto_increment, name varchar(20), `desc` varchar(100));create table student (id int primary key auto_increment, sn varchar(20),  name varchar(20), qq_mail varchar(20) ,        classes_id int);create table course(id int primary key auto_increment, name varchar(20));create table score(score decimal(3, 1), student_id int, course_id int);insert into classes(name, `desc`) values ('计算机系2019级1班', '学习了计算机原理、C和Java语言、数据结构和算法'),('中文系2019级3班','学习了中国传统文学'),('自动化2019级5班','学习了机械自动化');insert into student(sn, name, qq_mail, classes_id) values('09982','黑旋风李逵','xuanfeng@qq.com',1),('00835','菩提老祖',null,1),('00391','白素贞',null,1),('00031','许仙','xuxian@qq.com',1),('00054','不想毕业',null,1),('51234','好好说话','say@qq.com',2),('83223','tellme',null,2),('09527','老外学中文','foreigner@qq.com',2);insert into course(name) values('Java'),('中国传统文化'),('计算机原理'),('语文'),('高阶数学'),('英文');insert into score(score, student_id, course_id) values-- 黑旋风李逵(70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6),-- 菩提老祖(60, 2, 1),(59.5, 2, 5),-- 白素贞(33, 3, 1),(68, 3, 3),(99, 3, 5),-- 许仙(67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6),-- 不想毕业(81, 5, 1),(37, 5, 5),-- 好好说话(56, 6, 2),(43, 6, 4),(79, 6, 6),-- tellme(80, 7, 2),(92, 7, 6);
Query OK, 0 rows affected (0.05 sec)

Query OK, 0 rows affected (0.07 sec)

Query OK, 0 rows affected (0.07 sec)

Query OK, 0 rows affected (0.06 sec)

Query OK, 3 rows affected (0.01 sec)
Records: 3  Duplicates: 0  Warnings: 0

Query OK, 8 rows affected (0.03 sec)
Records: 8  Duplicates: 0  Warnings: 0

Query OK, 6 rows affected (0.02 sec)
Records: 6  Duplicates: 0  Warnings: 0

    -> ;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> show tables;
+-----------------------+
| Tables_in_java16_0528 |
+-----------------------+
| classes               |
| course                |
| emp                   |
| score                 |
| student               |
+-----------------------+
5 rows in set (0.00 sec)

mysql> select *from classes;
+----+-------------------+-----------------------------------------------+
| id | name              | desc                                          |
+----+-------------------+-----------------------------------------------+
|  1 | 计算机系2019级1班 | 学习了计算机原理、C和Java语言、数据结构和算法 |
|  2 | 中文系2019级3班   | 学习了中国传统文学                            |
|  3 | 自动化2019级5班   | 学习了机械自动化                              |
+----+-------------------+-----------------------------------------------+
3 rows in set (0.00 sec)

mysql> select *from course;
+----+--------------+
| id | name         |
+----+--------------+
|  1 | Java         |
|  2 | 中国传统文化 |
|  3 | 计算机原理   |
|  4 | 语文         |
|  5 | 高阶数学     |
|  6 | 英文         |
+----+--------------+
6 rows in set (0.01 sec)

mysql> select *from score;
Empty set (0.01 sec)

mysql> select *from student;
+----+-------+------------+------------------+------------+
| id | sn    | name       | qq_mail          | classes_id |
+----+-------+------------+------------------+------------+
|  1 | 09982 | 黑旋风李逵 | xuanfeng@qq.com  |          1 |
|  2 | 00835 | 菩提老祖   | NULL             |          1 |
|  3 | 00391 | 白素贞     | NULL             |          1 |
|  4 | 00031 | 许仙       | xuxian@qq.com    |          1 |
|  5 | 00054 | 不想毕业   | NULL             |          1 |
|  6 | 51234 | 好好说话   | say@qq.com       |          2 |
|  7 | 83223 | tellme     | NULL             |          2 |
|  8 | 09527 | 老外学中文 | foreigner@qq.com |          2 |
+----+-------+------------+------------------+------------+
8 rows in set (0.02 sec)

mysql> sert into score(score, student_id, course_id) values
    -> -- 黑旋风李逵
    -> (70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6),
    -> -- 菩提老祖
    -> (60, 2, 1),(59.5, 2, 5),
    -> -- 白素贞
    -> (33, 3, 1),(68, 3, 3),(99, 3, 5),
    -> -- 许仙
    -> (67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6),
    -> -- 不想毕业
    -> (81, 5, 1),(37, 5, 5),
    -> -- 好好说话
    -> (56, 6, 2),(43, 6, 4),(79, 6, 6),
    -> -- tellme
    -> (80, 7, 2),(92, 7, 6);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'sert into score(score, student_id, course_id) values

(70.5, 1, 1),(98.5, 1, 3),' at line 1
mysql> insert into score(score, student_id, course_id) values(70.5, 1, 1),(98.5, 1, 3),(33, 1, 5),(98, 1, 6),(60, 2, 1),(59.5, 2, 5),(33, 3, 1),(68, 3, 3),(99, 3, 5),(67, 4, 1),(23, 4, 3),(56, 4, 5),(72, 4, 6),(81, 5, 1),(37, 5, 5),(56, 6, 2),(43, 6, 4),(79, 6, 6),(80, 7, 2),(92, 7, 6);
Query OK, 20 rows affected (0.01 sec)
Records: 20  Duplicates: 0  Warnings: 0

mysql> select *from score;
+-------+------------+-----------+
| score | student_id | course_id |
+-------+------------+-----------+
|  70.5 |          1 |         1 |
|  98.5 |          1 |         3 |
|  33.0 |          1 |         5 |
|  98.0 |          1 |         6 |
|  60.0 |          2 |         1 |
|  59.5 |          2 |         5 |
|  33.0 |          3 |         1 |
|  68.0 |          3 |         3 |
|  99.0 |          3 |         5 |
|  67.0 |          4 |         1 |
|  23.0 |          4 |         3 |
|  56.0 |          4 |         5 |
|  72.0 |          4 |         6 |
|  81.0 |          5 |         1 |
|  37.0 |          5 |         5 |
|  56.0 |          6 |         2 |
|  43.0 |          6 |         4 |
|  79.0 |          6 |         6 |
|  80.0 |          7 |         2 |
|  92.0 |          7 |         6 |
+-------+------------+-----------+
20 rows in set (0.00 sec)

mysql> show table;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> show tables;
+-----------------------+
| Tables_in_java16_0528 |
+-----------------------+
| classes               |
| course                |
| emp                   |
| score                 |
| student               |
+-----------------------+
5 rows in set (0.00 sec)

mysql> select *from classes;
+----+-------------------+-----------------------------------------------+
| id | name              | desc                                          |
+----+-------------------+-----------------------------------------------+
|  1 | 计算机系2019级1班 | 学习了计算机原理、C和Java语言、数据结构和算法 |
|  2 | 中文系2019级3班   | 学习了中国传统文学                            |
|  3 | 自动化2019级5班   | 学习了机械自动化                              |
+----+-------------------+-----------------------------------------------+
3 rows in set (0.00 sec)

mysql> select *from course;
+----+--------------+
| id | name         |
+----+--------------+
|  1 | Java         |
|  2 | 中国传统文化 |
|  3 | 计算机原理   |
|  4 | 语文         |
|  5 | 高阶数学     |
|  6 | 英文         |
+----+--------------+
6 rows in set (0.00 sec)

mysql> select *from score;
+-------+------------+-----------+
| score | student_id | course_id |
+-------+------------+-----------+
|  70.5 |          1 |         1 |
|  98.5 |          1 |         3 |
|  33.0 |          1 |         5 |
|  98.0 |          1 |         6 |
|  60.0 |          2 |         1 |
|  59.5 |          2 |         5 |
|  33.0 |          3 |         1 |
|  68.0 |          3 |         3 |
|  99.0 |          3 |         5 |
|  67.0 |          4 |         1 |
|  23.0 |          4 |         3 |
|  56.0 |          4 |         5 |
|  72.0 |          4 |         6 |
|  81.0 |          5 |         1 |
|  37.0 |          5 |         5 |
|  56.0 |          6 |         2 |
|  43.0 |          6 |         4 |
|  79.0 |          6 |         6 |
|  80.0 |          7 |         2 |
|  92.0 |          7 |         6 |
+-------+------------+-----------+
20 rows in set (0.00 sec)

mysql> select *from student;
+----+-------+------------+------------------+------------+
| id | sn    | name       | qq_mail          | classes_id |
+----+-------+------------+------------------+------------+
|  1 | 09982 | 黑旋风李逵 | xuanfeng@qq.com  |          1 |
|  2 | 00835 | 菩提老祖   | NULL             |          1 |
|  3 | 00391 | 白素贞     | NULL             |          1 |
|  4 | 00031 | 许仙       | xuxian@qq.com    |          1 |
|  5 | 00054 | 不想毕业   | NULL             |          1 |
|  6 | 51234 | 好好说话   | say@qq.com       |          2 |
|  7 | 83223 | tellme     | NULL             |          2 |
|  8 | 09527 | 老外学中文 | foreigner@qq.com |          2 |
+----+-------+------------+------------------+------------+
8 rows in set (0.00 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  2 | 菩提老祖   |          1 |  70.5 |
|  3 | 白素贞     |          1 |  70.5 |
|  4 | 许仙       |          1 |  70.5 |
|  5 | 不想毕业   |          1 |  70.5 |
|  6 | 好好说话   |          1 |  70.5 |
|  7 | tellme     |          1 |  70.5 |
|  8 | 老外学中文 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  2 | 菩提老祖   |          1 |  98.5 |
|  3 | 白素贞     |          1 |  98.5 |
|  4 | 许仙       |          1 |  98.5 |
|  5 | 不想毕业   |          1 |  98.5 |
|  6 | 好好说话   |          1 |  98.5 |
|  7 | tellme     |          1 |  98.5 |
|  8 | 老外学中文 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  2 | 菩提老祖   |          1 |  33.0 |
|  3 | 白素贞     |          1 |  33.0 |
|  4 | 许仙       |          1 |  33.0 |
|  5 | 不想毕业   |          1 |  33.0 |
|  6 | 好好说话   |          1 |  33.0 |
|  7 | tellme     |          1 |  33.0 |
|  8 | 老外学中文 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          1 |  98.0 |
|  3 | 白素贞     |          1 |  98.0 |
|  4 | 许仙       |          1 |  98.0 |
|  5 | 不想毕业   |          1 |  98.0 |
|  6 | 好好说话   |          1 |  98.0 |
|  7 | tellme     |          1 |  98.0 |
|  8 | 老外学中文 |          1 |  98.0 |
|  1 | 黑旋风李逵 |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  3 | 白素贞     |          2 |  60.0 |
|  4 | 许仙       |          2 |  60.0 |
|  5 | 不想毕业   |          2 |  60.0 |
|  6 | 好好说话   |          2 |  60.0 |
|  7 | tellme     |          2 |  60.0 |
|  8 | 老外学中文 |          2 |  60.0 |
|  1 | 黑旋风李逵 |          2 |  59.5 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          2 |  59.5 |
|  4 | 许仙       |          2 |  59.5 |
|  5 | 不想毕业   |          2 |  59.5 |
|  6 | 好好说话   |          2 |  59.5 |
|  7 | tellme     |          2 |  59.5 |
|  8 | 老外学中文 |          2 |  59.5 |
|  1 | 黑旋风李逵 |          3 |  33.0 |
|  2 | 菩提老祖   |          3 |  33.0 |
|  3 | 白素贞     |          3 |  33.0 |
|  4 | 许仙       |          3 |  33.0 |
|  5 | 不想毕业   |          3 |  33.0 |
|  6 | 好好说话   |          3 |  33.0 |
|  7 | tellme     |          3 |  33.0 |
|  8 | 老外学中文 |          3 |  33.0 |
|  1 | 黑旋风李逵 |          3 |  68.0 |
|  2 | 菩提老祖   |          3 |  68.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  4 | 许仙       |          3 |  68.0 |
|  5 | 不想毕业   |          3 |  68.0 |
|  6 | 好好说话   |          3 |  68.0 |
|  7 | tellme     |          3 |  68.0 |
|  8 | 老外学中文 |          3 |  68.0 |
|  1 | 黑旋风李逵 |          3 |  99.0 |
|  2 | 菩提老祖   |          3 |  99.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          3 |  99.0 |
|  5 | 不想毕业   |          3 |  99.0 |
|  6 | 好好说话   |          3 |  99.0 |
|  7 | tellme     |          3 |  99.0 |
|  8 | 老外学中文 |          3 |  99.0 |
|  1 | 黑旋风李逵 |          4 |  67.0 |
|  2 | 菩提老祖   |          4 |  67.0 |
|  3 | 白素贞     |          4 |  67.0 |
|  4 | 许仙       |          4 |  67.0 |
|  5 | 不想毕业   |          4 |  67.0 |
|  6 | 好好说话   |          4 |  67.0 |
|  7 | tellme     |          4 |  67.0 |
|  8 | 老外学中文 |          4 |  67.0 |
|  1 | 黑旋风李逵 |          4 |  23.0 |
|  2 | 菩提老祖   |          4 |  23.0 |
|  3 | 白素贞     |          4 |  23.0 |
|  4 | 许仙       |          4 |  23.0 |
|  5 | 不想毕业   |          4 |  23.0 |
|  6 | 好好说话   |          4 |  23.0 |
|  7 | tellme     |          4 |  23.0 |
|  8 | 老外学中文 |          4 |  23.0 |
|  1 | 黑旋风李逵 |          4 |  56.0 |
|  2 | 菩提老祖   |          4 |  56.0 |
|  3 | 白素贞     |          4 |  56.0 |
|  4 | 许仙       |          4 |  56.0 |
|  5 | 不想毕业   |          4 |  56.0 |
|  6 | 好好说话   |          4 |  56.0 |
|  7 | tellme     |          4 |  56.0 |
|  8 | 老外学中文 |          4 |  56.0 |
|  1 | 黑旋风李逵 |          4 |  72.0 |
|  2 | 菩提老祖   |          4 |  72.0 |
|  3 | 白素贞     |          4 |  72.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          4 |  72.0 |
|  6 | 好好说话   |          4 |  72.0 |
|  7 | tellme     |          4 |  72.0 |
|  8 | 老外学中文 |          4 |  72.0 |
|  1 | 黑旋风李逵 |          5 |  81.0 |
|  2 | 菩提老祖   |          5 |  81.0 |
|  3 | 白素贞     |          5 |  81.0 |
|  4 | 许仙       |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  6 | 好好说话   |          5 |  81.0 |
|  7 | tellme     |          5 |  81.0 |
|  8 | 老外学中文 |          5 |  81.0 |
|  1 | 黑旋风李逵 |          5 |  37.0 |
|  2 | 菩提老祖   |          5 |  37.0 |
|  3 | 白素贞     |          5 |  37.0 |
|  4 | 许仙       |          5 |  37.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          5 |  37.0 |
|  7 | tellme     |          5 |  37.0 |
|  8 | 老外学中文 |          5 |  37.0 |
|  1 | 黑旋风李逵 |          6 |  56.0 |
|  2 | 菩提老祖   |          6 |  56.0 |
|  3 | 白素贞     |          6 |  56.0 |
|  4 | 许仙       |          6 |  56.0 |
|  5 | 不想毕业   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  7 | tellme     |          6 |  56.0 |
|  8 | 老外学中文 |          6 |  56.0 |
|  1 | 黑旋风李逵 |          6 |  43.0 |
|  2 | 菩提老祖   |          6 |  43.0 |
|  3 | 白素贞     |          6 |  43.0 |
|  4 | 许仙       |          6 |  43.0 |
|  5 | 不想毕业   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  7 | tellme     |          6 |  43.0 |
|  8 | 老外学中文 |          6 |  43.0 |
|  1 | 黑旋风李逵 |          6 |  79.0 |
|  2 | 菩提老祖   |          6 |  79.0 |
|  3 | 白素贞     |          6 |  79.0 |
|  4 | 许仙       |          6 |  79.0 |
|  5 | 不想毕业   |          6 |  79.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          6 |  79.0 |
|  8 | 老外学中文 |          6 |  79.0 |
|  1 | 黑旋风李逵 |          7 |  80.0 |
|  2 | 菩提老祖   |          7 |  80.0 |
|  3 | 白素贞     |          7 |  80.0 |
|  4 | 许仙       |          7 |  80.0 |
|  5 | 不想毕业   |          7 |  80.0 |
|  6 | 好好说话   |          7 |  80.0 |
|  7 | tellme     |          7 |  80.0 |
|  8 | 老外学中文 |          7 |  80.0 |
|  1 | 黑旋风李逵 |          7 |  92.0 |
|  2 | 菩提老祖   |          7 |  92.0 |
|  3 | 白素贞     |          7 |  92.0 |
|  4 | 许仙       |          7 |  92.0 |
|  5 | 不想毕业   |          7 |  92.0 |
|  6 | 好好说话   |          7 |  92.0 |
|  7 | tellme     |          7 |  92.0 |
|  8 | 老外学中文 |          7 |  92.0 |
+----+------------+------------+-------+
160 rows in set (0.01 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          3 |  33.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          4 |  67.0 |
|  4 | 许仙       |          4 |  23.0 |
|  4 | 许仙       |          4 |  56.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          7 |  80.0 |
|  7 | tellme     |          7 |  92.0 |
+----+------------+------------+-------+
20 rows in set (0.01 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id and name = "许仙";
+----+------+------------+-------+
| id | name | student_id | score |
+----+------+------------+-------+
|  4 | 许仙 |          4 |  67.0 |
|  4 | 许仙 |          4 |  23.0 |
|  4 | 许仙 |          4 |  56.0 |
|  4 | 许仙 |          4 |  72.0 |
+----+------+------------+-------+
4 rows in set (0.01 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id and student.name = "许仙";
+----+------+------------+-------+
| id | name | student_id | score |
+----+------+------------+-------+
|  4 | 许仙 |          4 |  67.0 |
|  4 | 许仙 |          4 |  23.0 |
|  4 | 许仙 |          4 |  56.0 |
|  4 | 许仙 |          4 |  72.0 |
+----+------+------------+-------+
4 rows in set (0.00 sec)

mysql> select student.id,student.name ,score.student_id,score.score from student,score ;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  2 | 菩提老祖   |          1 |  70.5 |
|  3 | 白素贞     |          1 |  70.5 |
|  4 | 许仙       |          1 |  70.5 |
|  5 | 不想毕业   |          1 |  70.5 |
|  6 | 好好说话   |          1 |  70.5 |
|  7 | tellme     |          1 |  70.5 |
|  8 | 老外学中文 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  2 | 菩提老祖   |          1 |  98.5 |
|  3 | 白素贞     |          1 |  98.5 |
|  4 | 许仙       |          1 |  98.5 |
|  5 | 不想毕业   |          1 |  98.5 |
|  6 | 好好说话   |          1 |  98.5 |
|  7 | tellme     |          1 |  98.5 |
|  8 | 老外学中文 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  2 | 菩提老祖   |          1 |  33.0 |
|  3 | 白素贞     |          1 |  33.0 |
|  4 | 许仙       |          1 |  33.0 |
|  5 | 不想毕业   |          1 |  33.0 |
|  6 | 好好说话   |          1 |  33.0 |
|  7 | tellme     |          1 |  33.0 |
|  8 | 老外学中文 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          1 |  98.0 |
|  3 | 白素贞     |          1 |  98.0 |
|  4 | 许仙       |          1 |  98.0 |
|  5 | 不想毕业   |          1 |  98.0 |
|  6 | 好好说话   |          1 |  98.0 |
|  7 | tellme     |          1 |  98.0 |
|  8 | 老外学中文 |          1 |  98.0 |
|  1 | 黑旋风李逵 |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  3 | 白素贞     |          2 |  60.0 |
|  4 | 许仙       |          2 |  60.0 |
|  5 | 不想毕业   |          2 |  60.0 |
|  6 | 好好说话   |          2 |  60.0 |
|  7 | tellme     |          2 |  60.0 |
|  8 | 老外学中文 |          2 |  60.0 |
|  1 | 黑旋风李逵 |          2 |  59.5 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          2 |  59.5 |
|  4 | 许仙       |          2 |  59.5 |
|  5 | 不想毕业   |          2 |  59.5 |
|  6 | 好好说话   |          2 |  59.5 |
|  7 | tellme     |          2 |  59.5 |
|  8 | 老外学中文 |          2 |  59.5 |
|  1 | 黑旋风李逵 |          3 |  33.0 |
|  2 | 菩提老祖   |          3 |  33.0 |
|  3 | 白素贞     |          3 |  33.0 |
|  4 | 许仙       |          3 |  33.0 |
|  5 | 不想毕业   |          3 |  33.0 |
|  6 | 好好说话   |          3 |  33.0 |
|  7 | tellme     |          3 |  33.0 |
|  8 | 老外学中文 |          3 |  33.0 |
|  1 | 黑旋风李逵 |          3 |  68.0 |
|  2 | 菩提老祖   |          3 |  68.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  4 | 许仙       |          3 |  68.0 |
|  5 | 不想毕业   |          3 |  68.0 |
|  6 | 好好说话   |          3 |  68.0 |
|  7 | tellme     |          3 |  68.0 |
|  8 | 老外学中文 |          3 |  68.0 |
|  1 | 黑旋风李逵 |          3 |  99.0 |
|  2 | 菩提老祖   |          3 |  99.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          3 |  99.0 |
|  5 | 不想毕业   |          3 |  99.0 |
|  6 | 好好说话   |          3 |  99.0 |
|  7 | tellme     |          3 |  99.0 |
|  8 | 老外学中文 |          3 |  99.0 |
|  1 | 黑旋风李逵 |          4 |  67.0 |
|  2 | 菩提老祖   |          4 |  67.0 |
|  3 | 白素贞     |          4 |  67.0 |
|  4 | 许仙       |          4 |  67.0 |
|  5 | 不想毕业   |          4 |  67.0 |
|  6 | 好好说话   |          4 |  67.0 |
|  7 | tellme     |          4 |  67.0 |
|  8 | 老外学中文 |          4 |  67.0 |
|  1 | 黑旋风李逵 |          4 |  23.0 |
|  2 | 菩提老祖   |          4 |  23.0 |
|  3 | 白素贞     |          4 |  23.0 |
|  4 | 许仙       |          4 |  23.0 |
|  5 | 不想毕业   |          4 |  23.0 |
|  6 | 好好说话   |          4 |  23.0 |
|  7 | tellme     |          4 |  23.0 |
|  8 | 老外学中文 |          4 |  23.0 |
|  1 | 黑旋风李逵 |          4 |  56.0 |
|  2 | 菩提老祖   |          4 |  56.0 |
|  3 | 白素贞     |          4 |  56.0 |
|  4 | 许仙       |          4 |  56.0 |
|  5 | 不想毕业   |          4 |  56.0 |
|  6 | 好好说话   |          4 |  56.0 |
|  7 | tellme     |          4 |  56.0 |
|  8 | 老外学中文 |          4 |  56.0 |
|  1 | 黑旋风李逵 |          4 |  72.0 |
|  2 | 菩提老祖   |          4 |  72.0 |
|  3 | 白素贞     |          4 |  72.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          4 |  72.0 |
|  6 | 好好说话   |          4 |  72.0 |
|  7 | tellme     |          4 |  72.0 |
|  8 | 老外学中文 |          4 |  72.0 |
|  1 | 黑旋风李逵 |          5 |  81.0 |
|  2 | 菩提老祖   |          5 |  81.0 |
|  3 | 白素贞     |          5 |  81.0 |
|  4 | 许仙       |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  6 | 好好说话   |          5 |  81.0 |
|  7 | tellme     |          5 |  81.0 |
|  8 | 老外学中文 |          5 |  81.0 |
|  1 | 黑旋风李逵 |          5 |  37.0 |
|  2 | 菩提老祖   |          5 |  37.0 |
|  3 | 白素贞     |          5 |  37.0 |
|  4 | 许仙       |          5 |  37.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          5 |  37.0 |
|  7 | tellme     |          5 |  37.0 |
|  8 | 老外学中文 |          5 |  37.0 |
|  1 | 黑旋风李逵 |          6 |  56.0 |
|  2 | 菩提老祖   |          6 |  56.0 |
|  3 | 白素贞     |          6 |  56.0 |
|  4 | 许仙       |          6 |  56.0 |
|  5 | 不想毕业   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  7 | tellme     |          6 |  56.0 |
|  8 | 老外学中文 |          6 |  56.0 |
|  1 | 黑旋风李逵 |          6 |  43.0 |
|  2 | 菩提老祖   |          6 |  43.0 |
|  3 | 白素贞     |          6 |  43.0 |
|  4 | 许仙       |          6 |  43.0 |
|  5 | 不想毕业   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  7 | tellme     |          6 |  43.0 |
|  8 | 老外学中文 |          6 |  43.0 |
|  1 | 黑旋风李逵 |          6 |  79.0 |
|  2 | 菩提老祖   |          6 |  79.0 |
|  3 | 白素贞     |          6 |  79.0 |
|  4 | 许仙       |          6 |  79.0 |
|  5 | 不想毕业   |          6 |  79.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          6 |  79.0 |
|  8 | 老外学中文 |          6 |  79.0 |
|  1 | 黑旋风李逵 |          7 |  80.0 |
|  2 | 菩提老祖   |          7 |  80.0 |
|  3 | 白素贞     |          7 |  80.0 |
|  4 | 许仙       |          7 |  80.0 |
|  5 | 不想毕业   |          7 |  80.0 |
|  6 | 好好说话   |          7 |  80.0 |
|  7 | tellme     |          7 |  80.0 |
|  8 | 老外学中文 |          7 |  80.0 |
|  1 | 黑旋风李逵 |          7 |  92.0 |
|  2 | 菩提老祖   |          7 |  92.0 |
|  3 | 白素贞     |          7 |  92.0 |
|  4 | 许仙       |          7 |  92.0 |
|  5 | 不想毕业   |          7 |  92.0 |
|  6 | 好好说话   |          7 |  92.0 |
|  7 | tellme     |          7 |  92.0 |
|  8 | 老外学中文 |          7 |  92.0 |
+----+------------+------------+-------+
160 rows in set (0.00 sec)

mysql> select student.id,student.score,score.student_id,score.score from student,score where student.id = score.student_id;
ERROR 1054 (42S22): Unknown column 'student.score' in 'field list'
mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          3 |  33.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          4 |  67.0 |
|  4 | 许仙       |          4 |  23.0 |
|  4 | 许仙       |          4 |  56.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          7 |  80.0 |
|  7 | tellme     |          7 |  92.0 |
+----+------------+------------+-------+
20 rows in set (0.00 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id and student.name = "许仙";
+----+------+------------+-------+
| id | name | student_id | score |
+----+------+------------+-------+
|  4 | 许仙 |          4 |  67.0 |
|  4 | 许仙 |          4 |  23.0 |
|  4 | 许仙 |          4 |  56.0 |
|  4 | 许仙 |          4 |  72.0 |
+----+------+------------+-------+
4 rows in set (0.00 sec)

mysql> select student.id,student.name,score.student_id,score.score from student join score on where student.id = score.student_id and name = "许仙";
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'where student.id = score.student_id and name = "许仙"' at line 1
mysql> select student.id,student.name,score.student_id,score.score from student join score on  student.id = score.student_id and name = "许仙";
+----+------+------------+-------+
| id | name | student_id | score |
+----+------+------------+-------+
|  4 | 许仙 |          4 |  67.0 |
|  4 | 许仙 |          4 |  23.0 |
|  4 | 许仙 |          4 |  56.0 |
|  4 | 许仙 |          4 |  72.0 |
+----+------+------------+-------+
4 rows in set (0.01 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  2 | 菩提老祖   |          1 |  70.5 |
|  3 | 白素贞     |          1 |  70.5 |
|  4 | 许仙       |          1 |  70.5 |
|  5 | 不想毕业   |          1 |  70.5 |
|  6 | 好好说话   |          1 |  70.5 |
|  7 | tellme     |          1 |  70.5 |
|  8 | 老外学中文 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  2 | 菩提老祖   |          1 |  98.5 |
|  3 | 白素贞     |          1 |  98.5 |
|  4 | 许仙       |          1 |  98.5 |
|  5 | 不想毕业   |          1 |  98.5 |
|  6 | 好好说话   |          1 |  98.5 |
|  7 | tellme     |          1 |  98.5 |
|  8 | 老外学中文 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  2 | 菩提老祖   |          1 |  33.0 |
|  3 | 白素贞     |          1 |  33.0 |
|  4 | 许仙       |          1 |  33.0 |
|  5 | 不想毕业   |          1 |  33.0 |
|  6 | 好好说话   |          1 |  33.0 |
|  7 | tellme     |          1 |  33.0 |
|  8 | 老外学中文 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          1 |  98.0 |
|  3 | 白素贞     |          1 |  98.0 |
|  4 | 许仙       |          1 |  98.0 |
|  5 | 不想毕业   |          1 |  98.0 |
|  6 | 好好说话   |          1 |  98.0 |
|  7 | tellme     |          1 |  98.0 |
|  8 | 老外学中文 |          1 |  98.0 |
|  1 | 黑旋风李逵 |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  3 | 白素贞     |          2 |  60.0 |
|  4 | 许仙       |          2 |  60.0 |
|  5 | 不想毕业   |          2 |  60.0 |
|  6 | 好好说话   |          2 |  60.0 |
|  7 | tellme     |          2 |  60.0 |
|  8 | 老外学中文 |          2 |  60.0 |
|  1 | 黑旋风李逵 |          2 |  59.5 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          2 |  59.5 |
|  4 | 许仙       |          2 |  59.5 |
|  5 | 不想毕业   |          2 |  59.5 |
|  6 | 好好说话   |          2 |  59.5 |
|  7 | tellme     |          2 |  59.5 |
|  8 | 老外学中文 |          2 |  59.5 |
|  1 | 黑旋风李逵 |          3 |  33.0 |
|  2 | 菩提老祖   |          3 |  33.0 |
|  3 | 白素贞     |          3 |  33.0 |
|  4 | 许仙       |          3 |  33.0 |
|  5 | 不想毕业   |          3 |  33.0 |
|  6 | 好好说话   |          3 |  33.0 |
|  7 | tellme     |          3 |  33.0 |
|  8 | 老外学中文 |          3 |  33.0 |
|  1 | 黑旋风李逵 |          3 |  68.0 |
|  2 | 菩提老祖   |          3 |  68.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  4 | 许仙       |          3 |  68.0 |
|  5 | 不想毕业   |          3 |  68.0 |
|  6 | 好好说话   |          3 |  68.0 |
|  7 | tellme     |          3 |  68.0 |
|  8 | 老外学中文 |          3 |  68.0 |
|  1 | 黑旋风李逵 |          3 |  99.0 |
|  2 | 菩提老祖   |          3 |  99.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          3 |  99.0 |
|  5 | 不想毕业   |          3 |  99.0 |
|  6 | 好好说话   |          3 |  99.0 |
|  7 | tellme     |          3 |  99.0 |
|  8 | 老外学中文 |          3 |  99.0 |
|  1 | 黑旋风李逵 |          4 |  67.0 |
|  2 | 菩提老祖   |          4 |  67.0 |
|  3 | 白素贞     |          4 |  67.0 |
|  4 | 许仙       |          4 |  67.0 |
|  5 | 不想毕业   |          4 |  67.0 |
|  6 | 好好说话   |          4 |  67.0 |
|  7 | tellme     |          4 |  67.0 |
|  8 | 老外学中文 |          4 |  67.0 |
|  1 | 黑旋风李逵 |          4 |  23.0 |
|  2 | 菩提老祖   |          4 |  23.0 |
|  3 | 白素贞     |          4 |  23.0 |
|  4 | 许仙       |          4 |  23.0 |
|  5 | 不想毕业   |          4 |  23.0 |
|  6 | 好好说话   |          4 |  23.0 |
|  7 | tellme     |          4 |  23.0 |
|  8 | 老外学中文 |          4 |  23.0 |
|  1 | 黑旋风李逵 |          4 |  56.0 |
|  2 | 菩提老祖   |          4 |  56.0 |
|  3 | 白素贞     |          4 |  56.0 |
|  4 | 许仙       |          4 |  56.0 |
|  5 | 不想毕业   |          4 |  56.0 |
|  6 | 好好说话   |          4 |  56.0 |
|  7 | tellme     |          4 |  56.0 |
|  8 | 老外学中文 |          4 |  56.0 |
|  1 | 黑旋风李逵 |          4 |  72.0 |
|  2 | 菩提老祖   |          4 |  72.0 |
|  3 | 白素贞     |          4 |  72.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          4 |  72.0 |
|  6 | 好好说话   |          4 |  72.0 |
|  7 | tellme     |          4 |  72.0 |
|  8 | 老外学中文 |          4 |  72.0 |
|  1 | 黑旋风李逵 |          5 |  81.0 |
|  2 | 菩提老祖   |          5 |  81.0 |
|  3 | 白素贞     |          5 |  81.0 |
|  4 | 许仙       |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  6 | 好好说话   |          5 |  81.0 |
|  7 | tellme     |          5 |  81.0 |
|  8 | 老外学中文 |          5 |  81.0 |
|  1 | 黑旋风李逵 |          5 |  37.0 |
|  2 | 菩提老祖   |          5 |  37.0 |
|  3 | 白素贞     |          5 |  37.0 |
|  4 | 许仙       |          5 |  37.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          5 |  37.0 |
|  7 | tellme     |          5 |  37.0 |
|  8 | 老外学中文 |          5 |  37.0 |
|  1 | 黑旋风李逵 |          6 |  56.0 |
|  2 | 菩提老祖   |          6 |  56.0 |
|  3 | 白素贞     |          6 |  56.0 |
|  4 | 许仙       |          6 |  56.0 |
|  5 | 不想毕业   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  7 | tellme     |          6 |  56.0 |
|  8 | 老外学中文 |          6 |  56.0 |
|  1 | 黑旋风李逵 |          6 |  43.0 |
|  2 | 菩提老祖   |          6 |  43.0 |
|  3 | 白素贞     |          6 |  43.0 |
|  4 | 许仙       |          6 |  43.0 |
|  5 | 不想毕业   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  7 | tellme     |          6 |  43.0 |
|  8 | 老外学中文 |          6 |  43.0 |
|  1 | 黑旋风李逵 |          6 |  79.0 |
|  2 | 菩提老祖   |          6 |  79.0 |
|  3 | 白素贞     |          6 |  79.0 |
|  4 | 许仙       |          6 |  79.0 |
|  5 | 不想毕业   |          6 |  79.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          6 |  79.0 |
|  8 | 老外学中文 |          6 |  79.0 |
|  1 | 黑旋风李逵 |          7 |  80.0 |
|  2 | 菩提老祖   |          7 |  80.0 |
|  3 | 白素贞     |          7 |  80.0 |
|  4 | 许仙       |          7 |  80.0 |
|  5 | 不想毕业   |          7 |  80.0 |
|  6 | 好好说话   |          7 |  80.0 |
|  7 | tellme     |          7 |  80.0 |
|  8 | 老外学中文 |          7 |  80.0 |
|  1 | 黑旋风李逵 |          7 |  92.0 |
|  2 | 菩提老祖   |          7 |  92.0 |
|  3 | 白素贞     |          7 |  92.0 |
|  4 | 许仙       |          7 |  92.0 |
|  5 | 不想毕业   |          7 |  92.0 |
|  6 | 好好说话   |          7 |  92.0 |
|  7 | tellme     |          7 |  92.0 |
|  8 | 老外学中文 |          7 |  92.0 |
+----+------------+------------+-------+
160 rows in set (0.00 sec)

mysql> select student.id,student.name,score.student_id,student.score from student,score where student.id = score.student_id;
ERROR 1054 (42S22): Unknown column 'student.score' in 'field list'
mysql> select student.id,student.name,score.student_id,student.score from student,score where student.id = score.student_id;
ERROR 1054 (42S22): Unknown column 'student.score' in 'field list'
mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  1 | 黑旋风李逵 |          1 |  98.5 |
|  1 | 黑旋风李逵 |          1 |  33.0 |
|  1 | 黑旋风李逵 |          1 |  98.0 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  2 | 菩提老祖   |          2 |  59.5 |
|  3 | 白素贞     |          3 |  33.0 |
|  3 | 白素贞     |          3 |  68.0 |
|  3 | 白素贞     |          3 |  99.0 |
|  4 | 许仙       |          4 |  67.0 |
|  4 | 许仙       |          4 |  23.0 |
|  4 | 许仙       |          4 |  56.0 |
|  4 | 许仙       |          4 |  72.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  5 | 不想毕业   |          5 |  37.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  6 | 好好说话   |          6 |  43.0 |
|  6 | 好好说话   |          6 |  79.0 |
|  7 | tellme     |          7 |  80.0 |
|  7 | tellme     |          7 |  92.0 |
+----+------------+------------+-------+
20 rows in set (0.01 sec)

mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id group by student.id;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  3 | 白素贞     |          3 |  33.0 |
|  4 | 许仙       |          4 |  67.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  7 | tellme     |          7 |  80.0 |
+----+------------+------------+-------+
7 rows in set (0.01 sec)

mysql> select student.id,student.name,sum(score.score) from student,score where student.id = score.student_id group by student.id;
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  1 | 黑旋风李逵 |            300.0 |
|  2 | 菩提老祖   |            119.5 |
|  3 | 白素贞     |            200.0 |
|  4 | 许仙       |            218.0 |
|  5 | 不想毕业   |            118.0 |
|  6 | 好好说话   |            178.0 |
|  7 | tellme     |            172.0 |
+----+------------+------------------+
7 rows in set (0.01 sec)

mysql> select student.id,student.name,score.studenta_id,score.score from student,score where student.id = score.student_id group by student.id;
ERROR 1054 (42S22): Unknown column 'score.studenta_id' in 'field list'
mysql> select student.id,student.name,score.student_id,score.score from student,score where student.id = score.student_id group by student.id;
+----+------------+------------+-------+
| id | name       | student_id | score |
+----+------------+------------+-------+
|  1 | 黑旋风李逵 |          1 |  70.5 |
|  2 | 菩提老祖   |          2 |  60.0 |
|  3 | 白素贞     |          3 |  33.0 |
|  4 | 许仙       |          4 |  67.0 |
|  5 | 不想毕业   |          5 |  81.0 |
|  6 | 好好说话   |          6 |  56.0 |
|  7 | tellme     |          7 |  80.0 |
+----+------------+------------+-------+
7 rows in set (0.01 sec)

mysql> select student.id,student.name,sum(score.score)from student,score where student.id = score.student_id group by student.id;
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  1 | 黑旋风李逵 |            300.0 |
|  2 | 菩提老祖   |            119.5 |
|  3 | 白素贞     |            200.0 |
|  4 | 许仙       |            218.0 |
|  5 | 不想毕业   |            118.0 |
|  6 | 好好说话   |            178.0 |
|  7 | tellme     |            172.0 |
+----+------------+------------------+
7 rows in set (0.00 sec)

mysql> select student.id,student.name,sum(score.score)from student,score where student.id = score.student_id group by score. student_id;
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  1 | 黑旋风李逵 |            300.0 |
|  2 | 菩提老祖   |            119.5 |
|  3 | 白素贞     |            200.0 |
|  4 | 许仙       |            218.0 |
|  5 | 不想毕业   |            118.0 |
|  6 | 好好说话   |            178.0 |
|  7 | tellme     |            172.0 |
+----+------------+------------------+
7 rows in set (0.00 sec)

mysql>
mysql> select student.id,student.name,sum(score.score)from student,score where student.id = score.student_id group by name;
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  7 | tellme     |            172.0 |
|  5 | 不想毕业   |            118.0 |
|  6 | 好好说话   |            178.0 |
|  3 | 白素贞     |            200.0 |
|  2 | 菩提老祖   |            119.5 |
|  4 | 许仙       |            218.0 |
|  1 | 黑旋风李逵 |            300.0 |
+----+------------+------------------+
7 rows in set (0.00 sec)

mysql> select student.id,student.name,sum(score.score)from student,score where student.id = score.student_id group by student.id order by sum(score.score);
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  5 | 不想毕业   |            118.0 |
|  2 | 菩提老祖   |            119.5 |
|  7 | tellme     |            172.0 |
|  6 | 好好说话   |            178.0 |
|  3 | 白素贞     |            200.0 |
|  4 | 许仙       |            218.0 |
|  1 | 黑旋风李逵 |            300.0 |
+----+------------+------------------+
7 rows in set (0.01 sec)

mysql> select student.id,student.name,sum(score.score)from student,score where student.id = score.student_id group by student.id order by sum(score.score)desc;
+----+------------+------------------+
| id | name       | sum(score.score) |
+----+------------+------------------+
|  1 | 黑旋风李逵 |            300.0 |
|  4 | 许仙       |            218.0 |
|  3 | 白素贞     |            200.0 |
|  6 | 好好说话   |            178.0 |
|  7 | tellme     |            172.0 |
|  2 | 菩提老祖   |            119.5 |
|  5 | 不想毕业   |            118.0 |
+----+------------+------------------+
7 rows in set (0.00 sec)

mysql> select student.id,student.name,course.id,course.name,score.studenta_id,score.course_id,score.score from student,course,score;
ERROR 1054 (42S22): Unknown column 'score.studenta_id' in 'field list'
mysql> select student.id,student.name,course.id,course.name,score.student_id,score.course_id,score.score from student,course,score;
+----+------------+----+--------------+------------+-----------+-------+
| id | name       | id | name         | student_id | course_id | score |
+----+------------+----+--------------+------------+-----------+-------+
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  1 | Java         |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  4 | 语文         |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  2 | 菩提老祖   |  6 | 英文         |          1 |         1 |  70.5 |
|  3 | 白素贞     |  1 | Java         |          1 |         1 |  70.5 |
|  3 | 白素贞     |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  3 | 白素贞     |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  3 | 白素贞     |  4 | 语文         |          1 |         1 |  70.5 |
|  3 | 白素贞     |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  3 | 白素贞     |  6 | 英文         |          1 |         1 |  70.5 |
|  4 | 许仙       |  1 | Java         |          1 |         1 |  70.5 |
|  4 | 许仙       |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  4 | 许仙       |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  4 | 许仙       |  4 | 语文         |          1 |         1 |  70.5 |
|  4 | 许仙       |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  4 | 许仙       |  6 | 英文         |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  1 | Java         |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  4 | 语文         |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  5 | 不想毕业   |  6 | 英文         |          1 |         1 |  70.5 |
|  6 | 好好说话   |  1 | Java         |          1 |         1 |  70.5 |
|  6 | 好好说话   |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  6 | 好好说话   |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  6 | 好好说话   |  4 | 语文         |          1 |         1 |  70.5 |
|  6 | 好好说话   |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  6 | 好好说话   |  6 | 英文         |          1 |         1 |  70.5 |
|  7 | tellme     |  1 | Java         |          1 |         1 |  70.5 |
|  7 | tellme     |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  7 | tellme     |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  7 | tellme     |  4 | 语文         |          1 |         1 |  70.5 |
|  7 | tellme     |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  7 | tellme     |  6 | 英文         |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  1 | Java         |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  4 | 语文         |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  8 | 老外学中文 |  6 | 英文         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  1 | Java         |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  4 | 语文         |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  2 | 菩提老祖   |  6 | 英文         |          1 |         3 |  98.5 |
|  3 | 白素贞     |  1 | Java         |          1 |         3 |  98.5 |
|  3 | 白素贞     |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  3 | 白素贞     |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  3 | 白素贞     |  4 | 语文         |          1 |         3 |  98.5 |
|  3 | 白素贞     |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  3 | 白素贞     |  6 | 英文         |          1 |         3 |  98.5 |
|  4 | 许仙       |  1 | Java         |          1 |         3 |  98.5 |
|  4 | 许仙       |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  4 | 许仙       |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  4 | 许仙       |  4 | 语文         |          1 |         3 |  98.5 |
|  4 | 许仙       |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  4 | 许仙       |  6 | 英文         |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  1 | Java         |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  4 | 语文         |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  5 | 不想毕业   |  6 | 英文         |          1 |         3 |  98.5 |
|  6 | 好好说话   |  1 | Java         |          1 |         3 |  98.5 |
|  6 | 好好说话   |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  6 | 好好说话   |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  6 | 好好说话   |  4 | 语文         |          1 |         3 |  98.5 |
|  6 | 好好说话   |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  6 | 好好说话   |  6 | 英文         |          1 |         3 |  98.5 |
|  7 | tellme     |  1 | Java         |          1 |         3 |  98.5 |
|  7 | tellme     |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  7 | tellme     |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  7 | tellme     |  4 | 语文         |          1 |         3 |  98.5 |
|  7 | tellme     |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  7 | tellme     |  6 | 英文         |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  1 | Java         |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  4 | 语文         |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  8 | 老外学中文 |  6 | 英文         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  1 | Java         |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  4 | 语文         |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  2 | 菩提老祖   |  6 | 英文         |          1 |         5 |  33.0 |
|  3 | 白素贞     |  1 | Java         |          1 |         5 |  33.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  3 | 白素贞     |  4 | 语文         |          1 |         5 |  33.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  3 | 白素贞     |  6 | 英文         |          1 |         5 |  33.0 |
|  4 | 许仙       |  1 | Java         |          1 |         5 |  33.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  4 | 许仙       |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  4 | 许仙       |  4 | 语文         |          1 |         5 |  33.0 |
|  4 | 许仙       |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  4 | 许仙       |  6 | 英文         |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  1 | Java         |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  4 | 语文         |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  5 | 不想毕业   |  6 | 英文         |          1 |         5 |  33.0 |
|  6 | 好好说话   |  1 | Java         |          1 |         5 |  33.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  6 | 好好说话   |  4 | 语文         |          1 |         5 |  33.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  6 | 好好说话   |  6 | 英文         |          1 |         5 |  33.0 |
|  7 | tellme     |  1 | Java         |          1 |         5 |  33.0 |
|  7 | tellme     |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  7 | tellme     |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  7 | tellme     |  4 | 语文         |          1 |         5 |  33.0 |
|  7 | tellme     |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  7 | tellme     |  6 | 英文         |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  1 | Java         |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  4 | 语文         |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  8 | 老外学中文 |  6 | 英文         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  1 | Java         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  4 | 语文         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  6 | 英文         |          1 |         6 |  98.0 |
|  3 | 白素贞     |  1 | Java         |          1 |         6 |  98.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  3 | 白素贞     |  4 | 语文         |          1 |         6 |  98.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  3 | 白素贞     |  6 | 英文         |          1 |         6 |  98.0 |
|  4 | 许仙       |  1 | Java         |          1 |         6 |  98.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  4 | 许仙       |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  4 | 许仙       |  4 | 语文         |          1 |         6 |  98.0 |
|  4 | 许仙       |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  4 | 许仙       |  6 | 英文         |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  1 | Java         |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  4 | 语文         |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  5 | 不想毕业   |  6 | 英文         |          1 |         6 |  98.0 |
|  6 | 好好说话   |  1 | Java         |          1 |         6 |  98.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  6 | 好好说话   |  4 | 语文         |          1 |         6 |  98.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  6 | 好好说话   |  6 | 英文         |          1 |         6 |  98.0 |
|  7 | tellme     |  1 | Java         |          1 |         6 |  98.0 |
|  7 | tellme     |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  7 | tellme     |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  7 | tellme     |  4 | 语文         |          1 |         6 |  98.0 |
|  7 | tellme     |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  7 | tellme     |  6 | 英文         |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  1 | Java         |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  4 | 语文         |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  8 | 老外学中文 |  6 | 英文         |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  4 | 语文         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  6 | 英文         |          2 |         1 |  60.0 |
|  3 | 白素贞     |  1 | Java         |          2 |         1 |  60.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  3 | 白素贞     |  4 | 语文         |          2 |         1 |  60.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  3 | 白素贞     |  6 | 英文         |          2 |         1 |  60.0 |
|  4 | 许仙       |  1 | Java         |          2 |         1 |  60.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  4 | 许仙       |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  4 | 许仙       |  4 | 语文         |          2 |         1 |  60.0 |
|  4 | 许仙       |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  4 | 许仙       |  6 | 英文         |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  1 | Java         |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  4 | 语文         |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  5 | 不想毕业   |  6 | 英文         |          2 |         1 |  60.0 |
|  6 | 好好说话   |  1 | Java         |          2 |         1 |  60.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  6 | 好好说话   |  4 | 语文         |          2 |         1 |  60.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  6 | 好好说话   |  6 | 英文         |          2 |         1 |  60.0 |
|  7 | tellme     |  1 | Java         |          2 |         1 |  60.0 |
|  7 | tellme     |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  7 | tellme     |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  7 | tellme     |  4 | 语文         |          2 |         1 |  60.0 |
|  7 | tellme     |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  7 | tellme     |  6 | 英文         |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  1 | Java         |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  4 | 语文         |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  8 | 老外学中文 |  6 | 英文         |          2 |         1 |  60.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  4 | 语文         |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  6 | 英文         |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  4 | 语文         |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  6 | 英文         |          2 |         5 |  59.5 |
|  3 | 白素贞     |  1 | Java         |          2 |         5 |  59.5 |
|  3 | 白素贞     |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  3 | 白素贞     |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  3 | 白素贞     |  4 | 语文         |          2 |         5 |  59.5 |
|  3 | 白素贞     |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  3 | 白素贞     |  6 | 英文         |          2 |         5 |  59.5 |
|  4 | 许仙       |  1 | Java         |          2 |         5 |  59.5 |
|  4 | 许仙       |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  4 | 许仙       |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  4 | 许仙       |  4 | 语文         |          2 |         5 |  59.5 |
|  4 | 许仙       |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  4 | 许仙       |  6 | 英文         |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  1 | Java         |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  4 | 语文         |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  5 | 不想毕业   |  6 | 英文         |          2 |         5 |  59.5 |
|  6 | 好好说话   |  1 | Java         |          2 |         5 |  59.5 |
|  6 | 好好说话   |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  6 | 好好说话   |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  6 | 好好说话   |  4 | 语文         |          2 |         5 |  59.5 |
|  6 | 好好说话   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  6 | 好好说话   |  6 | 英文         |          2 |         5 |  59.5 |
|  7 | tellme     |  1 | Java         |          2 |         5 |  59.5 |
|  7 | tellme     |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  7 | tellme     |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  7 | tellme     |  4 | 语文         |          2 |         5 |  59.5 |
|  7 | tellme     |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  7 | tellme     |  6 | 英文         |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  1 | Java         |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  4 | 语文         |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  8 | 老外学中文 |  6 | 英文         |          2 |         5 |  59.5 |
|  1 | 黑旋风李逵 |  1 | Java         |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  1 | Java         |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  4 | 语文         |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  2 | 菩提老祖   |  6 | 英文         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  1 | Java         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         1 |  33.0 |
|  4 | 许仙       |  1 | Java         |          3 |         1 |  33.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  4 | 许仙       |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  4 | 许仙       |  4 | 语文         |          3 |         1 |  33.0 |
|  4 | 许仙       |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  4 | 许仙       |  6 | 英文         |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  1 | Java         |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  4 | 语文         |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  5 | 不想毕业   |  6 | 英文         |          3 |         1 |  33.0 |
|  6 | 好好说话   |  1 | Java         |          3 |         1 |  33.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  6 | 好好说话   |  4 | 语文         |          3 |         1 |  33.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  6 | 好好说话   |  6 | 英文         |          3 |         1 |  33.0 |
|  7 | tellme     |  1 | Java         |          3 |         1 |  33.0 |
|  7 | tellme     |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  7 | tellme     |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  7 | tellme     |  4 | 语文         |          3 |         1 |  33.0 |
|  7 | tellme     |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  7 | tellme     |  6 | 英文         |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  1 | Java         |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  4 | 语文         |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  8 | 老外学中文 |  6 | 英文         |          3 |         1 |  33.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  1 | Java         |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  4 | 语文         |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  2 | 菩提老祖   |  6 | 英文         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  1 | Java         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         3 |  68.0 |
|  4 | 许仙       |  1 | Java         |          3 |         3 |  68.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  4 | 许仙       |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  4 | 许仙       |  4 | 语文         |          3 |         3 |  68.0 |
|  4 | 许仙       |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  4 | 许仙       |  6 | 英文         |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  1 | Java         |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  4 | 语文         |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  5 | 不想毕业   |  6 | 英文         |          3 |         3 |  68.0 |
|  6 | 好好说话   |  1 | Java         |          3 |         3 |  68.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  6 | 好好说话   |  4 | 语文         |          3 |         3 |  68.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  6 | 好好说话   |  6 | 英文         |          3 |         3 |  68.0 |
|  7 | tellme     |  1 | Java         |          3 |         3 |  68.0 |
|  7 | tellme     |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  7 | tellme     |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  7 | tellme     |  4 | 语文         |          3 |         3 |  68.0 |
|  7 | tellme     |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  7 | tellme     |  6 | 英文         |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  1 | Java         |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  4 | 语文         |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  8 | 老外学中文 |  6 | 英文         |          3 |         3 |  68.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  1 | Java         |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  4 | 语文         |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  2 | 菩提老祖   |  6 | 英文         |          3 |         5 |  99.0 |
|  3 | 白素贞     |  1 | Java         |          3 |         5 |  99.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         5 |  99.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         5 |  99.0 |
|  4 | 许仙       |  1 | Java         |          3 |         5 |  99.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  4 | 许仙       |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  4 | 许仙       |  4 | 语文         |          3 |         5 |  99.0 |
|  4 | 许仙       |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  4 | 许仙       |  6 | 英文         |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  1 | Java         |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  4 | 语文         |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  5 | 不想毕业   |  6 | 英文         |          3 |         5 |  99.0 |
|  6 | 好好说话   |  1 | Java         |          3 |         5 |  99.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  6 | 好好说话   |  4 | 语文         |          3 |         5 |  99.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  6 | 好好说话   |  6 | 英文         |          3 |         5 |  99.0 |
|  7 | tellme     |  1 | Java         |          3 |         5 |  99.0 |
|  7 | tellme     |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  7 | tellme     |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  7 | tellme     |  4 | 语文         |          3 |         5 |  99.0 |
|  7 | tellme     |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  7 | tellme     |  6 | 英文         |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  1 | Java         |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  4 | 语文         |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  8 | 老外学中文 |  6 | 英文         |          3 |         5 |  99.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  1 | Java         |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  4 | 语文         |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  2 | 菩提老祖   |  6 | 英文         |          4 |         1 |  67.0 |
|  3 | 白素贞     |  1 | Java         |          4 |         1 |  67.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  3 | 白素贞     |  4 | 语文         |          4 |         1 |  67.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  3 | 白素贞     |  6 | 英文         |          4 |         1 |  67.0 |
|  4 | 许仙       |  1 | Java         |          4 |         1 |  67.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         1 |  67.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  1 | Java         |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  4 | 语文         |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  5 | 不想毕业   |  6 | 英文         |          4 |         1 |  67.0 |
|  6 | 好好说话   |  1 | Java         |          4 |         1 |  67.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  6 | 好好说话   |  4 | 语文         |          4 |         1 |  67.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  6 | 好好说话   |  6 | 英文         |          4 |         1 |  67.0 |
|  7 | tellme     |  1 | Java         |          4 |         1 |  67.0 |
|  7 | tellme     |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  7 | tellme     |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  7 | tellme     |  4 | 语文         |          4 |         1 |  67.0 |
|  7 | tellme     |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  7 | tellme     |  6 | 英文         |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  1 | Java         |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  4 | 语文         |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  8 | 老外学中文 |  6 | 英文         |          4 |         1 |  67.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  1 | Java         |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  4 | 语文         |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  2 | 菩提老祖   |  6 | 英文         |          4 |         3 |  23.0 |
|  3 | 白素贞     |  1 | Java         |          4 |         3 |  23.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  3 | 白素贞     |  4 | 语文         |          4 |         3 |  23.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  3 | 白素贞     |  6 | 英文         |          4 |         3 |  23.0 |
|  4 | 许仙       |  1 | Java         |          4 |         3 |  23.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         3 |  23.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  1 | Java         |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  4 | 语文         |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  5 | 不想毕业   |  6 | 英文         |          4 |         3 |  23.0 |
|  6 | 好好说话   |  1 | Java         |          4 |         3 |  23.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  6 | 好好说话   |  4 | 语文         |          4 |         3 |  23.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  6 | 好好说话   |  6 | 英文         |          4 |         3 |  23.0 |
|  7 | tellme     |  1 | Java         |          4 |         3 |  23.0 |
|  7 | tellme     |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  7 | tellme     |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  7 | tellme     |  4 | 语文         |          4 |         3 |  23.0 |
|  7 | tellme     |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  7 | tellme     |  6 | 英文         |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  1 | Java         |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  4 | 语文         |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  8 | 老外学中文 |  6 | 英文         |          4 |         3 |  23.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  1 | Java         |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  4 | 语文         |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  2 | 菩提老祖   |  6 | 英文         |          4 |         5 |  56.0 |
|  3 | 白素贞     |  1 | Java         |          4 |         5 |  56.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  3 | 白素贞     |  4 | 语文         |          4 |         5 |  56.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  3 | 白素贞     |  6 | 英文         |          4 |         5 |  56.0 |
|  4 | 许仙       |  1 | Java         |          4 |         5 |  56.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         5 |  56.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  1 | Java         |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  4 | 语文         |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  5 | 不想毕业   |  6 | 英文         |          4 |         5 |  56.0 |
|  6 | 好好说话   |  1 | Java         |          4 |         5 |  56.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  6 | 好好说话   |  4 | 语文         |          4 |         5 |  56.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  6 | 好好说话   |  6 | 英文         |          4 |         5 |  56.0 |
|  7 | tellme     |  1 | Java         |          4 |         5 |  56.0 |
|  7 | tellme     |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  7 | tellme     |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  7 | tellme     |  4 | 语文         |          4 |         5 |  56.0 |
|  7 | tellme     |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  7 | tellme     |  6 | 英文         |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  1 | Java         |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  4 | 语文         |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  8 | 老外学中文 |  6 | 英文         |          4 |         5 |  56.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  1 | Java         |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  4 | 语文         |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  2 | 菩提老祖   |  6 | 英文         |          4 |         6 |  72.0 |
|  3 | 白素贞     |  1 | Java         |          4 |         6 |  72.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  3 | 白素贞     |  4 | 语文         |          4 |         6 |  72.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  3 | 白素贞     |  6 | 英文         |          4 |         6 |  72.0 |
|  4 | 许仙       |  1 | Java         |          4 |         6 |  72.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         6 |  72.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  1 | Java         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  4 | 语文         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  6 | 英文         |          4 |         6 |  72.0 |
|  6 | 好好说话   |  1 | Java         |          4 |         6 |  72.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  6 | 好好说话   |  4 | 语文         |          4 |         6 |  72.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  6 | 好好说话   |  6 | 英文         |          4 |         6 |  72.0 |
|  7 | tellme     |  1 | Java         |          4 |         6 |  72.0 |
|  7 | tellme     |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  7 | tellme     |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  7 | tellme     |  4 | 语文         |          4 |         6 |  72.0 |
|  7 | tellme     |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  7 | tellme     |  6 | 英文         |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  1 | Java         |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  4 | 语文         |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  8 | 老外学中文 |  6 | 英文         |          4 |         6 |  72.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  1 | Java         |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  4 | 语文         |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  2 | 菩提老祖   |  6 | 英文         |          5 |         1 |  81.0 |
|  3 | 白素贞     |  1 | Java         |          5 |         1 |  81.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  3 | 白素贞     |  4 | 语文         |          5 |         1 |  81.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  3 | 白素贞     |  6 | 英文         |          5 |         1 |  81.0 |
|  4 | 许仙       |  1 | Java         |          5 |         1 |  81.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  4 | 许仙       |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  4 | 许仙       |  4 | 语文         |          5 |         1 |  81.0 |
|  4 | 许仙       |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  4 | 许仙       |  6 | 英文         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  4 | 语文         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  6 | 英文         |          5 |         1 |  81.0 |
|  6 | 好好说话   |  1 | Java         |          5 |         1 |  81.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  6 | 好好说话   |  4 | 语文         |          5 |         1 |  81.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  6 | 好好说话   |  6 | 英文         |          5 |         1 |  81.0 |
|  7 | tellme     |  1 | Java         |          5 |         1 |  81.0 |
|  7 | tellme     |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  7 | tellme     |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  7 | tellme     |  4 | 语文         |          5 |         1 |  81.0 |
|  7 | tellme     |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  7 | tellme     |  6 | 英文         |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  1 | Java         |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  4 | 语文         |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  8 | 老外学中文 |  6 | 英文         |          5 |         1 |  81.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  1 | Java         |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  4 | 语文         |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  2 | 菩提老祖   |  6 | 英文         |          5 |         5 |  37.0 |
|  3 | 白素贞     |  1 | Java         |          5 |         5 |  37.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  3 | 白素贞     |  4 | 语文         |          5 |         5 |  37.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  3 | 白素贞     |  6 | 英文         |          5 |         5 |  37.0 |
|  4 | 许仙       |  1 | Java         |          5 |         5 |  37.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  4 | 许仙       |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  4 | 许仙       |  4 | 语文         |          5 |         5 |  37.0 |
|  4 | 许仙       |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  4 | 许仙       |  6 | 英文         |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  4 | 语文         |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  6 | 英文         |          5 |         5 |  37.0 |
|  6 | 好好说话   |  1 | Java         |          5 |         5 |  37.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  6 | 好好说话   |  4 | 语文         |          5 |         5 |  37.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  6 | 好好说话   |  6 | 英文         |          5 |         5 |  37.0 |
|  7 | tellme     |  1 | Java         |          5 |         5 |  37.0 |
|  7 | tellme     |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  7 | tellme     |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  7 | tellme     |  4 | 语文         |          5 |         5 |  37.0 |
|  7 | tellme     |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  7 | tellme     |  6 | 英文         |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  1 | Java         |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  4 | 语文         |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  8 | 老外学中文 |  6 | 英文         |          5 |         5 |  37.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  1 | Java         |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  4 | 语文         |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  2 | 菩提老祖   |  6 | 英文         |          6 |         2 |  56.0 |
|  3 | 白素贞     |  1 | Java         |          6 |         2 |  56.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  3 | 白素贞     |  4 | 语文         |          6 |         2 |  56.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  3 | 白素贞     |  6 | 英文         |          6 |         2 |  56.0 |
|  4 | 许仙       |  1 | Java         |          6 |         2 |  56.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  4 | 许仙       |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  4 | 许仙       |  4 | 语文         |          6 |         2 |  56.0 |
|  4 | 许仙       |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  4 | 许仙       |  6 | 英文         |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  1 | Java         |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  4 | 语文         |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  5 | 不想毕业   |  6 | 英文         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         2 |  56.0 |
|  7 | tellme     |  1 | Java         |          6 |         2 |  56.0 |
|  7 | tellme     |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  7 | tellme     |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  7 | tellme     |  4 | 语文         |          6 |         2 |  56.0 |
|  7 | tellme     |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  7 | tellme     |  6 | 英文         |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  1 | Java         |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  4 | 语文         |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  8 | 老外学中文 |  6 | 英文         |          6 |         2 |  56.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  1 | Java         |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  4 | 语文         |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  2 | 菩提老祖   |  6 | 英文         |          6 |         4 |  43.0 |
|  3 | 白素贞     |  1 | Java         |          6 |         4 |  43.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  3 | 白素贞     |  4 | 语文         |          6 |         4 |  43.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  3 | 白素贞     |  6 | 英文         |          6 |         4 |  43.0 |
|  4 | 许仙       |  1 | Java         |          6 |         4 |  43.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  4 | 许仙       |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  4 | 许仙       |  4 | 语文         |          6 |         4 |  43.0 |
|  4 | 许仙       |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  4 | 许仙       |  6 | 英文         |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  1 | Java         |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  4 | 语文         |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  5 | 不想毕业   |  6 | 英文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         4 |  43.0 |
|  7 | tellme     |  1 | Java         |          6 |         4 |  43.0 |
|  7 | tellme     |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  7 | tellme     |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  7 | tellme     |  4 | 语文         |          6 |         4 |  43.0 |
|  7 | tellme     |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  7 | tellme     |  6 | 英文         |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  1 | Java         |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  4 | 语文         |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  8 | 老外学中文 |  6 | 英文         |          6 |         4 |  43.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  1 | Java         |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  4 | 语文         |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  2 | 菩提老祖   |  6 | 英文         |          6 |         6 |  79.0 |
|  3 | 白素贞     |  1 | Java         |          6 |         6 |  79.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  3 | 白素贞     |  4 | 语文         |          6 |         6 |  79.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  3 | 白素贞     |  6 | 英文         |          6 |         6 |  79.0 |
|  4 | 许仙       |  1 | Java         |          6 |         6 |  79.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  4 | 许仙       |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  4 | 许仙       |  4 | 语文         |          6 |         6 |  79.0 |
|  4 | 许仙       |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  4 | 许仙       |  6 | 英文         |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  1 | Java         |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  4 | 语文         |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  5 | 不想毕业   |  6 | 英文         |          6 |         6 |  79.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         6 |  79.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         6 |  79.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         6 |  79.0 |
|  7 | tellme     |  1 | Java         |          6 |         6 |  79.0 |
|  7 | tellme     |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  7 | tellme     |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  7 | tellme     |  4 | 语文         |          6 |         6 |  79.0 |
|  7 | tellme     |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  7 | tellme     |  6 | 英文         |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  1 | Java         |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  4 | 语文         |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  8 | 老外学中文 |  6 | 英文         |          6 |         6 |  79.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  1 | Java         |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  4 | 语文         |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  2 | 菩提老祖   |  6 | 英文         |          7 |         2 |  80.0 |
|  3 | 白素贞     |  1 | Java         |          7 |         2 |  80.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  3 | 白素贞     |  4 | 语文         |          7 |         2 |  80.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  3 | 白素贞     |  6 | 英文         |          7 |         2 |  80.0 |
|  4 | 许仙       |  1 | Java         |          7 |         2 |  80.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  4 | 许仙       |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  4 | 许仙       |  4 | 语文         |          7 |         2 |  80.0 |
|  4 | 许仙       |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  4 | 许仙       |  6 | 英文         |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  1 | Java         |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  4 | 语文         |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  5 | 不想毕业   |  6 | 英文         |          7 |         2 |  80.0 |
|  6 | 好好说话   |  1 | Java         |          7 |         2 |  80.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  6 | 好好说话   |  4 | 语文         |          7 |         2 |  80.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  6 | 好好说话   |  6 | 英文         |          7 |         2 |  80.0 |
|  7 | tellme     |  1 | Java         |          7 |         2 |  80.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  7 | tellme     |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  7 | tellme     |  4 | 语文         |          7 |         2 |  80.0 |
|  7 | tellme     |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  7 | tellme     |  6 | 英文         |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  1 | Java         |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  4 | 语文         |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  8 | 老外学中文 |  6 | 英文         |          7 |         2 |  80.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          7 |         6 |  92.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          7 |         6 |  92.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  1 | Java         |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  4 | 语文         |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  2 | 菩提老祖   |  6 | 英文         |          7 |         6 |  92.0 |
|  3 | 白素贞     |  1 | Java         |          7 |         6 |  92.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  3 | 白素贞     |  4 | 语文         |          7 |         6 |  92.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  3 | 白素贞     |  6 | 英文         |          7 |         6 |  92.0 |
|  4 | 许仙       |  1 | Java         |          7 |         6 |  92.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  4 | 许仙       |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  4 | 许仙       |  4 | 语文         |          7 |         6 |  92.0 |
|  4 | 许仙       |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  4 | 许仙       |  6 | 英文         |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  1 | Java         |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  4 | 语文         |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  5 | 不想毕业   |  6 | 英文         |          7 |         6 |  92.0 |
|  6 | 好好说话   |  1 | Java         |          7 |         6 |  92.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  6 | 好好说话   |  4 | 语文         |          7 |         6 |  92.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  6 | 好好说话   |  6 | 英文         |          7 |         6 |  92.0 |
|  7 | tellme     |  1 | Java         |          7 |         6 |  92.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  7 | tellme     |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  7 | tellme     |  4 | 语文         |          7 |         6 |  92.0 |
|  7 | tellme     |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  7 | tellme     |  6 | 英文         |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  1 | Java         |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  4 | 语文         |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  8 | 老外学中文 |  6 | 英文         |          7 |         6 |  92.0 |
+----+------------+----+--------------+------------+-----------+-------+
960 rows in set (0.01 sec)

mysql> select student.id,student.name,course.id,course.name,score.student_id,score.course_id,score.score from student,course,score where student.id = score.student_id;
+----+------------+----+--------------+------------+-----------+-------+
| id | name       | id | name         | student_id | course_id | score |
+----+------------+----+--------------+------------+-----------+-------+
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  2 | 中国传统文化 |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  4 | 语文         |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         6 |  98.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  4 | 语文         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  6 | 英文         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  2 | 中国传统文化 |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  3 | 计算机原理   |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  4 | 语文         |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  2 | 菩提老祖   |  6 | 英文         |          2 |         5 |  59.5 |
|  3 | 白素贞     |  1 | Java         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         1 |  33.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         1 |  33.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         1 |  33.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  1 | Java         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         3 |  68.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         3 |  68.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         3 |  68.0 |
|  3 | 白素贞     |  1 | Java         |          3 |         5 |  99.0 |
|  3 | 白素贞     |  2 | 中国传统文化 |          3 |         5 |  99.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         5 |  99.0 |
|  3 | 白素贞     |  4 | 语文         |          3 |         5 |  99.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  3 | 白素贞     |  6 | 英文         |          3 |         5 |  99.0 |
|  4 | 许仙       |  1 | Java         |          4 |         1 |  67.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         1 |  67.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         1 |  67.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         1 |  67.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         1 |  67.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         1 |  67.0 |
|  4 | 许仙       |  1 | Java         |          4 |         3 |  23.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         3 |  23.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         3 |  23.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         3 |  23.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         3 |  23.0 |
|  4 | 许仙       |  1 | Java         |          4 |         5 |  56.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         5 |  56.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         5 |  56.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         5 |  56.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         5 |  56.0 |
|  4 | 许仙       |  1 | Java         |          4 |         6 |  72.0 |
|  4 | 许仙       |  2 | 中国传统文化 |          4 |         6 |  72.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         6 |  72.0 |
|  4 | 许仙       |  4 | 语文         |          4 |         6 |  72.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         6 |  72.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  4 | 语文         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  6 | 英文         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  2 | 中国传统文化 |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  3 | 计算机原理   |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  4 | 语文         |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  5 | 不想毕业   |  6 | 英文         |          5 |         5 |  37.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         2 |  56.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         2 |  56.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         2 |  56.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         4 |  43.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         4 |  43.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         4 |  43.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  1 | Java         |          6 |         6 |  79.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         6 |  79.0 |
|  6 | 好好说话   |  3 | 计算机原理   |          6 |         6 |  79.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         6 |  79.0 |
|  6 | 好好说话   |  5 | 高阶数学     |          6 |         6 |  79.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         6 |  79.0 |
|  7 | tellme     |  1 | Java         |          7 |         2 |  80.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  7 | tellme     |  3 | 计算机原理   |          7 |         2 |  80.0 |
|  7 | tellme     |  4 | 语文         |          7 |         2 |  80.0 |
|  7 | tellme     |  5 | 高阶数学     |          7 |         2 |  80.0 |
|  7 | tellme     |  6 | 英文         |          7 |         2 |  80.0 |
|  7 | tellme     |  1 | Java         |          7 |         6 |  92.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         6 |  92.0 |
|  7 | tellme     |  3 | 计算机原理   |          7 |         6 |  92.0 |
|  7 | tellme     |  4 | 语文         |          7 |         6 |  92.0 |
|  7 | tellme     |  5 | 高阶数学     |          7 |         6 |  92.0 |
|  7 | tellme     |  6 | 英文         |          7 |         6 |  92.0 |
+----+------------+----+--------------+------------+-----------+-------+
120 rows in set (0.00 sec)

mysql> select student.id,student.name,course.id,course.name,score.student_id,score.course_id,score.score from student,course,score where student.id = score.student_id and course.id and score.coursr_id;
ERROR 1054 (42S22): Unknown column 'score.coursr_id' in 'where clause'
mysql> select student.id,student.name,course.id,course.name,score.student_id,score.course_id,score.score from student,course,score where student.id = score.student_id and course.id = score.course_id;
+----+------------+----+--------------+------------+-----------+-------+
| id | name       | id | name         | student_id | course_id | score |
+----+------------+----+--------------+------------+-----------+-------+
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  3 | 白素贞     |  1 | Java         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  4 | 许仙       |  1 | Java         |          4 |         1 |  67.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         6 |  79.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  7 | tellme     |  6 | 英文         |          7 |         6 |  92.0 |
+----+------------+----+--------------+------------+-----------+-------+
20 rows in set (0.00 sec)

mysql> select student.id,student.name,course.id,course.name,score.student_id,score.course_id,score.score from student,course,score where student.id = score.student_id and course.id = score.course_id;
+----+------------+----+--------------+------------+-----------+-------+
| id | name       | id | name         | student_id | course_id | score |
+----+------------+----+--------------+------------+-----------+-------+
|  1 | 黑旋风李逵 |  1 | Java         |          1 |         1 |  70.5 |
|  1 | 黑旋风李逵 |  3 | 计算机原理   |          1 |         3 |  98.5 |
|  1 | 黑旋风李逵 |  5 | 高阶数学     |          1 |         5 |  33.0 |
|  1 | 黑旋风李逵 |  6 | 英文         |          1 |         6 |  98.0 |
|  2 | 菩提老祖   |  1 | Java         |          2 |         1 |  60.0 |
|  2 | 菩提老祖   |  5 | 高阶数学     |          2 |         5 |  59.5 |
|  3 | 白素贞     |  1 | Java         |          3 |         1 |  33.0 |
|  3 | 白素贞     |  3 | 计算机原理   |          3 |         3 |  68.0 |
|  3 | 白素贞     |  5 | 高阶数学     |          3 |         5 |  99.0 |
|  4 | 许仙       |  1 | Java         |          4 |         1 |  67.0 |
|  4 | 许仙       |  3 | 计算机原理   |          4 |         3 |  23.0 |
|  4 | 许仙       |  5 | 高阶数学     |          4 |         5 |  56.0 |
|  4 | 许仙       |  6 | 英文         |          4 |         6 |  72.0 |
|  5 | 不想毕业   |  1 | Java         |          5 |         1 |  81.0 |
|  5 | 不想毕业   |  5 | 高阶数学     |          5 |         5 |  37.0 |
|  6 | 好好说话   |  2 | 中国传统文化 |          6 |         2 |  56.0 |
|  6 | 好好说话   |  4 | 语文         |          6 |         4 |  43.0 |
|  6 | 好好说话   |  6 | 英文         |          6 |         6 |  79.0 |
|  7 | tellme     |  2 | 中国传统文化 |          7 |         2 |  80.0 |
|  7 | tellme     |  6 | 英文         |          7 |         6 |  92.0 |
+----+------------+----+--------------+------------+-----------+-------+
20 rows in set (0.00 sec)

mysql> select *from student;
+----+-------+------------+------------------+------------+
| id | sn    | name       | qq_mail          | classes_id |
+----+-------+------------+------------------+------------+
|  1 | 09982 | 黑旋风李逵 | xuanfeng@qq.com  |          1 |
|  2 | 00835 | 菩提老祖   | NULL             |          1 |
|  3 | 00391 | 白素贞     | NULL             |          1 |
|  4 | 00031 | 许仙       | xuxian@qq.com    |          1 |
|  5 | 00054 | 不想毕业   | NULL             |          1 |
|  6 | 51234 | 好好说话   | say@qq.com       |          2 |
|  7 | 83223 | tellme     | NULL             |          2 |
|  8 | 09527 | 老外学中文 | foreigner@qq.com |          2 |
+----+-------+------------+------------------+------------+
8 rows in set (0.00 sec)

mysql> select *from score;
+-------+------------+-----------+
| score | student_id | course_id |
+-------+------------+-----------+
|  70.5 |          1 |         1 |
|  98.5 |          1 |         3 |
|  33.0 |          1 |         5 |
|  98.0 |          1 |         6 |
|  60.0 |          2 |         1 |
|  59.5 |          2 |         5 |
|  33.0 |          3 |         1 |
|  68.0 |          3 |         3 |
|  99.0 |          3 |         5 |
|  67.0 |          4 |         1 |
|  23.0 |          4 |         3 |
|  56.0 |          4 |         5 |
|  72.0 |          4 |         6 |
|  81.0 |          5 |         1 |
|  37.0 |          5 |         5 |
|  56.0 |          6 |         2 |
|  43.0 |          6 |         4 |
|  79.0 |          6 |         6 |
|  80.0 |          7 |         2 |
|  92.0 |          7 |         6 |
+-------+------------+-----------+
20 rows in set (0.00 sec)

mysql> select *from course;
+----+--------------+
| id | name         |
+----+--------------+
|  1 | Java         |
|  2 | 中国传统文化 |
|  3 | 计算机原理   |
|  4 | 语文         |
|  5 | 高阶数学     |
|  6 | 英文         |
+----+--------------+
6 rows in set (0.00 sec)
