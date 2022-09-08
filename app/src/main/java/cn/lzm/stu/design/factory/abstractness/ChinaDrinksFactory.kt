package cn.lzm.stu.design.factory.abstractness

import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Drink
import cn.lzm.stu.design.factory.Latte

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/7 15:41
 */
class ChinaDrinksFactory : AbstractDrinkFactory {
    override fun createCoffee(): Coffee {
        return Latte()
    }

    override fun createTea(): Drink {
        return MilkTea()
    }

    override fun createSodas(): Drink? {
        return null
    }
}