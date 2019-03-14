package com.delegate;

/**
 * 文件发送器
 *
 * @author lance
 */
public class FileSender implements DealBusiness
{
    @Override
    public void doBusiness(String command)
    {
        System.out.println("发送文件:" + command);
    }
}
