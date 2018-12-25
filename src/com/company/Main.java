package com.company;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Creator.listOfString("C:\\in\\1.txt", "C:\\out\\");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
