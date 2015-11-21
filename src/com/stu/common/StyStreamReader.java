package com.stu.common;

import java.io.File;
import java.io.FileReader;

public class StyStreamReader {

    private File file;

    public StyStreamReader(File file) {
        assert file.exists() : "所要操作的文件不存在！！！";
        this.file = file;
    }

    public void Reader() {
        try {
            java.io.Reader reader = new FileReader(file);

            char[] out = new char[1024];

            int len = reader.read(out);

            reader.close();

            System.out.println(new String(out, 0, len));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
