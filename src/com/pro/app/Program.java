package com.pro.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Program{
    public static void main(String[] args) throws IOException {
        File file=new File("e:/MyFiles/photos/polo.jpg");
        InputStream is=new FileInputStream(file);
        OutputStream os=new FileOutputStream("e:/MyFiles/Copied.jpg");
        int i=0;
        byte[] data=new byte[1024];

        while((i=is.read(data))!=-1){
            os.write(data, 0, i);
        }
        is.close();
        os.close();
    }
}