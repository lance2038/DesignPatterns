package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 哨兵
 *
 * @author lance
 */
public class Sentinel implements Subject
{
    private List<Observer> obList = new ArrayList<>();

    /**
     * 注册一个Observer
     */
    @Override
    public void registerObserver(Observer ob)
    {
        obList.add(ob);
    }

    /**
     * 移除一个Observer
     */
    @Override
    public void removeObserver(Observer ob)
    {
        obList.remove(ob);
    }

    /**
     * 通知所有的Observer
     */
    @Override
    public void notifyObservers()
    {
        for (Observer ob : obList)
        {
            ob.update("");
        }
    }
}

