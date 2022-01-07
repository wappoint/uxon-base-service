package uxon.net.base.domain;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jiazhang
 * @wechat linger_zhang
 * @date 2022-01-06
 */
@Data
public class WxUser implements Serializable {
    private static final long serialVersionUID = 1797445812099223233L;

    private String appId;
    private String avatarUrl;
    private String city;
    private String country;
    private Integer gender;
    private String userId;
    private String mobile;
    private String nickName;
    private String openId;
    private String province;
    private String unionId;
    private String language;
    private String registrationCode;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
