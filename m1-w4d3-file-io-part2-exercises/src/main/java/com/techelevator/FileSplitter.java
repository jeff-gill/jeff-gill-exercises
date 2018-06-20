package com.techelevator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileSplitter {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner userInput = new Scanner(System.in);

		System.out.print("The name of the text file to be split >>> ");
		String path = userInput.nextLine();

		System.out.print("The maximum number of lines that should appear in each output file >>> ");
		Integer lineCount = Integer.parseInt(userInput.nextLine());
//		/Users/jgill/Development/jeffgill-java-blue-exercises/m1-w4d3-file-io-part2-exercises/src/main/java/com/techelevator/fizzbuzz.txt
		System.out.println();
		File f = new File(path);
		if (f.exists() && f.isFile() && lineCount > 0) {
			int fileSuffix = 1;
			int lineCounter = 1;

			String newFilename = f.getAbsolutePath().replaceAll(".txt", "-" + fileSuffix + ".txt");

			File outFile = new File(newFilename);
			outFile.createNewFile();

			try (Scanner fileScanner = new Scanner(f)) {
				while (fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					try (FileWriter writer = new FileWriter(newFilename, true)) {
						System.out.println(newFilename);
						writer.write(line + "\n");
					}
					if (lineCounter % lineCount == 0 && fileScanner.hasNextLine()) {
						fileSuffix++;
						newFilename = f.getAbsolutePath().replaceAll(".txt", "-" + fileSuffix + ".txt");
						outFile = new File(newFilename);
						outFile.createNewFile();
					}

					lineCounter++;

				}
			}

		} else {
			System.out.println(f.getAbsolutePath() + " does not exist or is not a file.");
		}
		userInput.close();
	}

}
