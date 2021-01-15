package day05;

import javax.swing.JOptionPane;

public class Test03_Command2 {
	public static void main(String[] args) {
		
		Command delete = new Command(){
			@Override
			public void exec() {
				System.out.println("DeleteCommand  수행");
			}
		};
		
		
		
		Command update = new Command(){
			@Override
			public void exec() {
				System.out.println("Updateommand  수행");
				base();
			}
			@Override
			public void base() {
		      System.out.println("~~~~~~");
			}
		};
		
		
		Command insert = new  Command(){
			@Override
			public void exec() {
				System.out.println("InsertCommand  수행");
			}
		};
		
		
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("SelectCommand  수행");

			}
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
				break;
			case "4":
				select.exec();
				break;
				
			default:
				break;
		}
		
	}
}

//interface Command{
//	 void exec() ;  //public abstract void exec()
//	 default void base() {}
//}



