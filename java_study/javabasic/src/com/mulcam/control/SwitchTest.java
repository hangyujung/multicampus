package com.mulcam.control;

public class SwitchTest {
	public static void main(String[] args) {
		int score =99;
		String grade ="F";
		switch(score) {
		case 99:{
			System.out.println("����F����");break;
		}
		}
	
		System.out.println("������ "+score+ "���̹Ƿ� "+grade +"�����Դϴ�.");
	
	
	

		String s = "a";  //jdk 7 (1.7) �̻󿡼��� ���ڿ��� �񱳰���
		switch(s) {
			case "a": System.out.println("���ڿ� a�Դϴ�.");break;
			default : System.out.println("���ڿ� a �ƴϾ�");break;
		}
	
	}
}
//ũ�� �۴� �� �ȵ�, ���� �񱳸� �� 
//string c = 'a'
//switch(c)//�����Ÿ� ū�ŷ� �ִ°��� �ڵ����� ����ȯ ����
//���ڿ� �� ���ڿ� ���Ҽ� ���� ,,,  String grade = "A";    grade+="+";     <<  A+�� ����.

