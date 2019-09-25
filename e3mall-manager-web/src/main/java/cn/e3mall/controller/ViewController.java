package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views")
public class ViewController {


   @RequestMapping("/haha")
    public String hello(){
        return "haha";
    }
    @RequestMapping("/hello")
    public String hello2(){
       return "jsp/index";
    }

}
