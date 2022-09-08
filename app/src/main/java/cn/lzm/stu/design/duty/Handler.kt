package cn.lzm.stu.design.duty

/**
 * @des: 定义一个处理请示的接口
 * @author: lizhiming
 * @date: 2022/9/6 17:54
 */
abstract class Handler {

    var successor: Handler? = null //设置继任者（自己处理不了，抛给上一级）

    abstract fun handleRequest(request: Int) //处理请求的抽象方法
}