package org.fairytail.jservice.bean.controller;

import com.alibaba.csp.sentinel.adapter.reactor.SentinelReactorTransformer;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.fairytail.jservice.bean.feign.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private EchoService echoService;

    @GetMapping(value = "/hello")
    @SentinelResource("hello")
    public String hello() {
        System.out.println(echoService.echo("HeHe"));
        return "Hello Sentinel";
    }

    @GetMapping("/mono")
    @SentinelResource("hello")
    public Mono<String> mono() {
        return Mono.just("simple string")
                .transform(new SentinelReactorTransformer<>("otherResourceName"));
    }
}
