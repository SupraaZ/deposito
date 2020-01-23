import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;


@RunWith(Parameterized.class)
public class TestDepositoParamLlenar {
	
private double capacidadMaxima;
private double nivelInicial;
private double cantidadRelleno;
private double resultado;

	 public TestDepositoParamLlenar (double ni, double cm , double cr, double res ) {
		 nivelInicial=ni;
		 capacidadMaxima=cm;
		 cantidadRelleno=cr;
		 resultado=res;
	 }
	 
    @Parameters
	public static Collection<Object[]> valores(){
		 return Arrays.asList(new Object[][]{
			 {30.0,50.0,15.0,45.0},{15.0,50.0,20.0,35.0},{15.0,50.0,-20.0,0.0}
			 
		 });
	 }
	 
	@Test
	public void testDepositoLlenar() {
		 DepositoCombustible tank = new DepositoCombustible(capacidadMaxima,nivelInicial);
		 tank.fill(cantidadRelleno);
		 assertEquals(resultado,tank.getDepositoNivel(),0.01);
		 
	}

	
}
