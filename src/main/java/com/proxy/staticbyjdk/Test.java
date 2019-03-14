package com.proxy.staticbyjdk;

/**
 * 静态代理测试
 */
public class Test
{
    public static void main(String[] args)
    {
        new GameProxy(new GamerNetWork()).request();
    }
}
