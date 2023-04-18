package trabalhocofrinho;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	public void remover(double valor) {
	    for (Moeda moeda : listaMoedas) {
	        if (moeda.getValor() == valor) {
	            listaMoedas.remove(moeda);
	            return;
	        }
	    }
	    System.out.println("Nao ha moedas no cofrinho!");
	}
	public void listagemMoedas() {
		for(Moeda m : listaMoedas) {
			System.out.println(m);
		}
	}
	 public double somarMoedas() {
		 double total = 0;
	     for(Moeda m : listaMoedas) {
	         total += m.converter();
	     }
	     System.out.println("Total: " + total);
	     return total;
	 }
	
}
