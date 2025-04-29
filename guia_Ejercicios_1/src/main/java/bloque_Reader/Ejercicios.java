package bloque_Reader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Ejercicios {
	static InputStreamReader in = new InputStreamReader(System.in);
	static PrintStream ps = new PrintStream(System.out);
	
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
		String apellido = leerLinea();
		String apellido2 = leerLinea();
		String apellido3 = leerLinea();
	}
}
