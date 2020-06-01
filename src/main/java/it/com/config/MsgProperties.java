package it.com.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {

    /**
     * 访问发送短信的url地址
     */
    private String url;

    /**
     * 短信服务商提供的请求keyId
     */
    private String accessKeyId;

    /**
     * 短信服务商提供的KeySecret
     */
    private String accessKeySecret;
}
