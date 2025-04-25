package bloque_System;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.BufferedReader;

public class ejercicios {
	public static void primer_Ejercicio(){
		PrintStream ps = new PrintStream(System.out);
		PrintStream errors = new PrintStream(System.err);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader is = new InputStreamReader(System.in);
		
		try {
			// Establecemos las variables
			boolean linea;
			int horasTrabajadas;
			int valorHoraTrabajo;
			
			// Pedimos mediante el canal ps la cantidad de horasTrabajadas
			ps.print("Ingrese cuantas horas trabaja en total: ");
			horasTrabajadas = br.read();
			ps.flush();
			if(linea = is.read() != 13){
				ps.println("Ingrese cuantas horas trabaja en total: ");
				valorHoraTrabajo = br.read();
				ps.write(horasTrabajadas);
				ps.print(valorHoraTrabajo);
			}else{
			}
		
		
		
			//
		}catch(IOException e){
			errors.print(e);
		}
		
	}
}
