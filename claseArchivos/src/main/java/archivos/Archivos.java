package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
	
	PrintStream ps;
	File file;
	File filee;
	
	public Archivos(){
		ps = new PrintStream(System.out);
		file = new File("C:\\Users\\Redes-20\\Desktop\\XVideos.porno");
		/**
		filee = new File("C:\\Users\\Redes-20\\Desktop\\PornHub.porno");
		file.delete();
		file.deleteOnExit();
		file.exists();
		file.getAbsoluteFile();
		file.getAbsolutePath();
		file.getName();
		file.getParent();
		file.getPath();
		file.getTotalSpace();
		file.isDirectory();
		file.isHidden();
		file.isFile();
		file.list();
		file.listFiles();
		file.mkdir();
		file.renameTo(filee);
		 */
		
		this.rutaFiles(file);
	}
	
	/**
	 * ESTE TEXTO NO TIENE NINGUNA ETIQUETA DE IDENTIFICACION. ESTO NO VA A
	 * AAPARECER :( Tambien se puede agregar referencias a class o methodos o
	 * atributos con la instruccion: {
	 *
	 * @ por ejemplo: {@code <html></html>} o usar {@link String}
	 *
	 * @param f Este metodo recibe un archivo.
	 * @see FlujoDeDatos.File.
	 * @since v1.0
	 * @exception
	 * @throw
	 * @return
	 * @author Redes-20
	 */
	public void rutaFiles(File f)
	{
	}

	public void crearFileConPrintStreamEasy(File f) {
		this.crearFileConPrintStreamEasy(file);
		FileOutputStream fos = null;
		PrintStream fs = null;
	
		try {
			fos = new FileOutputStream(file);
			fs = new PrintStream(fos);
			
			fs.print("Visiten Xvideos.com");
			fs.println("Visiten PornHub.com");
			fs.write('d');
			fs.append(("Gonza gil"));
			fs.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		} finally {
			try {
				if(fs != null) {
					fs.close();
				}
				if(fos != null) {
					fos.close();
				}
			} catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}
	}//Fin crearFileConPrintStreamEasy
	
	public void crearFileConPrinter(File f) {
		FileWriter fw = null; //usa buffered directo
		PrintWriter pw = null;
		try {
			if(!f.exists()) {
				try {
					f.createNewFile();
				}catch(IOException e) {
					Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
				}
			}
			
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			
			pw.print("Visiten Xvideos.com");
			pw.print("Crearle una cuenta a MonsterCreator");
			pw.println("Visiten PornHub.com");
			pw.write('d');
			pw.append(("Gonza genio"));
			pw.flush();
		}catch(FileNotFoundException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}catch(IOException e){
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}finally{
			try{
				if(pw != null) {
					pw.close();
				}
				if(fw != null) {
					fw.close();
				}
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}//Finally
		
	}
	
	/**
	*
	* @param f
	 * @return 
	*/
	public void crearFileConBuffer(File f) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(f , false ); //append
			bw = new BufferedWriter(fw);
			
			bw.append("ss");
			bw.write("s");
			bw.newLine();
			bw.flush(); //Opcional Buffered
		}catch(IOException e) {
			Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
		}finally {
			try {
				if(fw != null)
					fw.close();
				if(bw != null)
					bw.close();
			}catch(IOException e) {
				Logger.getLogger(Archivos.class.getName()).log(Level.WARNING,null,e);
			}
		}
	}
	
	/**
	 * Descripcion
	 *
	 * @param f un archivo al leer
	 * @return Todo el texto leido.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String LeerFileConBuffer(File f) throws FileNotFoundException, IOException {
		return null;
	}

	public void leerFileCaracterAcaractet(File f) {
		
	}
	
}
