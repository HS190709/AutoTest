package test;

import java.io.*;


/**
 * @author hosni
 * @date 2019/05/21 20:45:51
 **/
public class TestFileIODemo {
    public static void main(String[] args) throws IOException {
        File f=new File("G:/test/filetest");
        OutputStream os=new FileOutputStream(f);
        OutputStreamWriter osw=new OutputStreamWriter(os,"gbk");
        osw.append("A");
        osw.close();
        os.close();
        InputStream is=new FileInputStream(f);
        InputStreamReader isr=new InputStreamReader(is,"gbk");
        char a=(char)isr.read();
        System.out.println(a);
        isr.close();
        is.close();
        /*StringBuffer sb = new StringBuffer();
        while (isr.ready()) {
            sb.append((char) isr.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        isr.close();
        // 关闭读取流

        is.close();
        // 关闭输入流,释放系统资源*/
    }
}
    /*public static void main(String[] args) throws IOException {
        System.out.println(i + 1);
        i++;
        System.out.println("------mystart");
        System.out.println("4700012@qq.com ".hashCode() * 21 + System.currentTimeMillis());
        sendPost("https://www.inbreak.net/user/findpassword.action?email=4700012@qq.com");
        System.out.println("4700012@qq.com".hashCode() * 21 ++ System.currentTimeMillis());
        System.out.println("------myend");


        System.out.println("------user start");
        Long x = "10000@qq.com".hashCode() * 21 + System.currentTimeMillis();
        System.out.println(x);
        sendPost("https://www.inbreak.net/user/findpassword.action?email=10000@qq.com");
        Long y = "10000@qq.com ".hashCode() * 21 + System.currentTimeMillis();
        System.out.println(y);
        System.out.println(y - x);
        System.out.println("------user end");
    }*/