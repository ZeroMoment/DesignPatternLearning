package cn.lzm.stu.design.state

/**
 * @des:
 * @author: lizhiming
 * @date: 2022/9/2 18:19
 */
class AfternoonState : State() {
    override fun writeProgram(workData: Work) {
        if(workData.hour < 17) {
            //当前时间 work.hour点：下午状态还不错，继续努力
        } else { //超过17点，则转入傍晚工作状态
            workData.state = EveningState()
            workData.writeProgram()
        }
    }
}