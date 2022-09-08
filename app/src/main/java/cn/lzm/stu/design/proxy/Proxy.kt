package cn.lzm.stu.design.proxy

/**
 * @des: Proxy类，保存引用使得代理可以访问实体，并提供一个与Subject接口相同的接口，这样代理类就可以用来替代实体
 * @author: lizhiming
 * @date: 2022/8/31 11:49
 */
class Proxy : Subject() {
    var realSubject: RealSubject? = null

    override fun request() {
        if(realSubject == null) {
            realSubject = RealSubject()
        }
        realSubject?.request()
    }
}