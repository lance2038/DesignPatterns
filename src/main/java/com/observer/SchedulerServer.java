package com.observer;

/**
 * 定时服务器
 *
 * @author lance
 */
public class SchedulerServer extends Observer
{
    private boolean redisOnline;

    private String componentName;

    public SchedulerServer(String componentName)
    {
        this.componentName = componentName;
    }


    @Override
    public void update(String message)
    {
        if (null != message)
        {
            System.out.println(componentName + "received:redis online");
            redisOnline = true;
        }
        else
        {
            redisOnline = false;
        }
    }

    /**
     * 处理业务
     */
    public void doJob()
    {
        try
        {
            if (redisOnline)
            {
                System.out.println("get data from redis");
                Thread.sleep(200L);
            }
            else
            {
                System.out.println("get data from oracle");
                Thread.sleep(2000L);
            }

            Thread.sleep(2000L);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
