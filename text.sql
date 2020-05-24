create table exam_result(
id int,
name varchar(20),
chinese decimal(3,1),
math decimal(3,1),
english decimal(3,1));
insert into exam_result values
(1,"唐三藏",34.4,59.7,90.8),
(2,"孙悟空",77.9,89.0,90.9);
insert into exam_result values
(3,"猪八戒",44,0,33,66),
(4,"沙和尚",99,88,77);
 insert into exam_result values(
3,"猪八戒",67.8,89.0,66.7);
insert into exam_result values(4,"沙和尚",45.8,89.7,55.6);
insert into exam_result values(5,"萧炎",66.6,66.6,66.6),
(6,"林动",77.7,77.7,77.7),
(7,"秦羽",99.9,99.9,99.9);
insert exam_result values (8,"周青",88.8,88.8,88.8);
select name,chinese+math+english from exam_result;
select id,name,chinese+math+english as total from exam_result;
select distinct chinese from exam_result;
select * from exam_result order by chinese desc;
select *from exam_result where chinese = 66.6;
select *from exam_result where chinese is null;
select *from exam_result where chinese <60;
select *from exam_result where chinese<math;
select *from exam_result where chinese<=>null;
select name ,chinese+math+english as total from exam_result where chinese+math+english >200;
select *from exam_result where chinese<80 or matb>80;
select *from exam_result where chinese>80 or math>80;
select *from exam_result where chinese between 80 and 90;
select *from exam_result where chinese>=80 and chinese <=90;
select *from exam_result where math in (66.6,99.9);
select *from exam_result where name like "林%";
select name,chinese+math+english as total from exam_result order by total desc limit 3 offset 3;
select name,chinese+math+english as total from exam_result order by total desc limit 3 offset 100;
update exam_result set math = 60 where name = "林动"；
 update exam_result set math = 60 where name = "林动";
 update exam_result set math = 1.00,chinese  = 1.00 where name ="秦羽";