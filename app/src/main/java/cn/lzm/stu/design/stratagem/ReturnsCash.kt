package cn.lzm.stu.design.stratagem

import kotlin.math.floor

/**
 * @des: 满x返x
 * @author: lizhiming
 * @date: 2022/8/30 16:12
 * @param: 如每满200返50 limitMoney：200  returnMoney：20
 */
class ReturnsCash(limitMoney: Double, returnMoney: Double) : CashSuper() {
    private val mLimitMoney = limitMoney
    private val mReturnMoney = returnMoney

    override fun acceptCash(money: Double): Double {
        var resultMoney = money

        if(money >= mLimitMoney) //Math.floor 返回不大于的最大整数
            resultMoney = money - floor(money/mLimitMoney) * mReturnMoney

        return resultMoney
    }
}