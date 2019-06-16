DROP TABLE IF EXISTS t_user;
create table user(
    id int auto_increment primary key,
    name varchar(20) not null,
    password varchar(20) not null
);

DROP TABLE IF EXISTS `t_redit`;
create table credit(
    id int auto_increment primary key,
    balance int not null
);
