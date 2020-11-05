package org.fairytail.jservice.bean.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class TestCommonController {
    @GetMapping("/test/hello")
    public String testHello() {
        try {
            throw new RuntimeException("xxx");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return "Hello World";
    }

    public static void main(String[] args) {
        String errMsg =  "2020-11-02 14:22:39.945 ERROR[com.alibaba.nacos.naming.push.receiver]com.alibaba.nacos.client.naming.run:110 -[NA] error while receiving push data\njava.net.SocketException: Socket closed\n\tat java.net.PlainDatagramSocketImpl.receive0(Native Method)\n\tat java.net.AbstractPlainDatagramSocketImpl.receive(AbstractPlainDatagramSocketImpl.java:143)\n\tat java.net.DatagramSocket.receive(DatagramSocket.java:812)\n\tat com.alibaba.nacos.client.naming.core.PushReceiver.run(PushReceiver.java:83)\n\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\n\tat java.util.concurrent.FutureTask.run$$$capture(FutureTask.java:266)\n\tat java.util.concurrent.FutureTask.run(FutureTask.java)\n\tat java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.access$201(ScheduledThreadPoolExecutor.java:180)\n\tat java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:293)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\n\tat java.lang.Thread.run(Thread.java:748)";
        System.out.println(errMsg);
    }
}
