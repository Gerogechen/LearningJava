package cn.chenzhuo9.thinkingInJava.chapter7;

public class PlaceSetting extends Custom{
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;
    public PlaceSetting(int i){
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i + 5);
        System.out.println("我是餐桌");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(1);
    }
}

class Plate{
    Plate(int i) {
        System.out.println("我是一个盘子");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("我是一个正餐盘子");
    }
}
class Utensil{
    Utensil(int i){
        System.out.println("我是一个器皿");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("我是一个勺子");
    }
}
class Fork extends Utensil{
    Fork(int i) {
        super(i);
        System.out.println("我的是一个叉子");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("我是一把刀");
    }
}
class Custom{
    Custom(int i) {
        System.out.println("我的习惯是啥？");
    }
}
