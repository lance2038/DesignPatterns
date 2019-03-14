package com.decorator;

/**
 * 装饰器模式测试
 * 装饰器模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
        String requestXml= "2<jj>zjl</jj>";
        System.out.println("-----原生-----");
        BusinessService businessService = new BusinessServiceImpl();
        businessService.doJob(requestXml);
        System.out.println("-----加解密-----");
        BusinessService businessService1 = new SecurityDecorator(new BusinessServiceImpl());
        businessService1.doJob(requestXml);
        System.out.println("-----日志加解密-----");
        BusinessService businessService2 = new LoggerDecorator(new SecurityDecorator(new BusinessServiceImpl()));
        businessService2.doJob(requestXml);
    }
}
