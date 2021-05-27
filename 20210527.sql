select * from hr.employees;

select  first_name, email, salary, hire_date, to_char(hire_date, 'mm-dd-yyyy'),
        to_char(hire_date, 'dd-mm-yy'),
        to_char(hire_date, 'mm-dd-yyyy hh24:mi:ss AM')
from hr.employees;

select sysdate, to_char(sysdate, 'mm-dd-yyyy hh24:mi:ss AM sssss')
from dual;

select employee_id,  to_char(hire_date,'month/yy') month_year
from hr.employees;


--- 02/3���� �Ի��� ����� ����Ͻÿ�.
select to_char(hire_date,'yy/mon/dd day')
from hr.employees;

select * from hr.employees
where to_char(hire_date,'yy/mon') = '03/5��';

ALTER session set nls_date_format='yyYY-MM-DD HH:MI:SS sssss AM';

select sysdate from dual;

select * from hr.employees;

ALTER session set nls_date_format='RR-MM-DD';

select * from hr.employees; 
---- 24000 :  w24,000
select first_name, email, hire_date , salary, to_char(salary, '999,999,999'),
       to_char(salary, '$999,999,999'),to_char(salary, 'L999,999,999')
from hr.employees;

select -24000, to_char(-24000,'L999,999,999mi')
from dual;


select * from hr.employees;

-- 05/18/03 -- mm-dd-yy
select * from hr.employees
where hire_date = to_date('05/18/03', 'mm-dd-yy');
-- to_date() : yy-mm-dd


select to_char(sysdate, 'yyyy-mm-dd'), to_date('05/18/03','mm/dd/yy')
from dual;

-- 25-04-2003�� ������ �Ի��� ����� ����Ͻÿ�. -- 
select * from hr.employees
where hire_date > to_date('25-04-2003', 'dd-mm-yyyy');

select * from hr.employees -- ���� ����
where to_char(hire_date,'dd-mm-yyyy') > '25-04-2003';

select first_name, last_name, salary, commission_pct, 
        salary *( 1+ nvl(commission_pct,0)) * 12 year_sal
from hr.employees;

select null, nvl(null, 0), nvl(null, 100)
from dual;

---- �����ȣ, �̸�, ����, �μ�, �޿�, Ŀ�̼Ǳݾ��� ���. Ŀ�̼��� ���� ����� 0���� ���
select employee_id, salary, job_id, department_id,
       salary, salary * nvl(commission_pct,0) 
from hr.employees;

---- case 
--- job_id�� 'IT_PROG' �޿��� 10%���
---          'ST_CLERK' �޿��� 15%���
---          'SA_REP' �޿��� 20%���
---          ���ܴ̿� �޿�
select employee_id, job_id, salary,
       case job_id when 'IT_PROG' then salary *  1.1
                   when 'ST_CLERK' then salary * 1.15
                   when 'SA_REP' then salary * 1.2
                   else salary end sal
from hr.employees;

select employee_id, job_id, salary,
       decode ( job_id , 'IT_PROG'  , salary *  1.1
                       , 'ST_CLERK' , salary * 1.15
                       , 'SA_REP'   , salary * 1.2
                       , salary ) sal
from hr.employees;


select employee_id, job_id, salary,
       case  when job_id = 'IT_PROG' then salary *  1.1
             when job_id = 'ST_CLERK' then salary * 1.15
             when job_id = 'SA_REP' then salary * 1.2
             else salary end sal
from hr.employees;

--- �޿��� 3000�����̸� ��� 
--        5000�����̸� ����
--        7000�����̸� �븮
--        9000�����̸� ����
--       11000�����̸� ����
--       13000�����̸� ����
--       �� �̻� �̸� �ӿ�
select employee_id , salary,
case when salary <= 3000 then '���'
     when salary <= 5000 then '����'
     when salary <= 7000 then '�븮'
     when salary <= 9000 then '����'
     when salary <= 11000 then '����'
     when salary <= 13000 then '����'
     else '�ӿ�' end grade
from hr.employees;
---  �޿��� 2000���� ���� ���� 0�̸� �޿��� 0%
---                         1�̸� �޿��� 9%
---                         2�̸� �޿��� 20%
---                         3�̸� �޿��� 30%
---                         4�̸� �޿��� 40%
---                         5�̸� �޿��� 42%
---                         6�̸� �޿��� 44%
---                         �̿� �޿��� 45% �����̴�. ������ ������ ���
select last_name, salary, 
    case trunc(salary /2000,0)  when 0 then salary * 0.00
                                 when 1 then salary * 0.09
                                 when 2 then salary * 0.20
                                 when 3 then salary * 0.30
                                 when 4 then salary * 0.40
                                 when 5 then salary * 0.42
                                 when 6 then salary * 0.44
                                 else salary * 0.45 end tex
