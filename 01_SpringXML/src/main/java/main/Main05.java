package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Pelicula;


public class Main05 {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context05.xml");

		Pelicula p = context.getBean("pelicula",Pelicula.class);
		System.out.println(p);
	}

}
