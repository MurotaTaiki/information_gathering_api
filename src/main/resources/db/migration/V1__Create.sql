create table users(user_id varchar(255) not null primary key, password varchar(255) not null);
create table type(type_id int not null primary key, name varchar(100));
create table operation(operation_id int not null primary key, name varchar(20));

create table info(info_id int not null auto_increment primary key, user_id varchar(255) not null, type_id int not null, title varchar(255) not null, description varchar(1000) not null, url varchar(1000) not null, created_at datetime not null, foreign key(user_id) references users(user_id) on delete cascade on update cascade, foreign key(type_id) references type (type_id) on delete cascade on update cascade);
create table history(history_id int not null primary key, user_id varchar(255) not null, type_id int not null, operation_id int not null, title varchar(255) not null, created_at datetime not null, foreign key(user_id) references users(user_id) on delete cascade on update cascade, foreign key(type_id) references type (type_id) on delete cascade on update cascade, foreign key(operation_id) references operation(operation_id) on delete cascade on update cascade);
