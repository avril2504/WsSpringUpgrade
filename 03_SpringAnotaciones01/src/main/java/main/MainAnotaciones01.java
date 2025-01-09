package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Pelicula;

/*
 * En eeste ejemplo vamos a dar de alta al contexto de spring con XML, pero
 * vamos a dar de alta a los objetos mediante anotaciones
 */

public class MainAnotaciones01 {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context01.xml");
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		System.out.println(p);

	}

}
