
drop table book;

create table book  (
	bookno number(4) primary key,
	title 	varchar2(50),
	publisher varchar2(50),
	price number(7,2) check(price>0),
	pubdate DATE default sysdate,
	img varchar2(200)
);

--insert구문은 이런식
insert into book(bookno,title,publisher,price)
values((select nvl(max(bookno),0)+1 from book),'java','한빛미디어',24000);