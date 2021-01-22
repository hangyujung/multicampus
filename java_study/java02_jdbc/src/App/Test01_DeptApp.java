package App;

import dao.DeptDAO;
import service.DeptService;
import service.DeptServiceImpl;
import vo.DeptVO;

public class Test01_DeptApp {
	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		DeptService service = new DeptServiceImpl(dao);
		
		DeptVO vo = new DeptVO();
		vo.setDeptno(72);
		vo.setDname("기술부3");
		vo.setLoc("대구");
//        int result = 	service.insertDept(vo);
		
        
		System.out.println("************  getDept(72) ************************");

		System.out.println(service.getDept(72));
		
		System.out.println("************  getDeptAll ************************");
		service.getDeptAll().forEach(i->System.out.println(i));
        
		System.out.println("************************************");
		service.deleteDept(70);
		
		
		DeptVO data = service.getDept(50);
		if(data != null) {
			data.setDname("!!!!!!!!!");
			data.setLoc("******");
		}
		service.updateDept(data);
		
	}
}
