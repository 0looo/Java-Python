-- and 조건
-- Q) 90인 부서사원들 중 직무가 'AD_PRES' 인 사원 출력
select * FROM HR.employees
where (department_id=90) and job_id = 'AD_PRES';

-- Q) 급여가 10000이상, 업무가 MAN을 포함하는 사원 출력
select * from HR.employees where salary >= 10000 and job_id like '%MAN%';

-- Q) 급여가 10000이상을 받는 사람과 직무에 'MAN'이 포함되어 있는 사원 출력
select * from HR.employees where salary >- 10000 or job_id like '%MAN%';

-- Q) 직무가  AD_PRES, 'AD_VP','IR_PREOG'인 사람 출력
SELECT
    *
FROM HR.employees
where job_id in ('AD_PRES', 'AD_VP','IR_PREOG');

-- Q) 직무가  AD_PRES, 'AD_VP','IR_PREOG'인 사람 제외 출력
SELECT
    *
FROM HR.employees
where job_id not in ('AD_PRES', 'AD_VP','IR_PREOG');

-- Q) 급여가 5000 이상이고 10000이하가 아닌 사원
SELECT
    *
FROM HR.employees
where salary not BETWEEN 5000 and 10000;

--Q) or and 우선순위 : and 먼저 계산

--Q) 'IT_PROG' 업무를 하는 사원과 'ST_MAN'업무를 하는 사원 중 급여가 15000 이상인 사원
SELECT
    *
FROM HR.employees where job_id in ('IT_PROG', 'ST_MAN') and salary >= 15000;

-- Q) IT_PROG' 업무를 하는 사원과 'ST_MAN'를 하는 사원, 혹은 급여가 6000인 사원
SELECT
    *
FROM HR.employees
where job_id in ('IT_PROG', 'ST_MAN') and salary >= 6000;

-- 정렬 : oreder by 기준col
SELECT
    first_name,job_id, hire_date, salary,email
FROM HR.employees order BY hire_date;


-- 정리
-- select   from   where    order by


-- Q) 이름, 직무, 급여, 입사일, 이메일 출력 // 급여기준(오름차순)
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by salary;

-- Q) 이름, 직무, 급여, 입사일, 이메일 출력 // 급여기준(내림차순)
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by salary desc;

---- Q) 이름, 직무, 급여, 입사일, 이메일 // 입사일이 가장 늦은 사원부터 출력
SELECT
    first_name||last_name full_NAME, job_id, salary,hire_date, email
FROM HR.employees order by hire_date desc;

-- Q) 사원번호, 이름, 입사일, 급여, 부서번호를 급여가 많은 순으로 출력(sal => heading 으로 변경)
select employee_id,first_name||last_name full_NAME, salary sal, department_id from HR.employees
order by 3 desc;

--Q) 부서번호, 급여, 사원번호, 직무, 입사일 출력 // 기준 : 부서(오름차순) + 급여(오름차순)
SELECT
    department_id, salary, employee_id, job_id, hire_date
FROM HR.employees
order by department_id, salary ;

-- 부서가 오름차순으로 정렬된 상태에서 부서내에 있는 직무를내림차순으로 정렬
SELECT
    *
FROM HR.employees
order by department_id, job_id desc;

-- 80인 부서에 있는 사원을 입사일이늦은 사원부터 출력
select * from HR.employees where department_id = 80 order by hire_date desc;

-- select
-- from     :  sel~from : projection
-- where                    sel~where : selection
-- order by                     sel~order : 정렬

-- data 가공 : 데이터를 원하는 형태로 변환하여 출력

--문자함수
select lower(first_name), lower(email), job_id from HR.employees;

SELECT
    first_name, upper(first_name), last_name, upper(last_name)
FROM HR.employees;


SELECT
    first_name, email, INITCAP(job_id), job_id
FROM HR.employees;

-- Q) 직무가 'ac_account'인 사원들을 출력하시오.
SELECT
    *
FROM HR.employees where lower(job_id) = 'ac_account';

-- Q) 직무가 'Ac_Account'인 사원 출력
select * from HR.employees where initcap(job_id) = 'Ac_Account';

select last_name || first_name fullname, concat(last_name, first_name) name
from HR.employees;

