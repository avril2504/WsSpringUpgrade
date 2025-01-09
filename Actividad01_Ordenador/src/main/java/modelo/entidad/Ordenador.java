package modelo.entidad;

import java.util.ArrayList;

public class Ordenador {
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica tarjetaGrafica;
	private PlacaBase placaBase;
	private ArrayList<RAM>listaRAMs;
	private ArrayList<Periferico>ListaPerifericos;

	
	
	public Ordenador() {
		super();
	}


	public Ordenador(double precio, Procesador procesador, PlacaBase placaBase, ArrayList<RAM> listaRAMs,
			ArrayList<Periferico> listaPerifericos, TarjetaGrafica tarjetaGrafica) {
		super();
		this.precio = precio;
		this.procesador = procesador;
		this.tarjetaGrafica = tarjetaGrafica;
		this.placaBase = placaBase;
		this.listaRAMs = listaRAMs;
		ListaPerifericos = listaPerifericos;
	}

	
	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Procesador getProcesador() {
		return procesador;
	}


	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}


	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}


	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}


	public PlacaBase getPlacaBase() {
		return placaBase;
	}


	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}


	public ArrayList<RAM> getListaRAMs() {
		return listaRAMs;
	}


	public void setListaRAMs(ArrayList<RAM> listaRAMs) {
		this.listaRAMs = listaRAMs;
	}


	public ArrayList<Periferico> getListaPerifericos() {
		return ListaPerifericos;
	}


	public void setListaPerifericos(ArrayList<Periferico> listaPerifericos) {
		ListaPerifericos = listaPerifericos;
	}
	

	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaRAMs=" + listaRAMs + ", ListaPerifericos=" + ListaPerifericos
				+ "]";
	}


	public void calcularPrecio() {
		double suma = 0.0;
		suma += this.procesador.getPrecio();
		suma += this.tarjetaGrafica.getPrecio();
		suma += this.placaBase.getPrecio();
		
		for(RAM ram : this.listaRAMs) {
			suma += ram.getPrecio();
		}
		
		for(Periferico periferico : this.ListaPerifericos) {
			suma += periferico.getPrecio();
		}
		this.precio = suma + this.precio;
		System.out.println("El precio total del ordenador es:" + this.precio);

	}

}
