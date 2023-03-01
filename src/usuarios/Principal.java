package usuarios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char r;
		Usuarios persona;
		String nombre;
		String dni;
		String apellidos;
		Scanner sc = new Scanner(System.in);

		System.out.println("C. Crear usuario" + "\n S. Salir");
		r = sc.next().charAt(0);
		r = Character.toUpperCase(r);

		switch (r) {
		case 'C':
			persona = new Usuarios();
			System.out.println("Introducir dni");
			dni = sc.nextLine();
			persona.setDni(dni);
			sc.nextLine();
			System.out.println("Introducir nombre");
			nombre = sc.nextLine();
			persona.setNombre(nombre);
			System.out.println("Introducir apellidos");
			apellidos = sc.nextLine();
			persona.setApellidos(apellidos);
			;
			sc.nextLine();
			System.out.println("Usuario creado");
			break;
		case 'S':
			System.out.println("Fin programa");
			break;
		default:
			System.out.println("Error: caracter no válido");
			break;
		}

	}

}
