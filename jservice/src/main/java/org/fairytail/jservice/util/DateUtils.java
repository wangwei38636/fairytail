package org.fairytail.jservice.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.util.Date;

public class DateUtils {
    private final static String YMDHMS = "yyyy-MM-dd HH:mm:ss";

    public static Date parseDate(String str) {
        try {
            return org.apache.commons.lang3.time.DateUtils.parseDate(str, YMDHMS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Date addSeconds(final Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.addSeconds(date, amount);
    }

    public static Date addMinutes(final Date date, final int amount) {
        return org.apache.commons.lang3.time.DateUtils.addMinutes(date, amount);
    }

    public static String format(final Date date) {
        return format(date, YMDHMS);
    }

    public static String format(final Date date, final String pattern) {
        return DateFormatUtils.format(date, pattern);
    }
}
