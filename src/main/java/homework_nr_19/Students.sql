create table Students(
	studentID serial primary key,
	name text,
	surname text,
	age int,
	sex text
);

insert into Students (name, surname, age, sex)
values
('Alice', 'Smith', 20, 'Female'),
('Bob', 'Johnson', 22, 'Male'),
('Charlie', 'Brown', 19, 'Male'),
('Diana', 'Lee', 21, 'Female'),
('Emily', 'Davis', 21, 'Female');

update Students
set age = 24
where name = 'Emily'
and surname ='Davis';

delete from Students
where name = 'Charlie'
and surname = 'Brown';

select name, age from Students
where sex = 'Female';

select * from students
where surname like 'C%';

select * from Students;
