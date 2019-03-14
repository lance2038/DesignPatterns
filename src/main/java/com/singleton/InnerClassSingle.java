package com.singleton;

/**
 * 静态内部类单例
 *
 * @author lance
 */
public class InnerClassSingle
{
    private InnerClassSingle()
    {
    }

    private static class SingletonInstance
    {
        private static final InnerClassSingle INSTANCE = new InnerClassSingle();
    }

    public static InnerClassSingle getInnerClassSingleInstance()
    {
        return SingletonInstance.INSTANCE;
    }
}
