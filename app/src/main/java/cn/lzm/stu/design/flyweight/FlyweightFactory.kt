package cn.lzm.stu.design.flyweight

import java.util.*

/**
 * @des: 享元工厂，用来创建并管理flyweight对象。
 * 它主要是用来确保合理地共享flyweight，当用户请求一个flayweight时，此工厂对象提供一个已创建的实例或者创建一个（如果不存在的话）
 * @author: lizhiming
 * @date: 2022/9/7 10:42
 */
class FlyweightFactory {

    private val flyweights = Hashtable<String, Flyweight>()

    //初始化工厂时，先生成三个实例（初始化时也可以什么都不做，需要时再去创建也可）
    init {
        flyweights["x"] = ConcreteFlyweight()
        flyweights["y"] = ConcreteFlyweight()
        flyweights["z"] = ConcreteFlyweight()
    }

    //根据客户端请求，获得已生成的实例
    fun getFlyweight(key: String) : Flyweight? {
        if(!flyweights.containsKey(key)) //不存在，实例化再返回。下次有同类实例的需求，直接返回。
            flyweights[key] = ConcreteFlyweight()
        return flyweights[key]
    }
}