package Abstract_抽象类.Game;

/**
 * @author Sunpl
 * @description 英雄对象类
 * @date 2021/11/12
 */
public class Hero {
    //英雄基础血量
    private  int Blood;
    //英雄的基础攻击力
    private  int Hit;
    //加血的方法
    public  void addBlood(){

    }
    //攻击方法
    public  Hero  hit(Hero hero,int hitPower){
       int  HeroBlood=hero.getBlood();
        HeroBlood =HeroBlood-hitPower;
        hero.setBlood(HeroBlood);
        if (HeroBlood<10){
            System.out.println("英雄血量过低");
        }
        return hero;
    }

    public int getBlood() {
        return Blood;
    }

    public void setBlood(int blood) {
        Blood = blood;
    }

    public int getHit() {
        return Hit;
    }

    public void setHit(int hit) {
        Hit = hit;
    }
}
