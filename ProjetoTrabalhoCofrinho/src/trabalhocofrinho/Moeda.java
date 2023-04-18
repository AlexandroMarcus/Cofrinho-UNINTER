package trabalhocofrinho;

public abstract class Moeda {
	public double valor;
	
	public Moeda(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    
	public abstract double converter();
	
	public abstract void info();
	public abstract String toString();
	
}
