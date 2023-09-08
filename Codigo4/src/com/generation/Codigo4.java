package com.generation;
/*
 * Este código realiza el juego de piedra, papel y tijeras, se imprimen las instrucciones para cada jugador.
 * Se solicita que se ingrese su respuesta en la consola y se lee mediante Scanner
 * En la evaluacion If se analiza si es 
 */
import java.util.Scanner;//importe la clase Scanner

public class Codigo4 {
	public static void main(String[] args) {// Agregar clase main para que se ejecute el código

		Scanner sc = new Scanner(System.in);// agregar System.in y utlizar un solo Scanner para todo el código

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = sc.nextLine();//corregir a sc para el primer scanner

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");// corregir para que diga jugador 2
		String j2 = sc.nextLine();// corregir a sc para el segundo escaner

		if (j1.equals(j2)) {//usar .equals en lugar de "==" para poder evaluar Strings
			System.out.println("Empate");
		} else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {
					g = 1;
				}
				break;

			case "papel":
				if (j2.equals("piedra")) {
					g = 1;
				}
				break;
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}
		sc.close();//cerrar el escaner

	}

}
