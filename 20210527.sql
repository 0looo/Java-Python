select * from hr.employees;

select  first_name, email, salary, hire_date, to_char(hire_date, 'mm-dd-yyyy'),
        to_char(hire_date, 'dd-mm-yy'),
        to_char(hire_date, 'mm-dd-yyyy hh24:mi:ss AM')
from hr.employees;

select sysdate, to_char(sysdate, 'mm-dd-yyyy hh24:mi:ss AM sssss')
from dual;

select employee_id,  to_char(hire_date,'month/yy') month_year
from hr.employees;


--- 02/3월에 입사한 사람을 출력하시오.
select to_char(hire_date,'yy/mon/dd day')
from hr.employees;

select * from hr.employees
where to_char(hire_date,'yy/mon') = '03/5월';

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

-- 25-04-2003이 지나서 입사한 사람을 출력하시오. -- 
select * from hr.employees
where hire_date > to_date('25-04-2003', 'dd-mm-yyyy');

select * from hr.employees -- 사전 순서
where to_char(hire_date,'dd-mm-yyyy') > '25-04-2003';

select first_name, last_name, salary, commission_pct, 
        salary *( 1+ nvl(commission_pct,0)) * 12 year_sal
from hr.employees;

select null, nvl(null, 0), nvl(null, 100)
from dual;

---- 사원번호, 이름, 직무, 부서, 급여, 커미션금액을 출력. 커미션이 없는 사람은 0으로 출력
select employee_id, salary, job_id, department_id,
       salary, salary * nvl(commission_pct,0) 
from hr.employees;

---- case 
--- job_id이 'IT_PROG' 급여를 10%상승
---          'ST_CLERK' 급여를 15%상승
---          'SA_REP' 급여를 20%상승
---          그이외는 급여
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

--- 급여가 3000이하이면 사원 
--        5000이하이면 주임
--        7000이하이면 대리
--        9000이하이면 과장
--       11000이하이면 차장
--       13000이하이면 부장
--       그 이상 이면 임원
select employee_id , salary,
case when salary <= 3000 then '사원'
     when salary <= 5000 then '주임'
     when salary <= 7000 then '대리'
     when salary <= 9000 then '과장'
     when salary <= 11000 then '차장'
     when salary <= 13000 then '부장'
     else '임원' end grade
from hr.employees;
---  급여를 2000으로 나눈 몫이 0이면 급여의 0%
---                         1이면 급여의 9%
---                         2이면 급여의 20%
---                         3이면 급여의 30%
---                         4이면 급여의 40%
---                         5이면 급여의 42%
---                         6이면 급여의 44%
---                         이외 급여의 45% 세금이다. 세금이 얼마인지 출력
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


--- 사원번호, 이름, 급여, 이름의 길이를 출력하시오.
select employee_id, first_name, salary, length(first_name)
from hr.employees;

--- 직원의 수를 구하시오.
select * from hr.employees;
select count(*) from hr.employees;
-- 직원들의 평균급여, 급여 합계, 제일 많이 받는 사람, 제일 적게 받는 사람
select avg(salary), sum(salary), max(salary), min(salary)
from hr.employees;

select first_name, salary, job_id
from hr.employees
where job_id like '%REP%';

select avg(salary), sum(salary), max(salary), min(salary)
from hr.employees
where job_id like '%REP%';

--- 90인 부서의 평균 급여 , 최대급여, 최소급여, 급여의 합계를 구하시오.
select first_name , department_id, salary
from hr.employees
where department_id = 90;

select avg(salary), max(salary), min(salary) , sum(salary)
from hr.employees
where department_id = 90;

---입사일이 제일 빠른 사람과, 입사일이 제일 늦은 사람을 구하시오.
select min(hire_date), max(hire_date)
from hr.employees;

--- 이름이 사전에서 제일 먼저 나올 사람과 나중에 나올 사람을 출력하시오.
select min(first_name) , max(first_name)
from hr.employees;

--- 50인 부서의 사원의 수를 구하시오.
select count(*) from hr.employees
where department_id = 50;

select * from hr.employees;
select count(*) from hr.employees;

select first_name from hr.employees;
select count(first_name) from hr.employees;

select department_id  from hr.employees;
select count(department_id) from hr.employees;
--- 그룹함수는 null인 적용하지 않는다.
select * from hr.employees;
select count(*) from hr.employees;

-- 부서가 있는 사원의 수를 출력하시오.
select count(department_id) from hr.employees;
---전체 직원의 수와  커미션을 받는 사원의 수는 ?
select count(*) , count(commission_pct)
from hr.employees;

-- 80인 부서의 사원의 수와 커미션을 받는 사원의 수는 ?
select count(*) , count(commission_pct)
from hr.employees
where department_id = 80;

-- 커미션을 받는 사원의 커미션의 평균과 전체 사원의 커미션의 평균을 구하시오.
select avg(commission_pct) , sum(commission_pct) / count(*),
       avg(nvl(commission_pct,0))
from hr.employees;

-- 10번 부서의 급여의 평균
select avg(salary) from hr.employees where department_id = 10;
-- 20번 부서의 급여의 평균
select avg(salary) from hr.employees where department_id = 20;
-- 30번 부서의 급여의 평균
select avg(salary) from hr.employees where department_id = 30;
-- 40번 부서의 급여의 평균
select avg(salary) from hr.employees where department_id = 40;
---50,60,70,80,90,100,110

