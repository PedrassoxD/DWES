/**
 * 
 */
package Laboral;

/**
 * @author pedro
 *
 */
public class Empleado extends Persona{
	
	//Atributos
	
	private int categoria;
	int anyos;
	
	
	/**
	 * @param nombre
	 * @param dni
	 * @param sexo
	 * @param categoria
	 * @param anyos
	 * @throws DatosNoCorrectosException
	 */
	
	
	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		
		super(nombre, dni, sexo);
		this.setCategoria(categoria);
		if(anyos<0) {
			throw new DatosNoCorrectosException("Anyos no correctos");
		}else {
			this.anyos = anyos;
		}
	
	}
	
	
	public Empleado(String nombre, String dni, char sexo) {
		
		super(nombre, dni, sexo);
		
		this.categoria = 1;
		this.anyos = 0;
	
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) throws DatosNoCorrectosException {
		
		if(categoria >= 1 && categoria <= 10) {
			this.categoria = categoria;
		}else {
			throw new DatosNoCorrectosException("Categoria incorrecta");
		}
		
	}
	
	public int incrAnyo() {
		
		return anyos++;
		
	}
	
	
	public String imprime() {
		
		return this.nombre + "-" + this.dni + "-" + this.sexo + "-" + this.categoria + "-" + this.anyos;
		
	}
	
	public void setSexo(char sexo) throws DatosNoCorrectosException  {
		if(sexo == 'M' || sexo == 'F') {
			this.sexo = sexo;
		}else {
			throw new DatosNoCorrectosException("Este sexo no existe.");
		}
	}
	
	
}
