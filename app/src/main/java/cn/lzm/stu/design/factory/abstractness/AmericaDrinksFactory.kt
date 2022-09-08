package cn.lzm.stu.design.factory.abstractness

import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Drink
import cn.lzm.stu.design.factory.Latte

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/7 15:44
 */
class AmericaDrinksFactory : AbstractDrinkFactory {
    override fun createCoffee(): Coffee {
        return Latte()
    }

    override fun createTea(): Drink? {
        return null
    }

    override fun createSodas(): Drink {
        return CocaCola()
    }
}