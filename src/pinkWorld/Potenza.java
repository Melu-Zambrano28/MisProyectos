package pinkWorld;

public class Potenza extends Carta {
	private final String tipoCarta;

	public Potenza(String nomeCarta, int potenza, int vitaCarta) {
		super(nomeCarta, potenza, vitaCarta);
		tipoCarta="potenza";
		
	}

	@Override
	public void verso() {
		System.out.println("Senti il mio potere Distruttivo...");
	}

	@Override
	public void attacco(Carta c) {
		int quantitaVita=c.getVita()-this.getQuantitaAttacco(); 
		int quantitaPotenza=this.getPotenza()-this.getQuantitaAttacco();
		c.setVita(quantitaVita); //diminuisco la vita
		c.setPotenza(quantitaPotenza); //diminuisco anche la potenza
		
	}

	public String getTipoCarta() {
		return tipoCarta;
	}

}
