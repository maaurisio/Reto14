package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto produ = new Producto (23, "Laptops");
		
		produ.setDescripcion("gama alta");
		produ.setPeso(10);
		
		System.out.println("***PRODUCTO***");
		System.out.println(produ.getCodigo());
		System.out.println(produ.getNombre());
		System.out.println(produ.getDescripcion());
		System.out.println(produ.getPeso());
	}

}
