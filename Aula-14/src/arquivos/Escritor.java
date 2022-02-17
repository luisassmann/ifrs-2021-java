package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) {
		
		// Cria��o do arquivo no Java.
		File f = new File("pasta1");
		f.mkdir();
		
		File a = new File("pasta1/nomes.txt");
		try {
			a.createNewFile();
			
			// C�digo que faz a escrita no arquivo.
			// File Writer e Buffered Writer.
			FileWriter fw = new FileWriter(a, false); 	// O segundo par�metro indica se
														// o conte�do do arquivo ser�
														// escrito do zero (false) ou se
														// preservar� o conte�do j� existente (true).
			BufferedWriter bw = new BufferedWriter(fw);
			
			for (int i = 0; i < 3; i++) {
				bw.write("Bom dia " + (i+1) + "!\n");
			}
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
