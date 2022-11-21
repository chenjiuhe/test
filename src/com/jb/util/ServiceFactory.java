package com.jb.util;

public class ServiceFactory {
    //传递张三对象，得到lisi对象的过程
    public static Object getService(Object service){

        return new TransactionInvocationHandler(service).getProxy();
    }
}
