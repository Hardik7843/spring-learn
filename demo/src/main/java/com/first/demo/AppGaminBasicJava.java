package com.first.demo;

import com.first.demo.game.GameRunner;
import com.first.demo.game.MarioGame;
import com.first.demo.game.SuperContraGame;

public class AppGaminBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
