package service;

import java.util.List;

import dao.DeptDAO;
import vo.DeptVO;

public class DeptServiceImpl implements DeptService{
	
	private DeptDAO dao = null;
	
	public DeptServiceImpl() {
		super();
	}
	public DeptServiceImpl(DeptDAO dao) {
		this.dao = dao;
	}
	
	public DeptDAO getDao() {
		return dao;
	}
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}

	@Override
	public int insertDept(DeptVO vo) {
		return dao.insertDept(vo);
	}

	@Override
	public DeptVO getDept(int deptno) {
		return dao.getDept(deptno);
	}
	@Override
	public List<DeptVO> getDeptAll() {
		return dao.getDeptAll();
	}
	@Override
	public int deleteDept(int deptno) {
		return dao.deleteDept(deptno);
	}
	@Override
	public int updateDept(DeptVO vo) {
		// TODO Auto-generated method stub
		return dao.updateDept(vo);
	}
	
	

}
