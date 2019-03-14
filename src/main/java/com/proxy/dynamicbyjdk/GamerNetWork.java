package com.proxy.dynamicbyjdk;

/**
 * 游戏者的网络
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
