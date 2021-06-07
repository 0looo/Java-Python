create table services(
    svc_num number not null,
    mem_no number not null,
    svc_date date default sysdate not null,
    svc_title varchar2(100) not null,
    svc_content varchar2(2000) not null,
    svc_secret char(1)  not null,
    svc_pw  varchar2(300)   not null,
    svc_image varchar2(1000)   ,
    emp_no number,
    svc_reply   varchar2(1000));
    
drop table notice;
create table notice(
    noti_num number not null,
    emp_no number ,
    noti_title varchar2(100) not null,
    noti_content    varchar2(2000) not null,
    noti_visit_cont number  not null,
    noti_date   date  default sysdate  not null,
    noti_type   varchar2(50));
    
create table employees(
    emp_no number not null,
    emp_id varchar2(20) not null,
    emp_pw varchar2(300) not null,
    emp_name varchar2(21) not null,
    emp_dept_number varchar2(13) not null,
    emp_email varchar2(50) not null,
    emp_tell varchar2(13) not null);
    
drop table products;
create table products(
    pro_num number not null,
    cat_num number not null,
    pro_name varchar2(100) not null,
    pro_price number not null,
    pro_info    varchar2(2000) ,
    pro_image   varchar2(100),
    emp_no number);
    
    drop table review;
create table review(
    pro_num number not null,
    pur_no number not null,
    cat_num number not null,
    re_date date default sysdate not null,
    re_content varchar2(1000)   not null,
    re_rate number not null,
    re_image varchar2(1000),
    re_reply varchar2(1000),
    emp_no number );
    
    drop table purchase_list;
create table purchase_list(
    pro_num number not null,
    pur_no number not null,
    cat_num number not null,
    pur_list_qty number not null,
    pur_list_price number not null);
    
    drop table purchase;
create table purchase(
    mem_no number,
    pur_no number not null,
    pur_date date default sysdate not null,
    pur_price number not null,
    pur_add varchar2(200) not null,
    pur_receiver varchar2(21) not null,
    pur_tell varchar2(13) not null,
    pur_mag varchar2(200));

    drop table cart;
create table cart(
    mem_no number not null,
    pro_num number not null,
    cat_num number not null,
    cart_qty number not null,
    cart_price number not null);
    
create table members(
    mem_no number not null,
    mem_id varchar2(20) not null,
    mem_pw varchar2(300) not null,
    mem_name varchar2(21) not null,
    mem_addr varchar2(200),
    mem_tell varchar2(13) not null,
    mem_email varchar2(50),
    mem_birth date not null,
    mem_gender char(1) not null,
    mem_reg_date date default sysdate not null ,
    email_confirm char(1));
    
    drop table payment;
create table payment(
    pay_num number not null,
    pur_no number not null,
    pay_type varchar2(30) not null,
    pay_acc_num varchar2(30) not null,
    pay_price number not null,
    pay_date date default sysdate not null,
    pay_card varchar2(30));
    
    drop table categorys;
create table categorys(
    cat_num number not null,
    cat_type varchar2(30) not null,
    cat_name varchar2(30) not null);

---------- primary key
alter table cart
add constraint cart_pk primary key(mem_no, pro_num, cat_num);

alter table purchase
add constraint pur_pk primary key(pur_no);

alter table categorys
add constraint cat_pk primary key(cat_num);

alter table review
add constraint re_pk primary key(pro_num, pur_no, cat_num);

alter table employees
add constraint emp_pk primary key(emp_no);

alter table notice
add constraint noti_pk primary key(noti_num);

alter table purchase_list
add constraint pur_list_pk primary key(pro_num, pur_no, cat_num);

alter table payment
add constraint pay_pk primary key(pay_num, pur_no);

alter table members
add constraint mem_pk primary key(mem_no);

alter table services
add constraint svc_pk primary key(svc_num, mem_no);

alter table products
add constraint pro_pk primary key(pro_num, cat_num);

-- »Æ¿Œ
select * from user_constraints where table_name = 'EMPLOYEES';
select * from dba_cons_columns where constraint_name = 'EMP_PK';

--------- reference
alter table notice
add constraint noti_emp_no_FK foreign key(emp_no)
    references employees(emp_no)
    on delete set null;
    
alter table review
add constraint review_emp_no_fk foreign key(emp_no)
    references employees(emp_no)
    on delete set null;
    
alter table review
add constraint review_pur_list_fk foreign key(pro_num, pur_no, cat_num)
    references purchase_list(pro_num, pur_no, cat_num);
    
alter table purchase_list
add constraint pur_list_pur_no_fk foreign key(pur_no)
    references purchase(pur_no);

alter table purchase_list
add constraint pur_list_products_fk foreign key(pro_num, cat_num)
    references products(pro_num, cat_num);
    
alter table services
add constraint svc_emp_no_fk foreign key(emp_no)
    references employees(emp_no)
        on delete set null;
        
alter table services
add constraint svc_mem_no_fk foreign key(mem_no)
       references members(mem_no)
        on delete cascade;
        
alter table products
add constraint pro_emp_no_fk foreign key(emp_no)
    references employees(emp_no)
        on delete set null;
        
alter table products
add constraint pro_cat_num_fk foreign key(cat_num)
    references categorys(cat_num);
    
alter table cart
add constraint cart_pro_fk foreign key(pro_num, cat_num)
    references products(pro_num, cat_num)
        on delete cascade;

alter table cart
add constraint cart_mem_no_fk foreign key(mem_no)
    references members(mem_no)
        on delete cascade;
    
alter table purchase
add constraint pur_mem_no_fk foreign key(mem_no)
    references members(mem_no)
        on delete set null;
        
alter table payment
add constraint pay_pur_no_fk foreign key(pur_no)
    references purchase(pur_no)
        on delete cascade;