from hr.employees;

select last_name, salary, 
    decode ( trunc(salary /2000,0) , 0 , salary * 0.00
                                 , 1 , salary * 0.09
                                 , 2 , salary * 0.20
                                 , 3 , salary * 0.30
                                 , 4 , salary * 0.40
                                 , 5 , salary * 0.42
                                 , 6 , salary * 0.44
                                 , salary * 0.45 ) tex
from hr.employees;


--- �����ȣ, �̸�, �޿�, �̸��� ���̸� ����Ͻÿ�.
select employee_id, first_name, salary, length(first_name)
from hr.employees;

--- ������ ���� ���Ͻÿ�.
select * from hr.employees;
select count(*) from hr.employees;
-- �������� ��ձ޿�, �޿� �հ�, ���� ���� �޴� ���, ���� ���� �޴� ���
select avg(salary), sum(salary), max(salary), min(salary)
from hr.employees;

select first_name, salary, job_id
from hr.employees
where job_id like '%REP%';

select avg(salary), sum(salary), max(salary), min(salary)
from hr.employees
where job_id like '%REP%';

--- 90�� �μ��� ��� �޿� , �ִ�޿�, �ּұ޿�, �޿��� �հ踦 ���Ͻÿ�.
select first_name , department_id, salary
from hr.employees
where department_id = 90;

select avg(salary), max(salary), min(salary) , sum(salary)
from hr.employees
where department_id = 90;

---�Ի����� ���� ���� �����, �Ի����� ���� ���� ����� ���Ͻÿ�.
select min(hire_date), max(hire_date)
from hr.employees;

--- �̸��� �������� ���� ���� ���� ����� ���߿� ���� ����� ����Ͻÿ�.
select min(first_name) , max(first_name)
from hr.employees;

--- 50�� �μ��� ����� ���� ���Ͻÿ�.
select count(*) from hr.employees
where department_id = 50;

select * from hr.employees;
select count(*) from hr.employees;

select first_name from hr.employees;
select count(first_name) from hr.employees;

select department_id  from hr.employees;
select count(department_id) from hr.employees;
--- �׷��Լ��� null�� �������� �ʴ´�.
select * from hr.employees;
select count(*) from hr.employees;

-- �μ��� �ִ� ����� ���� ����Ͻÿ�.
select count(department_id) from hr.employees;
---��ü ������ ����  Ŀ�̼��� �޴� ����� ���� ?
select count(*) , count(commission_pct)
from hr.employees;

-- 80�� �μ��� ����� ���� Ŀ�̼��� �޴� ����� ���� ?
select count(*) , count(commission_pct)
from hr.employees
where department_id = 80;

-- Ŀ�̼��� �޴� ����� Ŀ�̼��� ��հ� ��ü ����� Ŀ�̼��� ����� ���Ͻÿ�.
select avg(commission_pct) , sum(commission_pct) / count(*),
       avg(nvl(commission_pct,0))
from hr.employees;

-- 10�� �μ��� �޿��� ���
select avg(salary) from hr.employees where department_id = 10;
-- 20�� �μ��� �޿��� ���
select avg(salary) from hr.employees where department_id = 20;
-- 30�� �μ��� �޿��� ���
select avg(salary) from hr.employees where department_id = 30;
-- 40�� �μ��� �޿��� ���
select avg(salary) from hr.employees where department_id = 40;
---50,60,70,80,90,100,110

select department_id, avg(salary)
from HR.employees
group by department_id
order by department_id;
--- group �Լ��� ����ϴ� ��쿡�� group by���� �ִ� column�� select���� ����� �� �ִ�.

-- �� �μ��� �޿��� ���, �޿��� �հ� , �ִ밪, �ּҰ��� ����Ͻÿ�.
select department_id, avg(salary), sum(salary), max(salary), min(salary)
from HR.employees
group by department_id;

---  �� �μ����� ���� ���� �Ի��� ����� ���� ���߿� �Ի��� ����� ����Ͻÿ�.
select department_id, min(hire_date), max(hire_date)
from hr.employees
group by department_id;

--- �� �������� ���� ���� �Ի��� ����� ���� ���߿� �Ի��� ����� ����Ͻÿ�.
select job_id, min(hire_date), max(hire_date)
from hr.employees
group by job_id;
--  �� �������� �޿��� ���� ���� �޴� ����� ���� �޴� ����� ����Ͻÿ�.
select job_id, min(salary), max(salary)
from hr.employees
group by job_id;


