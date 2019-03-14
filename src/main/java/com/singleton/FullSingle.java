package com.singleton;

/**
 * 饱汉单例
 *
 * @author lance
 */
public class FullSingle
{
    private static FullSingle fullSingle = new FullSingle();

    private FullSingle()
    {
    }

    public static FullSingle getFullSingleInstance()
    {
        return fullSingle;
    }

    public void process()
    {
        System.out.println(fullSingle);
    }
}
