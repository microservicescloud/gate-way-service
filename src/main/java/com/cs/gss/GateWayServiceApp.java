package com.cs.gss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableZuulProxy
public class GateWayServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(GateWayServiceApp.class, args);
    }

}