package cn.chenzhuo9.thinkingInJava.chapter7;

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControl shipControl = new SpaceShipControl();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        shipControl.back(velocity);
    }

    public void up(int velocity) {
        shipControl.up(velocity);
    }

    public void down(int velocity) {
        shipControl.down(velocity);
    }

    public void forward(int velocity) {
        shipControl.forward(velocity);
    }

    public void left(int velocity) {
        shipControl.left(velocity);
    }

    public void right(int velocity) {
        shipControl.right(velocity);
    }

    public void turboBoost() {
        shipControl.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("NESA protector");
        spaceShipDelegation.forward(100);
    }
}
