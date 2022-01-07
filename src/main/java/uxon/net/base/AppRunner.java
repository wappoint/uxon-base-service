package uxon.net.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uxon.net.base.domain.WxUser;
import uxon.net.base.mapper.UserMapper;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2022-01-06
 */
@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    UserMapper userMapper;
    @Override
    public void run(String... args) throws Exception {
        WxUser u = new WxUser();
        u.setUserId("15a6e1063ead4689846de12f6822fa41");
        final WxUser wxUser = userMapper.getWxUser(u);
        System.out.println(wxUser);
    }
}
