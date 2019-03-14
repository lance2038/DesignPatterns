package com.templet;

import java.util.LinkedHashMap;

/**
 * 生日的订单
 *
 * @author lance
 */
public class BirthdayOrder extends AbstractOrder
{
    private double orderAmount;

    public BirthdayOrder(double orderAmount)
    {
        this.orderAmount = orderAmount;
    }

    /**
     * 优惠方式
     *
     * @return
     */
    @Override
    protected LinkedHashMap<Double, Double> discountList()
    {
        LinkedHashMap<Double, Double> discountList = new LinkedHashMap<>();
        discountList.put(1000D, 100D);
        discountList.put(300D, 20D);
        discountList.put(100D, 5D);
        return discountList;
    }

    /**
     * 获取订单折扣
     *
     * @return
     */
    @Override
    protected Double discountRate()
    {
        return 0.2;
    }

    @Override
    protected double totalAmountOfTheOrder()
    {
        return orderAmount;
    }
}

