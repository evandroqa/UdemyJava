package udemy.application;

import java.util.ArrayList;
import java.util.List;

import udemy.entities.Product;

public class ProgPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lista de produtos preço menor que 100.0 <<Função Predicate>>");
		System.out.println("");
		
		List<Product> lista = new ArrayList<>();
		
		lista.add(new Product("TV", 900.0));
		lista.add(new Product("Mouse", 50.0));
		lista.add(new Product("Table", 350.50));
		lista.add(new Product("HD Case", 80.90));
		
		// Remove da lista valores acima de 100.0
		// lista.removeIf(new ProductPredicate());
		
		// Chamando um método static dentro da classe product
		// lista.removeIf(Product::staticProductPredicate);
		
		// Chamando um método não static dentro da classe product
		// lista.removeIf(Product::nonStaticProductPredicate);

		// Com Lambda declarada
		// Predicate<Product> pred = p -> p.getPrice() >= 100.0; 
		// lista.removeIf(pred);
		
		// Com Lambda declarada
		lista.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product p : lista) {
			System.out.println(p);
		}
		
	}

}
