package com.first.demo.game;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game Runner"+ game);
    }
}
