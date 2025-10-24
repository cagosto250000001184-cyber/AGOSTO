
package Agosto_filehandlingprogram;

import java.util.*;
import java.io.*;

public class Agosto_FileHandlingProgram {

    public static void main(String[] args) {

        writeFile();
    }

    static void createFile() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter file name to create: ");
            String fileName = s.nextLine();
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File creation failed.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

    static void writeFile() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input file name to write in: ");
        String fileName = s.nextLine();
        File myObj = new File(fileName);

        try (FileWriter myWriter = new FileWriter(myObj, true)) {
            System.out.print("Input multiple texts (blank to exit): ");
            while (true) {
                String input = s.nextLine();
                if (input.isBlank()) {
                    break;
                }
                myWriter.write(input + "\n");
            }
            System.out.println("File has been written successfully.");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
