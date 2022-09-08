package cn.lzm.stu.design.factory.method

import cn.lzm.stu.design.factory.Coffee

/**
 * @des: 抽象的咖啡工厂
 *
 * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到了子类。
 *
 * 场景延伸：不同地区咖啡工厂受制于环境、原料等因素的影响，制造出的咖啡种类有限。中国咖啡工厂仅能制造卡布奇诺、拿铁，而美国咖啡工厂仅能制造美式咖啡、拿铁。
 *
 * @author: lizhiming
 * @date: 2022/9/7 15:15
 */
abstract class CoffeeFactory {

    abstract fun createCoffee(): Array<Coffee> //这里返回单个Coffee实例也可，实现工厂就定义对应实例工厂即可

}