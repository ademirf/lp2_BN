
public class Inimigo extends Personagem {

	private String tipo;
	public Inimigo (DescricaoInimigo inimigo) {
		super (inimigo.getVida(), inimigo.getForca(), inimigo.getResistencia());
		this.tipo = inimigo.getTipo();
		// criar os outros
	}
	
	public String toString() {
		return tipo;
	}
}
