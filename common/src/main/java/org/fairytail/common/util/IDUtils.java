package org.fairytail.common.util;

import com.littlenb.snowflake.sequence.SnowFlakeGenerator;

import java.util.concurrent.TimeUnit;

public class IDUtils {
    private final static String xx = "OD";
    private final static SnowFlakeGenerator orderIdGen = new SnowFlakeGenerator(TimeUnit.MILLISECONDS, 42, 10, 11, 1577808000000L, 1L);

    public static long orderId() {
        return orderIdGen.nextId();
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(orderId());
        }
    }
}
