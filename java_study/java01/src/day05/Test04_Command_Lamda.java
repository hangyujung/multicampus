package day05;

import javax.swing.JOptionPane;

public class Test04_Command_Lamda {
	public static void main(String[] args) {
		
		Command delete =  ()-> 	System.out.println("DeleteCommand  수행");  //Lamda expression
		Command update =  ()-> System.out.println("Updateommand  수행");
		Command insert =  () -> System.out.println("InsertCommand  수행");
		Command select = ()->{
				System.out.println("SelectCommand  수행");
				System.out.println("SelectCommand LAMDA 수행");
			};
		
		
		
		String msg = JOptionPane.showInputDialog("1.delete    2.insert   3.update   4.select");
		switch (msg) {
			case "1":
				delete.exec();
				break;
	
			case "2":
				insert.exec();
				break;
				
			case "3":
				update.exec();
				update.base();
				break;
			case "4":
				select.exec();
				break;
				
			default:
				break;
		}
		
	}
}

interface Command{
	 void exec() ;  //public abstract void exec()
	 default void base() {
		 System.out.println("default 수행");
	 }
}



