package day04.interface_;

public class Test02 {
	public static void main(String[] args) { //클라이언트는 어플리케이션이기떄문에 메인이 있음
		
		
		//
		Service service = new MySQLServiceImpl();
		service.insert();
		service.update();
		service.select();
		service.delete();
	}
}

//service 인터페이스를 중심으로
// 클라인트쪽과 서버쪽 따로 다룰수 있음
