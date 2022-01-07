package uxon.net.base.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2022-01-07
 */
@RestController
@RequestMapping("/")
public class WxUserController {
    @GetMapping("/wx")
    public String hello(){
        return "hello world";
    }
}
