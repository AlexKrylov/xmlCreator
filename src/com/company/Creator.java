package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Creator {
    private static FileWriter fileWriter;

    public static void listOfString(String filePath, String outPath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> list = new ArrayList<>();
        String str;
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        reader.close();
        stringToXml(list, outPath);
    }

    public static void stringToXml(List<String> list, String outPath) throws IOException {
        int i = 0;
        for (String s : list) {
            i++;
            fileWriter = new FileWriter(outPath + "COST_59_296_78_" + i + ".xml");
            fileWriter.write(s);
            fileWriter.flush();
        }
        fileWriter.close();
    }
}
