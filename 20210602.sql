delete from employees;

insert into employees
select * from HR.employees;

delete from departments;

insert into departments
select * from hr.departments;

create view emp80 as
select employee_id, last_name, salary 
from employees where employee_id = 80;

select * from emp80;
-- �����ȣ, ����, �Ի���, �̸�, ���� (������ ���ʽ� 300)
-- // ������ IT���ԵǴ� ����� 30,60,80 �μ� ���

drop view empit;
create view empit as 
select employee_id eid, job_id jid, hire_date hdate, first_name fname, salary*(1 + nvl(commission_pct,0))*12 +300 year_sal
from employees where (job_id like '%IT%') or (department_id in (30,60,80));

select * from empit;

create or replace view empit2
(eid, jid, hdate, fname, year_sal)
as select employee_id , job_id , hire_date , first_name , salary*(1 + nvl(commission_pct,0))*12 +300
from employees where (job_id like '%IT%') or (department_id in (30,60,80));

select * from empit2;

create or replace view empit1
as 
select employee_id eid, job_id jid, hire_date hdate, last_name || first_name fullname, salary*(1 + nvl(commission_pct,0))*12 +300 year_sal
from employees where (job_id like '%IT%') or (department_id in (30,60,80));

select* from empit1;


-- �����ȣ, �̸�, ����, �޿�, �̸���, �μ���ȣ, �μ��� ���
create view emp_dept
as
select employee_id, first_name, job_id, salary, email, e.department_id, department_name from employees e, departments d
where e.department_id = d.department_id;

select * from emp_dept;

-- �� �μ��� �޿� ���, �޿��� �հ�, �޿� �ּұݾ�, �ִ�ݾ� ���
create view emp_sum_vu (d_name, avg_sal, sum_sal, min_sal, max_sal)
as
select department_name, round(avg(salary),3), sum(salary), min(salary), max(salary)
from employees e, departments d where e.department_id = d.department_id group by department_name;

select * from emp_sum_vu;

desc employees;

create view emp50
as 
select EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, SALARY, DEPARTMENT_ID
from employees where department_id= 50;

-- view�� ���� DML���� ����� �� �ִ���
insert into emp50
values (998, 'park','SK',sysdate,'ST_MAN',15000, 50);
select * from emp50;

delete from emp50
where employee_id = 999;

delete from emp50
where employee_id = 998;

-- view�� ���� DML�� ����� ��� ���Ѱɱ�
create or replace view emp50_1
as 
select EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, SALARY, DEPARTMENT_ID
from employees where department_id= 50
with check option constraint empvu20_ck;

insert into emp50_1
values (998, 'park','SK',sysdate,'ST_MAN',15000, 30);
select * from emp50;


create or replace view emp30
as 
select EMPLOYEE_ID, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, SALARY, DEPARTMENT_ID
from employees where department_id= 30
with read only;

desc emp30;

--Q) �� �μ��� �޿��� ���� ���� �޴� ����� ���ؼ� �� �޿��� �ش��ϴ� ������� ���
select * from employees where salary in 
(select max(salary) from employees group by department_id);

-- ����� �� �޿��� ���� ���� �޴� ��� 5�� ���
select * from (select * from employees order by salary desc)
where rownum <= 5;

-- �μ��� �ִ� �޾��� �޴� ������� �������
select * from employees e,(select department_id, max(salary) m from employees group by department_id) s
where e.department_id = s.department_id and e.salary = s.m;

-- �μ��� �Ի����� ���� ���� ��� �������
select * from employees e, (select department_id, max(hire_date) m from employees group by department_id) s
where e.department_id = s.department_id and e.hire_date = s.m;


-- ������ 'REP'�� �����ϰ� �ִ� ����� �� ������ �޿��� ���� ���� �޴� ������� ���
select * from employees e,
(select department_id, max(salary) m from employees group by department_id) s
where e.department_id = s.department_id and e.salary = s.m and e.job_id like '%REP%';

select * from employees where ((department_id, salary) in
(select department_id, max(salary) m from employees group by department_id))
and job_id like '%REP%';

-- ������(sequence) : ��ȣ �ڵ� ������ : �Խ��� �۹�ȣ, ���Ź�ȣ ���..
create sequence emp_seq;

select emp_seq.nextval, emp_seq.currval
from dual;

create sequence emp_sequl
increment by 10
start with 100;

select emp_sequl.nextval, emp_sequl.currval from dual;

insert into employees
values(emp_sequl.nextval, 'Louis','Popp', 'EEE', '515.124.4567',
sysdate, 'AC_ACCOUNT', 6900, Null, 205, 100);

select * from employees;

select emp_sequl.currval from dual;

create table department
as
select * from HR.departments;

insert into department
values (emp_sequl.nextval,'aaaa',100,1300);


-- DML : select / insert / delete / update
-- TCL : commit / rollback
-- DDL : create / alter / drop / truncate / rename
-- DCL : grant / revoke

-- alter

desc departments;

-- column �߰�
alter table departments
add (job_id varchar(10), hire_date date default sysdate);

alter table departments
modify job_id varchar2(20) default 'AC_ACCT';

alter table departments
drop column hire_date;

desc departments;

drop table employees;
drop table departments;

create table employees
as select * from HR.employees where 1=2;

select * from user_constraints where table_name = 'EMPLOYEES';

create table departments
as select * from HR.departments where 1=2;


-- primary key �ο�
alter table employees
MODIFY employee_id CONSTRAINT emp_employee_id_pk primary key; -- ������

alter table employees
add CONSTRAINT emp_employee_id_pk primary key (employee_id);  -- ���̺���

-- unique �ο�
alter table employees
modify email CONSTRAINT emp_email_UU unique;  -- ������

alter table employees
add constraint emp_email_UU unique(email)  -- table level

-- check
alter table employees
modify salary constraint emp_salary_CK check (salary>0);    -- ������

alter table employees
add constraint emp_salary_cK check (salary>0);

-- primary key
alter table departments
modify department_id constraint dep_department_id_PK primary key;

alter table departments
add constraint dep_department_id_PK primary key(department_id);

-- foreign
alter table employees
modify department_id constraint emp_department_id_FK
references departments(department_id);

alter table employees
add constraint emp_department_id_FK foreign key(department_id)
    reference departments(department_id);