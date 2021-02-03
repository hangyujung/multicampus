package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;

public class BookDAO {

	public List<BookVO> bookList() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = "select * from book order by bookno desc";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookno(rs.getInt("bookno"));
				vo.setPrice(rs.getInt("price"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setTitle(rs.getString("title"));
				vo.setImg(rs.getString("img"));

				list.add(vo);
			}

		} catch (Exception e) {
			System.out.println("error" + e);
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

		return list;
	}

	public void bookDelete(int bookno) {

		String sql = "delete from book where bookno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅
			ps.setInt(1, bookno);
			// 실행
			// ps.executeQuery();
			row = ps.executeUpdate();

			// 결과값 처리

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

	}

	public void bookUpdate(BookVO vo) {

		String sql = "update book set price = ? where bookno = ?";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 값 세팅
			ps.setInt(1, vo.getPrice());
			ps.setInt(2, vo.getBookno());

			// 실행
			// ps.executeQuery();
			ps.executeUpdate();

			// 결과값 처리

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

	}

	public BookVO getBook(int bookno) {
		String sql = "select * from book where bookno = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BookVO vo = null;
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookno);
			rs = ps.executeQuery();
			// 결과값 처리
			while (rs.next()) {
				vo = new BookVO();
				vo.setBookno(rs.getInt("bookno"));
				vo.setPrice(rs.getInt("price"));
				vo.setTitle(rs.getString("title"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setImg(rs.getString("img"));
				vo.setPubdate(rs.getDate("pubdate").toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, ps, con);
		}
		return vo;
	}

	public void bookAdd(BookVO vo) {

		String sql = "insert into book (bookno ,title,publisher,price) "
				+ " values ((select nvl(max(bookno),0)+1 from book)  ,?,?,?)";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row;

		try {

			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql

			// ps 구문에 파라미터세팅
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getPublisher());
			ps.setInt(3, vo.getPrice());

			row = ps.executeUpdate(); // insert , update,delete
			// 결과값핸들링

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

	}

	public List<BookVO> bookSearch(String condition, String keyword) {

		String sql = "select * from book where upper(" + condition + ") like ? order by bookno desc";

//    	select * from book where title like '%j%' order by bookno desc
//    	select * from book where publisher like '%한빛%' order by bookno desc

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row;

		List<BookVO> list = new ArrayList<BookVO>();
		try {

			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); // sql

			// ps 구문에 파라미터세팅
			ps.setString(1, "%" + keyword.toUpperCase() + "%");

			rs = ps.executeQuery(); // select

			// 결과값핸들링
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookno(rs.getInt("bookno"));
				vo.setPrice(rs.getInt("price"));
				vo.setTitle(rs.getString("title"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setImg(rs.getString("img"));
				vo.setPubdate(rs.getDate("pubdate").toString());
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, ps, con);
		}

		return list;
	}

}

/*
drop table book purge;
drop table book cascade CONSTRAINT;

CREATE TABLE book(
   bookno NUMBER(5) primary key,   --unique + not null   , index 생성
   title  VARCHAR2(50) ,
   publisher VARCHAR2(50) ,
   price number(7,2) check(price>0),
   pubdate DATE default sysdate,
   img       varchar2(200)
);


insert into book (bookno ,title,publisher,price)
values ((select nvl(max(bookno),0)+1 from book)  ,'SQL','도우출판사',900);



select * from book where title like '%j%' order by bookno desc
select * from book where publisher like '%한빛%' order by bookno desc




delete from user where id = 'java01';
UPDATE user SET password = '1234'  WHERE id ='java01';
select * from book order by bookno desc

delete from book where bookno = ?
String sql = "select * from book order by bookno desc";

String sql = "insert into book (bookno ,title,publisher,price) " + 
       		"values ((select nvl(max(bookno),0)+1 from book)  ,?,?,?)";
       		
String sql = "delete from book where bookno = ?";


select * from 
( select rownum row#,bookid, bookname, publisher, price 
 		 from (select * from Book order by bookid desc)  
 )
 where row# between 1 and 5 ;

 
 
 


insert into book (bookno,title,publisher,price)
values((select nvl( max(bookno),0)+1 from book) ,'java','한빛미디어',24000);



*/