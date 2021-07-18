package com.softeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 *
 * @author lyming
 * @date 2020/12/13 1:15 下午
 */
@Controller
public class TestController {

//    @GetMapping("/test")
    @RequestMapping(value = "/test2" ,method= RequestMethod.GET)
    @ResponseBody //直接响应输出字符串数据,不跳转页面
    public String test(){
        return "Success hello";
    }

}
