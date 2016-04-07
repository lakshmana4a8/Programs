package text.file.modification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadWriteTextFileJDK7 {
	public static void main(String... aArgs) throws IOException {
		ReadWriteTextFileJDK7 text = new ReadWriteTextFileJDK7();
		List<String> lines = text.readSmallTextFile(FILE_NAME);
		log(lines);
		lines.add("This is a line added in code.");
		text.writeSmallTextFile(lines, FILE_NAME);
		text.readLargerTextFile(FILE_NAME);
		lines = Arrays.asList("Down to the Waterline", "Water of Love");
		text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);
	}

	final static String FILE_NAME = "input.txt";
	final static String OUTPUT_FILE_NAME = "output.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;

	List<String> readSmallTextFile(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		return Files.readAllLines(path, ENCODING);
	}

	void writeSmallTextFile(List<String> aLines, String aFileName)
			throws IOException {
		Path path = Paths.get(aFileName);
		Files.write(path, aLines, ENCODING);
	}

	void readLargerTextFile(String aFileName) throws IOException {
	    Path path = Paths.get(aFileName);
		Scanner scanner =  new Scanner(path, ENCODING.name());
		while (scanner.hasNextLine()){
			log(scanner.nextLine());
		}
	  }

	void readLargerTextFileAlternate(String aFileName) throws IOException {
		Path path = Paths.get(aFileName);
		BufferedReader bufferedReader = Files.newBufferedReader(path, ENCODING);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			// process each line in some way
			log(line);
		}
	}

	void writeLargerTextFile(String aFileName, List<String> aLines) throws IOException {
		Path path = Paths.get(aFileName);
		BufferedWriter writer = Files.newBufferedWriter(path, ENCODING);
		for (String line : aLines) {
			writer.write(line);
			writer.newLine();
		}
	}

	private static void log(Object aMsg) {
		System.out.println(String.valueOf(aMsg));
	}
}
