package com.templet;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 优惠活动
 *
 * @author lance
 */
public abstract class AbstractOrder
{
    /**
     * 模板方法:计算优惠后的金额
     *
     * @return
     */
    public final double calculateFinalAmount()
    {
        double totalAmt = totalAmountOfTheOrder();
        double rate = discountRate() == null ? 0 : discountRate();
        LinkedHashMap<Double, Double> discountList = discountList();
        return calculateAmount(discountList, rate, totalAmt);
    }

    /**
     * 优惠方式
     *
     * @return
     */
    protected abstract LinkedHashMap<Double, Double> discountList();

    /**
     * 获取订单折扣
     *
     * @return
     */
    protected abstract Double discountRate();

    /**
     * 获取订单总价
     *
     * @return
     */
    protected abstract double totalAmountOfTheOrder();

    /**
     * 计算减免金额
     */
    private double calculateAmount(LinkedHashMap<Double, Double> accountList, Double rate, Double totalAmt)
    {
        if (null != accountList && accountList.size() > 0)
        {
            for (Map.Entry<Double, Double> entry : accountList.entrySet())
            {
                if (totalAmt >= entry.getKey())
                {
                    totalAmt -= entry.getValue();
                    break;
                }
            }
        }
        Double discountMoney = totalAmt * rate;
        return totalAmt - discountMoney;
    }
}

