package project;

import other.UserInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//商品库存管理
/**
 * @author Sunpl
 * @description 递归学习
 * @date 2021/10/12
 */
public class Recursion {
    //用户信息
    public  static HashMap<String,String>  UserInfoMap=new HashMap<>();
    //管理员信息
    public   static HashMap<String,String>  AdminInfoMap=new HashMap<>();
    //存放商品名称
    private static String[] CommodityArr={"手机","平板","电脑"};
    //商品属性
    private  static String[]   ComAttributeArr={"名称","价格","评价","类别","上架时间"};
    //手机名称
    private  static  String[]  PhoneName={"苹果13","三星note13","华为mate50pro","小米12pro","oppoFindX"};
    //手机价格
    private  static  String[]  PhonePrice={"8500","7400","6300","5200","4100"};
    //商品属性
    private  static String[]   PhoneComment={"特别好用","很好用","好用","比较好用","haixing "};
    //商品属性
    private  static String[]   PhoneDate={"2021-9-15","2021-10-28","2021-9-20","2022-2-20","2021-12-10"};

    //商品属性信息Map
    public  static HashMap<String,String>  CommodityInfoMap =new HashMap<>();
    //存放商品集合
    private  static ArrayList<String> CommodityList;
    //实例化用户类
    private  static UserInfo userInfo;
    //输入类
    Scanner  scanner=new Scanner(System.in);
   //
    public Boolean flag=false;
    //编写用户登录模块
    public  boolean  Login(){

        System.out.println("欢迎登录系统!");
        System.out.println("请输入用户名:");
        userInfo.setUsername(scanner.next());
        System.out.println("请输入密码:");
        userInfo.setPassword(scanner.next());
        if (getUserInfo(userInfo)){
            //
        }else {
            System.out.println("用户名或密码错误!!");
        }
        return  flag;
    }
    //判断是用户名和密码是否正确并且判断是否为管理员
    public  Boolean  getUserInfo(UserInfo userInfo){
        if (userInfo.getUsername() =="admin" && userInfo.getPassword()=="123456"){
            System.out.println("欢迎你,管理员!!!");
            return true ;
        }
        if(userInfo.getUsername() =="user" && userInfo.getPassword()=="123456"){
            System.out.println("欢迎你,亲爱的客户!!!");
            return true ;
        }
        return false ;
    }

    public static void main(String[] args) {
        showCommodityInfo();
    }
    //展示商品
    public  static  void showCommodityInfo(){
        //添加用户信息
        UserInfoMap.put("user","123456");
//        //添加管理员信息
        AdminInfoMap.put("admin","123456");
        //存放商品名称
        for (int i = 0; i < CommodityArr.length; i++) {
            if (CommodityArr[i]=="手机"){

            }
        }


    }

    //数据初识化
    private static void initData(){

    }




}
