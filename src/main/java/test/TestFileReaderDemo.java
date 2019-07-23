package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author hosni
 * @date 2019/06/13 16:37:57
 **/
public class TestFileReaderDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("G:\\test\\happy.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        char[] b=new char[]{'6','7'};
        //fw.write(b,0,2);
        fw.write("This\r\nis\r\nyou\r\nfather\r\n");
        fw.flush();
        fw.close();
        FileReader fr = new FileReader(f);
        char[] a = new char[50];
        fr.read(a);
        for (char c : a) {
            System.out.print(c);
        }
        fr.close();
    }
}
