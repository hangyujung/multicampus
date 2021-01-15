package day05.collection;  //collection framework

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day04.abstract_.Animal;

public class Test04_ArrayList {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();  //성능은 더 빠름
		//List<String> list= new Vector<String>();   // 다른 사람들과 공유 될 경우
		
		list.add("홍길동");
		list.add("이길동");
		list.add("삼길동");
		list.add("홍길동");
		String key = "이길동";
		System.out.println(key+" ?? "+list.contains(key));
		System.out.println();
		
		System.out.println("----------------iterator--------------");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String data =  it.next();
			System.out.println(data);
			if(data.contentEquals("홍길동")) {
				System.out.println("삭제함미다");
				it.remove();
			}
		}
		System.out.println("END--------------------");
		
		List<Animal> list2 = new ArrayList<>();
		
		
	}
}
