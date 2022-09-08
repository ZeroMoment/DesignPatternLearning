package cn.lzm.stu.design.proxy

/**
 * @des: Subject类，定义了RealSubject和Proxy的公用接口，这样就在任何使用RealSubject的地方都可以使用Proxy
 * @author: lizhiming
 * @date: 2022/8/31 11:46
 */
abstract class Subject {

    abstract fun request()

}