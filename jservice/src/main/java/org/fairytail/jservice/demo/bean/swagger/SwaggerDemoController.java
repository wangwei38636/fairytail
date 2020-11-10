package org.fairytail.jservice.demo.bean.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("demo控制器")
@RestController
public class SwaggerDemoController {
    @ApiOperation(value = "echo", notes = "echo-demo")
    @GetMapping("/swagger-demo/echo")
    public String echo(String he) {
        return he;
    }

    @ApiOperation(value = "hello", notes = "hello-demo")
    @PostMapping("/swagger-demo/hello")
    public String hello() {
        return "Hello World";
    }
}
