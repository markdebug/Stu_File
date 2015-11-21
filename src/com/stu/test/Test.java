package com.stu.test;

import java.io.File;

public class Test {

    public static void main(String[] args) {

        File testFile = new File("source/file_test.txt");
        System.out.println(testFile.exists());
    }
}
