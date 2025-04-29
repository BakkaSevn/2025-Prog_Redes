package bloque_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class UsandoReader {
	static InputStreamReader in = new InputStreamReader(System.in);
	static PrintStream ps = new PrintStream(System.out);
	static BufferedReader br = new BufferedReader(in);
	
	public static String leerLinea() throws IOException{
		int aux;
		String palabra = "";
		while( (aux = System.in.read()) != '\n' ){
			if (aux != '\r') {
	            palabra = palabra + (char) aux;
	        }
		}
		return palabra;
	}
	
	public static void primer_ejercicio() throws IOException {
		ps.print("Ingrese un primer apellido: ");
		String apellido = leerLinea();
		ps.print("Ingrese un segundo apellido: ");
		String apellido2 = leerLinea();
		ps.print("Ingrese un tercer apellido: ");
		String apellido3 = leerLinea();
		
		String[] apellidos = {apellido2,apellido,apellido3};
		Arrays.sort(apellidos);
		
		ps.print("Su lista de apellidos ordenada sería: ");
		ps.print(String.join(", ", apellidos));
	}
	
	public static void segundo_ejercicio() throws IOException{
		for(int i = 0; i < 4; i++) {
			float num = Integer.parseInt(br.readLine());
			Math.min(num, num);
			float[] array = {num};
			Arrays.sort(array);
			
		}
	}
}
