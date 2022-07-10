package training10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionFilesReaderWriter {

    public static String setFullPath(String name) {
        String root = System.getProperty("user.dir");
        return root + File.separator + "textfiles" + File.separator + name;
    }

    public static List<String> stringsFromFile(String filePath) throws IOException {
        List<String> filecontent = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        Scanner scan = new Scanner(fileReader);
        while (scan.hasNextLine()) {
            filecontent.add(scan.nextLine());
        }
        scan.close();
        fileReader.close();
        return filecontent;
    }

    public static void writeToFile(String filepath, List<String> towrite) throws IOException {
        FileWriter fw = new FileWriter((filepath), true);
        for (String str : towrite
        ) {
            fw.write(str + "\n");
        }
        fw.close();
    }


    public static void main(String[] args) throws IOException {

        writeToFile(setFullPath("text1.txt"), stringsFromFile(setFullPath("text2.txt")));
    }
}
