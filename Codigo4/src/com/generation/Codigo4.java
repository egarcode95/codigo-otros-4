package com.generation;

import java.util.Scanner;//importe la clase Scanner

public class Codigo4 {
	public static void main(String[] args) {//Agregar clase main para que se ejecute el código


	Scanner sc = new Scanner(System.in);//agregar System.in

	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	String j1 = sc.nextLine();

	System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//corregir para que diga jugador 2
	String j2 = sc.nextLine();//corregir a s2 para que el segundo escaner se utilice

	if(j1.equals(j2))
	{
		System.out.println("Empate");
	}else
	{
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;}
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
  
  
}

}
