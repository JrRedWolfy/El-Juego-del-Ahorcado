package Juego;

public class JuegoAhorcado {
	
	public static void dibujarMuñeco(int vidas) {
		
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
		
		
		
		
		
		
		
		
		
		
		
		return encontrado
		
	}
	
	public static void InicializarVectores(String vPalabra, String vAcierto, String vFallo, String palabra) {
		
		for (int i = 0; i < vFallo.length; i++) {
			vFallo[i] = "_";
			
		}
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vidas totales 7
		Scanner leer = new Scanner(System.in);
		
		int vidas = 8;
		String vPalabra[], vAcierto[], vFallo[];
		
		vPalabra = new String[palabra.length()]
		
		
		
		char letra;
		String palabra = "Huracan";
		
		//estructura general del juego
		do {
			
			// Preguntar Letra
			S
			
			
			// Comprobar si letra estar en palabra
			// Dibujar muñeco
			dibujarMuñeco(vidas);
			// Dibujar aciertos y errores
			vidas--;
			
			
			
			
			
			
		}
		while(vidas >= 0);
		
		
		
		
		
		
		
		
		
		
	}

}
