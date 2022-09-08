package cn.lzm.stu.design.proxy

/**
 * @des: RealSubject类，定义Proxy所代表的真实实体
 * @author: lizhiming
 * @date: 2022/8/31 11:47
 */
class RealSubject : Subject() {
    override fun request() {
        //真正实体调用处
    }
}