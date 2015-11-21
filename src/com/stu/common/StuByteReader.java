package com.stu.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class StuByteReader {

    private File file;

    public StuByteReader(File file) {
        assert file.exists() : "所要处理的文件不存在";
        this.file = file;
    }

    public void byteReader() {
        try {
            InputStream input = new FileInputStream(file);
            byte[] read = new byte[2048];
            // 为了不浪费 也可以直接创建跟文件大小相等的数组
            // byte[] read = new byte[(int)file.length()];

            int len = input.read(read);
            input.close();
            System.out.println(new String(read, 0, len));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void byteReader2() {
        try {
            InputStream input = new FileInputStream(file);
            byte[] read = new byte[(int) file.length()];

            int byt = 0;
            int length = 0;
            // -1为文件完全读完的标志
            while ((byt = input.read()) != -1) {
                read[length] = (byte) byt;
                length++;
            }
            input.close();

            System.out.println(new String(read));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
