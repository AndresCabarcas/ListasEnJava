package com.clases;

import java.io.Serializable;


public class Empleado extends Persona implements Serializable{
	private String mPuesto;
	private double mSalario;
	private String mCurp;
	private int mAntiguedad;
	public String getmPuesto() {
		return mPuesto;
	}
	
	
	public Empleado(String mNombre, int edad, String genero, String puesto,double salario,String curp,int antiguedad) {
		super(mNombre, edad, genero);
		mPuesto = puesto; mSalario = salario; mCurp = curp; mAntiguedad = antiguedad;
		// TODO Auto-generated constructor stub
	}

	public void setPuesto(String mPuesto) {
		this.mPuesto = mPuesto;
	}
	public double getSalario() {
		return mSalario;
	}
	public void setSalario(double mSalario) {
		this.mSalario = mSalario;
	}
	public String getCurp() {
		return mCurp;
	}
	public void setCurp(String mCurp) {
		this.mCurp = mCurp;
	}
	public int getAntiguedad() {
		return mAntiguedad;
	}
	public void setAntiguedad(int mAntiguedad) {
		this.mAntiguedad = mAntiguedad;
	}
	
	
	
	

}
