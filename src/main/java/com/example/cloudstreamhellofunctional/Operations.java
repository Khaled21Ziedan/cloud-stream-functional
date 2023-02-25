package com.example.cloudstreamhellofunctional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

@Configuration
public class Operations {
    @Bean
    public Function<String,String> upper(){
        return s -> {
            System.out.format("received %s \n",s);
            return s.toUpperCase();
        };
    }

    @Bean
    public Consumer<String> consume(){
        return s -> {
            System.out.println("consume msg "+ s);
        };
    }
}
