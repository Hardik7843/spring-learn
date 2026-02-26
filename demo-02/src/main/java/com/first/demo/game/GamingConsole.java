package com.first.demo.game;

import org.springframework.stereotype.Component;

@Component
public interface GamingConsole {
    void up();

    void down();

    void right();

    void left();
}
