package udemy.application;

import java.util.ArrayList;
import java.util.List;

public class ProgConsumer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lista de produtos aumentar em 10% <<Função consumer>> ...");
		System.out.println("");
		
		List<Double> lista = new ArrayList<>();
		lista.add(900.0);
		lista.add(50.0);
		lista.add(350.50);
		lista.add(80.90);
		
		
		//List<Product> lista = new ArrayList<>();
		//lista.add(new Product("TV", 900.0));
		//lista.add(new Product("Mouse", 50.0));
		//lista.add(new Product("Table", 350.50));
		//lista.add(new Product("HD Case", 80.90));

		// Variáveç Consumer declarada 
		//Consumer<Product> consumer = (p) -> { p.setPrice(p.getPrice()*1.1) };
		//lista.forEach(consumer);
		
		// Classe Consumer
		// lista.forEach(new ProductUpdatePriceConsumer());
		
		// Método static dentro de Produto 
		//lista.forEach(Product::staticProductConsumerPrice);

		// Método não static dentro de Produto 
		// lista.forEach(Product::nonstaticProductConsumerPrice);
		
		//Consumer direto
		double vlr = 1.1;
		lista.forEach( p -> { 
			p = p * vlr;
		});


		lista.forEach(System.out::println);
	}
	
}
