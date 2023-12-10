package ss16_io_text_file.read_csv;

import ss16_io_text_file.ReadAndWriteFileCSV;

import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<String> stringList = ReadAndWriteFileCSV.readfileCSV("ss16_io_text_file/read_csv/data.csv");
        List<Country> countryList = new ArrayList<>();
        String[] array;
        for (String string : stringList) {
            array = string.split(",");
            countryList.add(new Country(Integer.parseInt(array[0]), array[1], array[2]));
        }
        for (Country country : countryList) {
            System.out.println(country);
        }
    }
}
