package com.in28minutes.netflixzuulapigatewayservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixZuulApiGatewayServiceApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler() {

        return Sampler.ALWAYS_SAMPLE;

    }

}
