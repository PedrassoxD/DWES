/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class Nomina {
	
	private static final int SUELDO_BASE [] = {50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000};
	
	
	public Nomina() {
		
	}
	
	public int sueldo(Empleado e) {
		
		int sueldo = SUELDO_BASE[e.getCategoria()-1] + (5000*e.anyos);
		
		return sueldo;
		
	}	
}
