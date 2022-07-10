package training10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static String setFileName() {
        String root = System.getProperty("user.dir");
        String FileName = "writefile.txt";
        return root + File.separator + "textfiles" + File.separator + FileName;
    }

    public static void writeToFile(String filepath, String towrite) throws IOException {
        FileWriter fw = new FileWriter(FileWrite.setFileName(), true);
        fw.write(towrite + "\n");
        fw.close();
    }

    public static void main(String[] args) {

        String str = "Эту строчку запишем в файл";
        try {
            writeToFile(setFileName(), str);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
