-- DML
-- CRUD
-- c : create   : insert
-- R : read     : select
-- U : update   : update   
-- D : delete   : delete
select * from HR.employees;
desc HR.employees;

create table employees(
EMPLOYEE_ID    NUMBER(6)    NOT NULL,
FIRST_NAME              VARCHAR2(20) ,
LAST_NAME     VARCHAR2(25)   NOT NULL,
EMAIL           VARCHAR2(25) NOT NULL ,
PHONE_NUMBER            VARCHAR2(20) ,
HIRE_DATE      DATE     default sysdate ,
JOB_ID       VARCHAR2(10)   NOT NULL  ,
SALARY                  NUMBER(8,2)  ,
COMMISSION_PCT          NUMBER(2,2)  ,
MANAGER_ID              NUMBER(6)    ,
DEPARTMENT_ID           NUMBER(4) );

select * from employees;

commit;
select * from employees;

insert into employees
select * from HR.employees;

select * from employees;

delete from employees;

select * from employees;

rollback;

select * from employees;

delete from employees where department_id = 40;
select * from employees where department_id = 40;

rollback;

select * from employees where department_id = 40;

update employees
set salary = 900000
where employee_id = 140;


TRUNCATE table employees;

-- TCL : commit, rollback

-- create, drop, alter, truncate, rename

select * from employees;

insert into (select employee_id, last_name, email, hire_date, job_id, salary, department_id
    from employees where department_id = 50 with check option)
    values(9999, 'Taylor','DTAYLOR','02/02/02','ST_CLERK',5000, 50);

select * from employees;

select * from employees;
delete from employees;


insert into employees
select * from HR.employees;

select * from employees;

select * from dba_users;

--------------------------------
-- TCL문은 DML문에서만 가능하다.
drop table employees;
drop table departments;

desc HR.departments;

create table departments(
DEPARTMENT_ID    NUMBER(4)  CONSTRAINT dept_DEPARTMENT_ID_PK primary key,
DEPARTMENT_NAME  VARCHAR2(30) CONSTRAINT dept_DEPARTMENT_NAME_NN NOT NULL,
MANAGER_ID               NUMBER(6)    ,
LOCATION_ID              NUMBER(4)    
);

select * from user_constraints where table_name = 'DEPARTMENTS';

-- PRIMARY KEY  : column에 있는 값이 유일해야 함.(구별자)
--              : null 값 불가

desc HR.employees;
create table employees(
EMPLOYEE_ID   NUMBER(6) CONSTRAINT EMP_EMPLOYEE_ID_PK  PRIMARY KEY,
FIRST_NAME              VARCHAR2(20) ,
LAST_NAME    VARCHAR2(25)  CONSTRAINT EMP_LAST_NAME_NN  NOT NULL,
EMAIL        VARCHAR2(25)    CONSTRAINT EMP_EMAIL_UU UNIQUE, -- null 사용가능
PHONE_NUMBER            VARCHAR2(20) ,
HIRE_DATE      DATE          NOT NULL,
JOB_ID       VARCHAR2(10)    NOT NULL,
SALARY                  NUMBER(8,2)  ,
COMMISSION_PCT          NUMBER(2,2)  ,
MANAGER_ID              NUMBER(6)    ,
DEPARTMENT_ID           NUMBER(4)  CONSTRAINT emp_DEPARTMENT_ID_FK 
    REFERENCES departments(department_id)
);

drop table employees;
drop table departments;

desc HR.departments;
create table departments(
    DEPARTMENT_ID    NUMBER(4)    NOT NULL,
    DEPARTMENT_NAME VARCHAR2(30)  NOT NULL,
    MANAGER_ID               NUMBER(6)    default 100,
    LOCATION_ID              NUMBER(4)   ,
    CONSTRAINT dept_DEPARTMENT_ID_PK PRIMARY key(department_id)
);

desc hr.employees;
create table employees(
    EMPLOYEE_ID NUMBER(6)        NOT NULL,
    FIRST_NAME              VARCHAR2(20) ,
    LAST_NAME      VARCHAR2(25)  NOT NULL,
    EMAIL          VARCHAR2(25)  ,
    PHONE_NUMBER            VARCHAR2(20) ,
    HIRE_DATE       DATE    default sysdate   NOT NULL,
    JOB_ID        VARCHAR2(10)   NOT NULL,
    SALARY                  NUMBER(8,2)  ,
    COMMISSION_PCT          NUMBER(2,2)  ,
    MANAGER_ID              NUMBER(6)    ,
    DEPARTMENT_ID           NUMBER(4)    ,
    CONSTRAINT emp_EMPLOYEE_ID_PK PRIMARY key(EMPLOYEE_ID),
    CONSTRAINT emp_email_UU UNIQUE(email),
    CONSTRAINT emp_DEPARTMENT_ID_FK FOREIGN key(department_id) REFERENCES departments(department_id)
);

-- foreign key error // 부모 col에 값이 없을때 error
select * from departments;  -- values 없음.
insert into departments
values (100, 'Finance', null, null);

insert into employees
values(113, 'Louis','Popp','LPOPP','515.124.4567',SYSDATE, 'AC_ACCOUNT',6900,
    NULL, 205,100);
    
select * from departments;
select * from employees;

insert into employees
values(114, 'Louis','Popp',NULL,'515.124.4567',SYSDATE, 'AC_ACCOUNT',6900,
    NULL, 205,100);
    
select * from employees;

-- 부모 테이블
create table test1(
    a1 number PRIMARY key,
    a2 number,
    a3 number);
    
create table test2(
    b1 number PRIMARY key,
    b2 number ,
    a1 number REFERENCES test1(a1) );

insert into test2 values(11, 22, 1);   -- error

insert into test1 values(1,2,3);
insert into test2 values(11, 22, 1);

select * from test1;
select * from test2;

-- 삭제 위반
delete from test1;  -- 자식테이블이 없어야함.

-- 자식talbe 먼저 삭제
delete from test2;
delete from test1;

select * from test1;
select * from test2;

commit;


-- 삭제 위반
drop table test1;

-- 자식 table먼저 제거
drop table test2;
drop table test1;
drop table test3;

-- 삭제 위반 해결
-- test1 삭제시 tes2는 유지, test3는 동시삭제
create table test1(         
    a1 number PRIMARY key,
    a2 number,
    a3 number);
    
create table test2(         -- 구매 table
    b1 number PRIMARY key,
    b2 number ,
    a1 number REFERENCES test1(a1) on DELETE set null );
    
create table test3(
    c1 number PRIMARY key,
    c2 number,
    a1 number REFERENCES test1(a1) ON DELETE CASCADE
);

insert into test1 values(1,2,3);
insert into test2 values(11,22,1);
insert into test3 values(111,222,1);

DELETE from test1;

select * from test1;
select * from test3;
select * from test2;

create table emp_test
as
select * from HR.employees;

select * from emp_test;

--DDL : create, alter, drop, truncate, rename

create table dept_test
as
select * from HR.departments
where 1=2;  -- 1=2 : false

select * from dept_test;


-- view
drop view emp_rep;
create view emp_rep
as
select employee_id, first_name, salary, job_id, hire_date, department_id
from emp_test
where job_id like '%REP%';

select * from emp_rep;

-- Q) 사원번호, 이름, 직무, 입사일, 커미션포함한 연봉 // 30 50 70 부서
create view emp_305070
as
select * from emp_test;
select employee_id, last_name, job_id, hire_date, salary*(1 + nvl(commission_pct,0)) year_sal from emp_test
where department_id in (30, 50, 70);

select * from emp_305070;