-- and ����
-- Q) 90�� �μ������ �� ������ 'AD_PRES' �� ��� ���
select * FROM HR.employees
where (department_id=90) and job_id = 'AD_PRES';

-- Q) �޿��� 10000�̻�, ������ MAN�� �����ϴ� ��� ���
select * from HR.employees where salary >= 10000 and job_id like '%MAN%';

-- Q) �޿��� 10000�̻��� �޴� ����� ������ 'MAN'�� ���ԵǾ� �ִ� ��� ���
select * from HR.employees where salary >- 10000 or job_id like '%MAN%';

-- Q) ������  AD_PRES, 'AD_VP','IR_PREOG'�� ��� ���
SELECT
    *
FROM HR.employees
where job_id in ('AD_PRES', 'AD_VP','IR_PREOG');

-- Q) ������  AD_PRES, 'AD_VP','IR_PREOG'�� ��� ���� ���
SELECT
    *
FROM HR.employees
where job_id not in ('AD_PRES', 'AD_VP','IR_PREOG');

-- Q) �޿��� 5000 �̻��̰� 10000���ϰ� �ƴ� ���
SELECT
    *
FROM HR.employees
where salary not BETWEEN 5000 and 10000;

--Q) or and �켱���� : and ���� ���

--Q) 'IT_PROG' ������ �ϴ� ����� 'ST_MAN'������ �ϴ� ��� �� �޿��� 15000 �̻��� ���
SELECT
    *
FROM HR.employees where job_id in ('IT_PROG', 'ST_MAN') and salary >= 15000;

-- Q) IT_PROG' ������ �ϴ� ����� 'ST_MAN'�� �ϴ� ���, Ȥ�� �޿��� 6000�� ���
SELECT
    *
FROM HR.employees
where job_id in ('IT_PROG', 'ST_MAN') and salary >= 6000;

-- ���� : oreder by ����col
SELECT
    first_name,job_id, hire_date, salary,email
FROM HR.employees order BY hire_date;


-- ����
-- select   from   where    order by


-- Q) �̸�, ����, �޿�, �Ի���, �̸��� ��� // �޿�����(��������)
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by salary;

-- Q) �̸�, ����, �޿�, �Ի���, �̸��� ��� // �޿�����(��������)
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by salary desc;

---- Q) �̸�, ����, �޿�, �Ի���, �̸��� // �Ի����� ���� ���� ������� ���
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by hire_date desc;

-- Q) �����ȣ, �̸�, �Ի���, �޿�, �μ���ȣ�� �޿��� ���� ������ ���(sal => heading ���� ����)
select employee_id,first_name||last_name full_NAME, salary sal, department_id from HR.employees
order by 3 desc;

--Q) �μ���ȣ, �޿�, �����ȣ, ����, �Ի��� ��� // ���� : �μ�(��������) + �޿�(��������)
SELECT
    department_id, salary, employee_id, job_id, hire_date
FROM HR.employees
order by department_id, salary ;

-- �μ��� ������������ ���ĵ� ���¿��� �μ����� �ִ� ������������������ ����
SELECT
    *
FROM HR.employees
order by department_id, job_id desc;

-- 80�� �μ��� �ִ� ����� �Ի����̴��� ������� ���
select * from HR.employees where department_id = 80 order by hire_date desc;

-- select
-- from     :  sel~from : projection
-- where                    sel~where : selection
-- order by                     sel~order : ����

-- data ���� : �����͸� ���ϴ� ���·� ��ȯ�Ͽ� ���

--�����Լ�
select lower(first_name), lower(email), job_id from HR.employees;

SELECT
    first_name, upper(first_name), last_name, upper(last_name)
FROM HR.employees;


SELECT
    first_name, email, INITCAP(job_id), job_id
FROM HR.employees;

-- Q) ������ 'ac_account'�� ������� ����Ͻÿ�.
SELECT
    *
FROM HR.employees where lower(job_id) = 'ac_account';

-- Q) ������ 'Ac_Account'�� ��� ���
select * from HR.employees where initcap(job_id) = 'Ac_Account';

select last_name || first_name fullname, concat(last_name, first_name) name
from HR.employees;

