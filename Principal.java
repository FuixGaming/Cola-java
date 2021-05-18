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

	}

}
