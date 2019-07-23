/*
import java.io.*;

*/
/**
 * @author hosni
 * @date 2019/06/05 15:47:40
 **//*

public class TestFileDemo {
    public static void main(String[] args) throws IOException {
        */
/*File f=new File("G:\\test");
        File b=new File(f,"b");
        Writer os=new FileWriter(b);
        byte  c[]=null;
        System.out.println(c);
        os.write("8");
        os.close();
        System.out.println(b.length());*//*

        TestFileDemo testFileDemo=new TestFileDemo();
        System.out.println(testFileDemo.createFile("case"));

    }
    private static String path="G:\\test";
    private static String fileNameTemp;
    public static boolean createFile(String fileName){
        Boolean bool=false;
        fileNameTemp=path+fileName+".txt";
        File f=new File(fileNameTemp);
        try {
            if (!f.exists()){
                f.createNewFile();
                System.out.println("创建文件成功,地址在："+fileNameTemp);
                bool=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return bool;
    }
    */
/*public static boolean writeFile(){

    }*//*

}
*/
