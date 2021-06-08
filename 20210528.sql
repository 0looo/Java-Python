-- 50인 부서의 사원들의 사원번호, 이름, 급여 , 직무, 부서번호, 부서명, 주소번호 출력
select employee_id, first_name, salary, job_id, d.department_id, department_name, location_id
from HR.employees e, HR.departments d
where e.department_id = d.department_id
and e.department_id = 50;

-- 114번 사원과 90번 부서의 사원번호, 이름, 입사일, 급여, 직무번호, 부서번호, 부서명, 주소번호
SELECT
    employee_id, first_name, hire_date, salary, e.department_id, department_name, location_id
FROM HR.employees e, HR.departments d
where e.department_id = d.department_id
and (employee_id = 114 or d.department_id = 90);

-- ST_MAN인 직무를 갖는 사원의 사원번호, 이름, 급여 ,부서번호, 직무번호, 직무명 출력
-- T-SQL JOIN
select
    employee_id, first_name, salary, department_id, e.job_id, job_title
from HR.employees e, HR.jobs j
where e.job_id = j.job_id
and e.job_id = 'ST_MAN';

-- Ansi-join
-- datebase 사이에 join, where 자리에 on을 적고 조건전에 where적음
-- Q) 90인 부서의 사원의 이름, 입사일 직무 사원번호 부서번호 부서명 주소
select first_name, hire_date, job_id, e.department_id, department_name, location_id
from HR.employees e join HR.departments d
on e.department_id = d.department_id
where e.department_id = 90;

-- 사원의 직무명, 직무번호, 사원번호, 이름, 입사일, 급여, 부서번호, 부서명
select job_title, e.job_id, employee_id, first_name, hire_date, salary, e.department_id, department_name
from HR.jobs j, HR.employees e, HR.departments d
where j.job_id = e.job_id and e.department_id = d.department_id;

-- ANSI-JOIN(다중결합)
select job_title, e.job_id, employee_id, first_name, hire_date, salary, e.department_id, department_name
from HR.employees e
inner join HR.jobs j
on j.job_id = e.job_id 
inner join HR.departments d
on e.department_id = d.department_id;

-- 사원 115번 직무명, 직무번호, 사원번호, 이름, 급여, 입사일, 상사, 부서번호, 부서명
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

-- 비등가 조건
select * from HR.jobs;
-- 130번 사원이 받는 급여는 어느 급여 테이블에 속하는가?
select salary from HR.employees where employee_id = 130;  -- 2800

select e.employee_id, job_title, e.salary
              FROM hr.jobs j, HR.employees e
              WHERE e.employee_id = 130 and
              (e.salary BETWEEN j.min_salary and j.max_salary);
            
-- 포괄join
select first_name, employee_id, e.department_id, department_name
from HR.employees e full outer join HR.departments d
on e.department_id = d.department_id;

-- 문제 ) 사원번호, 이름, 직무, 급여, 부서번호, 부서명, 지역번호, 지역명, 국가번호, 국가명
select employee_id, first_name, job_id, salary, d.department_id,
    department_name, l.location_id, street_address, c.country_id, country_name
    from HR.employees e join hr.departments d
    on e.department_id = d.department_id
    join HR.locations l on d.location_id = l.location_id
    join HR.countries c on l.country_id = c.country_id;


-- 서브쿼리
-- Abel의 급여
select last_name, salary from HR.employees
where last_name = 'Abel';

-- Abel의 급여와 동일한 사원출력
select * from HR.employees
where salary = (select salary from HR.employees where last_name = 'Abel');

-- 114번 사원이 하는 직무와 같은 사원
select * from HR.employees where job_id = 
(select job_id from HR.employees where employee_id = 114);

-- 120번 사원과 같이 입사한 사원
select * from HR.employees where hire_date = 
(select hire_date from HR.employees where employee_id = 120);

-- 130번 사원이 하는 직무 출력(130번 제외)
select * from HR.employees where job_id =
(select job_id from HR.employees where employee_id = 130) and employee_id !=130;

-- 113번 사원이 하는 직무와 같고 120번 사원의 급여와 같은 사원
select * from HR.employees where job_id =
(select job_id from HR.employees where employee_id = 113) and 
salary = (select salary from hr.employees where employee_id = 120);

-- 사원들 중 급여를 제일 적게 받는 사원
select * from HR.employees where salary = (select min(salary) from HR.employees);

-- 사원 전체 평균 급여 이상에 해당하는 사원들을 구하시오.
select * from HR.employees where salary >= (select avg(salary) from HR.employees);

-- 각 부서의 평균 금액이 50번 부서의 평균 금액보다 많은 부서의 평균 금액
select department_id, avg(salary) from HR.employees group by department_id having avg(salary) >= 
(select avg(salary) from HR.employees where department_id = 50);

-- 직무의 평균 급여 중 제일 적게 받는 금액과 같은 금액인 사원들?
select * from HR.employees where salary = 
(SELECT min(avg(salary)) from HR.employees GROUP by job_id);

-- 부서의 최소 금액에 해당하는 사원 출력
select * from HR.employees where salary in 
(select min(salary) from HR.employees group by department_id);

-- 각 부서별 최소금액을 받는 사원 출력
select e.department_id, e.last_name, e.salary from HR.employees e, (select department_id , min(salary) from HR.employees group by department_id) s
where e.department_id = s.department_id;

-- 60인 부서의 급여 중 제일 작은 급여 금액보다 더 많이 받는 사원들을 구하시오.
select * from HR.employees where salary > (select min(salary) from HR.employees where department_id = 60);
select * from HR.employees where salary > any (select salary from HR.employees where department_id = 60);

-- 60인 부서의 급여중 제일 많이 받는 급여보다 작은 급여를 받는 사원 출력
select * from HR.employees where salary < (select max(salary) from HR.employees where department_id = 60);
select * from HR.employees where salary < all (select salary from HR.employees where department_id = 60);

-- 60인 부서의 급여와 같은 급여 사원 출력
select * from HR.employees where salary in (SELECT salary from HR.employees where department_id = 60);
select * from HR.employees where salary = any (SELECT salary from HR.employees where department_id = 60);