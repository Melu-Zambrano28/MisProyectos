package pinkWorld;

public abstract class Carta {
	private String nomeCarta;
	private int potenza;
	private int vita;
	private int quantitaCura;
	private int costo;
	private String descr;
	
	
	public Carta(String nomeCarta, int potenza, int vitaCarta, int costo, String descripzione) {
		if(nomeCarta==null || vitaCarta>30 || costo>10)
			throw new IllegalArgumentException("ATTENZIONE: Vita fuori range o nome null");
		else
			this.nomeCarta=nomeCarta;
			this.potenza=potenza;
			this.vita=vitaCarta;
			quantitaCura=0;
			this.costo=costo;
			descr=descripzione;
	}
	
	public abstract void verso();
	public abstract void attacco( Carta c);
	public abstract String getTipoCarta();

	
	
	
	public boolean puoAttancare(Carta c) {
		return this.getPotenza()>=c.getPotenza()&& this.getVita()>=c.getVita();
	}


	public String getNomeCarta() {
		return nomeCarta;
	}


	public void setNomeCarta(String nomeCarta) {
		this.nomeCarta = nomeCarta;
	}


	public int getPotenza() {
		return potenza;
	}


	public void setPotenza(int potenza) {
		this.potenza = potenza;
	}


	public int getVita() {
		return vita;
	}


	public void setVita(int vita) {
		this.vita = vita;
	}
	
	public void mostraCarta() {
		System.out.println("**************************");
		System.out.println("* NOME: "+ this.getNomeCarta());
		System.out.println("* POTENZA: "+ this.getPotenza());
		System.out.println("* VITA: "+ this.getVita());
		System.out.println("* TIPO: "+ this.getTipoCarta());
		System.out.println("**************************");	
	}
	
	public void setQuantitaAttacco(int quantita) {
		this.quantitaCura=quantita;
	}
	
	public int getQuantitaAttacco() {
		return quantitaCura;
	}
	
	public void setCosto(int costoNew) {
		this.costo=costoNew;
	}
	
	public int getCosto() {
		return costo;
	}
	
	public void setDescripzione(String s) {
		this.descr=s;
	}
	
	public String getDescripzione() {
		return descr;
	}
	
	public String toString() {
		return "[Nome: "+this.getNomeCarta()+"][ Potenza: "+this.getPotenza()+"][ vita: "+this.getVita()+"][ Tipo: "+this.getTipoCarta()+"][ Descripzione: "+this.getDescripzione()+"]";
	}

}
