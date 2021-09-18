package FileStudy;

import java.io.File;

public class FileStudy02 {
    public static void main(String[] args) {



    }

    public  static  void  getFileInfo(String filePath){
        String Path=filePath;
        File file=new File(Path);
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());

    }
}
