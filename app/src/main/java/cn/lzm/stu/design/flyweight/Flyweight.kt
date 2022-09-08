package cn.lzm.stu.design.flyweight

/**
 * @des: 所有享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 * @author: lizhiming
 * @date: 2022/9/7 10:22
 */
abstract class Flyweight {

    /**
     * extrinsicState 外部状态数据，可以是一个完整的bean结构
     * 根据外部数据不同，实现不同的处理
     */
    abstract fun operation(extrinsicState: Int)

}