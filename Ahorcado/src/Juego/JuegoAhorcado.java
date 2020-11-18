package Juego;

import java.util.Scanner;

public class JuegoAhorcado {
	
	public static void dibujarMuneco(int vidas) {
		
		switch (vidas) {
		case 7:
			
			System.out.println("                     ");
			System.out.println("                     ");
			System.out.println("                     ");
			System.out.println("                     ");
			System.out.println("                     ");
			System.out.println("                     ");
			System.out.println("          _          ");
			System.out.println("_________[_]         ");
			System.out.println("                     ");
			
			break;
		case 6:
			System.out.println("                     ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|         _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 5:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|         _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 4:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|       @            ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|         _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 3:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|       @            ");
			System.out.println("|       T            ");
			System.out.println("|       |            ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|         _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 2:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|     __@__          ");
			System.out.println("|    ·  T  ·         ");
			System.out.println("|       |            ");
			System.out.println("|                    ");
			System.out.println("|                    ");
			System.out.println("|         _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 1:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|     __@__          ");
			System.out.println("|    ·  T  ·         ");
			System.out.println("|       |            ");
			System.out.println("|      {^}           ");
			System.out.println("|      |             ");
			System.out.println("|      I  _          ");
			System.out.println("L________[_]         ");
			System.out.println("                     ");
			
			break;
		case 0:
			System.out.println("_________            ");
			System.out.println("|       |            ");
			System.out.println("|     __Ø__          ");
			System.out.println("|    ·  T  ·         ");
			System.out.println("|       |            ");
			System.out.println("|      {^}           ");
			System.out.println("|      | |           ");
			System.out.println("|      I L           ");
			System.out.println("L__________          ");
			System.out.println("                     ");
			
			break;
		
		
		
		
		
		
		
		}
		
		
	}
	
	public static boolean comprobar(String palabra, char letra) {
		
		boolean encontrado =false;
		return encontrado;
		
	}
	
	public static void inicializarVectores(String vPalabra[], String vAciertos[], String vFallos[], String palabra) {
	
			
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i]  ="_";
		}
		
		for (int i = 0; i < vAciertos.length; i++) {
			vAciertos[i] = "_";
			vPalabra[i] = palabra.substring(i, i+1);
		}
		
	}
	
	public static int comprobarLetraIntroducida(int vidas, String letra, String vPalabra[], String vAciertos[], String vFallos[]) {
		
		boolean acertar = false;
		
		for (int i = 0; i < vPalabra.length; i++) {
			
			if (letra.equalsIgnoreCase(vPalabra[i])) {
				
				vAciertos[i] = letra;
				acertar = true;
			}
		}
		if (acertar == false) {
			
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equals("_")) {
					vFallos[i] = letra;
					break;
				}
			}
			
			
			vidas--;
		}
		
		return vidas;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vidas totales 7
		
		Scanner leer = new Scanner(System.in);
		
		int vidas = 8;
		String vPalabra[], vAciertos[], vFallos[];
		String letra, palabra = "huracan";
		
		
		vPalabra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas];
		
		inicializarVectores(vPalabra, vAciertos, vFallos, palabra);
		
		
		
		
		
		
		do {
			
			//1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			//2º Comprobar si la letra está en la palabra
			vidas = comprobarLetraIntroducida(vidas, letra,vPalabra, vAciertos, vFallos);
			
			//3º Dibujar muñeco
			dibujarMuneco(vidas);
			//4º Dibujar aciertos y errores
			
				
		}
		while(vidas >= 0);
		
	}

	

}
