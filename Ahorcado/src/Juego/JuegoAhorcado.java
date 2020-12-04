package Juego;

import java.util.Scanner;

public class JuegoAhorcado {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vidas totales 7
		
		Scanner leer = new Scanner(System.in);
		
		int vidas = 8;
		String vPalabra[], vAciertos[], vFallos[];
		String letra, palabra = "huracan";
		boolean solucion = false;
		
		vPalabra = new String[palabra.length()];
		vAciertos = new String[palabra.length()];
		vFallos = new String[vidas+1];
		
		Funciones.inicializarVectores(vPalabra, vAciertos, vFallos, palabra);
		
		do {
			
			//1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			//2º Comprobar si la letra está en la palabra
			vidas = Funciones.comprobarLetraIntroducida(vidas, letra,vPalabra, vAciertos, vFallos);
			
			//3º Dibujar muñeco
			Funciones.dibujarMuneco(vidas);
			//4º Dibujar aciertos y errores
			Funciones.aciertosFallos(vidas, vFallos, vAciertos, palabra);
			
			solucion = Funciones.palabraCorrecta(vAciertos, palabra);
				
		}
		while((vidas >= 0)&&(solucion == false));
		
		if ((vidas <= 0)&&(solucion == false)) {
			System.out.println("¡Perdiste, intentalo de nuevo!");	
		} else {
			System.out.println("¡Enhorabuena, Has ganado!");
		}
		
	}

}
