# Java Project: Database Connectivity

This project demonstrates a Java application for database connectivity with MySQL. Below are the SQL scripts and explanations for setting up the required database.

---

## Database Setup

### Step 1: Create the Database
```sql
create database CollegeWebsite_LogInDetails;
use CollegeWebsite_LogInDetails;
create table studentLogIn(
    serial_No int AUTO_INCREMENT primary key,
    name varchar(100),
    email varchar(200),
    password varchar(200),
    mobileNumber varchar(200)
);

insert into studentLogIn values(null, 'student1', 'student1@gmail.com', 'Student@123', '987654321');
insert into studentLogIn values(null, 'student2', 'student2@gmail.com', 'Student@123', '123456789');
insert into studentLogIn values(null, 'student3', 'student3@gmail.com', 'Student@123', '987654372');

create table teacherLogIn(
    serial_No int AUTO_INCREMENT primary key,
    fullname varchar(100),
    email varchar(200),
    password varchar(200),
    mobileNumber varchar(200)
);

insert into teacherLogIn values(null, 'Teacher1', 'teacher1@gmail.com', 'teach@123', '9876543210');
insert into teacherLogIn values(null, 'Teacher2', 'teacher2@gmail.com', 'teach@123', '8976583432');
insert into teacherLogIn values(null, 'Teacher3', 'teacher3@gmail.com', 'teach@123', '6784934592');

create table coursesData(
    courseID varchar(100) unique not null,
    courseName varchar(100),
    price varchar(100),
    author varchar(100)
);

insert into coursesData values('JAVA123', 'JAVA', '1200', 'teacherName1');
insert into coursesData values('PYTYHON123', 'PYTHON', 'Free', 'teacherName2');
insert into coursesData values('JAVASCRIPT123', 'JAVASCRIPT', '345', 'teacherName3');

show tables;
select * from studentLogIn;
select * from teacherLogIn;
select * from coursesData;

```

##
---

### Instructions to Add It to Your README
1. Open the `README.md` file in a text editor.
2. Copy the above content.
3. Paste it into the file.
4. Save the changes.
5. Add the file to your Git repository:
   ```bash
   git add README.md
   git commit -m "Added database setup instructions"
   git push origin main```
