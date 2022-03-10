package priv.xl.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换为日期
 */
public class StringToDateConverter implements Converter<String, Date> {

    public Date convert(String s) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("converter error");
        }
    }
}
