package cn.lzm.stu.design.factory.method

import cn.lzm.stu.design.factory.Americano
import cn.lzm.stu.design.factory.Cappuccino
import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Latte

/**
 * @des: 美国咖啡工厂
 * @author: lizhiming
 * @date: 2022/9/7 15:23
 */
class AmericaCoffeeFactory : CoffeeFactory() {
    override fun createCoffee(): Array<Coffee> {
        return arrayOf(Americano(), Latte())
    }
}