
select * from employees;

create table test (
    u_id char(2) primary key,
    u_password varchar(20) NOT NULL,
    u_name varchar(20)  NOT NULL,
    u_adder varchar(50) NOT NULL,
    birth DATE
);

select * from test;

insert into test (u_id, u_password, u_name , u_adder , birth) values('1','123', '김현수', '서울시 노원구 상계5동' , DATE '19911230');

