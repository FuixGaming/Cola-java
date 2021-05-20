import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//MENU 1 || ESCANERES
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cuantos usuarios caben en la cola?");
		int numeroUsuarios = sc.nextInt();
		System.out.println("¿Cuantos puestos hay atendiendo?");
		int numeroPuestos = sc.nextInt();
		System.out.println("¿Cual es la frecuencia de actualizacion?");
		int frecuencia = sc.nextInt();
		//Generar la cola de usuarios
		ColaUsuario cola=generarUsuario();
		for (int i=1; i<numeroUsuarios;i++) {
			cola.encolar(generarUsuario());
		}
		//Generar los puestos
		Puesto[] puestos = new Puesto[numeroPuestos];
		for (int i=0;i<numeroPuestos;i++) {
			puestos[i] = new Puesto("Puesto "+(i+1));
		}
		// Meter un usuario en el puesto 0
		
		
		//Secuencia Principal
		while (cola.longitud()>=0 && puestosVacios(puestos)) {
			//Buscar en el array un puesto libre
			//Si lo hay meted un usuario
			//Si no lo hay seguid
			//Haced la espera (frecuencia)
			//Quitad frecuencia de cada puesto ocupado
			//Si el tiempo de un puesto llega a 0 o menos, entonces liberad puesto
			//parriba otra vez
		}
		
				
	}
	public static ColaUsuario generarUsuario() {
		
	        String [] Nombre = new String [] {"Lopetegui", "Juan", "Guille", "David", "Dani", "Roberto", "Pablo", "Gerardo", "Carlos", "Jesus", "Marco", "Luis", "Pedro", "Santiago", "Rafael", "Eustaquio", "Mauricio", "Alejandro"};
	        Random NombreRandom=new Random(); 
	        int indice = NombreRandom.nextInt(Nombre.length);
	        Random tiempoRandom = new Random();
	        int tiempo = tiempoRandom.nextInt(30);
	        ColaUsuario cola = new ColaUsuario(Nombre[indice],tiempo);
	        return cola;
	        		
	}
	
	public static boolean puestosVacios(Puesto[] puestos) {
		for (int i=0;i<puestos.length;i++) {
			if (puestos[i].libre()==false) {
				return false;
			}
		}
		return true;
	}
}
