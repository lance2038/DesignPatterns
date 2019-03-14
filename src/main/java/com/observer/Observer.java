package com.observer;

/**
 * 订阅者
 *
 * @author lance
 */
public abstract class Observer
{
    /**
     * 获取订阅消息
     *
     * @param message
     */
    abstract void update(String message);
}
