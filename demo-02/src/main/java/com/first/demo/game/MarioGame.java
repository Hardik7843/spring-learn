package com.first.demo.game;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario: up");
    }

    public void down() {
        System.out.println("Mario: down");
    }

    public void right() {
        System.out.println("Mario: Shoot");
    }

    public void left() {
        System.out.println("Mario: Go Back");
    }
}
