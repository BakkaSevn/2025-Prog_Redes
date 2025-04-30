package bloque_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream err = new PrintStream(System.err);
		while(true) {
			System.out.println("Seleccione una opción entre 1 y 2.");
			try {
				System.out.print("Seleccione que Bloque quiere usar: ");
				int aux = Integer.parseInt(br.readLine());
				switch(aux){
				case 1:
					System.out.println("Usted eligió el bloque de Usando System class");
					System.out.println("Seleccione una opción entre 1 y 8.");
					System.out.print("Seleccione que Ejercicio quiere ejecutar: ");
					int aux2 = Integer.parseInt(br.readLine());
					switch(aux2) {
						case 1:
							UsandoSystem.primer_Ejercicio();
							break;
						case 2:
							UsandoSystem.segundo_Ejercicio();
							break;
						case 3:
							UsandoSystem.tercer_Ejercicio();
							break;
						case 4:
							UsandoSystem.cuarto_Ejercicio();
							break;
						case 5:
							UsandoSystem.quinto_Ejercicio();
							break;
						case 7:
							UsandoSystem.septimo_Ejercicio();
							break;
						default:
							return;
						}
				case 2:
					System.out.println("Usted eligió el bloque de Usando Reader class");
					System.out.println("Seleccione una opción entre 1 y 8.");
					System.out.print("Seleccione que Ejercicio quiere ejecutar: ");
					int aux3 = Integer.parseInt(br.readLine());
					switch(aux3) {
					case 1:
						UsandoReader.primer_ejercicio();
						break;
					case 2:
						UsandoReader.segundo_ejercicio();
						break;
					case 3:
						UsandoReader.tercer_ejercicio();
						break;
					case 4:
						UsandoReader.cuarto_ejercicio();
						break;
					case 5:
						UsandoReader.quinto_ejercicio();
						break;
					case 6:
						UsandoReader.sexto_ejercicio();
						break;
					case 7:
						UsandoReader.septimo_ejercicio();
						break;
					case 8:
						UsandoReader.octavo_ejercicio();
						break;
						}
					}
				}		
			catch(IOException | NumberFormatException e){
				err.println("Datos ingresados en el menú fueron incorrectos");
			}
		}
		}
}
