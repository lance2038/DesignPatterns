package com.observer;

/**
 * 观察者
 *
 * @author lance
 */
public interface Subject
{
    /**
     * 注册订阅者
     *
     * @param ob
     */
    void registerObserver(Observer ob);

    /**
     * 移除订阅者
     *
     * @param ob
     */
    void removeObserver(Observer ob);

    /**
     * 通知所有订阅者
     */
    void notifyObservers();
}
