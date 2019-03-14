package com.strategy;

import java.util.Map;

/**
 * 可选的http请求客户端的上下文
 *
 * @author lance
 */
public class HttpStrategyContext implements IHttpUtils
{
    private IHttpUtils iHttpUtils;

    public HttpStrategyContext(IHttpUtils iHttpUtils)
    {
        this.iHttpUtils = iHttpUtils;
    }

    @Override
    public String getRequest(String url, Map params)
    {
        return iHttpUtils.getRequest(url, params);
    }
}
