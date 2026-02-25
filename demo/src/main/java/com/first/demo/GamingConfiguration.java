package com.first.demo;

import com.first.demo.game.GameRunner;
import com.first.demo.game.GamingConsole;
import com.first.demo.game.MarioGame;
import com.first.demo.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
    @Bean
    @Primary
    GamingConsole game() {
        return new MarioGame();
    }

    @Bean(name = "superContraGame")
    GamingConsole superContra() {
        return new SuperContraGame();
    }

    @Bean
    GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }
}
