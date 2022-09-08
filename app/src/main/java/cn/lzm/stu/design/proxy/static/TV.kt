package cn.lzm.stu.design.proxy.static

import java.lang.reflect.Proxy

/**
 * @des: 某公司生产电视机，在当地销售需要找到一个代理销售商。那么客户需要购买电视机的时候，就直接通过代理商购买就可以。
 * @author: lizhiming
 * @date: 2022/9/7 16:22
 */
class TV(name: String, address: String) {

    var name = name
    var address = address

    override fun toString(): String {
        return "name:$name--address:$address"
    }

}