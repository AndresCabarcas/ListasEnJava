package com.clases;

import java.io.Serializable;

public class Persona implements Serializable{
	private String mNombre;
	private int edad;
	private String genero;
	
	
	public Persona(String mNombre, int edad, String genero) {
		super();
		this.mNombre = mNombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getmNombre() {
		return mNombre;
	}
	public void setmNombre(String mNombre) {
		this.mNombre = mNombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}
