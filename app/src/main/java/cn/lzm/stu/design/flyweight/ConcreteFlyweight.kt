package cn.lzm.stu.design.flyweight

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: 实现类，为内部状态增加存储空间
 * @author: lizhiming
 * @date: 2022/9/7 10:32
 */
class ConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicState: Int) {
        LogUtil.eLog("具体的Flyweight:$extrinsicState")
    }
}