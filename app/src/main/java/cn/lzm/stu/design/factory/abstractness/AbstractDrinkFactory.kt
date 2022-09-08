package cn.lzm.stu.design.factory.abstractness

import cn.lzm.stu.design.factory.Coffee
import cn.lzm.stu.design.factory.Drink

/**
 * @des:抽象的饮料产品家族制造工厂
 *
 * 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
 *
 * 在上述的场景上继续延伸：咖啡工厂做大做强，引入了新的饮品种类：茶、 碳酸饮料。中国工厂只能制造咖啡和茶，美国工厂只能制造咖啡和碳酸饮料。
 *
 * 如果用上述工厂方法方式，除去对应的产品实体类还需要新增2个抽象工厂（茶制造工厂、碳酸饮料制造工厂），4个具体工厂实现。随着产品的增多，会导致类爆炸。
 *
 * 所以这里引出一个概念产品家族，在此例子中，不同的饮品就组成我们的饮品家族， 饮品家族开始承担创建者的责任，负责制造不同的产品。
 *
 * @author: lizhiming
 * @date: 2022/9/7 15:34
 */
interface AbstractDrinkFactory {

    /**
     * 制造咖啡
     */
    fun createCoffee() : Coffee

    /**
     * 制造茶(这里茶跟碳酸饮料可以再往上抽一层，参考coffee)
     */
    fun createTea() : Drink?

    /**
     * 制造碳酸饮料
     */
    fun createSodas() :Drink?

}