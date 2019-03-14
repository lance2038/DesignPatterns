package com.strategy;

import java.util.Map;

/**
 * 使用httpClient
 *
 * @author lance
 */
public class HttpClientUtils implements IHttpUtils
{
    /**
     * 发送get请求
     *
     * @param url
     * @param params
     * @return
     */
    @Override
    public String getRequest(String url, Map params)
    {
        // 使用httpClient请求
        return "httpClientResponse";
    }
}
