package cn.lzm.stu.design.stratagem

/**
 * @des: 正常收费，返回原价计费
 * @author: lizhiming
 * @date: 2022/8/30 16:12
 */
class NormalCash : CashSuper() {

    override fun acceptCash(money: Double): Double {
        return money
    }
}