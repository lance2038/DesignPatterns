package com.decorator;

/**
 * 解密
 *
 * @author lance
 */
public class SecurityDecorator extends BusinessDecorator
{

    public SecurityDecorator(BusinessService businessService)
    {
        super(businessService);
    }

    @Override
    public String doJob(String requestXml)
    {
        String decryptedRequestXml = this.decrypt(requestXml);
        String responseXml = super.doJob(decryptedRequestXml);
        return this.encrypt(responseXml);
    }

    /**
     * 解密
     */
    public String decrypt(String xmlStr)
    {
        System.out.println("解密");
        return xmlStr.substring(1);
    }

    /**
     * 加密
     */
    public String encrypt(String responseXml)
    {
        System.out.println("加密");
        return "a" + responseXml;
    }
}
