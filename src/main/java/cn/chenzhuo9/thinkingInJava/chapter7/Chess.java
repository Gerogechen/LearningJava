package cn.chenzhuo9.thinkingInJava.chapter7;

public class Chess extends BoardGame {
    Chess(int i) {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess(2);
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(1);
        System.out.println("BoardGame constructor");
    }
}