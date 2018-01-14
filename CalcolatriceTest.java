import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalcolatriceTest {
	
	Calcolatrice cal;
	
	@Before
	public void ini() {
		cal=new Calcolatrice();
	}
	
	
	@Test
	public void addtest() {
		this.ini();
		int somma=cal.add(8, 8);
		assertEquals(16,somma);
		
	}
	
	@Test
	public void testAsSum() {
		this.ini();
		cal.add(3, 2);
		int resut=cal.getAns();
		int esperado=5;
		assertEquals(esperado,resut);
	}
	
	@Test
	public void FullTest() {
		this.ini();
		assertEquals(4,cal.fullCal(1, 2, 2));
		assertEquals(0,cal.fullCal(2, 2, 2));
		assertEquals(0,cal.fullCal(3, 2, 2));


		
	}
	


}
