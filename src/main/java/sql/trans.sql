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
-- drop table trans_order;
create table trans_order(
order_id varchar2(40) primary key ,-- 预约编号
car_type varchar2(50) not null, -- 车型
car_num varchar2(30)  default ' ', -- 车牌
car_pro varchar2(256) not null, -- 车况
order_time timestamp not null,-- 预约时间
order_status number(1) default 0, -- 状态  0 待处理  1 处理中  2  已处理 3 已取消
phoneno varchar2(60) -- 所属客户
);

create table trans_order_img(
img_url varchar2(256) not null,
order_id varchar2(40) not null
);

insert into TRANS_ORDER_IMG values('11111.jpg','1001');

alter table trans_order add CONSTRAINT trans_order_user_fk 
FOREIGN KEY(phoneno) REFERENCES trans_user(phoneno) ON DELETE SET NULL;

-- 主页咨询
create table indexinfo(
username varchar2(40) not null,
email varchar2(30),
phoneno varchar2(30) not null,
problem varchar2(512) not null,
infotime timestamp not null
);

alter table indexinfo add (status number(1) default 0); -- 添加字段  表示该字段是否联系 0 未联系  1 已联系

select * from indexinfo;
select * from trans_order;



