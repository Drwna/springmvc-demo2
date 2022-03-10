package priv.xl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.xl.domain.Account;


/**
 * 请求参数转发
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求参数绑定
     *
     * @param username
     * @return
     */
    @RequestMapping("testParam")
    public String testParam(String username) {
        System.out.println("执行了。。。");
        System.out.println("用户名" + username);
        return "success";
    }

    /**
     * 请求参数绑定 把数据封装到 JavaBean 的类中
     *
     * @return
     */
    @RequestMapping("saveAccount")
    public String saveAccount(Account account) {
        System.out.println("执行了。。。");
        System.out.println(account);
        return "success";
    }
}
