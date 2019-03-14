package com.decorator;

/**
 * 包装类
 *
 * @author lance
 */
public class BusinessDecorator implements BusinessService
{

    private BusinessService businessService;

    public BusinessDecorator(BusinessService businessService)
    {
        this.businessService = businessService;
    }

    @Override
    public String doJob(String xmlStr)
    {
        return businessService.doJob(xmlStr);
    }
}