-- '나의 이름은 KingSteven이고, 내가 맡은 업무는 AD_PRES입니다.' 처럼 출력
select '나의 이름은 ' || last_name|| first_name|| '이고, 내가 맡은 업무는 ' || job_id||'입니다.'
from HR.employees;

-- length
SELECT
    length('abcd'), length('아이유')
FROM dual;

SELECT
    first_name, length(first_name), last_name, length(last_name), email, LENGTH('email')
FROM HR.employees;

 -- 성의 길이가 5보다 큰 사원 출력
 SELECT
     *
 FROM HR.employees where length(first_name) > 5;
 
 -- 급여가 4자리 이상인 사원
 SELECT
     *
 FROM HR.employees where length(salary) >= 4;

-- instr
-- email에 s index 출력
select instr(lower(email), 's') from HR.employees;

-- email 's'가 5번째 출력
select * from HR.employees where instr(lower(email), 's')=5;

-- substr
select first_name, salary, job_id, substr(email,2,3), email from HR.employees;

-- 이메일에 w가 있다면 w부터 3개 출력
select substr(email,instr(email,'W'),3) from HR.employees where instr(email,'W') != 0;

-- 이름, 급여, 직무, 입사일, 이메일 출력// 이름을 3번째부터 출력
SELECT
    first_name, salary, job_id, hire_date, email, substr(first_name, 3)
FROM HR.employees;

-- 이름, 급여, 직무, 입사일, 이메일 출력// 이름을 뒤에서 2개 출력
SELECt
    first_name, salary, job_id, hire_date, email, substr(first_name, -2)
FROM HR.employees;

-- 이름, 급여, 직무, 입사일, 이메일 출력// 이름을 뒤에서 3번째부터 2개 출력
SELECt
    first_name, salary, job_id, hire_date, email, substr(first_name, -3,2)
FROM HR.employees;

-- replace
select replace('abcd', 'e', 'c') from dual;

-- trim
select trim('     bcde     ') a, trim('abcd       ') b, trim('         bacd') c, trim('b cad') d from dual;

--Q) 이메일에 ' ABANDA' 출력
select * from HR.employees where email in trim('  ABANDA ');

-- 양옆에 특수문자 제거
select trim('A' from 'A아이유A') from dual;

-- 이메일에 양끝 'A' 제거
select trim('A' from email) from HR.employees;

-- rpad : 해당글자제외 변환
select rpad('high', 9,'*') from dual;

-- 이메일 앞 3글자 출력후 나머지 *로 변환
select email, rpad(substr(email,1,3),length(email),'*') from HR.employees;

-- 12글자인 전화번호에서 가운데에 3자리는 '*'로 출력
select SUBSTR(phone_number,1,4)||'***'||substr(phone_number,-5) from HR.employees
where length(phone_number)= 12;

-- 전화번호 가운데만 '*' 출력
select phone_number, rpad(substr(phone_number,1,4),instr(phone_number,'.',8),'*')
||substr(phone_number,instr(phone_number,'.',8)) from HR.employees;

-- round : 반올림
select round(5555.5553,-1) from dual;

-- trunc : 절삭(버림)
select trunc(5555.555,1) from dual;

-- ceil :
select ceil(5555.15) from dual;

-- mod : 나머지
select mod(10,3) from dual;
select mod(10,3) from dual;

-- 급여를 2000으로 나눈 몫이 10 이상인 사원을 출력
select floor(5555.15) from dual;

select * from HR.employees
where trunc(salary , 2000) >= 10;

-- 몇년차 인가
select round((sysdate-hire_date)/365) from HR.employees;
select round((sysdate-hire_date)) from HR.employees;

--months_between
select months_between(sysdate, hire_date) from HR.employees;

-- add_month
select hire_date, add_months(hire_date,6) from HR.employees;

-- 입사후 금요일
select next_day(hire_date,'금') from HR.employees;

--last_day
select last_day(hire_date) from HR.employees;

-- 입사한지 170개월 이상된 사원 출력
select * from HR.employees where months_between(sysdate, hire_date) >= 170;

-- round(date, 기준)
-- 기준이 day일때는 검색필요
select hire_date, round(hire_date, 'day'), next_day(hire_date,'월') from HR.employees;