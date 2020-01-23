import static org.junit.Assert.*;

import org.junit.Test;

public class testDeposito {


	@Test
	public void testGetDepositoNivel() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,10.0);

			assertEquals(10.0,tank.getDepositoNivel(),0.001);
			
	}

	@Test
	public void testGetDepositoMax() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,10.0);

			assertEquals(10.0,tank.getDepositoNivel(),0.001);
	}

	@Test
	public void testEstaVacio() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,0.0);

			assertEquals(true,tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,40.0);

			assertEquals(true,tank.estaLleno());
	}

	@Test
	public void testFill() {
		 DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		 tank.fill(30);
		 
		 assertEquals(40.0,tank.getDepositoNivel(),0.01);
		 
		
	}

	@Test
	public void testConsumir() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0,10.0);
		 tank.consumir(10);
		 
		 assertEquals(0.0,tank.getDepositoNivel(),0.01);
	}


}
