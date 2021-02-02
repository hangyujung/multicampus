package service;

import java.util.List;

import dao.UserDAO;
import vo.UserVO;

public class UserServiceImpl {
private UserDAO dao = null;
	
	public UserServiceImpl() {	}
	
	public UserServiceImpl(UserDAO dao) {
		this.dao = dao;
	}
	public UserDAO getDao() {
		return dao;
	}
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
	@Override
	public UserVO login(String id,String pw) {
		dao.login(String id,String pw);
	}
	@Override
	public void addUser(UserVO vo)  {
		dao.addUser(vo);
	}
	@Override
	public UserVO idCheck(String id) {
		dao.idCheck(id);
	}
	
}
