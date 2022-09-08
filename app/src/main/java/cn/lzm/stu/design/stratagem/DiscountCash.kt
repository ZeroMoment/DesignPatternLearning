package cn.lzm.stu.design.stratagem

/**
 * @des: 折扣收费
 * @author: lizhiming
 * @date: 2022/8/30 16:12
 * @param: discount 折扣率： 入八折，就传入0.8
 */
class DiscountCash(discount: Double) : CashSuper() {
    private val mDiscount = discount

    override fun acceptCash(money: Double): Double {
        return money * mDiscount
    }
}