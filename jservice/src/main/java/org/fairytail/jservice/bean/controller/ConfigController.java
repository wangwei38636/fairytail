package org.fairytail.jservice.bean.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;
    @Value("${iii:999}")
    private int iii;

    private int i;

    @RequestMapping("/idd")
    public int i() {
        i++;
        return i;
    }

    @RequestMapping("/get")
    public String get() {
        return useLocalCache + " " + i + " " + iii;
    }
}