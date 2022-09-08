package cn.lzm.stu.design.factory.abstractness

import cn.lzm.stu.design.factory.Drink

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/7 15:42
 */
class CocaCola : Drink() {
    override fun getName(): String {
        return "可口可乐"
    }
}