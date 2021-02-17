package kr.co.multi.teamfinder.dao;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Mapper;

import kr.co.multi.teamfinder.dto.User;


@Mapper
public interface UsersMapper {
	
	public User getUser(User user) ; 
	public int addUser(User user) throws Exception; 
	public List<User> getUsers();
	public int login(User user); 
	public int idCheck(String memberId);
}




