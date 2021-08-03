package com.cimu.date;

import net.jpountz.xxhash.XXHash64;
import net.jpountz.xxhash.XXHashFactory;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

/**
 * @author: zhengmao_chai
 * @date: 2021/7/8 9:38
 * @since: 1.0.0
 */
public class Timestamp2Date {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        String s = System.currentTimeMillis() + "";
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        System.out.println(format.format(date));
        LocalDate localDate = LocalDate.now();
        String format1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(format1);

        Long timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(timestamp);
        System.out.println(System.currentTimeMillis());
        LocalDateTime time2 = LocalDateTime.ofEpochSecond(1623392416, 0, ZoneOffset.ofHours(8));
        System.out.println(time2.format(DateTimeFormatter.BASIC_ISO_DATE));
        XXHash64 xxHash64 = XXHashFactory.safeInstance().hash64();
        long hash = Math.abs(xxHash64.hash(ByteBuffer.wrap("12312312312321312".getBytes()), 0));
        System.out.println(hash);
    }
}
