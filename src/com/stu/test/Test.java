package com.stu.test;

import java.io.File;

import com.stu.common.StuByteReader;
import com.stu.common.StyStreamReader;

public class Test {

    public static void main(String[] args) {

        /**
         * 字节流在操作的时候本身是不会用到缓冲区（内存）的，是与文件本身直接操作的，而字符流在操作的时候是使用到缓冲区的
         * 
         * 字节流在操作文件时，即使不关闭资源（close方法），文件也能输出，但是如果字符流不使用close方法的话，则不会输出任何内容，
         * 说明字符流用的是缓冲区，并且可以使用flush方法强制进行刷新缓冲区，这时才能在不close的情况下输出内容
         */
        File testFile = new File("source/file_test.txt");
        StuByteReader read = new StuByteReader(testFile);
        StyStreamReader reader = new StyStreamReader(testFile);

        // read.byteReader();

        // read.byteReader2();

        reader.Reader();

    }
}
