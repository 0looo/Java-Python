select * from employees;
drop table employees;

create table employees
as select * from HR.employees;

drop table departments;

create table departments
as select * from HR.departments;

---Q) �� �μ����� �ּұݾ����޴� ������� ������ ���Ͻÿ�.
-- �γ��κ�
select * from employees e, (select department_id, min(salary) m from employees
group by department_id) s where e.department_id = s.department_id and e.salary = s.m;

-- �ֺ�
select * from employees where (department_id, salary) in
(select department_id, min(salary) m from employees group by department_id);


--Q) ��ֺ�  (( ���� �ؼ��� �ָ���.)
select * from employees where (department_id in (select distinct(department_id) from employees order by 1))
and (salary in (select min(salary) from employees group by department_id order by department_id));


--- Q) 178 ����� 174�� ��� �μ��� ��簡 ���� ���� ����
-- �ֺ�
select * from employees where (department_id, manager_id) in 
(select department_id, manager_id from employees where employee_id in (178, 174));

-- ��ֺ�
select * from employees where department_id in (select department_id from employees where employee_id in (178, 174))
and manager_id in (select manager_id from employees where employee_id in (178, 174));



-- ���� �߰� ���ΰ� ���� �κ�

--- windows �Լ�
-- �� �μ��� �ִ�޿�, �ּұ޿�, ��ձ޿�, �޿��հ踦 ���
select department_id, max(salary), min(salary), avg(salary), sum(salary)
from employees group by department_id;

-- employees ���̺��� ù ����� ����������� ������ȣ, �̸�, �޿�, �޿��� �հ踦 ���
select employee_id, first_name, salary,
    sum(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ) total,
    round(avg(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ), 3) avg,
    max(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ) max
    from employees;

-- employees table���� ������ȣ, �̸�, �޿�, �����հ踦 ����Ͻÿ�.
select employee_id, first_name, salary,
    sum(salary) over(order by salary rows BETWEEN unbounded PRECEDING
        and current row) sum
    from employees;

-- employees table���� ������ȣ, �̸�, �޿�, �޿��հ�(����~ �����޿��� �ջ�)

select employee_id, first_name, salary,
    sum(salary) over(order by salary rows BETWEEN current row
        and unbounded following) sum
    from employees;


-- rank
--  : ���� �Լ�
select first_name, salary,
    rank() over (order by salary desc) all_rank,
    rank() over (partition by job_id order by salary desc) job_rank
        from employees;
        
select first_name, salary,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank
        from employees;

-- �μ��� densc_rank
select first_name, salary, department_id,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank,
    dense_rank() over (partition by department_id order by salary desc) dep_densc
        from employees;
        
-- row_number   : ������ ���.
select first_name, salary, department_id,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank,
    dense_rank() over (partition by department_id order by salary desc) dep_densc,
    row_number() over (order by salary desc) row_number,
    row_number() over (partition by department_id order by salary desc) job_number
        from employees;
        
-- �� �μ��� �޿��� �հ�, ���, �ִ�, �ּҰ�
select employee_id, first_name,department_id, salary,
    sum(salary) over (partition by department_id) sum,
    round(avg(salary) over (partition by department_id),3) avg,
    max(salary) over (partition by department_id) max,
    min(salary) over (partition by department_id) min
        from employees;

---- �� �μ����� �޿��� ���� ���� ����� ���
select * from employees where (department_id, salary) in
(select department_id, max(salary) m from employees group by department_id);
-- windows

select employee_id, first_name, salary, department_id,
    first_value(first_name) over (partition by department_id order by salary desc
        rows unbounded preceding) dept_a
            from employees;
            
            
-- ��� ������, ���� ���� �޴� ��� ���
select employee_id, first_name, salary, department_id,
    last_value(first_name) over (partition by department_id order by salary desc
        rows BETWEEN unbounded preceding and UNBOUNDED FOLLOWING) dept_a
            from employees;

-- LAG
select department_id, first_name, salary,
lag(salary) over(order by salary desc) pre_sal
from employees;

--LEad
select department_id, first_name, salary,
lead(salary) over(order by salary desc) pre_sal
from employees;


-- �����Լ�
select department_id, first_name, salary,
    percent_rank() over (partition by department_id order by salary desc) per_sal
from employees;

-- ���� ( �޿��� ��ü���� ���ۼ�Ʈ�ΰ�)
select department_id, first_name, salary,
    percent_rank() over (order by salary desc) per_sal
from employees order by salary;

-- ������ ���� (ntile)
select department_id, first_name, salary,
    ntile(4) over (order by salary desc
    ) per_sal
from employees;

--- pl / sql   => ����� �κ�(�ð��ҿ䰡 ����� �����)
