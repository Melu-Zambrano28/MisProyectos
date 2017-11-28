package pinkWorld;

public class Magia extends Carta {
	private final String tipo;
	

	public Magia(String nomeCarta, int potenza, int vitaCarta, int costo,String descripzione) {
		super(nomeCarta, potenza, vitaCarta,costo, descripzione );
		tipo="magia";
		
		
	}

	@Override
	public void verso() {
		System.out.println("Il mio potere è curare una carta...");
	}

	
	public String getTipoCarta() {
		return tipo;
	}
	
	
	
	public void attacco( Carta c) { //vita restante + numeroinserito
		int quantoCura=c.getVita()+this.getQuantitaAttacco();
		c.setVita(quantoCura);
	}
	
	
	
	public boolean isAlive() {
		return this.getVita()>1;
	}

	
	
	

	

}
