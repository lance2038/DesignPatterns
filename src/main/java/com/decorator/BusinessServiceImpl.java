package com.decorator;

/**
 * 业务处理类
 *
 * @author lance
 */
public class BusinessServiceImpl implements BusinessService
{
    @Override
    public String doJob(String xmlStr)
    {
        System.out.println("执行业务...,处理[" + xmlStr + "]这段xml");
        return "<xl>333</xl>";
    }
}
