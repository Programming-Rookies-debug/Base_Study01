package FileStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageTest {
    public static void main(String[] args) throws Exception {


        FileInputStream in=new FileInputStream("D:\\ImageTest\\截图");
        System.out.println("in :"+in);
        FileOutputStream out=new FileOutputStream("D:\\ImageTest\\test");
        //创建数组
        int n=0;
        int a=0;
        //1024字节,相当于每次读取1kb
        byte[] arr=new byte[1024];
        //循环读取,读到末尾返回-1
        while ((n=in.read(arr))!=-1){
            //将读取的内容写入输出流当中
            out.write(arr,0,n);
        }
        out.flush();
        out.close();
        in.close();
    }

}
