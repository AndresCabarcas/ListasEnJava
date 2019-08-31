package com.clases;

import java.io.Serializable;

public class ListaEmpleado implements Serializable{
	
	public class Nodo implements Serializable
	{
		Empleado empleado;
		Nodo siguiente;
		
		public Nodo(Empleado emp) 
		{
			empleado = emp;
			siguiente = null;
		}
		
		public Empleado getEmpleado() {
			return empleado;
		}
		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}
		public Nodo getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}
	}

	
	Nodo primero;
	
	public ListaEmpleado()
	{ primero = null; }
	
	
	public ListaEmpleado insertarNodo(Empleado emp)
	{
		Nodo nuevo = new Nodo(emp);
		nuevo.siguiente = primero;
		primero = nuevo;
		return this;
	}
	
	public void visualizar()
	{
		Nodo temp = primero;
		while( temp != null )
		{
			System.out.println(temp.empleado.getmNombre());
			System.out.println(temp.empleado.getmPuesto());
			System.out.println(temp.empleado.getCurp());
			System.out.println(temp.empleado.getGenero());
			System.out.println(temp.empleado.getSalario());
			System.out.println(temp.empleado.getAntiguedad());
			temp = temp.getSiguiente();
			System.out.println();
		}
	}
}
