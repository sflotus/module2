package ss16_io_text_file.copy_file;

import ss16_io_text_file.ReadAndWriteFileCSV;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap  file Path can copy");
        String inputPath = scanner.nextLine();
        System.out.println("Nhap vi tri luu file moi");
        String outputPath;
        boolean flag;
        do {
            flag = false;
            outputPath = scanner.nextLine();
            File targetFile = new File(outputPath);
            if (targetFile.exists()) {
                System.out.println("Tep dich da ton tai. thu lai");
                flag = true;
            }
        } while (flag);

        List<String> stringList = ReadAndWriteFileCSV.readfileCSV(inputPath);
        int charCount = 0;
        String[] array;
        for (String string : stringList) {
            array = string.split("");
            charCount += array.length;
        }
        stringList.add("so luong ky tu trong file goc : " + charCount);
        ReadAndWriteFileCSV.writeListStringToCSV(outputPath, stringList, true);
        System.out.println("sao chep thanh cong");

    }
}
