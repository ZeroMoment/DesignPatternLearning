package cn.lzm.stu.design.command

/**
 * @des:声明执行操作的接口
 * @author: lizhiming
 * @date: 2022/9/6 15:26
 */
abstract class Command(receiver: Receiver) {

    var receiver = receiver

    abstract fun execute()

}