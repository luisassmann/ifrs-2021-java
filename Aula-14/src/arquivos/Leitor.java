package arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

	public static void main(String[] args) {
		File f = new File("pasta1/nomes.txt");
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = null;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
