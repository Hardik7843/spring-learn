package com.first.demo;

import com.first.demo.game.GameRunner;
import com.first.demo.game.MarioGame;

public class AppGaminBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
