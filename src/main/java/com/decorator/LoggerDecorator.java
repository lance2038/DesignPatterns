package com.decorator;

/**
 * 日志
 *
 * @author lance
 */
public class LoggerDecorator extends BusinessDecorator
{
    public LoggerDecorator(BusinessService businessService)
    {
        super(businessService);
    }

    @Override
    public String doJob(String requestXml)
    {
        this.recordBeforeLog(requestXml);
        String responseXml = super.doJob(requestXml);
        this.recordAfterLog(responseXml);
        return responseXml;
    }

    public void recordBeforeLog(String xmlStr)
    {
        System.out.println("前置日志记录:" + xmlStr);
    }

    public void recordAfterLog(String xmlStr)
    {
        System.out.println("后置日志记录:" + xmlStr);
    }
}