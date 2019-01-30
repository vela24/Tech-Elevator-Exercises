--Asssumptions: 
--this is a mom and pop facility where the only employees are the owners, eliminating the need for additional staff and store tables. 

--Populate the tables with data for at least four projects, three departments, and eight employees. 
--Make sure each project has at least one employee assigned to it, and each department has at least two employees in it.

CREATE DATABASE new_business;

CREATE TABLE employee
(
        
	employee_id serial,                               
	last_Name varchar(50) not null,
	first_Name varchar(50) not null,
	gender varchar(50) not null,
	birthday varchar(50) not null,
	hire_date varchar(5) not null,
	department_id varchar(10) not null,
	
	constraint pk_employee_id primary key (employee_id)
);



CREATE TABLE department
(
	department_id serial,
	department_name varchar(30) not null,
	--pet_type varchar(20) not null,
	number_of_employees int,

	constraint pk_department_id primary key (department_id)
);

CREATE TABLE project_id
(
	project_id INT GENERATED ALWAYS AS IDENTITY,
	name_of_project varchar(50) not null,
	--amount_procedure decimal (7,2) not null,
	
	constraint pk_project_id primary key (project_id)
	
);

CREATE TABLE project
(
	project_id serial,
	project_name varchar(30) not null, -- which ones needs to be primary key? 
	employee_id int not null,
	
	
	constraint pk_project_id primary key (project_id),
	--constraint pk_project_id primary key (project_id, owner_id),
	constraint fk_employee_id foreign key (employee_id) references (employee_id),
	--constraint fk_owner_id foreign key (owner_id) references owner(owner_id)
);


--constraint fk_procedure_id foreign key (procedure_id) references procedure (procedure_id)
--);



select * FROM employee;

select * FROM project;

select * FROM project_id;

SELECT * FROM project_employee;

SELECT first_name, last_name, project_id 
FROM employee e  
LEFT OUTER JOIN project_employee pid
on pid.employee_id = e.employee_id  
WHERE project_id is null;

SELECT first_name, last_name, department_id  
FROM employee;

SELECT department_id, name FROM department;

SELECT name FROM department WHERE name LIKE 'Store Support';

DELETE FROM department Where department_id = 5;