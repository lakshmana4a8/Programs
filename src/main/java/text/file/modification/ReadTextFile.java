package text.file.modification;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.ReadWriteLock;

public class ReadTextFile {
	public static void main(String[] args) {
		String fileName = "file.txt";
		String line = "";
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(" : "+line);
			}
			bufferedReader.close();fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			ReadW
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
