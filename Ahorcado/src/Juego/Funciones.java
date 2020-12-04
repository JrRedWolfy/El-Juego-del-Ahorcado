package Juego;

public class Funciones {
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
	               
	public static void aciertosFallos(int vidas, String vFallos[], String vAciertos[], String palabra) {
		
		System.out.print("Las letras que no estan son: ");
		for (int i = 0; i < (8- vidas); i++) {
			
			System.out.print(vFallos[i] + ", ");
		}
		System.out.println("");
		
		System.out.print("La palabra que buscas es: ");
		for (int i = 0; i < palabra.length(); i++) {
			
			System.out.print(vAciertos[i] + " ");
			
		}
		System.out.println();
		
		System.out.println("Te quedan " + vidas + " vidas.");
		
	}
	
	public static boolean palabraCorrecta(String vAciertos[], String palabla) {
		boolean verdadero = true;
		
		for (int i = 0; i < palabla.length(); i++) {
			if (vAciertos[i].equals("_")) {
				verdadero = false;
				break;
			}
			
		}	
		return verdadero;
		
	}
	
	
	
	
}
