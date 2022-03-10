package priv.xl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 请求参数转发
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("testParam")
    public String testParam() {
        System.out.println("执行了。。。");
        return "success";
    }

}
