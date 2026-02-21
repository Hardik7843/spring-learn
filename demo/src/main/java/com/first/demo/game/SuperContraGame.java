package com.first.demo.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void right() {
        System.out.println("Shoot");
    }

    public void left() {
        System.out.println("Go Back");
    }
}
