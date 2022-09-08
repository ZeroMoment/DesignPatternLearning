package cn.lzm.stu.design.command

import cn.lzm.stu.design.util.LogUtil

/**
 * @des: receiver类，知道如何实施与执行一个与请求相关的操作，任何类都可能作为一个接收者
 * @author: lizhiming
 * @date: 2022/9/6 15:24
 */
class Receiver {

    fun action1() {
        LogUtil.eLog("执行请求1")
    }

    fun action2() {
        LogUtil.eLog("执行请求2")
    }

}