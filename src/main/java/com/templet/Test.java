package com.templet;

/**
 * 模板方法模式测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        Double amount = 500D;
        AbstractOrder blackFridayOrder = new BlackFridayOrder(amount);
        System.out.println("黑五期间买" + amount + "元商品实际花费:" + blackFridayOrder.calculateFinalAmount());
        AbstractOrder birthdayOrder = new BirthdayOrder(amount);
        System.out.println("生日期间买" + amount + "元商品实际花费:" + birthdayOrder.calculateFinalAmount());
    }
}
