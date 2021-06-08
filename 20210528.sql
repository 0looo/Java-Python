-- 50�� �μ��� ������� �����ȣ, �̸�, �޿� , ����, �μ���ȣ, �μ���, �ּҹ�ȣ ���
select employee_id, first_name, salary, job_id, d.department_id, department_name, location_id
from HR.employees e, HR.departments d
where e.department_id = d.department_id
and e.department_id = 50;

-- 114�� ����� 90�� �μ��� �����ȣ, �̸�, �Ի���, �޿�, ������ȣ, �μ���ȣ, �μ���, �ּҹ�ȣ
SELECT
    employee_id, first_name, hire_date, salary, e.department_id, department_name, location_id
FROM HR.employees e, HR.departments d
where e.department_id = d.department_id
and (employee_id = 114 or d.department_id = 90);

-- ST_MAN�� ������ ���� ����� �����ȣ, �̸�, �޿� ,�μ���ȣ, ������ȣ, ������ ���
-- T-SQL JOIN
select
    employee_id, first_name, salary, department_id, e.job_id, job_title
from HR.employees e, HR.jobs j
where e.job_id = j.job_id
and e.job_id = 'ST_MAN';

-- Ansi-join
-- datebase ���̿� join, where �ڸ��� on�� ���� �������� where����
-- Q) 90�� �μ��� ����� �̸�, �Ի��� ���� �����ȣ �μ���ȣ �μ��� �ּ�
select first_name, hire_date, job_id, e.department_id, department_name, location_id
from HR.employees e join HR.departments d
on e.department_id = d.department_id
where e.department_id = 90;

-- ����� ������, ������ȣ, �����ȣ, �̸�, �Ի���, �޿�, �μ���ȣ, �μ���
select job_title, e.job_id, employee_id, first_name, hire_date, salary, e.department_id, department_name
from HR.jobs j, HR.employees e, HR.departments d
where j.job_id = e.job_id and e.department_id = d.department_id;

-- ANSI-JOIN(���߰���)
select job_title, e.job_id, employee_id, first_name, hire_date, salary, e.department_id, department_name
from HR.employees e
inner join HR.jobs j
on j.job_id = e.job_id 
inner join HR.departments d
on e.department_id = d.department_id;

-- ��� 115�� ������, ������ȣ, �����ȣ, �̸�, �޿�, �Ի���, ���, �μ���ȣ, �μ���
select job_title, e.job_id, employee_id, first_name, salary, hire_date,
e.manager_id, e.department_id, department_name
from HR.employees e join HR.jobs j
on j.job_id = e.job_id 
join HR.departments d
on e.department_id = d.department_id
where e.employee_id = '115';

-- 
select first_name, job_id, e.manager_id,
e.department_id, d.department_name, d.manager_id
from HR.employees e, HR.departments d
where e.department_id = d.department_id;

-- �� ����
select * from HR.jobs;
-- 130�� ����� �޴� �޿��� ��� �޿� ���̺� ���ϴ°�?
select salary from HR.employees where employee_id = 130;  -- 2800

select e.employee_id, job_title, e.salary
              FROM hr.jobs j, HR.employees e
              WHERE e.employee_id = 130 and
              (e.salary BETWEEN j.min_salary and j.max_salary);
            
-- ����join
select first_name, employee_id, e.department_id, department_name
from HR.employees e full outer join HR.departments d
on e.department_id = d.department_id;

-- ���� ) �����ȣ, �̸�, ����, �޿�, �μ���ȣ, �μ���, ������ȣ, ������, ������ȣ, ������
select employee_id, first_name, job_id, salary, d.department_id,
    department_name, l.location_id, street_address, c.country_id, country_name
    from HR.employees e join hr.departments d
    on e.department_id = d.department_id
    join HR.locations l on d.location_id = l.location_id
    join HR.countries c on l.country_id = c.country_id;


-- ��������
-- Abel�� �޿�
select last_name, salary from HR.employees
where last_name = 'Abel';

-- Abel�� �޿��� ������ ������
select * from HR.employees
where salary = (select salary from HR.employees where last_name = 'Abel');

-- 114�� ����� �ϴ� ������ ���� ���
select * from HR.employees where job_id = 
(select job_id from HR.employees where employee_id = 114);

-- 120�� ����� ���� �Ի��� ���
select * from HR.employees where hire_date = 
(select hire_date from HR.employees where employee_id = 120);

-- 130�� ����� �ϴ� ���� ���(130�� ����)
select * from HR.employees where job_id =
(select job_id from HR.employees where employee_id = 130) and employee_id !=130;

-- 113�� ����� �ϴ� ������ ���� 120�� ����� �޿��� ���� ���
select * from HR.employees where job_id =
(select job_id from HR.employees where employee_id = 113) and 
salary = (select salary from hr.employees where employee_id = 120);

-- ����� �� �޿��� ���� ���� �޴� ���
select * from HR.employees where salary = (select min(salary) from HR.employees);

-- ��� ��ü ��� �޿� �̻� �ش��ϴ� ������� ���Ͻÿ�.
select * from HR.employees where salary >= (select avg(salary) from HR.employees);

-- �� �μ��� ��� �ݾ��� 50�� �μ��� ��� �ݾ׺��� ���� �μ��� ��� �ݾ�
select department_id, avg(salary) from HR.employees group by department_id having avg(salary) >= 
(select avg(salary) from HR.employees where department_id = 50);

-- ������ ��� �޿� �� ���� ���� �޴� �ݾװ� ���� �ݾ��� �����?
select * from HR.employees where salary = 
(SELECT min(avg(salary)) from HR.employees GROUP by job_id);

-- �μ��� �ּ� �ݾ׿� �ش��ϴ� ��� ���
select * from HR.employees where salary in 
(select min(salary) from HR.employees group by department_id);

-- �� �μ��� �ּұݾ��� �޴� ��� ���
select e.department_id, e.last_name, e.salary from HR.employees e, (select department_id , min(salary) from HR.employees group by department_id) s
where e.department_id = s.department_id;

-- 60�� �μ��� �޿� �� ���� ���� �޿� �ݾ׺��� �� ���� �޴� ������� ���Ͻÿ�.
select * from HR.employees where salary > (select min(salary) from HR.employees where department_id = 60);
select * from HR.employees where salary > any (select salary from HR.employees where department_id = 60);

-- 60�� �μ��� �޿��� ���� ���� �޴� �޿����� ���� �޿��� �޴� ��� ���
select * from HR.employees where salary < (select max(salary) from HR.employees where department_id = 60);
select * from HR.employees where salary < all (select salary from HR.employees where department_id = 60);

-- 60�� �μ��� �޿��� ���� �޿� ��� ���
select * from HR.employees where salary in (SELECT salary from HR.employees where department_id = 60);
select * from HR.employees where salary = any (SELECT salary from HR.employees where department_id = 60);