-- '���� �̸��� KingSteven�̰�, ���� ���� ������ AD_PRES�Դϴ�.' ó�� ���
select '���� �̸��� ' || last_name|| first_name|| '�̰�, ���� ���� ������ ' || job_id||'�Դϴ�.'
from HR.employees;

-- length
SELECT
    length('abcd'), length('������')
FROM dual;

SELECT
    first_name, length(first_name), last_name, length(last_name), email, LENGTH('email')
FROM HR.employees;

 -- ���� ���̰� 5���� ū ��� ���
 SELECT
     *
 FROM HR.employees where length(first_name) > 5;
 
 -- �޿��� 4�ڸ� �̻��� ���
 SELECT
     *
 FROM HR.employees where length(salary) >= 4;

-- instr
-- email�� s index ���
select instr(lower(email), 's') from HR.employees;

-- email 's'�� 5��° ���
select * from HR.employees where instr(lower(email), 's')=5;

-- substr
select first_name, salary, job_id, substr(email,2,3), email from HR.employees;

-- �̸��Ͽ� w�� �ִٸ� w���� 3�� ���
select substr(email,instr(email,'W'),3) from HR.employees where instr(email,'W') != 0;

-- �̸�, �޿�, ����, �Ի���, �̸��� ���// �̸��� 3��°���� ���
SELECT
    first_name, salary, job_id, hire_date, email, substr(first_name, 3)
FROM HR.employees;

-- �̸�, �޿�, ����, �Ի���, �̸��� ���// �̸��� �ڿ��� 2�� ���
SELECt
    first_name, salary, job_id, hire_date, email, substr(first_name, -2)
FROM HR.employees;

-- �̸�, �޿�, ����, �Ի���, �̸��� ���// �̸��� �ڿ��� 3��°���� 2�� ���
SELECt
    first_name, salary, job_id, hire_date, email, substr(first_name, -3,2)
FROM HR.employees;

-- replace
select replace('abcd', 'e', 'c') from dual;

-- trim
select trim('     bcde     ') a, trim('abcd       ') b, trim('         bacd') c, trim('b cad') d from dual;

--Q) �̸��Ͽ� ' ABANDA' ���
select * from HR.employees where email in trim('  ABANDA ');

-- �翷�� Ư������ ����
select trim('A' from 'A������A') from dual;

-- �̸��Ͽ� �糡 'A' ����
select trim('A' from email) from HR.employees;

-- rpad : �ش�������� ��ȯ
select rpad('high', 9,'*') from dual;

-- �̸��� �� 3���� ����� ������ *�� ��ȯ
select email, rpad(substr(email,1,3),length(email),'*') from HR.employees;

-- 12������ ��ȭ��ȣ���� ����� 3�ڸ��� '*'�� ���
select SUBSTR(phone_number,1,4)||'***'||substr(phone_number,-5) from HR.employees
where length(phone_number)= 12;

-- ��ȭ��ȣ ����� '*' ���
select phone_number, rpad(substr(phone_number,1,4),instr(phone_number,'.',8),'*')
||substr(phone_number,instr(phone_number,'.',8)) from HR.employees;

-- round : �ݿø�
select round(5555.5553,-1) from dual;

-- trunc : ����(����)
select trunc(5555.555,1) from dual;

-- ceil :
select ceil(5555.15) from dual;

-- mod : ������
select mod(10,3) from dual;
select mod(10,3) from dual;

-- �޿��� 2000���� ���� ���� 10 �̻��� ����� ���
select floor(5555.15) from dual;

select * from HR.employees
where trunc(salary , 2000) >= 10;

-- ����� �ΰ�
select round((sysdate-hire_date)/365) from HR.employees;
select round((sysdate-hire_date)) from HR.employees;

--months_between
select months_between(sysdate, hire_date) from HR.employees;

-- add_month
select hire_date, add_months(hire_date,6) from HR.employees;

-- �Ի��� �ݿ���
select next_day(hire_date,'��') from HR.employees;

--last_day
select last_day(hire_date) from HR.employees;

-- �Ի����� 170���� �̻�� ��� ���
select * from HR.employees where months_between(sysdate, hire_date) >= 170;

-- round(date, ����)
-- ������ day�϶��� �˻��ʿ�
select hire_date, round(hire_date, 'day'), next_day(hire_date,'��') from HR.employees;