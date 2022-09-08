package cn.lzm.stu.design.factory.simple

import cn.lzm.stu.design.factory.Americano
import cn.lzm.stu.design.factory.Cappuccino
import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Latte

/**
 * @des:简单工厂实际不能算作一种设计模式，它引入了创建者的概念，将实例化的代码从应用代码中抽离，在创建者类的静态方法中只处理创建对象的细节，
 * 后续创建的实例如需改变，只需改造创建者类即可，
 *
 *  但由于使用静态方法来获取对象，使其不能在运行期间通过不同方式去动态改变创建行为，因此存在一定局限性。
 * @author: lizhiming
 * @date: 2022/9/7 15:09
 */
class SimpleFactory {

    companion object {

        /**
         * 根据类型创建不同coffee实例对象
         */
        fun createInstance(type: String) : Coffee {
            return when(type) {
                "americano" -> Americano()
                "cappuccino" -> Cappuccino()
                "latte" -> Latte()
                else -> Cappuccino()
            }
        }

    }

}