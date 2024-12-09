package com.rectangulo;

import daw.com.Teclado;
import daw.com.Pantalla;

public class Rectangulo {
	//atributos
	private double base;
	private double altura;
	//private Punto centro;
	private int color;
	
	//Constructor por defecto
	public Rectangulo() {
		this.base = 0;
		this.altura = 0;
		this.color = 0;
		//this.centro = new Punto ();
	}
	
	//Constructor con todos los campos. 
	public Rectangulo(double base, double altura,int color) {
		this.base = base;
		this.altura = altura;
		//this.centro = centro;
		this.color = color;
	}
	
	//Constructor de clonado
	public Rectangulo(Rectangulo RectanguloDOS) {
		this.base = RectanguloDOS.base;
		this.altura = RectanguloDOS.altura;
		//this.centro = RectanguloDOS.centro;
		this.color = RectanguloDOS.color;
	}
	
	//Metodo mostrar datos
	public void mostrarDatos() {
		//centro.mostrarDatos();
		Pantalla.escribirString("Base: " + base);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura: " + altura);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirInt("Color: " + color, color);
	}
	
	//get y set
	public double getBase() {
		return base;}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	//public Punto getCentro() {
		//return centro;
	//}
	
	//public void setCentro(Punto centro) {
		//this.centro = centro;
	//}
	
	//operaciones para el perimetro, area y diagonal
	public double perimetro () {
		return (double) 2 * (base + altura);
	}
	
	public double area () {
		return (double) base * altura;
	}
	
	public double diagonal () {
		return (double) Math.sqrt((base * base) + (altura * altura));
	}
	
	
	/*Metodo para cambiar datos
	public void setbase(double nuevaBase) {
		this.base = nuevaBase;
	}
	
	public void setaltura(double nuevaAltura) {
		this.altura = nuevaAltura;
	}
	
	public void setcolor(int nuevoColor) {
		this.color = nuevoColor;
	}
	*/
	public void cambiarDatos(double nuevaBase,double nuevaAltura, int nuevoColor ) {
		this.base = nuevaBase;
		this.altura = nuevaAltura;
		this.color = nuevoColor; 
		
		//centro.leerDatos();
		setBase (Teclado.leerInt("Base: "));
		setAltura(Teclado.leerInt("Altura: "));
		setColor(Teclado.leerInt("Color: "));
		
		/*------------------------------------*/
		
		//centro.mostrarDatos();
		Pantalla.escribirString("Base: " + base);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura: \n" + altura);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirInt("Color: \n" + color, color);
	}
	

	public static void main(String[] args) {
		Rectangulo rectanguloEjemplo = new Rectangulo(2.2, 4.4, 255);
			rectanguloEjemplo.mostrarDatos();
			
			Pantalla.escribirSaltoLinea();
			//modificar los datos
			rectanguloEjemplo.cambiarDatos(4.4, 5.5, 345);
			rectanguloEjemplo.mostrarDatos();
			
	}

}
