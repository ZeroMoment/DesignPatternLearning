package cn.lzm.stu.design.factory

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/7 15:06
 */
class Cappuccino : Coffee() {
    override fun getName(): String {
        return "卡布奇诺"
    }
}