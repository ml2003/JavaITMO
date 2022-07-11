package training10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceChar {

    public static String setFullPath(String name) {
        String root = System.getProperty("user.dir");
        return root + File.separator + "textfiles" + File.separator + name;
    }

    public static String stringFromFile(String filePath) throws IOException {
        String filecontent = "";
        FileReader fileReader = new FileReader(filePath);
        Scanner scan = new Scanner(fileReader);
        while (scan.hasNextLine()) {
            filecontent+=(scan.nextLine());
        }
        scan.close();
        fileReader.close();
        return filecontent;
    }

    public static void writeToFile(String filepath, String towrite) throws IOException {
        FileWriter fw = new FileWriter((filepath), true);
        fw.write(towrite);
        fw.close();
    }


    public static String replacechar(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                sb.append("$");
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) throws IOException {

        writeToFile(setFullPath("newtext.txt") ,replacechar(stringFromFile(setFullPath("text0.txt"))));

    }

}
