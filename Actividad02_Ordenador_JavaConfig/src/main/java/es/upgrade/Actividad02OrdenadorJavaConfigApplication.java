package es.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.modelo.entidad.Ordenador;

@SpringBootApplication
public class Actividad02OrdenadorJavaConfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Actividad02OrdenadorJavaConfigApplication.class, args);
		
		Ordenador o = context.getBean("ordenador",Ordenador.class);
		System.out.println(o);
	}

}
