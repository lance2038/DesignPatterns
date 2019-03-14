package com.proxy.staticbyjdk;

/**
 * 游戏加速器
 *
 * @author lance
 */
public class GameProxy implements CnNetWork
{

    private CnNetWork cnNetWork;

    public GameProxy(CnNetWork cnNetWork)
    {
        this.cnNetWork = cnNetWork;
    }

    @Override
    public void request()
    {
        System.out.println("start proxy");
        cnNetWork.request();
    }

}
