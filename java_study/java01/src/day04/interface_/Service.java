package day04.interface_;

public interface Service {
	
	
	void insert();
	void update();
	void select();
	void delete();
}

class OracleServiceImpl implements Service{

	@Override
	public void insert() {
		System.out.println("Oracle insert 작업 수행");
	}
	@Override
	public void update() {
		System.out.println("Oracle updatte 작업 수행");
	}
	@Override
	public void select() {
		System.out.println("Oracle select 작업 수행");
	}
	@Override
	public void delete() {
		System.out.println("Oracle delete 작업 수행");
	}
	
}
class MySQLServiceImpl implements Service{
	
	@Override
	public void insert() {
		System.out.println("MySQL insert 작업 수행");
	}
	@Override
	public void update() {
		System.out.println("MySQL updatte 작업 수행");
	}
	@Override
	public void select() {
		System.out.println("MySQL select 작업 수행");
	}
	@Override
	public void delete() {
		System.out.println("MySQL delete 작업 수행");
	}
	
}