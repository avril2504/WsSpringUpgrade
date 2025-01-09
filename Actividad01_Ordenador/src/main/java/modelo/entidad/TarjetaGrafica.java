package modelo.entidad;

public class TarjetaGrafica {
	private String marca;
	private String modelo;
	private int nucleosCUDA;
	private RAM ram;
	private double precio;
	
	
	
	public TarjetaGrafica() {
		super();
	}

	public TarjetaGrafica(String marca, String modelo, int nucleosCUDA, RAM ram, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleosCUDA = nucleosCUDA;
		this.ram = ram;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleosCUDA() {
		return nucleosCUDA;
	}

	public void setNucleosCUDA(int nucleosCUDA) {
		this.nucleosCUDA = nucleosCUDA;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCUDA=" + nucleosCUDA + ", ram=" + ram
				+ ", precio=" + precio + "]";
	}
	

}