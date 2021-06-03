select * from employees;
drop table employees;

create table employees
as select * from HR.employees;

drop table departments;

create table departments
as select * from HR.departments;

---Q) 각 부서에서 최소금액을받는 사원들의 정보를 구하시오.
-- 인나인뷰
select * from employees e, (select department_id, min(salary) m from employees
group by department_id) s where e.department_id = s.department_id and e.salary = s.m;

-- 쌍비교
select * from employees where (department_id, salary) in
(select department_id, min(salary) m from employees group by department_id);


--Q) 비쌍비교  (( 문제 해설이 애매함.)
select * from employees where (department_id in (select distinct(department_id) from employees order by 1))
and (salary in (select min(salary) from employees group by department_id order by department_id));


--- Q) 178 사원과 174번 사원 부서와 상사가 같은 직원 추출
-- 쌍비교
select * from employees where (department_id, manager_id) in 
(select department_id, manager_id from employees where employee_id in (178, 174));

-- 비쌍비교
select * from employees where department_id in (select department_id from employees where employee_id in (178, 174))
and manager_id in (select manager_id from employees where employee_id in (178, 174));



-- 차후 추가 공부가 좋은 부분

--- windows 함수
-- 각 부서의 최대급여, 최소급여, 평균급여, 급여합계를 출력
select department_id, max(salary), min(salary), avg(salary), sum(salary)
from employees group by department_id;

-- employees 테이블의 첫 행부터 마지막행까지 직원번호, 이름, 급여, 급여의 합계를 출력
select employee_id, first_name, salary,
    sum(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ) total,
    round(avg(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ), 3) avg,
    max(salary) over (order by salary 
        rows BETWEEN unbounded preceding and unbounded following ) max
    from employees;

-- employees table에서 직원번호, 이름, 급여, 누적합계를 출력하시오.
select employee_id, first_name, salary,
    sum(salary) over(order by salary rows BETWEEN unbounded PRECEDING
        and current row) sum
    from employees;

-- employees table에서 직원번호, 이름, 급여, 급여합계(본인~ 상위급여자 합산)

select employee_id, first_name, salary,
    sum(salary) over(order by salary rows BETWEEN current row
        and unbounded following) sum
    from employees;


-- rank
--  : 순위 함수
select first_name, salary,
    rank() over (order by salary desc) all_rank,
    rank() over (partition by job_id order by salary desc) job_rank
        from employees;
        
select first_name, salary,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank
        from employees;

-- 부서별 densc_rank
select first_name, salary, department_id,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank,
    dense_rank() over (partition by department_id order by salary desc) dep_densc
        from employees;
        
-- row_number   : 순서가 등수.
select first_name, salary, department_id,
    rank() over (order by salary desc) all_rank,
    dense_rank() over (order by salary desc) dense_rank,
    dense_rank() over (partition by department_id order by salary desc) dep_densc,
    row_number() over (order by salary desc) row_number,
    row_number() over (partition by department_id order by salary desc) job_number
        from employees;
        
-- 각 부서별 급여의 합계, 평균, 최댓값, 최소값
select employee_id, first_name,department_id, salary,
    sum(salary) over (partition by department_id) sum,
    round(avg(salary) over (partition by department_id),3) avg,
    max(salary) over (partition by department_id) max,
    min(salary) over (partition by department_id) min
        from employees;

---- 각 부서에서 급여가 가장 많은 사람만 출력
select * from employees where (department_id, salary) in
(select department_id, max(salary) m from employees group by department_id);
-- windows

select employee_id, first_name, salary, department_id,
    first_value(first_name) over (partition by department_id order by salary desc
        rows unbounded preceding) dept_a
            from employees;
            
            
-- 모든 사원출력, 제일 적게 받는 사원 출력
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


-- 비율함수
select department_id, first_name, salary,
    percent_rank() over (partition by department_id order by salary desc) per_sal
from employees;

-- 비율 ( 급여가 전체기준 몇퍼센트인가)
select department_id, first_name, salary,
    percent_rank() over (order by salary desc) per_sal
from employees order by salary;

-- 구간별 비율 (ntile)
select department_id, first_name, salary,
    ntile(4) over (order by salary desc
    ) per_sal
from employees;

--- pl / sql   => 어려운 부분(시간소요가 상당히 예상됨)
