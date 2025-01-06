package com.zyz.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/12 23:08
 * @Description:
 */
@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }




}


