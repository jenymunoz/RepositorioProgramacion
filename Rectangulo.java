package com.rectangulo;

import daw.com.Teclado;
import daw.com.Pantalla;

public class Rectangulo {

/*atributos*/
	private double base;
	private double altura;
	private int color;
	private Punto centro;
	
/*Constructor por defecto*/
	public Rectangulo() {
		this.base = 0.0;
		this.altura = 0.0;
		this.color = 0;
		this.centro = new Punto ();
	}
	
/*Constructor con todos los campos.*/
	public Rectangulo(double base, double altura,int color, Punto centro) {
		this.base = base;
		this.altura = altura;
		this.color = color;
		this.centro = centro;
	}
	
/*Constructor de clonado*/
	public Rectangulo(Rectangulo RectanguloDOS) {
		this.base = RectanguloDOS.base;
		this.altura = RectanguloDOS.altura;
		this.color = RectanguloDOS.color;
		this.centro = new Punto (RectanguloDOS.centro);
	}
	
/*Metodo mostrar datos*/
	public void mostrarDatos() {
		Pantalla.escribirString("Base: " + base);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Altura: " + altura);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirInt("Color: " + color, color);
		Pantalla.escribirSaltoLinea();
		centro.mostrarDatos();
	}
	
/*get y set*/
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
	
	public Punto getCentro() {
		return centro;
	}
	
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
/*operaciones para el perimetro, area y diagonal*/
	public double perimetro () {
		return (double) 2 * (base + altura);
	}
	
	public double area () {
		return (double) base * altura;
	}
	
	public double diagonal () {
		return (double) Math.sqrt((base * base) + (altura * altura));
	}
	
	
/*Metodo para cambiar datos*/
	public void cambiarDatos() {
		 do {
			 Pantalla.escribirString("Indica el nuevo valor de la base:");
			 String baseNueva = Teclado.leerString();
			 
			 if(!baseNueva.isEmpty()) {
				 try {
					 this.base=Double.valueOf(baseNueva);
				 }catch (NumberFormatException e) {
					 this.base = -1;
				 }
			 }
		 }while (this.altura < 0.0);
		 
		 Pantalla.escribirString("indica el valor nuevo de la altura:");
		 String alturaNueva = Teclado.leerString();
		 if (!alturaNueva.isEmpty()) {
			 this.base = Double.valueOf(alturaNueva);
		 }
		 
		 Pantalla.escribirString("Indica el nuevo valor del color: ");
		 String colorNuevo = Teclado.leerString();
		 if (!colorNuevo.isEmpty()) {
			 this.color = Integer.valueOf(colorNuevo);
		 }
		 
		 Pantalla.escribirString("Indica el nuevo valor del punto X: ");
		 String xNueva = Teclado.leerString();
		 if (!xNueva.isEmpty())
			 this.centro.setX(Integer.valueOf(xNueva));
		 
		 Pantalla.escribirString("Indica el nuevo valor del punto Y: ");
		 String yNueva = Teclado.leerString();
		 if (!yNueva.isEmpty());
		 	this.centro.setY(Integer.valueOf(yNueva));
		 	
		 
	}
	
	

}
