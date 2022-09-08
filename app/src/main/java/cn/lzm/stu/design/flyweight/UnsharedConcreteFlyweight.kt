package cn.lzm.stu.design.flyweight

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: 不需要共享的子类，因为flyweight接口共享成为可能，但它不强制共享
 * @author: lizhiming
 * @date: 2022/9/7 10:40
 */
class UnsharedConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicState: Int) {
        LogUtil.eLog("不共享的具体Flyweight:$extrinsicState")
    }
}