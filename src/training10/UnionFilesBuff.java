package training10;

import java.io.*;
import java.util.Scanner;

public class UnionFilesBuff {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        try (
                BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(file1));
                BufferedInputStream inputStream2 = new BufferedInputStream(new FileInputStream(file2))
        ) {
            byte[] buffer = inputStream.readAllBytes();

            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file1));
            outputStream.write(inputStream2.readAllBytes());
            outputStream.write(buffer);
            outputStream.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
