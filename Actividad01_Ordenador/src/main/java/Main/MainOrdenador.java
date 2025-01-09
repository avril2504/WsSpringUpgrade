package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Ordenador;

public class MainOrdenador {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("context.xml");
		Ordenador o = context.getBean("Ordenador",Ordenador.class);
		System.out.println(o);
	}

}
