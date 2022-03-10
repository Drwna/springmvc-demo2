package priv.xl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class HelloController {

    @RequestMapping(path = "hello")
    public String sayHello() {
        System.out.println("hello spring mvc");
        return "success";
    }

    @RequestMapping("test")
    public String test() {
        System.out.println("RequestMapping 注解测试中。。。");
        return "success";
    }
}
