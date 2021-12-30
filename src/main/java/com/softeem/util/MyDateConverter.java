package com.softeem.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description:
 *
 * @author lyming
 * @date 2020/12/13 7:01 下午
 */
public class MyDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            System.out.println("========");
            Date d = sdf.parse(s);
            System.out.println(d);
            return d;
        } catch (ParseException e) {
            return null;
        }
    }

    public static void main(String[] args) {
        String s = "1234567.jpg";
        System.out.println(s.substring(s.lastIndexOf(".")));
    }
}

