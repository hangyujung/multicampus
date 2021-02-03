package service;

import dao.UserDAO;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	
	UserDAO dao;
	
    
	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public UserVO login(String id, String pw) {
		// TODO Auto-generated method stub
		return dao.login(id, pw);
	}

	@Override
	public void addUser(UserVO vo) {
		// TODO Auto-generated method stub
		dao.addUser(vo);
	}

	@Override
	public UserVO idCheck(String id) {
		// TODO Auto-generated method stub
		return dao.idCheck(id);
	}

}