select distinct job_id from hr.employees where department_id = 30;
--- 50�μ��� ������ ST_MAN�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 50 and job_id ='ST_MAN';
--- 50�μ��� ������ SH_CLERK�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 50 and job_id ='SH_CLERK';
--- 50�μ��� ������ ST_CLERK�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 50 and job_id ='ST_CLERK';
--- 40�μ��� ������ HR_REP�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 40 and job_id ='HR_REP';
--- 30�μ��� ������ PU_MAN�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 30 and job_id ='PU_MAN';
--- 30�μ��� ������ PU_CLERK�� ����� ��ձ޿��� ���Ͻÿ�.
select avg(salary) from hr.employees where department_id = 30 and job_id ='PU_CLERK';

--- �μ��� ������ �޿��� �հ�
select department_id, job_id, avg(salary), sum(salary), min(salary), max(salary)
from hr.employees
group by department_id, job_id
order by department_id, job_id;

--- �μ��� ������ �޿��� ���� ����� ���� ���Ͻÿ�.
select department_id, job_id, salary, count(*)
from hr.employees
group by department_id, job_id, salary;

--- �� �μ����� ������ 'REP'�� ������ �ִ� ������� �޿��� �հ踦 ���Ͻÿ�.
select department_id, sum(salary)
from hr.employees
where job_id like '%REP%'
group by department_id;

--- ��ձ޿��� 7000�̻��� �μ��� ����Ͻÿ�. 
select department_id, avg(salary)
from hr.employees
group by department_id
having avg(salary) >= 7000
order by avg(salary);

---select           5
---from             1
---where            2 -- ���̺� �ִ� �������� ����
-- group by         3
-- having           4 --- group by�� ���� ����
-- order by         6

--- �μ��� ���� ���� 10�� �̸��� �μ��� ����Ͻÿ�.
select department_id, count(*)
from hr.employees
group by department_id
having count(*) < 10;

--- ������ 'REP'�� ���ԵǾ� ���� ���� ������ �޿��� ���, �հ�, �ּ�, �ִ� ���� ����Ҷ�
--- �޿��� �հ谡 13000�̻��� ������ ����Ͻÿ�.

select job_id, avg(salary), sum(salary), min(salary), max(salary)
from hr.employees
where job_id not like '%REP%'
group  by job_id
having sum(salary) >= 13000;

--1. projection
--2. selection
--3. ������ �Լ�
--4. ������ �Լ�(�׷� �Լ�)

---- ��ü ������ ���� �ִ� �μ��� �հ�
select count(*), count(department_id), count(distinct department_id)
from hr.employees;

--- �������� ����ϰ� �ִ� ������ ��� �ΰ�?
select count(distinct job_id)
from HR.employees;

---- 90�� �μ��� ����� ����Ͻÿ�.
select * from hr.employees
where department_id = 90;
--- 90�� �μ� ������ ����Ͻÿ�
select * from hr.departments
where department_id = 90;

select employee_id, first_name, salary, 
       hr.employees.department_id, department_name, location_id
from  hr.employees , hr.departments
where hr.employees.department_id = hr.departments.department_id;

select employee_id, first_name, salary, 
       e.department_id, department_name, location_id
from  hr.employees e, hr.departments d
where e.department_id = d.department_id;

--- 90�� �μ��� ���� ����� �����ȣ, �̸�, �޿�, �μ���ȣ, �μ���, �ּҹ�ȣ�� ���
select employee_id, first_name, salary, 
       e.department_id, department_name, location_id
from  hr.employees e, hr.departments d
where e.department_id = d.department_id 
and e.department_id = 90;

---- 'AD_PRES'������ �ϴ� ������� ����Ͻÿ�.
-- �����ȣ, �̸� , �޿� , �μ���ȣ, ������ȣ
select employee_id, first_name, salary, department_id, job_id
from hr.employees
where job_id = 'AD_PRES';

--- jobs���� 'AD_PRES'�� ���� ������ ����Ͻÿ�.
select * from hr.jobs
where job_id = 'AD_PRES';

--AD_PRES�� ������ ���� ������� �����ȣ, �̸� , �޿� , �μ���ȣ, ������ȣ, �������� ���
select employee_id, first_name, salary, department_id, j.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and j.job_id = 'AD_PRES';

--- ST_MAN�� ������ ���� ������� �����ȣ, �� , �̸��� , ���, ������ȣ, �������� ���
select employee_id, last_name, email, manager_id, j.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and e.job_id = 'ST_MAN';

---- REP�� ���ԵǾ� ���� �ʰ� �޿��� 7500 �̻��� ������� 
--- �����ȣ, �� , �̸� , �޿�, �Ի��� , ������ȣ, �������� ����Ͻÿ�
select employee_id, last_name , first_name, salary, hire_date,
       e.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and e.job_id not like '%REP%' and salary >= 7500;
