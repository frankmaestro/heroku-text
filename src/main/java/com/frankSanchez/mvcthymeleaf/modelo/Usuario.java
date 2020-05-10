package com.frankSanchez.mvcthymeleaf.modelo;

public class Usuario {

	
	private int id;
	private String nombreUsuario;
	private String nombreCompleto;
	
	
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nombreUsuario, String nombreCompleto) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.nombreCompleto = nombreCompleto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	
}
