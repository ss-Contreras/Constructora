package constructura;

import javax.swing.JOptionPane;

public class constructora {
	public static int pisos [] = new int[20];
	public static int personas [] = new int[20];
	public static Double metros2 [] = new Double[20];
	public static String nombre [] = new String[20];
	public static int N_edificios = 0;

	public static void main(String[] args) {
		constructoraSA();

	}

	public static void constructoraSA() {

		boolean menu = false;


		while ( menu == false ) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A CONSTRUCTORA S.A \n"
					+ "Escoje una de las siguiente opciones: \n 1) Crear un edificio\n 2) Mostrar edeficios\n"
					+ " 3) Demoler un edificio\n 0) Salir\n"));


			switch (opcion) {


			case 1:
				crearEdificio();
				break;

			case 2:
				mostrarEdificios();
				break;

			case 3:
				eliminarEdificio();
				break;

			case 0:
				menu = true;
				break;
			}
		}
	}

	public static void crearEdificio() {
		int pisos0 = Integer.parseInt(JOptionPane.showInputDialog("Cuantos pisos desea su edificio"));
		int personas0 = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas viviran alli"));
		Double metrocd = Double.parseDouble(JOptionPane.showInputDialog("Cuantos metros cuadrados tendra"));
		String name = JOptionPane.showInputDialog("Nombre del Edificio");
		pisos[N_edificios] = pisos0;
		personas[N_edificios] = personas0;
		metros2[N_edificios] = metrocd;
		nombre[N_edificios] = name;
		N_edificios++;
		JOptionPane.showMessageDialog(null, "El edificio " + name + " fue creado con exito");

	}

	public static void mostrarEdificios() {
		String texto = "Edificios: " + N_edificios;
		int i = 0;
		do {
			texto += " \n Nombre: " + nombre[i] + "   Pisos: " + pisos[i] + "   Personas: " + personas[i] + "   Metros cuadrados: " + metros2[i] + " \n";
			i++;
		} while (nombre[i] != null);
		JOptionPane.showMessageDialog(null, texto);
	}

	public static void eliminarEdificio() {
		String name = JOptionPane.showInputDialog("Escriba el nombre el edificio que deseas demoler");
		for (int i = 0; i < N_edificios; i++) {
			if (name.equals(nombre[i]))
			{
				pisos[i] = 0;
				personas[i] = 0;
				metros2[i] = null;
				nombre[i] = null;
				i = organizar(i);
			}
		}

	}

	public static int organizar(int i) {

		for (; i < N_edificios; i++) {
			pisos[i] = pisos[i + 1];
			personas[i] = personas[i + 1];
			metros2[i] = metros2[i + 1];
			nombre[i] = nombre[i + 1];
		}
		N_edificios--;
		return i;
	}

}
