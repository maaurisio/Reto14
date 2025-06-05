package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double peso;
	
	public Producto (int nuevoCodigo, String nuevoNombre) {
		codigo = nuevoCodigo;
		nombre = nuevoNombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
