package com.clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ProbarEmpleados {

	public static void main(String[] args) throws Exception{
            /*
            Empleado pepe = new Empleado("Jose Hernandez",25,"masculino","empleado de piso",120.50,"PEPE001",4);
            Empleado maria = new Empleado("Maria P",29,"femenino","empleado de piso",120.50,"MARIAE001",4);     
            
            ListaEmpleado lista = new ListaEmpleado();
            lista.insertarNodo(pepe);
            lista.insertarNodo(maria);
            lista.visualizar();
            
            
            FileOutputStream out = new FileOutputStream("empleados.txt");
            ObjectOutputStream salida = new ObjectOutputStream(out);
            
            salida.writeObject(lista);
            salida.flush();
            */
            
            
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("empleados.txt"));
            
            ListaEmpleado lista = (ListaEmpleado) leer.readObject();
            
            lista.visualizar();
            
            leer.close();
            
            
            /*
            Empleado augustin = new Empleado("Agustin Martinez",35,"masculino","cajero",110.30,"AGUSTIN001",2);
            
            
            lista.insertarNodo(augustin);
            
            FileOutputStream out = new FileOutputStream("empleados.txt");
            ObjectOutputStream salida = new ObjectOutputStream(out);
                        
            salida.writeObject(lista);
            salida.flush();
            */
            
            
            
	}

}
