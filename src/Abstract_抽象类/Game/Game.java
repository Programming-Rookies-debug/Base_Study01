package Abstract_抽象类.Game;

/**
 * @author Sunpl
 * @description 游戏类
 * @date 2021/11/12
 */
public class Game {
    public static void main(String[] args) {
        //男英雄
        Hero man=new Hero();
        man.setBlood(50);
        man.setHit(15);
        int  ManHit=man.getHit();
        //女英雄
        Hero Women=new Hero();
        Women.setBlood(40);
        Women.setHit(20);
        Women= man.hit(Women,ManHit);
        System.out.println(Women.getBlood());
    }
}
