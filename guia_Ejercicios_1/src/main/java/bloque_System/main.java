package bloque_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seleccione una opción entre 1-8.");
		while(true) {
			try {
				System.out.print("Seleccione que Ejercicio quiere ejecutar: ");
				int aux = Integer.parseInt(br.readLine());
					switch(aux){
					case 1:
						Ejercicios.primer_Ejercicio();
						break;
					case 2:
						Ejercicios.segundo_Ejercicio();
						break;
					case 3:
						Ejercicios.tercer_Ejercicio();
						break;
					case 4:
						Ejercicios.cuarto_Ejercicio();
						break;
					case 5:
						Ejercicios.quinto_Ejercicio();
						break;
					case 7:
						Ejercicios.septimo_Ejercicio();
						break;
					default:
						System.out.println("Seleccione una opción entre 1-8.");
						break;
					}
			}catch(IOException e){
				System.out.println(e);
			}
		}
		}
}
