create table students(
id serial primary key,
name varchar(40) not null,
email varchar(40) unique,
age int,
marks decimal(10,2)
);

insert into students(name,email,age,marks)values('Akash','akash002@gmail.com',13,75.87);
insert into students(name,email,age,marks)values('Bhawish','bhawish062@gmail.com',14,85.77);
insert into students(name,email,age,marks)values('Dheeraj','dheeraj202@gmail.com',12,65.87);
insert into students(name,email,age,marks)values('Athrav','athrav202@gmail.com',18,95.87);
insert into students(name,email,age,marks)values('Ranveer','ranveer102@gmail.com',17,65.87);
insert into students(name,email,age,marks)values('ankush','ankush222@gmail.com',23,90.00);
select * from students;

-- Q2: Fetch student details where age > 21.--
select * from students where age>21

--Q3: Update the email of the student with id = 5 to 'rahul@gmail.com'.--
update students set email='rahul@gmail.com' where id=5;

--Q4: Delete all students with age < 18.
delete from students where age<18;

--Q5: Find the second highest score student details--
select * from students max(marks) offset 1 limit 1;

create table student(
id int primary key,
name varchar(40),
age int
)
create table courses(
course_id int,
student_id int,
course_name varchar(40),
foreign key(student_id)references student(id)
)

insert into student values(1,'Rahul',22);
insert into student values(2,'priya',21);
insert into student values(3,'Akash',23);

insert into courses values(101,1,'java');
insert into courses values(102,2,'python');
insert into courses values(103,1,'Sql');

--Q6: Write a query to display student names and their enrolled course names.
select sname ,ccourse_name from student s left join course c in s.id=c.coursesid