CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50)
);

CREATE TABLE employee_projects (
    employee_id INT,
    project_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

select * from employee_projects

insert into departments (department_id, department_name)
values
(1, 'Finances'),
(2, 'Production'),
(3, 'Human Resources');

select * from departments;

insert into employees (employee_id, employee_name, department_id)
values
(1, 'Alice', 1),
(2, 'Bob', 2),
(3, 'Charli', 3),
(4, 'Diana', 2),
(5, 'Emily', 1),
(6, 'Max', Null);

select * from employees;

insert into projects (project_id, project_name)
values
(1, 'Money Makers'),
(2, 'Dream Killers'),
(3, 'Miracle Worker');

select * from projects;

insert into employee_projects (employee_id , project_id)
 values
(1, 2),
(2, 1),
(3, 3),
(4, 1);

select * from employee_projects;

select e.employee_id , e.employee_name, d.department_name
from employees e
    inner join departments d on e.department_id = d.department_id;

select e.employee_id , e.employee_name
from employees e
where department_id is Null;


select e.employee_name, p.project_name
from employees e
    inner join employee_projects ep on e.employee_id = ep.employee_id
    inner join projects p on p.project_id = ep.project_id


select e.employee_name, d.department_name
from employees e
    full join departments d on e.department_id = d.department_id;


select d.department_name, count(e.employee_id) as employee_count
from departments d
    left join employees e on d.department_id = e.department_id
    group by d.department_id, d.department_name;
