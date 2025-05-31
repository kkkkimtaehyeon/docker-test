package com.kth.dockertest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @Value("${profile}")
    String profile;

    @Value("${name}")
    String name;

    @Value("${age}")
    int age;

    @Value("${sex}")
    String sex;

    @Value("${docker-compose-active}")
    String dockerComposeActive;

    @GetMapping("/")
    public String hi() {
        StringBuilder sb = new StringBuilder();
        sb.append("profile: ").append(profile).append("\n");
        sb.append("name: ").append(name).append("\n");
        sb.append("age: ").append(age).append("\n");
        sb.append("sex: ").append(sex).append("\n");
        sb.append("docker-compose-active: ").append(dockerComposeActive).append("\n");
        return sb.toString();
    }
}