package com.proxy.cglib;

/**
 * cglib代理测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        GamerNetWork gamerNetWork = new GamerNetWork();
        GamerNetWork proxy = (GamerNetWork) new NetWorkProxyFactory(gamerNetWork).getProxyInstance();
        proxy.request();
    }
}

