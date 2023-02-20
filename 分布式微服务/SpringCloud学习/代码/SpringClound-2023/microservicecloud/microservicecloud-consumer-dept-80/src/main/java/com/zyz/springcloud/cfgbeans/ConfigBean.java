package com.zyz.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule()
    {
        //return new RoundRobinRule();
        /**
         * 达到的目的，用我们重新选择的随机算法替代默认的轮询。
         */
        return new RandomRule();

        /**
         * 比如说有个服务宕机，会经过一段时间自动跳过已经宕机的服务
         */
//        return new RetryRule();
    }


}


