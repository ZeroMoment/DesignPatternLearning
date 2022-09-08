package cn.lzm.stu.design.command

/**
 * @des: 要求该命令执行这个请求 (执行具体命令的发起人)
 * @author: lizhiming
 * @date: 2022/9/6 15:29
 */
class Invoker {

    private val commandList = ArrayList<Command>()

    fun setCommand(command: Command) {
        if(command.toString() == "aaaa") {
            //此命令不支持了，请执行其他命令（这里假设aaaa,未具体实现）
        } else {
            commandList.add(command)
        }
    }

    //模拟取消命令
    fun cancelCommand(command: Command) {
        commandList.remove(command)
    }

    fun executeCommand() {
        for (itemCommand in commandList) {
            itemCommand.execute()
        }
    }


}