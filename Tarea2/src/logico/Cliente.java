package logico;

import java.io.Serializable;

public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String direccion;
	private String telefono;
	private String cedula;
	public static int codCliente = 1;
	
	public Cliente(String nombre, String direccion, String telefono, String cedula) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono; 
		this.cedula = cedula;
		Cliente.codCliente++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
	
}
