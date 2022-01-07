package uxon.net.base.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.Transactional;
import uxon.net.base.domain.WxUser;

import java.util.Date;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2022-01-06
 */
@Mapper
public interface UserMapper {
    @Select("select * from uxon_wx_user where user_id = #{userId}")
    @Results(id = "getWxUser", value = {
            @Result(column = "appid", property = "appId"),
            @Result(column = "avatar_url", property = "avatarUrl"),
            @Result(column = "city", property = "city"),
            @Result(column = "country", property = "country"),
            @Result(column = "gender", property = "gender"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "mobile", property = "mobile"),
            @Result(column = "nick_name", property = "nickName"),
            @Result(column = "open_id", property = "openId"),
            @Result(column = "province", property = "province"),
    })
    WxUser getWxUser(WxUser wxUser);
}
