package com.laiye.knowledgegraph.logger;


public class Log4j2Util {

    public static <T> org.slf4j.Logger getLogger(Class<T> tClass){
        return org.slf4j.LoggerFactory.getLogger(tClass);
    }

}
