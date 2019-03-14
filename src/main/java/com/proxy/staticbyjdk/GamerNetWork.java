package com.proxy.staticbyjdk;

/**
 * 用户网络
 *
 * @author lance
 */
public class GamerNetWork implements CnNetWork
{

    @Override
    public void request()
    {
        System.out.println("play battlefield V");
    }

}
