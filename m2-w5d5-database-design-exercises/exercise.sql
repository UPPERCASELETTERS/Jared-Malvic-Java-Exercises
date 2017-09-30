BEGIN TRANSACTION;

CREATE TABLE department (
        id serial,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_department_id PRIMARY KEY (id)
);

CREATE TABLE employee (
        id serial,
        first_name varchar(64) NOT NULL,
        last_name varchar(64) NOT NULL,
        gender varchar(6) NOT NULL,
        job_title varchar(64) NOT NULL,
        birthday smallint NOT NULL,
        hiredate smallint NOT NULL,
        CONSTRAINT fk_department_id FOREIGN (department_key) REFERENCE department(pk_department_id)
);
INSERT INTO department (name) VALUES 'my department');