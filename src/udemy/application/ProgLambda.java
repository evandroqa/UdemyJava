package udemy.application;

import java.util.ArrayList;
import java.util.List;

import udemy.entities.Product;

public class ProgLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lista Ordenada de produtos - Função Lâmbda");
		
		List<Product> lista = new ArrayList<>();
		
		lista.add(new Product("TV", 900.0));
		lista.add(new Product("Notebook", 1200.0));
		lista.add(new Product("Tablet", 450.0));

		// Objeto de classe anônima.
//		Comparator<Product> comp new Comparator<Product>() {
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
		
		// A função abaixo substitui a de cima - com Lâmbda - interface funcional
//		Comparator<Product> comparar = (p1,p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
		
		//Simplificando ainda mais.
//		Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		lista.sort(comp);
		
		// ou diretamente
		// Ordenando por nome do produto
		// lista.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		// Função são objetos de primeira ordem ou primeira class.
		
		// Ordenando por preço - Referência pra método
		// ProgrLambda - nome desta classe static
		lista.sort(ProgLambda::compareProductsPreco);
		
		for (Product p : lista) {
			System.out.println(p);
		}

	}
	
	public static int compareProductsPreco(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

}
