package com.strategy;

/**
 * 策略模式测试
 */
public class Test
{
    public static void main(String[] args)
    {
        HttpStrategyContext context = new HttpStrategyContext(new OkHttpUtils());
        String responseStr = context.getRequest(null, null);
        System.out.println(responseStr);
    }
}
