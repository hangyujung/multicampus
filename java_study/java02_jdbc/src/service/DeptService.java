package service;

import java.util.List;

import vo.DeptVO;

public interface DeptService {
	public int insertDept(DeptVO vo) ;
	public DeptVO getDept(int deptno);
	public List<DeptVO> getDeptAll();
	public int deleteDept(int deptno);
	public int updateDept(DeptVO vo);
	
}
