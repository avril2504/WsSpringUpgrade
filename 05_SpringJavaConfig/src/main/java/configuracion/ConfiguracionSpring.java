package configuracion;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

@Configuration
public class ConfiguracionSpring {

	@Bean
	@Scope("prototype")
	//<bean id="director" class="modelo.entidd.Director" scope="prototype"/>
	public Director director(){ //el id del bean sera el nombre del metodo
		Director d = new Director();
		//<property name="nombre" value="Juan"/>
		d.setNombre("Juan");
		return d;
	}
	
	@Bean
	@Scope("prototype")
	//Si existe un bean de tipo Director dentro del contexto de spring
	//se inyectaria a traves del parametro. En este caso entraría el
	//bean cuyo nombre es "Juan"
	public Pelicula pelicula1(Director director) {
		Pelicula pelicula = new Pelicula();
		pelicula.setDirector(director);
		pelicula.setGenero("sci-Fi");
		return pelicula;
	}
	
	@Bean
	public Pelicula pelicula2() {
		Director d = new Director();
		d.setNombre("George Lucas");
		
		Pelicula p = new Pelicula();
		p.setDirector(d);
		p.setTitulo("La guerra de las galaxias");
		return p;
	}
		
	@Bean	
	public DaoPelicula daoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		daoPelicula.setListaPelicula(new ArrayList<Pelicula>());
		daoPelicula.setNumeroMaximoPeliculas(2);
		return daoPelicula;
	
	}
	
	@Bean
	public GestorPelicula gestorPelicula(DaoPelicula daoPelicula) {
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daoPelicula);
		return gp;
	}
}
