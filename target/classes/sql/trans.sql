-- 用户表设计
create table trans_user(
phoneno varchar2(60) primary key,  
username varchar2(30) not null,
password varchar2(60) not null, 
usertype number(2) default 0 
);

insert into trans_user(phoneno,username,password) values('13111112222','123','123');
insert into trans_user(phoneno,username,password,usertype) values('13188888888','123','admin',1);

select * from trans_user;

-- 维修预约
create table trans_order(
order_id varchar2(40) primary key ,-- 预约编号
car_type varchar2(50) not null, -- 车型
car_num varchar2(30)  , -- 车牌
car_pro varchar2(256) not null, -- 车况
order_time timestamp not null,-- 预约时间
order_status number(1) default 0, -- 状态  0 待处理  1 处理中  2  已处理 3 已取消
phoneno varchar2(60) -- 所属客户
);

alter table trans_order add CONSTRAINT trans_order_user_fk 
FOREIGN KEY(phoneno) REFERENCES trans_user(phoneno) ON DELETE SET NULL;

select * from trans_order;



