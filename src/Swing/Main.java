package Swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("测试窗口");
        jFrame.setSize(500,250);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        创建中间的容器
        JPanel panel =new JPanel();
        JButton btn =new JButton("测试按钮");
        panel.add(btn);
        jFrame.setContentPane(panel);
        jFrame.setVisible(true);


    }
}
