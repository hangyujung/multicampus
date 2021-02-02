package service;

public interface UserService {
	UserVO login(String id,String pw);
	
	void addUser(UserVO vo);
	
	UserVO idCheck(String id);

}


/*


/* user table 
drop table users;
create table users(
	id varchar2(10) constraint users_id_pk primary key,
	pw varchar2(10) constraint password_not_null not null,
	name varchar2(20),
	role varchar2(10) default 'user' check(role in ('user','admin'))
);


insert into user (id,pw,name,role) values ('admin','1234','관리자','admin');
insert into user (id,pw,name) values ('java01','1234','홍길동');

*/