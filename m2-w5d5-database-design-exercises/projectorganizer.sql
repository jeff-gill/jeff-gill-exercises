create database projectorganizer

drop table project_department
drop table employee_department
drop table employee_project
drop table project
drop table employee
drop table job_title
drop table department

---- create tables: employee, department, project, job title, employee project, project department

create table project (
        project_id serial,
        project_name varchar(35) not null,
        start_date date not null,
        
        constraint pk_project_id primary key (project_id)
 );
        
create table department (
        department_id serial,
        department_name varchar(20) not null,
        
        constraint pk1_department_id primary key (department_id)
);
        
create table job_title (
        title_id serial,
        title_name varchar(20) not null,
        
        constraint pk1_title_id primary key (title_id)
);       

create table employee (
        employee_id serial,
        job_title_id int,   --int because it's pulling from another table with data type serial as primary key
        last_name varchar(35) not null,
        first_name varchar(35) not null,
        gender_initial varchar(2) not null,
        birthday date not null,
        hire_date date not null,
        department_id int, --int because it's pulling from another table with data type serial as primary key
        
        constraint pk_employee_id primary key (employee_id),
        constraint fk_job_title_id foreign key (job_title_id) references job_title(title_id),
        constraint fk_department_id foreign key (department_id) references department(department_id)
);

create table employee_department (
        department_id int,  --int because it's pulling from another table with data type serial as primary key
        employee_id int,  --int because it's pulling from another table with data type serial as primary key
        
        constraint fk1_department_id foreign key (department_id) references department(department_id),
        constraint fk2_employee_id foreign key (employee_id) references employee(employee_id)
);


create table employee_project (
        project_id int,  --int because it's pulling from another table with data type serial as primary key
        employee_id int,  --int because it's pulling from another table with data type serial as primary key
        
        constraint fk1_project_id foreign key (project_id) references project(project_id),
        constraint fk2_employee_id foreign key (employee_id) references employee(employee_id)
);

--job: bread baker, meat butcher, vegetable cutter, condiment captain, sandwich stacker, cheese slicer

select * from job_title

insert into job_title (title_id, title_name)
        values (1, 'bread baker')
        
insert into job_title (title_id, title_name)
        values (2, 'meat butcher')
        
insert into job_title (title_id, title_name)
        values (3, 'vegetable cutter')
        
 insert into job_title (title_id, title_name)
        values (4, 'condiment captain')
        
insert into job_title (title_id, title_name)
        values (5, 'sandwich stacker')
        
insert into job_title (title_id, title_name)
        values (6, 'cheese slicer')

--project: italian sub, grilled cheese, turkey sandwich, the dagwood, blt

select * from project

insert into project (project_id, project_name, start_date)
        values (1, 'italian sub', date '3/13/2017')
        
insert into project (project_id, project_name, start_date)
        values (2, 'grilled cheese', date '5/13/2015')

insert into project (project_id, project_name, start_date)
        values (3, 'turkey sandwich', date '7/22/2016')

insert into project (project_id, project_name, start_date)
        values (4, 'the dagwood', date '10/01/2018') 

insert into project (project_id, project_name, start_date)
        values (5, 'blt', date '01/01/2011')        
       
--department: bread, meat and cheese, vegetables, sandwich assembly

select * from department        

insert into department (department_id, department_name)
        values (1, 'bread')
        
insert into department (department_id, department_name)
        values (2, 'meat and cheese')

insert into department (department_id, department_name)
        values (3, 'vegetables')

insert into department (department_id, department_name)
        values (4, 'sandwich assembly')

--employee:  Jordan Edwards, Sydnie Savidge, Ella Parris, Truman Frank, Terrance Beasley, June Grant, Dudley Cannon, Polly McPollerson

select * from employee

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (1, 'Edwards', 'Jordan', 'M', date '12/20/1977', date '4/12/05', 1)

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (1, 'Sydnie', 'Savidge', 'F', date '2/29/1988', date '7/13/2017', 1)
        
insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (2, 'Parris', 'Ella', 'F', date '9/11/1968', date '6/15/2010', 2)
        
insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (2, 'Frank', 'Truman', 'F', date '10/18/1976', date '8/15/2000', 2)

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (3, 'Beasley', 'Terrance', 'F', date '1/08/1987', date '4/25/2009', 3)

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (4, 'Grant', 'June', 'F', date '2/05/1966', date '2/05/1999', 4)

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (5, 'Cannon', 'Dudley', 'M', date '9/20/1990', date '4/30/2008',4)

insert into employee (job_title_id, last_name, first_name, gender_initial, birthday, hire_date, department_id)
        values (6, 'McPollerson', 'Polly', 'M', date '12/16/1997', date '11/09/2014', 2)

Select* from employee_project

insert into employee_project (employee_id,project_id)
        values (1, 1)

insert into employee_project (employee_id,project_id)
        values (1, 2)

insert into employee_project (employee_id,project_id)
        values (1, 4)

insert into employee_project (employee_id,project_id)
        values (2, 3)
  
insert into employee_project (employee_id,project_id)
        values (2, 4)
        
insert into employee_project (employee_id,project_id)
        values (2, 5)
        
insert into employee_project (employee_id,project_id)
        values (3, 2)      

insert into employee_project (employee_id,project_id)
        values (3, 4)

insert into employee_project (employee_id,project_id)
        values (3, 5)

insert into employee_project (employee_id,project_id)
        values (4, 1)        

insert into employee_project (employee_id,project_id)
        values (4, 3)        
        
insert into employee_project (employee_id,project_id)
        values (4, 4)        

insert into employee_project (employee_id,project_id)
        values (5, 1)

insert into employee_project (employee_id,project_id)
        values (5, 3)

insert into employee_project (employee_id,project_id)
        values (5, 4)

insert into employee_project (employee_id,project_id)
        values (5, 5)

insert into employee_project (employee_id,project_id)
        values (6, 1)

insert into employee_project (employee_id,project_id)
        values (6, 2)

insert into employee_project (employee_id,project_id)
        values (6, 3)

insert into employee_project (employee_id,project_id)
        values (6, 4)
        
insert into employee_project (employee_id,project_id)
        values (6, 5)
        
insert into employee_project (employee_id,project_id)
        values (7, 1)
        
insert into employee_project (employee_id,project_id)
        values (7, 3)
            
insert into employee_project (employee_id,project_id)
        values (7, 4)
        
insert into employee_project (employee_id,project_id)
        values (7, 5)
        
insert into employee_project (employee_id,project_id)
        values (8, 1)
        
insert into employee_project (employee_id,project_id)
        values (8, 2)
        
insert into employee_project (employee_id,project_id)
        values (8, 3)
        
insert into employee_project (employee_id,project_id)
        values (8, 4)
    
 select * from employee_department
 
insert into employee_department (employee_id, department_id)
        values (1, 1)     
  
insert into employee_department (employee_id, department_id)
        values (2, 1)     
   
insert into employee_department (employee_id, department_id)
        values (3, 2)     
    
insert into employee_department (employee_id, department_id)
        values (4, 2)     
  
insert into employee_department (employee_id, department_id)
        values (5, 3)     
  
insert into employee_department (employee_id, department_id)
        values (6, 4)     
  
insert into employee_department (employee_id, department_id)
        values (7, 4)     
  
insert into employee_department (employee_id, department_id)
        values (8, 2)     
      
select * from employee