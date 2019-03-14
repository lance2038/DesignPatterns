package com.templet;

import java.util.LinkedHashMap;

/**
 * 黑五订单
 *
 * @author lance
 */
public class BlackFridayOrder extends AbstractOrder
{
    private double orderAmount;

    public BlackFridayOrder(double orderAmount)
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
        discountList.put(1000D, 400D);
        discountList.put(300D, 100D);
        discountList.put(100D, 30D);
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
        return 0.1;
    }

    @Override
    protected double totalAmountOfTheOrder()
    {
        return orderAmount;
    }
}
