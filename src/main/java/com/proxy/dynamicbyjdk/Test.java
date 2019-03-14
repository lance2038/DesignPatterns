package com.proxy.dynamicbyjdk;

/**
 * 动态代理测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        CnNetWork gamerNetWork = new GamerNetWork();
        CnNetWork proxy = (CnNetWork) new NetWorkProxyFactory(gamerNetWork).getProxyInstance();
        proxy.request();
    }
}

