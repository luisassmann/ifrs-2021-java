package arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) {
		
		// Criação do arquivo no Java.
		File f = new File("pasta1");
		f.mkdir();
		
		File a = new File("pasta1/nomes.txt");
		try {
			a.createNewFile();
			
			// Código que faz a escrita no arquivo.
			// File Writer e Buffered Writer.
			FileWriter fw = new FileWriter(a, false); 	// O segundo parâmetro indica se
														// o conteúdo do arquivo será
														// escrito do zero (false) ou se
														// preservará o conteúdo já existente (true).
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
