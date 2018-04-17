-- 用户表设计
create table trans_user(
phoneno varchar2(60) primary key,  
username varchar2(30) not null,
password varchar2(60) not null, 
usertype number(2) default 0 
);

insert into trans_user(phoneno,username,password) values('13111112222','123','123');
insert into trans_user(phoneno,username,password,usertype) values('13188888888','123','admin',1);

-- 维修预约