select department_id, avg(salary)
from HR.employees
group by department_id
order by department_id;
--- group 함수를 사용하는 경우에는 group by절에 있는 column만 select절에 사용할 수 있다.

-- 각 부서의 급여의 평균, 급여의 합계 , 최대값, 최소값을 출력하시오.
select department_id, avg(salary), sum(salary), max(salary), min(salary)
from HR.employees
group by department_id;

---  각 부서에서 제일 먼저 입사한 사원과 제일 나중에 입사한 사원을 출력하시오.
select department_id, min(hire_date), max(hire_date)
from hr.employees
group by department_id;

--- 각 직무에서 제일 먼저 입사한 사원과 제일 나중에 입사한 사원을 출력하시오.
select job_id, min(hire_date), max(hire_date)
from hr.employees
group by job_id;
--  각 직무에서 급여를 가장 많이 받는 사원과 적게 받는 사원을 출력하시오.
select job_id, min(salary), max(salary)
from hr.employees
group by job_id;


select distinct job_id from hr.employees where department_id = 30;
--- 50부서의 직무가 ST_MAN인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 50 and job_id ='ST_MAN';
--- 50부서의 직무가 SH_CLERK인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 50 and job_id ='SH_CLERK';
--- 50부서의 직무가 ST_CLERK인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 50 and job_id ='ST_CLERK';
--- 40부서의 직무가 HR_REP인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 40 and job_id ='HR_REP';
--- 30부서의 직무가 PU_MAN인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 30 and job_id ='PU_MAN';
--- 30부서의 직무가 PU_CLERK인 사원의 평균급여를 구하시오.
select avg(salary) from hr.employees where department_id = 30 and job_id ='PU_CLERK';

--- 부서별 직무의 급여의 합계
select department_id, job_id, avg(salary), sum(salary), min(salary), max(salary)
from hr.employees
group by department_id, job_id
order by department_id, job_id;

--- 부서와 직무와 급여가 같은 사원의 수를 구하시오.
select department_id, job_id, salary, count(*)
from hr.employees
group by department_id, job_id, salary;

--- 각 부서에서 직무에 'REP'를 가지고 있는 사원들의 급여의 합계를 구하시오.
select department_id, sum(salary)
from hr.employees
where job_id like '%REP%'
group by department_id;

--- 평균급여가 7000이상인 부서만 출력하시오. 
select department_id, avg(salary)
from hr.employees
group by department_id
having avg(salary) >= 7000
order by avg(salary);

---select           5
---from             1
---where            2 -- 테이블에 있는 데이터의 조건
-- group by         3
-- having           4 --- group by에 대한 조건
-- order by         6

--- 부서의 직원 수가 10명 미만이 부서를 출력하시오.
select department_id, count(*)
from hr.employees
group by department_id
having count(*) < 10;

--- 직무에 'REP'가 포함되어 있지 않은 직무별 급여의 평균, 합계, 최소, 최대 값을 출력할때
--- 급여의 합계가 13000이상인 직무만 출력하시오.

select job_id, avg(salary), sum(salary), min(salary), max(salary)
from hr.employees
where job_id not like '%REP%'
group  by job_id
having sum(salary) >= 13000;

--1. projection
--2. selection
--3. 다일행 함수
--4. 다중행 함수(그룹 함수)

---- 전체 직원이 속해 있는 부서의 합계
select count(*), count(department_id), count(distinct department_id)
from hr.employees;

--- 직원들이 담당하고 있는 직무는 몇가지 인가?
select count(distinct job_id)
from HR.employees;

---- 90인 부서의 사원을 출력하시오.
select * from hr.employees
where department_id = 90;
--- 90인 부서 정보를 출력하시오
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

--- 90인 부서에 대한 사원의 사원번호, 이름, 급여, 부서번호, 부서명, 주소번호를 출력
select employee_id, first_name, salary, 
       e.department_id, department_name, location_id
from  hr.employees e, hr.departments d
where e.department_id = d.department_id 
and e.department_id = 90;

---- 'AD_PRES'직무를 하는 사원들을 출력하시오.
-- 사원번호, 이름 , 급여 , 부서번호, 직무번호
select employee_id, first_name, salary, department_id, job_id
from hr.employees
where job_id = 'AD_PRES';

--- jobs에서 'AD_PRES'에 대한 내용을 출력하시오.
select * from hr.jobs
where job_id = 'AD_PRES';

--AD_PRES인 직무를 가진 사원들의 사원번호, 이름 , 급여 , 부서번호, 직무번호, 직무명을 출력
select employee_id, first_name, salary, department_id, j.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and j.job_id = 'AD_PRES';

--- ST_MAN인 직무를 가진 사원들의 사원번호, 성 , 이메일 , 상사, 직무번호, 직무명을 출력
select employee_id, last_name, email, manager_id, j.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and e.job_id = 'ST_MAN';

---- REP가 포함되어 있지 않고 급여가 7500 이상인 사원들의 
--- 사원번호, 성 , 이름 , 급여, 입사일 , 직무번호, 직무명을 출력하시오
select employee_id, last_name , first_name, salary, hire_date,
       e.job_id, job_title
from hr.employees e, hr.jobs j
where e.job_id = j.job_id and e.job_id not like '%REP%' and salary >= 7500;
