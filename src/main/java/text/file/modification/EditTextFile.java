package text.file.modification;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class EditTextFile {

	public static void main(String[] args) {

		try {
			File file = new File("file.txt");
			List<String> lines = FileUtils.readLines(file);
			System.out.println(lines);
			lines.set(0, lines.get(0).replaceAll("here", "there"));
			lines.set(1, ""+System.currentTimeMillis());
			FileUtils.writeLines(file, lines);
			lines = FileUtils.readLines(file);
			System.out.println(lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
