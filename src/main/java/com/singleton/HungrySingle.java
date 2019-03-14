package com.singleton;

/**
 * 饿汉单例(双重校验)
 *
 * @author lance
 */
public class HungrySingle
{
    private static volatile HungrySingle hungrySingle = null;

    private HungrySingle()
    {
    }

    public static HungrySingle getHungrySingleInstance()
    {
        if (hungrySingle == null)
        {
            synchronized (HungrySingle.class)
            {
                if (hungrySingle == null)
                {
                    hungrySingle = new HungrySingle();
                }
            }
        }
        return hungrySingle;
    }

    public void process()
    {
        System.out.println(hungrySingle);
    }
}
