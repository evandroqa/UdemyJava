package udemy.application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Olá mundo");

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2,"Marco");
		//list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		List<String> result = list.stream().filter(x -> x.charAt(0) =='A').toList();
		
		//
		//System.out.println(result);
		for (String str : list) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------");
		for (String str : result) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------");
		String pos = result.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse("Não localizou");
		System.out.println(pos);
	}

}
