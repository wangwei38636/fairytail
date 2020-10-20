package org.fairytail.jservice.demo.delay.queue;

import lombok.Data;
import org.fairytail.jservice.util.DateUtils;

import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class JDKDelayQueue {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayItem> delayQueue = new DelayQueue<DelayItem>();


        Date date1 = DateUtils.parseDate("2020-10-16 14:06:00");
        Date date2 = DateUtils.parseDate("2020-10-16 14:06:10");
        Date date3 = DateUtils.parseDate("2020-10-16 14:06:20");

        // 20s后
        delayQueue.add(new DelayItem(date1.getTime(), "aaaaaa"));
        // 10秒后
        delayQueue.add(new DelayItem(date3.getTime(), "bbbbbb"));
        // 30秒后
        delayQueue.add(new DelayItem(date2.getTime(), "cccccc"));

        while (0 < delayQueue.size()) {
            Thread.sleep(1000);
            DelayItem d;
            do {
                d = delayQueue.poll();
                System.out.println(null != d ? d.getItem() : "null" + ",delayQueue size:" + delayQueue.size());
            } while (d != null);

        }
    }

    @Data
    public static class DelayItem implements Delayed {
        private long delayTime;
        private String item;
        private final static TimeUnit TIME_UNIT = TimeUnit.MILLISECONDS;

        public DelayItem(long delayTime, String item) {
            super();
            this.delayTime = delayTime;
            this.item = item;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(delayTime, TIME_UNIT) - unit.convert(System.currentTimeMillis(), TIME_UNIT);
        }

        @Override
        public int compareTo(Delayed o) {
            return Long.compare(this.getDelay(TIME_UNIT), o.getDelay(TIME_UNIT));
        }
    }
}