package pinkWorld;

public class ProvaMetodi {

	public static void main(String[] args) {
		Magia carta1 = new Magia("princesa ghiaccio",20,30);
		Magia carta2 = new Magia("princesa sole ", 40,30);
		System.out.println("carta 1 puo attacare: "+carta1.puoAttancare(carta2));
		System.out.println("antes "+carta1.toString()+" Curando carta.. ");
		carta2.setQuantitaAttacco(5);
		carta2.attacco(carta1);
		System.out.println("Carta curada : "+carta1.getVita());
		carta1.mostraCarta();
		carta1.setQuantitaAttacco(4);
		carta1.attacco(carta2);
		System.out.println("cura "+carta2.toString());
		System.out.println("Carta nueva");
		Potenza carta3= new Potenza("ogro ",20,20);
		System.out.println("Prima del attacco");
		carta1.mostraCarta();
		
		carta3.mostraCarta();
		carta3.verso();
		carta3.setQuantitaAttacco(4);
		carta3.attacco(carta1);
		carta1.mostraCarta();
		

	}

}
