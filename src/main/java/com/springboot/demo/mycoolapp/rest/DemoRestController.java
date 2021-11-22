package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController

public class DemoRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/team")
    public String getTeamInfo(){
        return "Coach name : "+coachName+"\nTeam name : "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!! Time on server is : "+ LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run for 5k every day..!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Rock the Day..!";
    }
}
