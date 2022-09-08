package cn.lzm.stu.design.stratagem

/**
 * @des:策略包装类跟简单工厂模式结合
 * 使用策略模式比直接使用简单工厂模式创建对象进行调用，关注的类对象更少了，具体方法也不用关注（简单工厂会有工厂类跟返回类，还需要具体调用方法[acceptCash]）
 * @author: lizhiming
 * @date: 2022/8/30 16:33
 */
class CashContext(type:String) { //收费类型（商品的活动类型）
    private var cs: CashSuper? = null

    init {
        when(type) {
            "正常收费" -> {
                cs = NormalCash()
            }
            "满200返50" -> {
                cs = ReturnsCash(200.0, 50.0)
            }
            "打八折" -> {
                cs = DiscountCash(0.8)
            }
        }
    }

    fun getResult(money: Double) : Double? {
        return cs?.acceptCash(money)
    }

}