package com.delegate;

/**
 * 日志记录器
 *
 * @author lance
 */
public class LogRecorder implements DealBusiness
{
    @Override
    public void doBusiness(String command)
    {
        System.out.println("日志记录:" + command);
    }
}
