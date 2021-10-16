package other;

import java.util.Scanner;

/**
 * @author Sunpl
 * @description 递归学习
 * @date 2021/10/12
 */
public class Recursion {
    Scanner  scanner=new Scanner(System.in);
    UserInfo userInfo =new UserInfo();
    public Boolean flag=false;
    public  boolean  Login(){
        System.out.println("欢迎登录系统!");
        System.out.println("请输入用户名:");
        userInfo.setUsername(scanner.next());
        System.out.println("请输入密码:");
        userInfo.setPassword(scanner.next());
//        if ( getUserInfo(username,password)){
//
//        }else{
//            flag=true;
//        }
        return  flag;
    }
    public static Boolean  getUserInfo(String username ,String  password){
        if (username !="root" && password!="123456"){
            return false ;
        }
        return true ;
    }

}
