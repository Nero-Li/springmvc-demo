package com.softeem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * description:
 *
 * @author lyming
 * @date 2020/12/15 10:11 下午
 */
@RequestMapping("/fm")
@Controller
public class FreemarkerController {

    @GetMapping("/test")
    public ModelAndView test1(){
        ModelAndView modelAndView = new ModelAndView("/test");
        modelAndView.addObject("Freemarker","软帝在线");
        return modelAndView;
    }

}
