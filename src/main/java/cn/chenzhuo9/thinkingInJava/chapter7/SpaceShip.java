package cn.chenzhuo9.thinkingInJava.chapter7;

/**
 * velocity速度
 */
public class SpaceShip extends SpaceShipControl {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("NSEA protector");
        spaceShip.forward(100);
    }
}
class SpaceShipControl{
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forward(int velocity){}
    void back(int velocity){}
    void turboBoost(){}
}