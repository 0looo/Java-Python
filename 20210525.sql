select * from HR.departments;

select * from HR.employees;

select department_id, location_id from HR.departments;

DESC HR.employees;

-- Q) �����ȣ, �̸�, �޿�, �̸���, �Ի���, �μ���ȣ�� ����Ͻÿ�.
select Employee_id, first_name, salary, email,hire_date, department_id from HR.employees;

select last_name, salary from HR.employees;
select last_name, salary, 12*(salary+300) from HR.employees;

-- Q) ������̺��� �����ȣ, �̸�, �޿�, ����, �μ���ȣ�� ���
select employee_id, first_name, salary, job_id, department_id from HR.employees;

-- Q) �μ����̺��� �μ���, �μ���ȣ, �ּҹ�ȣ�� ���
select manager_id, department_id, location_id from HR.departments;

-- Q) ������̺��� �����ȣ, �μ���ȣ, ����, �޿� ���(�޿� : ����)
select employee_id, department_id, job_id, salary*12 from HR.employees;

-- Q) ������̺��� �����ȣ, �μ���ȣ, ����, ������ ��� // �ſ� 300�� ���ʽ� ����
select employee_id, department_id, job_id, (salary+300)*12 from HR.employees;

-- Q) ������̺��� �����ȣ, �μ���ȣ, ����, ������ ���// �������޿� 300 ���ʽ�
select employee_id, department_id, job_id, salary*12 + 300 from HR.employees;

-- null
select last_name, job_id, salary, commission_pct from HR.employees;

-- null ����
select last_name, 12* salary * commission_pct from HR.employees;
-- null ���Ե� ������ null�� ǥ��

-- col�� ���� : as
select last_name, 12* salary * commission_pct as year_salary from HR.employees;
select last_name, 12* salary * commission_pct year_salary from HR.employees;

-- Q) �����ȣ, �̸�, ����, �μ���ȣ, �޿�, ���� // ������ 2500���� ���ʽ�
select employee_id, first_name, job_id, department_id, salary, salary*12+2500 anuual_salary from HR.employees;

select last_name || job_id employees from HR.employees;

select '��' || '�ڼ�' fullname from dual;  -- dual : �������̺�

--Q) ������̺��� �����ȣ, �����ü�̸�, �޿�, �μ� ���
SELECT
    employee_id, first_name||last_name fullname, salary, department_id
FROM HR.employees;

--Q) �����ȣ�� �޿��� ���̿� first_name_last_name_�� ������ department_id�Դϴ�. �߰� ���
SELECT
    employee_id, first_name||last_name||'�� ������ '||job_id||'�Դϴ�.' ans , salary
FROM HR.employees;


-- �ߺ�����
SELECT
    DISTINCT employee_id
FROM HR.employees;

SELECT
    distinct department_id, job_id
FROM HR.employees
order by department_id, job_id;

-- 
SELECT
    employee_id, LAST_name, job_id,department_id
FROM HR.employees
where department_id = 90;

-- Q) �����ȣ�� 110�� ����� �������
SELECT
    *
FROM HR.employees
where employee_id = 110;

select last_name, job_id, department_id from HR.employees
where last_name = 'Whalen';


select * from HR.employees;
-- 2003. 3. 6.�Ի��� ���
SELECT * fROM HR.employees
where hire_date = '03/06/17';

-- 06/01/03 ���� �ʰ� �Ի���
SELECT
    *
FROM HR.employees
where hire_date > '06/01/03';

SELECT
    *
FROM HR.employees where salary BETWEEN 2500 AND 3500;

-- Q)�� king ~ smith ���� ������
SELECT
    *
FROM HR.employees WHERE last_name BETWEEN 'King' and 'Smith';

-- �μ��� 50, 70, 90 
select * from HR.employees where department_id in (50,70,90);

--
SELECT
    *
FROM HR.employees where first_name like 'S%';

-- �Ի����� 6��
select * from HR.employees where hire_date like '%06';

-- REP ���ԵǴ� ���
select * from HR.employees where job_id like '%REP%';