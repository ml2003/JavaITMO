package training10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {


    public static String setFileName (){
        String root = System.getProperty("user.dir");
        String FileName="file.txt";
        return root+ File.separator+"textfiles"+File.separator+FileName;
    }

    public static List<String> stringsFromFile (String filePath) throws IOException{
       List<String> filecontent = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        Scanner scan = new Scanner(fileReader);
        while (scan.hasNextLine()){
            filecontent.add(scan.nextLine());
        }
        scan.close();
        fileReader.close();
        return filecontent;
    }


    public static void main(String[] args)  {

        try {
            for (String str : stringsFromFile(FileRead.setFileName())
            ) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
