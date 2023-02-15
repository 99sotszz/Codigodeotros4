package com.generation;


import java.util.Scanner; //importar el scanner para usarlo

public class Codigo4 {

public static void main(String args[]){  //faltaba este metodo
    Scanner s = new Scanner(System.in); //falta el sistem.in entre parentesis
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras:"); //jugador 2 // las comillas van adentro de los aprentesis al igual los 2 puntos  y el punto y coma afuera
      Scanner s2 = new Scanner(System.in); //se creo otro scanner y se le asigno al s2
        String j2 = s2.nextLine();
    
    if (j1 == j2) { //parentesis extra
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals "tijeras") { //en java es equals, no funciona el ==
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijeras": // la "S" DE TIJERAS
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
} // no se donde debia ponerse pero marcaba error la llave de la clase