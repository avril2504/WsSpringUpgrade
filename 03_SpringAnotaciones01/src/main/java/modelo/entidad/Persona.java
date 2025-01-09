package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Para poder trabajar con objetos en spring tienen que llevar la notación
//JavaBean

@Component("personaBean")
/*
 * Esta anotacion @Component da de alta un objeto en el contexto de spring de la clase 
 * donde este y como id el nombre de la clase en lowerCamelCase
 * 
 * Si queremos cambiar el id del bean, lo podemos poner entre parentesis al lado de @Component
 * Es decir, esto seria equivalente a:
 * <bean id="persona" class="modelo.entidad.Persona" scope="singleton">
 * 
 * Ahora bien si queremos cambiar el scope del bean lo haremos con la
 * anotación "Scope("prototype")
 * 
 * Esto seria equivalente a:
 * <bean id="persona" class="modelo.entidad.Persona" scope="prototype">
 * 
 * Las anotaciones en java suelen servir para añadir funcionalidades a 
 * las clases de manera automatica
 */
@Scope("prototype")
public class Persona {
	private String nombre;
	private int edad;
	private double peso;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
}
