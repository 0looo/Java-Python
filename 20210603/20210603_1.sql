create table teacher
(   teach_no    number not null,
    teach_name  varchar2(10)    not null,
    teach_tel   varchar2(11)    not null,
    teach_email varchar2(30)    not null,
    teach_addr  varchar2(255)   not null,
    teach_carr  varchar2(1000),
    teach_viol  varchar2(1000),
    teach_verti varchar2(1000));
    
create table subject(
    subj_no number not null,
    subj_name   varchar2(100) not null,
    subj_cnt    varchar2(1000),
    subj_group  number not null,
    subj_day    number  not null,
    subj_time   number  not null);
    
create table leccontract(
    lec_no  number  not null,
    teach_no    number,
    subj_no number,
    lec_date    timestamp   not null,
    lec_pay number  not null,
    lec_sign    varchar2(1000)  not null,
    lec_unit    number);

create table leceval(
    leceval_no  number  not null,
    emp_no  number  not null,
    lec_no  number  not null,
    leceval_substfy number  not null,
    leceval_relate number not null,
    leceval_lecstfy number not null,
    leceval_etc varchar2(1000));

create table employment(
    employment_no   number  not null,
    emp_no  number  not null,
    employment_sign varchar2(1000) not null,
    employment_sal  number not null,
    employment_posi varchar2(10)    not null,
    employment_date timestamp not null);
    
create table jobintv(
    jobintv_no  number  not null,
    emp_no  number not null,
    jobintv_lang  number  not null,
    jobintv_serv  number  not null,
    jobintv_task  number  not null,
    jobintv_social  number  not null,
    jobintv_solve  number  not null);

create table employee(
    emp_no  number not null,
    dept_no number,
    emp_name    varchar2(10) not null,
    emp_tel varchar2(11)    not null,
    emp_email   varchar2(30)    not null,
    emp_addr    varchar2(225)    not null,
    emp_date timestamp ,
    emp_carr    varchar2(1000),
    emp_certi   varchar2(1000));
    
create table attend(
    attend_no number not null,
    emp_no  number  not null,
    lec_no  number  not null,
    attend_date timestamp   not null,
    attend_time number  not null,
    compl_date timestamp not null);

create table department(
    dept_no number not null,
    dept_name   varchar2(100)   not null,
    dept_tel    varchar2(11)    not null,
    dept_addr   varchar2(255)   not null);

-- primary key

alter table teacher
add CONSTRAINT tch_teach_no_PK primary key(teach_no);

alter table subject
add CONSTRAINT sub_subj_no_PK primary key(subj_no);

alter table employment
add CONSTRAINT emp_employment_no_pk primary key(employment_no, emp_no);

alter table leceval
add constraint lec_leceval_no_pk primary key(leceval_no, emp_no, lec_no);

alter table leccontract
add constraint lec_lec_no_pk primary key(lec_no);

alter table jobintv
add constraint job_jobintv_pk primary key(jobintv_no,emp_no);

alter table employee
add constraint emp_emp_no_pk primary key(emp_no);

alter table attend
add constraint att_attend_no_pk primary key(attend_no, emp_no, lec_no);

alter table DEPARTMENT
add constraint dept_dept_no_pk primary key(dept_no);

-- foreign key
alter table leccontract
add constraint lec_teach_no_FK FOREIGN key (teach_no)
    REFERENCES teacher(teach_no)
    on delete set null;

alter table leccontract
add constraint lec_subj_no_FK FOREIGN key (subj_no)
    REFERENCES subject(subj_no)
    on delete set null;

alter table leceval
add constraint lece_lec_no_FK FOREIGN key (lec_no)
    REFERENCES leccontract(lec_no) on delete cascade;

alter table leceval
add constraint lece_emp_no_FK FOREIGN key (emp_no)
    REFERENCES employee(emp_no) on delete cascade;
    
alter table employment
add CONSTRAINT empl_emp_no_FK FOREIGN key(emp_no)
    REFERENCES employee(emp_no) ON DELETE CASCADE;
    
alter table jobintv
add CONSTRAINT jobin_emp_no_fK FOREIGN key(emp_no)
    REFERENCES employee(emp_no) ON DELETE CASCADE;
    
alter table employee
add CONSTRAINT emp_dept_no_fk FOREIGN key(dept_no)
    REFERENCES department(dept_no) on delete set null;

alter table attend
add CONSTRAINT att_emp_no_fk FOREIGN key(emp_no)
    REFERENCES employee(emp_no) on delete CASCADE;
    
alter table attend
add CONSTRAINT att_lec_no_fk FOREIGN key(lec_no)
    REFERENCES leccontract(lec_no) on delete CASCADE;