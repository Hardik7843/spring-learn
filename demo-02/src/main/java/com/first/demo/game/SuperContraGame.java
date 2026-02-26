package com.first.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Pick_SuperContraGame")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("SuperContra: up");
    }

    public void down() {
        System.out.println("SuperContra: down");
    }

    public void right() {
        System.out.println("SuperContra: Shoot");
    }

    public void left() {
        System.out.println("SuperContra: Go Back");
    }
}
