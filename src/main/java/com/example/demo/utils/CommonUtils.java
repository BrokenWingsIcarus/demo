package com.example.demo.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonUtils {

    public static Map<String, Object> getParameterMap(HttpServletRequest request) {
        Map<String, String[]> properties = request.getParameterMap();

        Map<String, Object> returnMap = new HashMap();
        Set<String> keySet = properties.keySet();
        for (String keyValue : keySet) {
            String[] values = properties.get(keyValue);
            String value = "";
            if(keyValue != null &&  (keyValue.length() != 1 && StringUtils.isNotBlank(values[0])? true :false)) {
                for(int i=0; i< values.length; i++){
                    if(values[i] != null && "".equals(values[i])){
                        value +=  values[i] + ",";
                    }
                    if(values[i]!= null && !"".equals(value)) {
                        value = value.substring(0,value.length() - 1);
                    }
                    if(value.equals("keywords")) {
                        value = value.replace("_","\\_").replace("%","\\%");
                    }
                    returnMap.put(keyValue,value);
                }
            }
        }
           return returnMap;
    }
}
