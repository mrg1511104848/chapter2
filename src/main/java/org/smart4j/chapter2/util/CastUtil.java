package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 2bu on 2018/2/28.
 */
public class CastUtil {

    public static int castInt(Object obj) {
        return CastUtil.castInt(obj,0);
    }

    private static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if(obj!=null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return intValue;
    }

    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                booleanValue = Boolean.parseBoolean(strValue);
            }
        }
        return booleanValue;
    }

    private static String castString(Object obj) {
        return CastUtil.castString(obj,"");
    }

    private static String castString(Object obj, String defaultValue) {
        return obj!=null ? String.valueOf(obj) : defaultValue;
    }

    public static boolean castBoolean(Object property) {
        return castBoolean(property,false);
    }
}
