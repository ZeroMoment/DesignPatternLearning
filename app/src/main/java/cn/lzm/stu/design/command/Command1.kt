package cn.lzm.stu.design.command

/**
 * @des: 命令实现类1，将一个接收者对象绑定于一个动作（此实现），调用接收者相应操作，以实现execute
 * @author: lizhiming
 * @date: 2022/9/6 15:28
 */
class Command1(receiver: Receiver) : Command(receiver) {
    override fun execute() {
        receiver.action1() //调用不同action
    }
}