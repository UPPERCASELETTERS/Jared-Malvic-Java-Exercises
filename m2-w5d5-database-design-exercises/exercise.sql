BEGIN TRANSACTION;

CREATE TABLE department (
        department_id serial,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_department_department_id PRIMARY KEY (department_id)
);

CREATE TABLE project (
        project_id serial,
        name varchar(255) NOT NULL,
        start_date date NOT NULL,
        CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE employee (
        employee_id serial,
        department_id integer NOT NULL,
        first_name varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        gender varchar(255) NOT NULL,
        job_title varchar(255) NOT NULL,
        birthday date NOT NULL,
        hiredate date NOT NULL,
        CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id),
        CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(department_id)
);

CREATE TABLE project_employee (
        project_id integer NOT NULL,
        employee_id integer NOT NULL,
        CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES project(project_id),
        CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);      
ROLLBACK;
COMMIT; 

INSERT INTO department (name) VALUES ('Sales');
INSERT INTO department (name) VALUES ('Engineering');
INSERT INTO department (name) VALUES ('Human Resources');

INSERT INTO project (name, start_date) VALUES ('Profit Sharing', '2017-01-01');
INSERT INTO project (name, start_date) VALUES ('Product Development', '2017-01-01'); 
INSERT INTO project (name, start_date) VALUES ('Sexual Harassment Training', '2017-01-01');
INSERT INTO project (name, start_date) VALUES ('Payroll Training', '2017-01-01');

INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (13, 'Sally', 'Seller', 'Female', 'Boss Hoss', '1960-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (13, 'Sam', 'Sale', 'Male', 'Assistant Boss Hoss', '1961-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (14, 'Eugene', 'Engine', 'Male', 'Boss Hoss', '1960-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (14, 'Eva', 'Builder', 'Female', 'Assistant Boss Hoss', '1961-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (14, 'Ernie', 'Planner', 'Male', 'Planning Lead', '1961-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (14, 'Eric', 'Construction', 'Male', 'Planning Assistant', '1961-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (15, 'Patricia', 'Culture', 'Female', 'HR Boss Hoss', '1960-01-01', '2016-01-01');
INSERT INTO employee (department_id, first_name, last_name, gender, job_title, birthday, hiredate)
VALUES (15, 'Pat', 'Correctness', 'Unknown', 'HR Assistant', '1961-01-01', '2016-01-01');

INSERT INTO project_employee (project_id, employee_id) VALUES (5,1);
INSERT INTO project_employee (project_id, employee_id) VALUES (5,2);

INSERT INTO project_employee (project_id, employee_id) VALUES (6,3);
INSERT INTO project_employee (project_id, employee_id) VALUES (6,4);
INSERT INTO project_employee (project_id, employee_id) VALUES (6,5);
INSERT INTO project_employee (project_id, employee_id) VALUES (6,5);

INSERT INTO project_employee (project_id, employee_id) VALUES (7,1);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,2);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,3);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,4);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,5);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,6);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,7);
INSERT INTO project_employee (project_id, employee_id) VALUES (7,8);

INSERT INTO project_employee (project_id, employee_id) VALUES (8,1);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,2);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,3);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,4);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,5);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,6);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,7);
INSERT INTO project_employee (project_id, employee_id) VALUES (8,8);


SELECT * FROM site WHERE campground_id = ? AND site_id NOT IN (SELECT site_id FROM site s JOIN reservation r ON s.site_id = r.site_id WHERE campground_id =? AND (to_date BETWEEN ? AND ? OR from_date BETWEEN ? AND ? OR (from_date <= ? AND to_date >= ?)))


 FROM PARK WHERE (SELECT * FROM campground WHERE (SELECT * FROM 
 
SELECT site_id FROM site s JOIN campground c ON s.campground_id = c.campground_id
JOIN park p ON c.park_id = p.park_id WHERE p.park_id=1 AND c.campground_id=1 AND s.site_number=5 

INSERT INTO reservation SET (site_id, name, from_date, to_date, create_date RETURNING reservation_id


DELETE FROM reservation WHERE reservation_id=50;

Select site_id FROM reservation WHERE site_id = 46 AND to_date BETWEEN '2017-11-09' AND '2017-11-14' OR from_date BETWEEN '2017-11-09' AND '2017-11-14'