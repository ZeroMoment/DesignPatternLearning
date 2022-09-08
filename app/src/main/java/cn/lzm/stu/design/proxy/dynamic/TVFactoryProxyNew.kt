package cn.lzm.stu.design.proxy.dynamic

import java.lang.reflect.Proxy

/**
 * @des: 新的代理商，全面代理公司所有的业务。使用Proxy.newProxyInstance方法生成代理对象，
 * 实现InvocationHandler中的 invoke方法，在invoke方法中通过反射调用代理类的方法，并提供增强方法。
 * @author: lizhiming
 * @date: 2022/9/7 16:51
 */
class TVFactoryProxyNew(obj: Any) {

    private var target = obj

    fun getProxy() : Any {

        return Proxy.newProxyInstance(this.javaClass.classLoader, target.javaClass.interfaces
        ) { proxy, method, args ->
            println("TV proxy find factory for tv.... ")
            method.invoke(target, *args.orEmpty())
        }

    }

}