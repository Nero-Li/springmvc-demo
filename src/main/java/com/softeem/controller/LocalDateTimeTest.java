package com.softeem.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.softeem.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lyming
 */
@RestController
@RequestMapping("/time")
public class LocalDateTimeTest {


    @PostMapping("/test")
    public Map<String, Object> testLocalDateTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDateTime birthday) {
        System.out.println(birthday);
        User user = new User();
        user.setId("1");
        user.setUsername("muzi");
        user.setBirthday(birthday);
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        return map;
    }
}
