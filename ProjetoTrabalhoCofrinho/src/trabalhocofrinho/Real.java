package trabalhocofrinho;

public class Real extends Moeda{
	public Real(double valor) {
		super(valor);
		
	}
	
	@Override
	public double converter() {
		return valor;
	}
	@Override
	public void info() {
		System.out.println("Nao e necessario fazer a convercao!");
	}
	@Override
	public String toString() {
		return "Real: " + this.converter();
	}
	
}
