package com.singleton;

/**
 * 枚举代理
 *
 * @author lance
 */
public enum EnumSingle
{
    /**
     * 实例
     */
    INSTANCE;

    public void process()
    {
        System.out.println("枚举");
    }
}
