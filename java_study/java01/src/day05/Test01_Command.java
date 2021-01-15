package day05;

public class Test01_Command {
	public static void main(String[] args) {
		Command cmd =new UpdateCommand();
	
		if(cmd !=null) cmd.exec();
	
	}
}
//interface Command{
//	void exec();
//	default void base() {}  //필요한 기능들만 추가해서 쓰라고 디폴트 매소드 넣음
//}
class DleleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
		base();
	}
	@Override
	public void base() {
		System.out.println("~~~~~~~~~");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
}
class SelectCommand implements Command{
	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
}