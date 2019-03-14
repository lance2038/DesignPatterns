package com.observer;

/**
 * 报表服务器
 *
 * @author lance
 */
public class ReportServer extends Observer
{
    private boolean redisOnline;

    private String componentName;

    public ReportServer(String componentName)
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
                Thread.sleep(100L);
            }
            else
            {
                System.out.println("get data from oracle");
                Thread.sleep(1000L);
            }

            Thread.sleep(1000L);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
