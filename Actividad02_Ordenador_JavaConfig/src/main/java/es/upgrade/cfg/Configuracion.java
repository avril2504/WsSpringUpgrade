package es.upgrade.cfg;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.upgrade.modelo.entidad.Periferico;
import es.upgrade.modelo.entidad.RAM;



@Configuration
public class Configuracion {

	@Bean
	public ArrayList<RAM> ramList(){
		ArrayList<RAM> rams = new ArrayList<RAM>();
		
		RAM r1 = new RAM();
		r1.setCapacidad(16);
		r1.setMarca("Corsair");
		r1.setPrecio(60);
		
		RAM r2 = new RAM();
		r2.setCapacidad(14);
		r2.setMarca("Corsair");
		r2.setPrecio(80);
				
		rams.add(r1);
		rams.add(r2);
		
		return rams;
	}
	
	@Bean
	public ArrayList<Periferico> perifericosList(){
		ArrayList<Periferico> perifericosList = new ArrayList<Periferico>();
		
		Periferico mouse = new Periferico();
		mouse.setMarca("Logitech");
		mouse.setTipo("mouse");
		mouse.setPrecio(60);
		
		Periferico teclado = new Periferico();
		teclado.setMarca("dell");
		teclado.setTipo("teclado");
		teclado.setPrecio(70);
		
		perifericosList.add(mouse);
		perifericosList.add(teclado);
		
		return perifericosList;
	}
}
