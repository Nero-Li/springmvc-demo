package com.softeem.controller;

import com.softeem.pojo.Form;
import com.softeem.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * description:
 *
 * @author lyming
 * @date 2020/12/13 5:22 下午
 */
@Controller
@RequestMapping("/url")
public class URLMappingController {

    @GetMapping("/getTest")
    @ResponseBody
    public String getTest(){
        return "Get....";
    }

    @PostMapping("/postTest")
    @ResponseBody
    public String postTest(){
        return "Post....";
    }
    @PostMapping("/getData")
    @ResponseBody
    public String getData(String username,String password){
        System.out.println(username + ":" + password);
        return "login";
    }

    @GetMapping("/getTestWithData")
    @ResponseBody
//    public String getTestWithData(String username){
    public String getTestWithData(@RequestParam("user_name") String username){
        System.out.println(username);
        return "getTestWithData....";
    }

    @PostMapping("/pojo")
    @ResponseBody
    public String getDataWithPojo(User user,String username){
        System.out.println(username);
        return user.toString();
    }

//    @PostMapping("/complexData")
//    @ResponseBody
//    public String getComplexData(@RequestParam(defaultValue = "张三") String username,String lady,Integer[] reason){
//        System.out.println(username+"===="+lady+"====");
//        for (Integer r : reason){
//            System.out.println(r);
//        }
//        return "good";
//    }

//    @PostMapping("/complexData")
//    @ResponseBody
//    public String getComplexData(@RequestParam(defaultValue = "张三") String username, String lady, @RequestParam List<Integer> reason){
//        System.out.println(username+"===="+lady+"====");
//        for (Integer r : reason){
//            System.out.println(r);
//        }
//        return "good";
//    }

//    @PostMapping("/complexData")
//    @ResponseBody
//    public String getComplexData(Form form) {
//        System.out.println(form);
//        return "good";
//    }

//    @PostMapping("/complexData")
//    @ResponseBody
//    public String getComplexData(@RequestParam Map map) {
//        System.out.println(map);
//        return "good";
//    }

//    @PostMapping("/complexData")
//    @ResponseBody
//    public String getComplexData(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        System.out.println(sdf.format(birthday));
//        return "good";
//    }

    @PostMapping("/complexData")
    @ResponseBody
    public String getComplexData(Date birthday) {
        System.out.println(birthday);
        return "good";
    }

    @GetMapping("/response")
    @ResponseBody
    public String showResponse(){
        return "<h2 style='color:red'>软帝学院</h2>";
    }

    @GetMapping("/view")
    public ModelAndView showMAV(String id){
        ModelAndView modelAndView = new ModelAndView();
        //绝对路径 只要webapp下有mav.jsp就可以
//        modelAndView.setViewName("/mav.jsp");
        //相对路径 需要在webapp/url下有mav.jsp
        modelAndView.setViewName("mav.jsp");
        User user= new User();
        if (null != id && "1".equals(id)) {
            user.setUsername("木子");
        }else{
            user.setUsername("匿名");
        }
        modelAndView.addObject("u",user);
        return modelAndView;
    }

    @GetMapping("view2")
    public String showMAV2(String id){
//        String view = "/url/mav.jsp";
        String view = "/test";
//        User user= new User();
//        if (null != id && "1".equals(id)) {
//            user.setUsername("木子");
//        }else{
//            user.setUsername("匿名");
//        }
//        modelMap.addAttribute("u",user);
        return view;
    }

    public static void main(String[] args) throws IOException {
        File dir = new File("d");
        File file = new File(dir, "f");
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
