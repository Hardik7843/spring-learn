package com.first.demo;

import com.first.demo.game.GameRunner;
import com.first.demo.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.first.demo.game")
public class App03GamingSpringBeans {
//    Removed Because we are using component scan
//    @Bean
//    GamingConsole game() {
//        return new MarioGame();
//    }

//    @Bean(name = "superContraGame")
//    GamingConsole superContra() {
//        return new SuperContraGame();
//    }

//    @Bean
//    GameRunner gameRunner(GamingConsole game)
//    {
//        return new GameRunner(game);
//    }

    static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}
