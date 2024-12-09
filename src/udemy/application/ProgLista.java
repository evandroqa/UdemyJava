/**
 * 
 */
package udemy.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import udemy.entities.Product;

/**
 * Testar uma lista ..
 */
public class ProgLista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> produtos = new ArrayList<>();
		produtos.add(new Product("Computador", 2500.0));
		produtos.add(new Product("Mouse", 50.0));
		produtos.add(new Product("Teclado", 150.0));
		produtos.add(new Product("Teclado", 150.0));
		produtos.add(new Product("Fone", 100.0));
		
		List<String> nomes = new ArrayList<String>();
		int ia = 0;
		for (Product prod : produtos) {
			nomes.add(produtos.get(ia).getName());
			ia++;
		}
		Collections.sort(nomes);
		
		for (String nome : nomes) {
		    System.out.println(nome);
		}
		
	}

}
