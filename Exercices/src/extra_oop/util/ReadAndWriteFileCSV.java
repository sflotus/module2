package extra_oop.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    public static void writeListStringToCSV(String filePath, List<String> stringList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : stringList) {
                bufferedWriter.write(line);
                //xuong dong
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error! File not found");
        } catch (IOException e) {
            System.out.println("Error! We got some unknown error, please try again");
            ;
        }
    }

    public static List<String> readFileCSV(String filePatch) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePatch);
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error! File not found");
        } catch (IOException e) {
            System.out.println("Error! We got some unknown error, please try again");
            ;
        }
        return stringList;
    }
}