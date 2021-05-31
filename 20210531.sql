-- where 절에 서브쿼리를 포함하여 상사가 없는 모든 사원 표시
select * from HR.employees where manager_id is null;

-- where 절에 서브쿼리를 포함하여 부하직원 없는 모든 사원 표시
select * from HR.employees where employee_id not in 
(select manager_id from HR.employees where manager_id is not null);

-- set 연산자
select manager_id from HR.employees where department_id = 90
union
select manager_id from HR.employees where job_id like '%REP%';

-- 회원가입 예시
select user_id from 회원 where user_id = 'highland0'
union
select user_id from 직원 where user_id = 'highland0';

select * from HR.employees;
select * from HR.job_history;

-- 200 직원의 현재 직무와 과거 직무 모두 출력
select employee_id, job_id, department_id, 'present' from HR.employees where employee_id = 200
union
select employee_id, job_id, department_id, 'past' from HR.job_history where employee_id = 200;

-- 모든사원의 현제와 과거 직무 모두 출력
select employee_id, job_id, department_id, 'present' from HR.employees
union
select employee_id, job_id, department_id, 'past' from HR.job_history;

--- DML : insert, delete, update, select
---- CRUD : create, read, update, delete

create table hire_date
(
id number(8),
hire_date date
);

desc hire_Date;
select * from hire_Date;

create table dept(
    deptno number(2) not null,
    deptname varchar2(14),
    loc varchar2(13),
    create_Date date default sysdate
);

desc dept;
select * from dept;

desc HR.employees;

/*
table : employees
EMPLOYEE_ID    NOT NULL NUMBER(6)    
FIRST_NAME              VARCHAR2(20) 
LAST_NAME      NOT NULL VARCHAR2(25) 
EMAIL          NOT NULL VARCHAR2(25) 
PHONE_NUMBER            VARCHAR2(20) 
HIRE_DATE      NOT NULL DATE         
JOB_ID         NOT NULL VARCHAR2(10) 
SALARY                  NUMBER(8,2)  
COMMISSION_PCT          NUMBER(2,2)  
MANAGER_ID              NUMBER(6)    
DEPARTMENT_ID           NUMBER(4)   
*/

create table employees(
    EMPLOYEE_ID NUMBER(6) NOT NULL,
    FIRST_NAME VARCHAR2(20),
    LAST_NAME VARCHAR2(25) NOT NULL,
    EMAIL VARCHAR2(25) NOT NULL,
    PHONE_NUMBER VARCHAR2(20),
    HIRE_DATE DATE DEFAULT sysdate,
    JOB_ID VARCHAR2(10) NOT NULL ,
    SALARY NUMBER(8,2),
    COMMISSION_PCT NUMBER(2,2),
    MANAGER_ID NUMBER(6),
    DEPARTMENT_ID NUMBER(4)
);

desc HR.departments;
drop table departments;

create table departments (
DEPARTMENT_ID   NUMBER(4) NOT NULL ,
DEPARTMENT_NAME  VARCHAR2(30) NOT NULL,
MANAGER_ID NUMBER(6)  default 100  ,
LOCATION_ID NUMBER(4)  
);

Insert into departments (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID , LOCATION_ID)
    values  (70, 'Public Relations', 100, 1700);
select * from departments;

Insert into departments (DEPARTMENT_ID, DEPARTMENT_NAME)
    values  (30, 'Purchasing');

Insert into departments (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID , LOCATION_ID)
    values  (100, 'Finance', null, null);
select * from departments;

insert into departments
    values (10, 'Administation', 200, 1700);

insert into departments
    values(20, 'Marketing', null, null);
select * from departments;

insert into employees( EMPLOYEE_ID,
    FIRST_NAME,
    LAST_NAME ,
    EMAIL,
    PHONE_NUMBER,
    HIRE_DATE ,
    JOB_ID ,
    SALARY ,
    COMMISSION_PCT ,
    MANAGER_ID ,
    DEPARTMENT_ID )
    values (113, 'Louis','Popp','LPOPP','515.125.4567', sysdate, 'AC_ACCOUNT',6900,
    null, 205, 100);

select * from employees;

insert into employees
values (114, 'Den','Raphealy','DRAPHEAL', '515.127.4561',to_date('28/05/20','dd/mm/yy'),'AC_ACCOUNT',
11000,null, 100,30);
select * from employees;

insert into employees
    values(115, 'Soong', 'Rhee', 'SRHEE', '010.123.1122','21/05/31','AC_ACCUNT', 6000, null, 110,30);
select * from employees;

drop table sales_reps;
create table sales_reps(
    id number,
    name varchar2(25),
    salary number(8,2),
    commission_pct number(2,2)
);
desc sales_reps;

select employee_id, last_name, salary, commission_pct
from HR.employees where job_id like '%REP%';

insert into sales_reps(id, name, salary, commission_pct)
select employee_id, last_name, salary, commission_pct
from HR.employees where job_id like '%REP%';

select * from sales_reps;

insert into departments(department_id, department_name)
values (20, 'Marketing');

select * from departments;

insert into departments
values(30, 'Purchasing', default, null);

select * from departments;


-- update
select * from employees where employee_id = 113;
update employees
set department_id = 70
where employee_id = 113;
select * from employees;

DELETE from employees;
insert into employees select * from HR.employees;

select * from employees;

-- Q) 114번 사원의 직무를 205번과 동일하게, 급여는 113번의 급여와 동일하게
update employees set job_id = (select job_id from employees where employee_id = 205)
, salary = (select salary from employees where employee_id = 113)
where employee_id = 114; 

-- Q) 200번과 같은 직무를 하는 직원들의 부서를 100번이 속해 있는 부서로 변경
update employees set department_id = (select department_id from employees where employee_id = 100)
where job_id = (select job_id from employees where employee_id = 200);

delete from departments
where department_name = 'Marketing';

delete from departments;

select * from departments;

-- hr로 부터 부서정보 가져오기.
insert into departments
select * from HR.departments;

-- 부서번호가 30번과 40번 부서를 삭제
delete from departments
where department_id in (30, 40);

-- 부서명이 'Public'을 포함하는 부서번호에 해당하는 사원삭제
delete from departments
where department_name like '%Public%';

-- 부서명이 'IT'에 해당하는 사원들의 급여를 120번의 사원의 급여와 같게 변경하시오.
update employees set salary = (select salary from employees where employee_id = 120)
where department_id = (select department_id from departments where department_name = 'IT');

-- 20번과 30번 부서의 사원 급여를 130번 사원의 급여와 동일하게, 직무는 150번과 동일하게 변경
update employees set salary = (select salary from employees where employee_id = 130),
job_id = (select job_id from employees where employee_id = 150)
where department_id in (20, 30);