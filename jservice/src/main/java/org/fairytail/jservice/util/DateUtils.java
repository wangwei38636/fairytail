package org.fairytail.jservice.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

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

    public static String format(Date date) {
        return DateFormatUtils.format(date, YMDHMS);
    }
}
