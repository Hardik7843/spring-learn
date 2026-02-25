package com.first.demo;

import com.first.demo.game.GamingConsole;
import com.first.demo.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    GamingConsole game() {
        return new MarioGame();
    }
}
