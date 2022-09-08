package cn.lzm.stu.design.state

/**
 * @des: 工作类
 * @author: lizhiming
 * @date: 2022/9/2 18:11
 */
class Work {

    var hour : Int = 9 //默认9点上班
    var isFinish : Boolean = false

    //工作初始状态为上午工作状态
    var state: State = ForenoonState()

    fun writeProgram() {
        state.writeProgram(this)
    }

}