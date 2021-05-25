select * from HR.departments;

select * from HR.employees;

select department_id, location_id from HR.departments;

DESC HR.employees;

-- Q) 사원번호, 이름, 급여, 이메일, 입사일, 부서번호를 출력하시오.
select Employee_id, first_name, salary, email,hire_date, department_id from HR.employees;

select last_name, salary from HR.employees;
select last_name, salary, 12*(salary+300) from HR.employees;

-- Q) 사원테이블에서 사원번호, 이름, 급여, 직무, 부서번호를 출력
select employee_id, first_name, salary, job_id, department_id from HR.employees;

-- Q) 부서테이블에서 부서장, 부서번호, 주소번호를 출력
select manager_id, department_id, location_id from HR.departments;

-- Q) 사원테이블에서 사원번호, 부서번호, 직무, 급여 출력(급여 : 연봉)
select employee_id, department_id, job_id, salary*12 from HR.employees;

-- Q) 사원테이블에서 사원번호, 부서번호, 직무, 연봉을 출력 // 매월 300씩 보너스 지급
select employee_id, department_id, job_id, (salary+300)*12 from HR.employees;

-- Q) 사원테이블에서 사원번호, 부서번호, 직무, 연봉을 출력// 마지막달에 300 보너스
select employee_id, department_id, job_id, salary*12 + 300 from HR.employees;

-- null
select last_name, job_id, salary, commission_pct from HR.employees;

-- null 연산
select last_name, 12* salary * commission_pct from HR.employees;
-- null 포함된 연산은 null로 표시

-- col명 설정 : as
select last_name, 12* salary * commission_pct as year_salary from HR.employees;
select last_name, 12* salary * commission_pct year_salary from HR.employees;

-- Q) 사원번호, 이름, 직무, 부서번호, 급여, 연봉 // 마지막 2500만원 보너스
select employee_id, first_name, job_id, department_id, salary, salary*12+2500 anuual_salary from HR.employees;

select last_name || job_id employees from HR.employees;

select '이' || '자수' fullname from dual;  -- dual : 가상테이블

--Q) 사원테이블에서 사원번호, 사원전체이름, 급여, 부서 출력
SELECT
    employee_id, first_name||last_name fullname, salary, department_id
FROM HR.employees;

--Q) 사원번호와 급여를 사이에 first_name_last_name_의 직무는 department_id입니다. 추가 출력
SELECT
    employee_id, first_name||last_name||'의 직무는 '||job_id||'입니다.' ans , salary
FROM HR.employees;


-- 중복제거
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

-- Q) 사원번호가 110인 사원의 정보출력
SELECT
    *
FROM HR.employees
where employee_id = 110;

select last_name, job_id, department_id from HR.employees
where last_name = 'Whalen';


select * from HR.employees;
-- 2003. 3. 6.입사자 출력
SELECT * fROM HR.employees
where hire_date = '03/06/17';

-- 06/01/03 보다 늦게 입사사원
SELECT
    *
FROM HR.employees
where hire_date > '06/01/03';

SELECT
    *
FROM HR.employees where salary BETWEEN 2500 AND 3500;

-- Q)성 king ~ smith 사이 사원출력
SELECT
    *
FROM HR.employees WHERE last_name BETWEEN 'King' and 'Smith';

-- 부서가 50, 70, 90 
select * from HR.employees where department_id in (50,70,90);

--
SELECT
    *
FROM HR.employees where first_name like 'S%';

-- 입사일이 6일
select * from HR.employees where hire_date like '%06';

-- REP 포함되는 사원
select * from HR.employees where job_id like '%REP%';